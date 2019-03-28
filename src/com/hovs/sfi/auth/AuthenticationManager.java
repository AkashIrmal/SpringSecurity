package com.hovs.sfi.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hovs.sfi.config.ApplicationContext;
import com.hovs.sfi.model.User;
import com.hovs.sfi.model.UserRole;


@Service("authService")
public class AuthenticationManager implements UserDetailsService {

	
	@Autowired
	ApplicationContext mApplicationContext;
	
	public ApplicationContext getApplicationContext() {
		return mApplicationContext;
	}



	@Override
	public UserDetails loadUserByUsername(String loginName)
			throws UsernameNotFoundException {
		UserPrincipalImpl lUserPrincipalImpl = new UserPrincipalImpl();
		User lUser = getApplicationContext().getUserManager().getUser(loginName); 

		if(lUser == null){
			throw new UsernameNotFoundException("User with login user id -"+loginName+"is not found");
		}else{
			UserRole lUserRole = new UserRole();
			if(lUser.getIsAdmin().equalsIgnoreCase("Y")){
				lUserRole.setName(AuthConstants.ROLE_NAME_ADMIN_USER);
				lUserRole.setId(AuthConstants.ROLE_ADMIN_USER);
			}else if(lUser.getPasswordChangeFirstTime().equalsIgnoreCase("Y")){
				lUserRole.setId(AuthConstants.ROLE_PRE_AUTH_USER);
				lUserRole.setName(AuthConstants.ROLE_NAME_PRE_AUTH_USER);
			}else{
				lUserRole.setId(AuthConstants.ROLE_AUTH_USER);
				lUserRole.setName(AuthConstants.ROLE_NAME_AUTH_USER);
			}
			lUser.setUserRole(lUserRole);
		}
		lUserPrincipalImpl.setUser(lUser);
		return lUserPrincipalImpl;
	}

	public UserPrincipal getUserPrincipal(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if(authentication != null ){
				return (UserPrincipalImpl)authentication.getPrincipal();
		} else {
				return null;
		}
	}
}
