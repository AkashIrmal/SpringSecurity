package com.hovs.sfi.auth;

public class AuthConstants {

    public static final String ALGORITHM="MD5";
	public static final int ROLE_AUTH_USER = 2;
	public static final String STATE_ACTIVE = "Y";
	public static final String STATE_INACTIVE = "N";
	public static final String ACCOUNT_INACTIVE_REASON_NOT_ACTIVATED = "NotActivated";
	public static final int ROLE_AUTH_USER_FOURTEEN_DAY_WORKFLOW = 3;
	public static final int ROLE_PRE_AUTH_USER = 1;
	public static final int ROLE_ADMIN_USER = 4;
	public static final String ROLE_NAME_ADMIN_USER="ADMIN";
	public static final String ROLE_NAME_AUTH_USER ="USER";
	public static final String ROLE_NAME_PRE_AUTH_USER="PRE_AUTH";
	public static final String SESSION_AUTHENTICATION_FAILURE_TYPE = "SESSION_AUTHENTICATION_FAILURE_TYPE";
	public static final int USER_ACCOUNT_DISABLED = 1;
	public static final int USER_ACCOUNT_NOT_ACTIVATED = 4;
	public static final int USER_ACCOUNT_BAD_CREDENTIALS = 3;
	public static final int USER_MAXIMUM_SESSION = 5;
	public static final String CMD_VALIDATE_SECURITY_QUESTION_AND_ANSWER = "ValidateSecurityQuestionAndAnswer";
	
}
