package com.hovs.sfi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SessionExtendController extends BaseController {

	@Override
	@RequestMapping(value="/extendSessionTime.do", method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		aRequest.getSession().setMaxInactiveInterval(getApplicationContextObject().getAppProperties().getSessionTimeoutInMinutes() * 60);
		System.out.println(aRequest.getSession().getMaxInactiveInterval());
		return new ModelAndView("model");
	}

}
