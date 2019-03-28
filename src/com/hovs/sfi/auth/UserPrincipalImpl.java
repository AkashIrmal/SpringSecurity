package com.hovs.sfi.auth;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.hovs.sfi.model.User;

public class UserPrincipalImpl implements UserPrincipal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.hovs.sfi.model.User user;
	private Collection<GrantedAuthority> authorities;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getLoginName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		if(user.getState().equals(AuthConstants.STATE_INACTIVE)){
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		if(user.getState().equals(AuthConstants.STATE_INACTIVE) ){
			return true;
		} else  {
			return user.getState().equals(AuthConstants.STATE_ACTIVE);
		}
	}
	
	@Override
	public boolean equals(Object otherUser) {
		UserPrincipalImpl lUser = (UserPrincipalImpl) otherUser;
	   if (getUser().getId() == lUser.getUser().getId())
	       return true;
	  
	   return false;
	}

	@Override
	public int hashCode() {
	    return getUser().getId();
	}
	/**
	 * Method returns the com.hovs.miefile.model.User instance based on UserPrincipal.
	 */
	@Override
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
		//Add user authorities here as per requirement. Based on user role.
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		int roleKey = user.getUserRole().getId();
		switch (roleKey) {
			case AuthConstants.ROLE_PRE_AUTH_USER:
				authorities.add(new SimpleGrantedAuthority(String.valueOf(AuthConstants.ROLE_PRE_AUTH_USER)));
				break;
			case AuthConstants.ROLE_AUTH_USER:
				authorities.add(new SimpleGrantedAuthority(String.valueOf(AuthConstants.ROLE_AUTH_USER)));
				break;
			case AuthConstants.ROLE_ADMIN_USER:
				authorities.add(new SimpleGrantedAuthority(String.valueOf(AuthConstants.ROLE_ADMIN_USER)));
				break;
			default:
				break;
		}
		this.authorities = authorities;
	}
}
