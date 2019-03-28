package com.hovs.sfi.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hovs.rule14.admin.ws.ForgotPasswordRequest;
import com.hovs.rule14.admin.ws.ForgotPasswordResult;



@Controller
public class ForgotPassWordController extends BaseController {

protected Log logger = LogFactory.getLog(getClass());

	

	@Override
	@RequestMapping(value="forgotpassword.do",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		
		String cmd = ServletRequestUtils.getStringParameter(aRequest,"cmd" , "UnknownRequestCmd");
		
           
		return forgotPassword(aRequest,aResponse);
		
		
		/*System.out.println("Akash");
		System.out.println( (Integer)aRequest.getSession().getAttribute(AuthConstants.SESSION_AUTHENTICATION_FAILURE_TYPE));
		ModelAndView lModelAndView = new ModelAndView("login");
		return lModelAndView;*/
	}

	private ModelAndView forgotPassword(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		
		String loginName = ServletRequestUtils.getStringParameter(aRequest,"loginName", null);
		if(loginName!=null)
		{
		ForgotPasswordResult forgotPasswordResult=getApplicationContextObject().getUserManager().forgotPassword(loginName);
		return new ModelAndView("login");
		}
		
		return new ModelAndView("forgot_password");
	
		
	}
}
