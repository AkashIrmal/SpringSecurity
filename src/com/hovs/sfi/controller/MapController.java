package com.hovs.sfi.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hovs.rule14.admin.ws.UserURLMap;
import com.hovs.rule14.admin.ws.UserURLMapRequest;
import com.hovs.rule14.admin.ws.UserURLMapResult;
import com.hovs.rule14.admin.ws.WsException_Exception;
import com.hovs.sfi.auth.AuthConstants;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.util.AESSecurityUtil;
import com.hovs.sfi.util.CommonUtil;

@Controller("mapController")
public class MapController extends BaseController{

	@Override
	@RequestMapping(value="/map.do",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView processRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		return handleMapRequest(aRequest , aResponse);
	}

	private ModelAndView handleMapRequest(HttpServletRequest aRequest,
			HttpServletResponse aResponse) {
		String lToken = ServletRequestUtils.getStringParameter(aRequest, "token",null);
		
		UserURLMapRequest userURLMapRequest = new UserURLMapRequest();
		userURLMapRequest.setTokenId(lToken);
		userURLMapRequest.setMode(2);
		
		try{
			UserURLMapResult userUrlMapResult = getApplicationContextObject().getUserManager().getUserUrlMap(userURLMapRequest);
			List<UserURLMap> userURLMapList = userUrlMapResult.getUserURLMap();
			if(userURLMapList != null && userURLMapList.size() > 0){
				UserURLMap userURLMap = userURLMapList.get(0);
				if(userURLMap != null && AuthConstants.STATE_ACTIVE.equals(userURLMap.getActive())){
					Date createdOn = CommonUtil.convertToDate(userURLMap.getCreatedOn());
					Date expiryDate = CommonUtil.convertToDate(userURLMap.getExpiryDate());
					long currentDateDiff = new Date().getTime() - createdOn.getTime();
					long expiryDateDiff = expiryDate.getTime() - createdOn.getTime();
					// Check for expiry.
					if(currentDateDiff <= expiryDateDiff ){
						String urlPath = userURLMap.getUrlPath();
						//request.setAttribute("userId",userURLMap.getUserId());
						try{
							String encodedUserId = "0";
							try {
								encodedUserId = AESSecurityUtil.encrypt(""+userURLMap.getUserId());
							} catch (Exception e) {
								e.printStackTrace();
							}
//							userURLMapRequest.setMode(3);
//							userURLMapRequest.setTokenId(userURLMap.getToken());
//							userURLMapRequest.setStatus(AuthConstants.STATE_INACTIVE);
//							UserURLMapResult updateUSerUrlMap = getApplicationContextObject().getUserManager().updateUSerUrlMap(userURLMapRequest);
//							System.out.println(updateUSerUrlMap.isResult());
							RedirectView redirectView = new RedirectView(urlPath, true);
							Properties properties = new Properties();
							properties.setProperty(AppConstants.USERID_MASK_STRING,encodedUserId);
							properties.setProperty(AppConstants.TOKEN_MASK_STRING,userURLMap.getToken());
							redirectView.setAttributes(properties);
							return new ModelAndView(redirectView);
						}catch(ArrayIndexOutOfBoundsException outOfBoundsException){
							aResponse.sendRedirect(urlPath);
						}
					} else {
						return new ModelAndView(getView(),"model" , "Link has expired.");
					}
				} else {
					return new ModelAndView(getView(),"model" , "Link has expired.");
				}
			}
			return new ModelAndView(getView(),"model" , "Invalid token.");
		} catch (WsException_Exception e) {
			return new ModelAndView(getView(),"model" , "Error while calling web service to validate token.");
			//Web service exception....
		} catch (IOException e) {
			// IO Exception response.sendRedirect....
			return new ModelAndView(getView(),"model" , "Error while calling web service to validate token.");
		}
		
	}

}
