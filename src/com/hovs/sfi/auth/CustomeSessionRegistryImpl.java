package com.hovs.sfi.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.core.session.SessionDestroyedEvent;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.util.Assert;

public class CustomeSessionRegistryImpl implements SessionRegistry,
ApplicationListener<SessionDestroyedEvent> {
	/*     */   protected final Log logger;
	/*     */   private final ConcurrentMap<Object, Set<String>> principals;
	/*     */   private final Map<String, SessionInformation> sessionIds;
	/*     */  
	            
	/*     */   public CustomeSessionRegistryImpl()
	/*     */   {
	/*  44 */     this.logger = LogFactory.getLog(SessionRegistryImpl.class);
	/*     */ 
	/*     */ 
	/*  47 */     this.principals = new ConcurrentHashMap();
	/*     */ 
	/*  49 */     this.sessionIds = new ConcurrentHashMap();
	             
	              
	/*     */   }
	/*     */ 
	/*     */   public List<Object> getAllPrincipals()
	/*     */   {
	/*  54 */     return new ArrayList(this.principals.keySet());
	/*     */   }
	/*     */ 
	/*     */   public List<SessionInformation> getAllSessions(Object principal, boolean includeExpiredSessions) {
	/*  58 */     Set sessionsUsedByPrincipal = (Set)this.principals.get(principal);
	/*     */ 
	/*  60 */     if (sessionsUsedByPrincipal == null) {
	/*  61 */       return Collections.emptyList();
	/*     */     }
	/*     */ 
	/*  64 */     List list = new ArrayList(sessionsUsedByPrincipal.size());
	/*     */ 
	/*  66 */     for (Object sessionId : sessionsUsedByPrincipal) {
	/*  67 */       SessionInformation sessionInformation = getSessionInformation(sessionId.toString());
	/*     */ 
	/*  69 */       if (sessionInformation == null) {
	/*     */         continue;
	/*     */       }
	/*     */ 
	/*  73 */       if ((includeExpiredSessions) || (!(sessionInformation.isExpired()))) {
	/*  74 */         list.add(sessionInformation);
	/*     */       }
	/*     */     }
	/*     */ 
	/*  78 */     return list;
	/*     */   }
	/*     */ 
	/*     */   public SessionInformation getSessionInformation(String sessionId) {
	/*  82 */     Assert.hasText(sessionId, "SessionId required as per interface contract");
	/*     */ 
	/*  84 */     return ((SessionInformation)this.sessionIds.get(sessionId));
	/*     */   }
	/*     */ 
	/*     */   public void onApplicationEvent(SessionDestroyedEvent event) {
	/*  88 */     String sessionId = event.getId();
	/*  89 */     removeSessionInformation(sessionId);
	/*     */   }
	/*     */ 
	/*     */   public void refreshLastRequest(String sessionId) {
	/*  93 */     Assert.hasText(sessionId, "SessionId required as per interface contract");
	/*     */ 
	/*  95 */     SessionInformation info = getSessionInformation(sessionId);
	/*     */ 
	/*  97 */     if (info != null)
	/*  98 */       info.refreshLastRequest();
	/*     */   }
	/*     */ 
	/*     */   public void registerNewSession(String sessionId, Object principal)
	/*     */   {
	/* 103 */     Assert.hasText(sessionId, "SessionId required as per interface contract");
	/* 104 */     Assert.notNull(principal, "Principal required as per interface contract");
	/*     */ 
	/* 106 */     if (this.logger.isDebugEnabled()) {
	/* 107 */       this.logger.debug("Registering session " + sessionId + ", for principal " + principal);
	/*     */     }
	/*     */ 
	/* 110 */     if (getSessionInformation(sessionId) != null) {
	/* 111 */       removeSessionInformation(sessionId);
	/*     */     }
	/*     */ 
	               for(String entry: sessionIds.keySet()){
	            	     SessionInformation lSessionInformation = sessionIds.get(entry);
	            	     UserPrincipalImpl lUserPrincipalImpl = (UserPrincipalImpl) lSessionInformation.getPrincipal();
	            	     UserPrincipalImpl lNewUserPrincipalImpl = (UserPrincipalImpl) principal;
	            	     if(lUserPrincipalImpl.getUser().getId() == lNewUserPrincipalImpl.getUser().getId() ){
	            	    	 removeSessionInformation(entry);
	            	     }
	            	     
	               }
	
	/* 114 */     this.sessionIds.put(sessionId, new SessionInformation(principal, sessionId, new Date()));
;	/*     */       int len = sessionIds.size();
	/* 116 */     Set sessionsUsedByPrincipal = (Set)this.principals.get(principal);
	/*     */ 
	/* 118 */     if (sessionsUsedByPrincipal == null) {
	/* 119 */       sessionsUsedByPrincipal = new CopyOnWriteArraySet();
	/* 120 */       Set prevSessionsUsedByPrincipal = (Set)this.principals.putIfAbsent(principal, sessionsUsedByPrincipal);
	/*     */ 
	/* 122 */       if (prevSessionsUsedByPrincipal != null) {
	/* 123 */         sessionsUsedByPrincipal = prevSessionsUsedByPrincipal;
	/*     */       }
	/*     */     }
	/*     */ 
	/* 127 */     sessionsUsedByPrincipal.add(sessionId);
	/*     */ 
	/* 129 */     if (this.logger.isTraceEnabled())
	/* 130 */       this.logger.trace("Sessions used by '" + principal + "' : " + sessionsUsedByPrincipal);
	/*     */   }
	/*     */ 
	/*     */   public void removeSessionInformation(String sessionId)
	/*     */   {
	/* 135 */     Assert.hasText(sessionId, "SessionId required as per interface contract");
	/*     */ 
	/* 137 */     SessionInformation info = getSessionInformation(sessionId);
	/*     */ 
	/* 139 */     if (info == null) {
	/* 140 */       return;
	/*     */     }
	/*     */ 
	/* 143 */     if (this.logger.isTraceEnabled()) {
	/* 144 */       this.logger.debug("Removing session " + sessionId + " from set of registered sessions");
	/*     */     }
	/*     */ 
	/* 147 */     this.sessionIds.remove(sessionId);
	/*     */ 
	/* 149 */     Set sessionsUsedByPrincipal = (Set)this.principals.get(info.getPrincipal());
	/*     */ 
	/* 151 */     if (sessionsUsedByPrincipal == null) {
	/* 152 */       return;
	/*     */     }
	/*     */ 
	/* 155 */     if (this.logger.isDebugEnabled()) {
	/* 156 */       this.logger.debug("Removing session " + sessionId + " from principal's set of registered sessions");
	/*     */     }
	/*     */ 
	/* 159 */     sessionsUsedByPrincipal.remove(sessionId);
	/*     */ 
	/* 161 */     if (sessionsUsedByPrincipal.isEmpty())
	/*     */     {
	/* 163 */       if (this.logger.isDebugEnabled()) {
	/* 164 */         this.logger.debug("Removing principal " + info.getPrincipal() + " from registry");
	/*     */       }
	/* 166 */       this.principals.remove(info.getPrincipal());
	/*     */     }
	/*     */ 
	/* 169 */     if (this.logger.isTraceEnabled())
	/* 170 */       this.logger.trace("Sessions used by '" + info.getPrincipal() + "' : " + sessionsUsedByPrincipal);
	/*     */   }
	public Map<String, SessionInformation> getSessionIds() {
		return sessionIds;
	}
	
	
	            
	/*     */ }
