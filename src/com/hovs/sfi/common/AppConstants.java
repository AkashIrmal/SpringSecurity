package com.hovs.sfi.common;

public class AppConstants {

	public final static int RESULT_CODE_SUCCESS = 0;
	public final static int RESULT_CODE_USER_ERROR = 1;
	public final static int RESULT_CODE_APPLICATION_ERROR = 2;
	public final static int RESULT_CODE_VALIDATION_ERROR = 3;
	public final static int RESULT_CODE_FAILED = 4;
	public final static int RESULT_CODE_EFILE_WEB_SERVICE_INVOCATION_ERROR = 5;
	public static final String UNKNOWN_REQUEST_CMD = "UNKNOWN_REQUEST_CMD";
	public static final String FORGOT_PASSWORD = "forgotPassword";
	
	public static final String UPDATE_W9_DETAILS="updateW9details";
	public static final String GET_W9_DETAILS="getW9details";
	public static final String GET_MANAGERS="getManagers";
	public static final String GET_PROJECTS="getProjects";
	public static final String GET_CLIENTS="getClients";
	public static final String GET_CLIENTS_BY_USER="getClientsByUser";
	public static final String GET_MENUSBYMANAGER="getMenusByManager";
	public static final String GET_PROJECTGROUPS="getProjectGroups";
	public static final String LOAD_MENUS="loadMenus";
	public static final String IS_VALIDATEMAODULE="isValidModule";
	public static final String UPDATE_CUSTOMER_TYPE_INFO="updateCustomerTypeInfo";
	public static final String UPDATE_CUSTOMER_INFO="updateCustomerInfo";
	public static final String VERIFY_PASSWORD="verifyCurrentPassword";
	public static final String LOAD_USER_ACCOUNT_DETAILS = "loadUserAccountDetails";
	public static final CharSequence SIF_SERVLET_PATH = "sfi.do";
	public static final CharSequence VIEW_W_9_SEARCH_SERVLET_PATH = "view.do";
	public static final String EXTEND_SESSION_TIME="extendSessionTime.do";
	
	
	public static final String SFI_REPORT_SERVLET_PATH = "report.do";
	public static final String USER_INFORMATION_REPORT_SERVLET_PATH = "userinformationreport.do";
	public static final String LAWFIRM_REPORT_SERVLET_PATH = "lawfirmreport.do";
	public static final String BUSINESS_REPORT_SERVLET_PATH = "businessreport.do";
	public static final String LEGALNAME_REPORT_SERVLET_PATH = "legalnamereport.do";
	public static final String CURRENT_FILE_UPDATE_SERVLET_PATH = "currentfileupdate.do";
	public static final String TRANSMISSION_REPORT_SERVLET_PATH = "transmissionreport.do";
	public static final String CUSTOMER_REPORT_SERVLET_PATH = "customerreport.do";
	public static final String VALIDW9_REPORT_SERVLET_PATH = "validw9report.do";
	public static final String INVALIDW9_REPORT_SERVLET_PATH = "invalidw9report.do";
	public static final String EMAIL_REPORT_SERVLET_PATH = "emailreport.do";
	public static final String INVENTORY_REPORT_SERVLET_PATH = "inventoryreport.do";
	public static final String BILLING_REPORT_SERVLET_PATH = "billingreport.do";
	public static final String USERID_LISTING_REPORT_SERVLET_PATH = "useridlistreport.do";
	
	public static final String VERIFY_EMAIL_ID = "verifyEmailId";
	public static final String CMD_VALIDATE_SECURITY_QUESTION_AND_ANSWER = "ValidateSecurityQuestionAndAnswer";
	public static final String FORGOT_PASSWORD_URL = "login.do?cmd=ForgotPassword";
	public static final String MAP_CONTROLLER_URL = "map.do";
	public static final String QUESTION_MARK = "?";
	public static final int SP_IMODE_1 = 1;
	public static final int LINK_EXPIRY_TWO_HOUR = 2;
	public static final int LINK_EXPIRY_TWENTY_FOUR_HOUR = 24;
	public static final String ACTIVATE_ACCOUNT_URL = "login.do?cmd=ActivateAccount";
	public static final String RESET_SECURITY_QUESTION_URL = "login.do?cmd=ResetSecurityQuestion";
	public static final String GET_CHECK_MENUS_BY_USER = "getcheckmenusbyuser";
	public static final String ASSIGN_MENU_PERMISSION = "assignmenupermission";
	public static final String GET_MENUS_BY_MANAGER = "getmenusbymanager";
	public static final String GET_TIN_PAYER_DATA = "getTINPayerData";
	public static final String GET_W9_PDF_DATA = "getW9PdfData";



	//role constants
	public static final String SAVE_OR_UPDATE_ROLE = "saveorupdaterole";
	public static final String IN_ACTIVATE_ROLE = "inactivaterole";
	public static final String GET_USER_BY_ROLE = "getuserbyrole";
	public static final String GET_ASSIGNED_USER_BY_ROLE = "getassigneduserbyrole";
	public static final String GET_CHECK_MENUS_BY_ROLE = "getcheckmenusbyrole";
	public static final String LOAD_ROLES  = "loadRoles";
	public static final String GET_MENUS_BY_ROLE = "getmenusbyrole";
	
	//User constants
	public static final String FORGOT_USER_ID = "forgotUserId";
	public static final String CMD_URL_MAP_FORGOT_PASSWORD = "ForgotPassword";
	public static final String CMD_SET_NEW_PASSWORD = "SetNewPassword";
	public static final String LOAD_USERS = "loadusers";
	public static final String LOAD_ALL_USERS = "loadAllusers";
	public static final String LOAD_REPORT_TO = "loadReportTo";
	public static final String GET_USER_TYPE_LIST = "getUserTypeList";
	public static final String IN_ACTIVE_USER = "inactiveuser";
	public static final String IS_EMAIL_EXISTS = "isemailexists";
	public static final String SAVE_OR_UPDATE_USER = "saveorupdateuser";
	public static final String ASSIGNED_ROLE_TO_USER = "assignedroletouser";
	public static final String ASSIGNED_USER_PERMISSION = "assigneduserpermission";
	public static final String GET_CLIENT_LOCATION = "getClientLocation";
	public static final String PASSWORDCHGNXTTIME="passwordChangeNxtTime";
	public static final String GETSFIREPORT = "getSfiReport"; 
	public static final String PRINTSFIREPORT ="printSfiReport";
	public static final String RESET_PASSWORD = "resetPassword";
	public static final String LOAD_DTS_LIST = "loaddtslist";
	public static final String IMPORT_DTS= "importdts";
	
	public static final String USERID_MASK_STRING = "XlkmnghWrtOin";
	public static final String TOKEN_MASK_STRING = "BMQzOljihTmLOP";
	
	
	public static final String SFI_USER_CODE ="AD";
	public static final String SFI_ADMIN_CODE = "SFI";
	
	public enum ResponseCode{
        Success(100),
        RecordNotFound(200),
        EmptyResult(201),      
        RequireParam(203),
        RecordModifyFailure(204),
        ProcessFail(205),
        DBException(300),
       
        
        PASSWORDEXPIRED(295),
    	ATTEMPTSOVER(296),		
    	NOTMATCHED(297),
    	INACTIVE(298),
        
        ;
        ResponseCode(int val) {
            this.val = val;
        }
        
        private final int val;
        public int value(){
            return val;
        }
    }
}
