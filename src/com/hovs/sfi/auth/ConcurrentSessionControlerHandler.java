package com.hovs.sfi.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.SpringSecurityMessageSource;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.web.authentication.session.ConcurrentSessionControlAuthenticationStrategy;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationException;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionFixationProtectionStrategy;
import org.springframework.util.Assert;

import com.hovs.sfi.model.User;

public class ConcurrentSessionControlerHandler  extends
SessionFixationProtectionStrategy implements MessageSourceAware { 
	protected MessageSourceAccessor messages = SpringSecurityMessageSource
			.getAccessor();
	private final SessionRegistry sessionRegistry;
	private boolean exceptionIfMaximumExceeded = false;
	private int maximumSessions = 1;
	private final Map<HttpSession,UserPrincipalImpl> mHttpSessions;
	
	 

	public ConcurrentSessionControlerHandler(SessionRegistry sessionRegistry) {
		Assert.notNull(sessionRegistry, "The sessionRegistry cannot be null");
		super.setAlwaysCreateSession(true);
		this.sessionRegistry = sessionRegistry;
		this.mHttpSessions = new ConcurrentHashMap<HttpSession, UserPrincipalImpl>();
	}

	public void onAuthentication(Authentication authentication,
			HttpServletRequest request, HttpServletResponse response) {
		checkAuthenticationAllowed(authentication, request);
		UserPrincipalImpl lUserPrincipalImpl = (UserPrincipalImpl) authentication.getPrincipal();
		
	List<HttpSession> expiredSessionList = new ArrayList<HttpSession>();

		
		for(HttpSession session : mHttpSessions.keySet()){
			if(mHttpSessions.get(session).getUser().getId() == lUserPrincipalImpl.getUser().getId()){
				expiredSessionList.add(session);
			}
		}
		if(!expiredSessionList.isEmpty()){
			expirePreviousSession(expiredSessionList);
		}
		
		this.mHttpSessions.put(request.getSession(true),(UserPrincipalImpl) authentication.getPrincipal());
		super.onAuthentication(authentication, request, response);
		this.sessionRegistry.registerNewSession(request.getSession().getId(),authentication.getPrincipal());
		
		
	}
	private void expirePreviousSession(List<HttpSession> expiredSessionList) {
		for(HttpSession sesionsHttpSession : expiredSessionList){
			System.out.println("Expired ID"+sesionsHttpSession.getId());
			try{
			sesionsHttpSession.invalidate();
			removeHttpSessionDetails(sesionsHttpSession);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		return;
	}

	private void checkAuthenticationAllowed(Authentication authentication,
			HttpServletRequest request) throws AuthenticationException {
		List<SessionInformation> sessions = this.sessionRegistry.getAllSessions(
				authentication.getPrincipal(), true);
		UserPrincipalImpl lUser = (UserPrincipalImpl) authentication.getPrincipal();
		int sessionCount = sessions.size();
		int allowedSessions = getMaximumSessionsForThisUser(authentication);

		if (sessionCount < allowedSessions) {
			return;
		}

		if (allowedSessions == -1) {
			return;
		}

		
		/*
		allowableSessionsExceeded(sessions, allowedSessions,
				this.sessionRegistry);*/
	}


	protected int getMaximumSessionsForThisUser(Authentication authentication) {
		return this.maximumSessions;
	}

	protected void allowableSessionsExceeded(List<SessionInformation> sessions,
			int allowableSessions, SessionRegistry registry)
			throws SessionAuthenticationException {
		if ((this.exceptionIfMaximumExceeded) || (sessions == null)) {
			throw new SessionAuthenticationException(this.messages.getMessage(
					"ConcurrentSessionControlStrategy.exceededAllowed",
					new Object[] { Integer.valueOf(allowableSessions) },
					"Maximum sessions of {0} for this principal exceeded"));
		}

		SessionInformation leastRecentlyUsed = null;

		for (SessionInformation session : sessions) {
			if ((leastRecentlyUsed == null)
					|| (session.getLastRequest().before(leastRecentlyUsed
							.getLastRequest()))) {
				leastRecentlyUsed = session;
			}
		}

		leastRecentlyUsed.expireNow();
	}

	public void setExceptionIfMaximumExceeded(boolean exceptionIfMaximumExceeded) {
		this.exceptionIfMaximumExceeded = exceptionIfMaximumExceeded;
	}

	public void setMaximumSessions(int maximumSessions) {
		Assert.isTrue(
				maximumSessions != 0,
				"MaximumLogins must be either -1 to allow unlimited logins, or a positive integer to specify a maximum");

		this.maximumSessions = maximumSessions;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messages = new MessageSourceAccessor(messageSource);
	}

	public final void setAlwaysCreateSession(boolean alwaysCreateSession) {
		if (!(alwaysCreateSession))
			throw new IllegalArgumentException(
					"Cannot set alwaysCreateSession to false when concurrent session control is required");
	}
	
	public boolean addHttpSessionDetails(HttpSession session,UserPrincipalImpl aUserPrincipalImpl){
		mHttpSessions.put(session, aUserPrincipalImpl);
   	 return true;
   }
   
   public boolean removeHttpSessionDetails(HttpSession session)
   {
   	if(mHttpSessions.containsKey(session))
   		mHttpSessions.remove(session);
   	 return true;
   }

	
}
