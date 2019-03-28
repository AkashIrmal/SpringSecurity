package com.hovs.sfi.util;

import javax.servlet.http.HttpServletRequest;

public class HttpUtil {


	/**
	 * Get operating system name of client from the HttpServletRequest.getHeader("User-Agent").
	 * @param request
	 * @return
	 */
	public static String  getClientOperatingSystem(HttpServletRequest request){
		String  userAgent = getUserAgentHeaderInfo(request);
		 String os = "";
		 //=================OS=======================
         if (userAgent.toLowerCase().indexOf("windows") >= 0 ) {
             os = "Windows";
         } else if(userAgent.toLowerCase().indexOf("mac") >= 0) {
             os = "Mac";
         } else if(userAgent.toLowerCase().indexOf("x11") >= 0) {
             os = "Unix";
         } else if(userAgent.toLowerCase().indexOf("android") >= 0){
             os = "Android";
         } else if(userAgent.toLowerCase().indexOf("iphone") >= 0){
             os = "IPhone";
         } else{
             os = "UnKnown, More-Info: "+userAgent;
         }
		return os;
	}
	
	/**
	 * Get the browser information from the HttpServletRequest.getHeader("User-Agent").
	 * @param request
	 * @return
	 */
	public static String getBrowserInfo(HttpServletRequest request){
		String  userAgent  =   getUserAgentHeaderInfo(request);
        String  user            =   userAgent.toLowerCase();
        String browser = "";
         //===============Browser===========================
        if (user.contains("msie")){
            String substring=userAgent.substring(userAgent.indexOf("MSIE")).split(";")[0];
            browser=substring.split(" ")[0].replace("MSIE", "IE")+"-"+substring.split(" ")[1];
        } else if (user.contains("safari") && user.contains("version")){
            browser=(userAgent.substring(userAgent.indexOf("Safari")).split(" ")[0]).split("/")[0]+"-"+(userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
        } else if ( user.contains("opr") || user.contains("opera")){
            if(user.contains("opera"))
                browser=(userAgent.substring(userAgent.indexOf("Opera")).split(" ")[0]).split("/")[0]+"-"+(userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
            else if(user.contains("opr"))
                browser=((userAgent.substring(userAgent.indexOf("OPR")).split(" ")[0]).replace("/", "-")).replace("OPR", "Opera");
        } else if (user.contains("chrome")){
            browser=(userAgent.substring(userAgent.indexOf("Chrome")).split(" ")[0]).replace("/", "-");
        } else if ((user.indexOf("mozilla/7.0") > -1) || (user.indexOf("netscape6") != -1)  || (user.indexOf("mozilla/4.7") != -1) || (user.indexOf("mozilla/4.78") != -1) || (user.indexOf("mozilla/4.08") != -1) || (user.indexOf("mozilla/3") != -1) ){
            //browser=(userAgent.substring(userAgent.indexOf("MSIE")).split(" ")[0]).replace("/", "-");
            browser = "Netscape-?";
        } else if (user.contains("firefox")){
            browser=(userAgent.substring(userAgent.indexOf("Firefox")).split(" ")[0]).replace("/", "-");
        } else if(user.contains("rv")){
            browser="IE";
        } else{
            browser = "UnKnown, More-Info: "+userAgent;
        }
         return browser;
	}
	
	/**
	 * Returns the user agent info header using HttpServletRequest.getHeader("User-Agent").
	 * @param request
	 * @return
	 */
	public static String getUserAgentHeaderInfo(HttpServletRequest request){
		return request.getHeader("User-Agent");
	}
	
	public static String getApplicationDomainURLPath(HttpServletRequest request){
		
		String scheme = request.getScheme();
		boolean isSecured = request.isSecure(); 
		String requestURI = request.getRequestURI();
		String domainURL = request.getRequestURL().toString();
		if(requestURI!= null && domainURL.indexOf(requestURI) != -1 ){
			domainURL = domainURL.substring(0, domainURL.indexOf(requestURI));
		}
		/*if(request.isSecure()) {
			domainURL = domainURL.replace("http", "https");
		}else if (request.getServerName().contains("sourcehov")){
			domainURL = domainURL.replace("http", "https");
		}*/
		return domainURL;
	}
	
	/**
	 * Prints all the parameters in the HttpServletRequest object.
	 * @param request
	 */
	public static void printAllParameterInRequest(HttpServletRequest request){
		System.out.println(request.getAttribute("userId"));
		System.out.println("=== Request data ===");
		java.util.Enumeration<String> reqEnum = request.getParameterNames();
		while (reqEnum.hasMoreElements()) {
			String s = reqEnum.nextElement();
			System.out.println(s);
			System.out.println("==" + request.getParameter(s));
		}
	}
	
	/**
	 * Get Client IP Address
	 * @param request
	 * */
	
	private static final String[] HEADERS_TO_TRY = { 
	    "X-Forwarded-For",
	    "Proxy-Client-IP",
	    "WL-Proxy-Client-IP",
	    "HTTP_X_FORWARDED_FOR",
	    "HTTP_X_FORWARDED",
	    "HTTP_X_CLUSTER_CLIENT_IP",
	    "HTTP_CLIENT_IP",
	    "HTTP_FORWARDED_FOR",
	    "HTTP_FORWARDED",
	    "HTTP_VIA",
	    "REMOTE_ADDR" };

	public static String getClientIpAddress(HttpServletRequest request) {
	    for (String header : HEADERS_TO_TRY) {
	        String ip = request.getHeader(header);
	        if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
	            return ip;
	        }
	    }
	    return request.getRemoteAddr();
	}

}
