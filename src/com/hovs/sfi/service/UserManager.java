package com.hovs.sfi.service;

import javax.servlet.http.HttpServletRequest;

import com.hovs.rule14.admin.ws.AccountTypeResult;
import com.hovs.rule14.admin.ws.AuthenticateRequest;
import com.hovs.rule14.admin.ws.AuthenticateResult;
import com.hovs.rule14.admin.ws.ChangePasswordRequest;
import com.hovs.rule14.admin.ws.ChangePasswordResult;
import com.hovs.rule14.admin.ws.ForgotLoginNameRequest;
import com.hovs.rule14.admin.ws.ForgotLoginNameResult;
import com.hovs.rule14.admin.ws.ForgotPasswordResult;
import com.hovs.rule14.admin.ws.GetClientListRequest;
import com.hovs.rule14.admin.ws.GetClientListResult;
import com.hovs.rule14.admin.ws.GetClientLocationRequest;
import com.hovs.rule14.admin.ws.GetClientLocationResult;
import com.hovs.rule14.admin.ws.GetUserTypeListByClientIdRequest;
import com.hovs.rule14.admin.ws.GetUserTypeListByClientIdResult;
import com.hovs.rule14.admin.ws.InActivateUserRequest;
import com.hovs.rule14.admin.ws.InActivateUserResult;
import com.hovs.rule14.admin.ws.IsEmailExistRequest;
import com.hovs.rule14.admin.ws.IsEmailExistsResult;
import com.hovs.rule14.admin.ws.IsSupervisorRequest;
import com.hovs.rule14.admin.ws.IsSupervisorResult;
import com.hovs.rule14.admin.ws.IsValidModuleResult;
import com.hovs.rule14.admin.ws.KbaQuestionResult;
import com.hovs.rule14.admin.ws.KbaSecurityRequest;
import com.hovs.rule14.admin.ws.LoadClientsRequest;
import com.hovs.rule14.admin.ws.LoadClientsResult;
import com.hovs.rule14.admin.ws.LoadManagersRequest;
import com.hovs.rule14.admin.ws.LoadManagersResult;
import com.hovs.rule14.admin.ws.LoadMenusRequest;
import com.hovs.rule14.admin.ws.LoadMenusResult;
import com.hovs.rule14.admin.ws.LoadProjectRequest;
import com.hovs.rule14.admin.ws.LoadProjectsResult;
import com.hovs.rule14.admin.ws.LoadRoleRequest;
import com.hovs.rule14.admin.ws.LoadRolesResult;
import com.hovs.rule14.admin.ws.LoadUsersRequest;
import com.hovs.rule14.admin.ws.LoadUsersResult;
import com.hovs.rule14.admin.ws.ReportToMappingRequest;
import com.hovs.rule14.admin.ws.ReportToMappingResult;
import com.hovs.rule14.admin.ws.SaveOrUpdateUserResult;
import com.hovs.rule14.admin.ws.SaveSessionRequest;
import com.hovs.rule14.admin.ws.SaveSessionResult;
import com.hovs.rule14.admin.ws.SaveUpdateRoleRequest;
import com.hovs.rule14.admin.ws.SaveUpdateUserRequest;
import com.hovs.rule14.admin.ws.SaveorUpdateRoleResult;
import com.hovs.rule14.admin.ws.SendNotificationResult;
import com.hovs.rule14.admin.ws.SfiNotificationRequest;
import com.hovs.rule14.admin.ws.UpdateSessionRequest;
import com.hovs.rule14.admin.ws.UpdateSessionResult;
import com.hovs.rule14.admin.ws.UserURLMapRequest;
import com.hovs.rule14.admin.ws.UserURLMapResult;
import com.hovs.rule14.admin.ws.ValidModuleRequest;
import com.hovs.rule14.admin.ws.WsException;
import com.hovs.rule14.admin.ws.WsException_Exception;
import com.hovs.rule14.sfi.ws.GetUserProfileRequest;
import com.hovs.rule14.sfi.ws.GetUserResponse;
import com.hovs.rule14.sfi.ws.SaveUpdateUserProfileRequest;
import com.hovs.rule14.sfi.ws.SaveUpdateUserResult;
import com.hovs.sfi.model.User;

public interface UserManager {

	public User getUser(String aLoginName);
	
	public ForgotPasswordResult forgotPassword(String userName);
	public  LoadManagersResult loadManagers(LoadManagersRequest loadManagersRequest);
	
