package com.hovs.sfi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hovs.rule14.admin.ws.ForgotPasswordResult;

@Controller
public class DashboardController extends BaseController {

	@Override
	@RequestMapping(value="pulse.do",method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		
		String cmd = ServletRequestUtils.getStringParameter(aRequest,"cmd" , "UnknownRequestCmd");
		
           
		return displayPage(aRequest,aResponse);
		
		
		/*System.out.println("Akash");
		System.out.println( (Integer)aRequest.getSession().getAttribute(AuthConstants.SESSION_AUTHENTICATION_FAILURE_TYPE));
		ModelAndView lModelAndView = new ModelAndView("login");
		return lModelAndView;*/
	}

	private ModelAndView displayPage(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
	
		
		return new ModelAndView("pulse");
	
		
	}
}