	public LoadProjectsResult loadProjects(LoadProjectRequest loadProjectRequest);
	
	public LoadClientsResult loadClients(LoadClientsRequest request);
	
	public IsSupervisorResult isSupervisor(IsSupervisorRequest request);
	public IsValidModuleResult isValidModule(ValidModuleRequest request);
	
	public LoadMenusResult loadMenus(LoadMenusRequest request);
	
	public LoadProjectsResult loadProjectGroups(LoadProjectRequest request);
	public ForgotLoginNameResult forgotLoginName(ForgotLoginNameRequest request);

	public KbaQuestionResult getKBAQuestionList() throws WsException_Exception;

	public AccountTypeResult getAccountTypeList()throws WsException_Exception;

	public SaveUpdateUserResult saveOrUpdateUserDetails(
			SaveUpdateUserProfileRequest lSaveUpdateUserProfileRequest)throws com.hovs.rule14.sfi.ws.WsException_Exception;
	public SaveUpdateUserResult saveOrUpdateUserProfile(
			SaveUpdateUserProfileRequest lSaveUpdateUserProfileRequest)throws com.hovs.rule14.sfi.ws.WsException_Exception;
	public GetUserResponse getUserDetails(GetUserProfileRequest setUserId)throws com.hovs.rule14.sfi.ws.WsException_Exception;

	public IsEmailExistsResult isEmailExits(
			IsEmailExistRequest lIsEmailExistRequest)throws WsException_Exception;

	public KbaQuestionResult getUserKBAQuestionList(
			KbaSecurityRequest kbaSecurityRequest)throws WsException_Exception;

	public KbaQuestionResult validateForKBASecurity(
			KbaSecurityRequest kbaSecurityRequest)throws WsException_Exception;

	public UserURLMapResult saveUserUrlMap(HttpServletRequest aRequest,int userId, int clientId, int projectId, String forgotPasswordUrl,boolean isOTP, String cellPhone)throws WsException_Exception;

	public UserURLMapResult getUserUrlMap(UserURLMapRequest userURLMapRequest)throws WsException_Exception;

	public ChangePasswordResult changePassword(
			ChangePasswordRequest changePasswordRequest)throws WsException_Exception;

	public UserURLMapResult updateUserUrlMap(UserURLMapRequest userURLMapRequest)throws WsException_Exception;
	
	public LoadRolesResult loadRoles(LoadRoleRequest request)throws WsException_Exception ;
	
	public GetClientListResult getClientListByUser(GetClientListRequest request) throws WsException_Exception;
	
	public SaveorUpdateRoleResult saveOrUpdateRole(SaveUpdateRoleRequest request) throws WsException_Exception;
	
	public LoadUsersResult loadUsers(LoadUsersRequest request)throws WsException_Exception;
	
	public ReportToMappingResult loadReportTo(ReportToMappingRequest request)throws WsException_Exception;
	
	public GetUserTypeListByClientIdResult getUserTypeListByClientId(GetUserTypeListByClientIdRequest request)throws WsException_Exception;
	
	public GetClientLocationResult getClientLocation(GetClientLocationRequest request) throws WsException_Exception;
	
	public IsEmailExistsResult isEmailExists(IsEmailExistRequest request)throws WsException_Exception;	
	
	public SaveOrUpdateUserResult saveOrUpdateUsers(SaveUpdateUserRequest request)throws WsException_Exception;
	public InActivateUserResult inActivateUsers(InActivateUserRequest request)throws WsException_Exception;

	public SaveUpdateUserResult passwordChangeNextTime(int id) throws com.hovs.rule14.sfi.ws.WsException_Exception;

	public SendNotificationResult sendSFINotification(
			SfiNotificationRequest lSfiNotificationRequest)throws WsException_Exception;
	
	public boolean updatePasswordByUserId(com.hovs.rule14.admin.ws.User aUser) throws WsException_Exception ;


	public AuthenticateResult getUserByLoginName(AuthenticateRequest authWSRequest)throws WsException_Exception;
	

public LoadUsersResult loadAllUsers(LoadUsersRequest aRequest)throws WsException_Exception;

public SaveSessionResult saveSessionLog(SaveSessionRequest lSessionRequest)throws WsException_Exception;

public UpdateSessionResult updateSessionLog(UpdateSessionRequest updateSessionRequest)throws WsException_Exception;

public ChangePasswordResult changePasswordAdminUser(ChangePasswordRequest changePasswordRequest)throws WsException_Exception;
}
