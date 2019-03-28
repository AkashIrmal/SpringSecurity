package com.hovs.sfi.service;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.hovs.rule14.admin.ws.AccountTypeResult;
import com.hovs.rule14.admin.ws.AuthenticateRequest;
import com.hovs.rule14.admin.ws.AuthenticateResult;
import com.hovs.rule14.admin.ws.ChangePasswordRequest;
import com.hovs.rule14.admin.ws.ChangePasswordResult;
import com.hovs.rule14.admin.ws.ForgotLoginNameRequest;
import com.hovs.rule14.admin.ws.ForgotLoginNameResult;
import com.hovs.rule14.admin.ws.ForgotPasswordRequest;
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
import com.hovs.rule14.admin.ws.SaveUserURLMapRequest;
import com.hovs.rule14.admin.ws.SaveorUpdateRoleResult;
import com.hovs.rule14.admin.ws.SendNotificationResult;
import com.hovs.rule14.admin.ws.SfiNotificationRequest;
import com.hovs.rule14.admin.ws.UpdateSessionRequest;
import com.hovs.rule14.admin.ws.UpdateSessionResult;
import com.hovs.rule14.admin.ws.UserURLMapRequest;
import com.hovs.rule14.admin.ws.UserURLMapResult;
import com.hovs.rule14.admin.ws.ValidModuleRequest;
import com.hovs.rule14.admin.ws.WsException_Exception;
import com.hovs.rule14.sfi.ws.GetUserProfileRequest;
import com.hovs.rule14.sfi.ws.GetUserResponse;
import com.hovs.rule14.sfi.ws.SaveUpdateUserProfileRequest;
import com.hovs.rule14.sfi.ws.SaveUpdateUserResult;
import com.hovs.sfi.common.AppConstants;
import com.hovs.sfi.model.User;
import com.hovs.sfi.util.CommonUtil;
import com.hovs.sfi.util.HttpUtil;

@Service
public class UserManagerImpl extends BaseManagerImpl implements UserManager {

	protected Log logger = LogFactory.getLog(getClass());
	
	@Override
	public User getUser(String aLoginName) {
		User user = new User();
		AuthenticateRequest authWSRequest = new AuthenticateRequest();
		authWSRequest.setLoginName(aLoginName);
		AuthenticateResult authWSResponse;
		try {
			authWSResponse = getSFIAdminWebService().loadUserIdByUserName(authWSRequest);
		
			if( authWSResponse != null && authWSResponse.getUser() != null){
				com.hovs.rule14.admin.ws.User wsUserInstance = authWSResponse.getUser();
				user.setId(wsUserInstance.getUserId());
				user.setLoginName(wsUserInstance.getLoginName());
				user.setPassword(wsUserInstance.getPassword());
				user.setClientId(wsUserInstance.getClientId());
				user.setClientLogo(wsUserInstance.getClientLogo());
				user.setState("Y");
				user.setPoiId(wsUserInstance.getPoiId());
				user.setEmailId(wsUserInstance.getEmailId());
				user.setIsAdmin(wsUserInstance.getAdminFlag());
				user.setPasswordChangeFirstTime(wsUserInstance.getPasswordchangenxttm());
				user.setIsSupervisor(wsUserInstance.getIsSupervisor());
				user.setAccountType(wsUserInstance.getAccountType());
				user.setAccountTypeCode(wsUserInstance.getAccountTypeCode());
				user.setUserTypeCode(wsUserInstance.getUserType());
				logger.debug("UserManagerImpl.loadUserIdByUserName[LoginName:" + wsUserInstance.getLoginName() + ".State:"+ wsUserInstance.getActive() + ",AccountInActiveReason:" + wsUserInstance.getAccountInActiveReason()+"]");
				return user;
			}
		} catch (WsException_Exception e) {
			logger.error("Erorr while calling loadUserIdByUserName web service :" , e);
		}
		return null;
	}

	@Override
	public ForgotPasswordResult forgotPassword(String userName) {
		ForgotPasswordRequest fr=new ForgotPasswordRequest();
		fr.setLoginName(userName);
		try {
			ForgotPasswordResult f=getSFIAdminWebService().forgotPassword(fr);
			return f;
		} catch (WsException_Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LoadManagersResult loadManagers(
			LoadManagersRequest loadManagersRequest) {
		try {
			LoadManagersResult loadManagersResult=getSFIAdminWebService().loadManagers(loadManagersRequest);
			return loadManagersResult;
		} catch (WsException_Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LoadProjectsResult loadProjects(LoadProjectRequest loadProjectRequest) {
		try {
			LoadProjectsResult loadProjectsResult=getSFIAdminWebService().loadProjects(loadProjectRequest);
			return loadProjectsResult;
		} catch (WsException_Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LoadClientsResult loadClients(LoadClientsRequest request) {
		try {
			LoadClientsResult loadClientsResult=getSFIAdminWebService().loadClients(request);
			return loadClientsResult;
		} catch (WsException_Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public IsSupervisorResult isSupervisor(IsSupervisorRequest request) {
		try {
			IsSupervisorResult isSupervisorResult=getSFIAdminWebService().isSupervisor(request);
			return isSupervisorResult;
		} catch (WsException_Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public IsValidModuleResult isValidModule(ValidModuleRequest request) {
		try {
			IsValidModuleResult isValidModuleResult=getSFIAdminWebService().isValidModule(request);
			return isValidModuleResult;
		} catch (WsException_Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LoadMenusResult loadMenus(LoadMenusRequest request) {
		try {
			LoadMenusResult loadMenusResult=getSFIAdminWebService().loadMenus(request);
			return loadMenusResult;
		} catch (WsException_Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LoadProjectsResult loadProjectGroups(LoadProjectRequest request) {
		try {
			LoadProjectsResult loadProjectsResult=getSFIAdminWebService().loadProjectGroups(request);
			return loadProjectsResult;
		} catch (WsException_Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ForgotLoginNameResult forgotLoginName(ForgotLoginNameRequest request) {
		
		try {
			ForgotLoginNameResult forgotLoginNameResult=getSFIAdminWebService().forgotLoginName(request);
			return forgotLoginNameResult;
		} catch (WsException_Exception e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public KbaQuestionResult getKBAQuestionList() throws WsException_Exception {
		return getSFIAdminWebService().getKBAQuestionList();
	}

	@Override
	public AccountTypeResult getAccountTypeList() throws WsException_Exception {
		return getSFIAdminWebService().getAccountTypeList();
	}

	@Override
	public SaveUpdateUserResult saveOrUpdateUserDetails(SaveUpdateUserProfileRequest lSaveUpdateUserProfileRequest)throws com.hovs.rule14.sfi.ws.WsException_Exception {
		return getSFIWebService().saveOrUpdateUserDetails(lSaveUpdateUserProfileRequest);
	}

	@Override
	public GetUserResponse getUserDetails(GetUserProfileRequest lGetUserProfileRequest)
			throws com.hovs.rule14.sfi.ws.WsException_Exception {
		return getSFIWebService().getUserProfile(lGetUserProfileRequest);
	}

	@Override
	public SaveUpdateUserResult saveOrUpdateUserProfile(
			SaveUpdateUserProfileRequest lSaveUpdateUserProfileRequest)
			throws com.hovs.rule14.sfi.ws.WsException_Exception {
		
		return getSFIWebService().saveOrUpdateUserProfile(lSaveUpdateUserProfileRequest);
	} 
	
	@Override
	public IsEmailExistsResult isEmailExits(
			IsEmailExistRequest lIsEmailExistRequest)
			throws WsException_Exception {
		return getSFIAdminWebService().isEmailExists(lIsEmailExistRequest);
	}

	@Override
	public KbaQuestionResult getUserKBAQuestionList(
			KbaSecurityRequest kbaSecurityRequest) throws WsException_Exception {
		// TODO Auto-generated method stub
		return getSFIAdminWebService().getUserKBASecurityQuestionList(kbaSecurityRequest);
	}

	@Override
	public KbaQuestionResult validateForKBASecurity(
			KbaSecurityRequest kbaSecurityRequest) throws WsException_Exception {
		return getSFIAdminWebService().validateForKBASecurity(kbaSecurityRequest);
	}

	@Override
	public UserURLMapResult saveUserUrlMap(HttpServletRequest aRequest,
			int userId, int clientId, int projectId, String actualBusinessOperationCMD,
			boolean aOTPActivation, String cellPhone) throws WsException_Exception {

		SaveUserURLMapRequest saveUrlMapRequest = new SaveUserURLMapRequest();
		if(!aOTPActivation){
			String domainURL = HttpUtil.getApplicationDomainURLPath(aRequest);
			//System.out.println("Domain URL ===========>>> :"+domainURL);
			logger.debug("Domain URL ===========>>> :"+domainURL);
			String uuid = UUID.randomUUID().toString();
			String urlPath = null;
			String actualPath = null;
			if(aRequest.getContextPath() == null){
				urlPath = domainURL + "/" +  AppConstants.MAP_CONTROLLER_URL + AppConstants.QUESTION_MARK +"token=" + uuid;
				actualPath = domainURL + "/" +actualBusinessOperationCMD ;
			} else {
				urlPath = domainURL + aRequest.getContextPath()  + "/" +  AppConstants.MAP_CONTROLLER_URL + AppConstants.QUESTION_MARK +"token=" + uuid;
				actualPath = domainURL + aRequest.getContextPath() + "/" +actualBusinessOperationCMD ;
			}
			logger.debug("urlPath =========>>>>:"+urlPath);
			saveUrlMapRequest.setTokenId(uuid);
			saveUrlMapRequest.setUserId(userId);
			saveUrlMapRequest.setClientId(clientId);
			saveUrlMapRequest.setProjectId(projectId);
			saveUrlMapRequest.setUrlPath(urlPath); // This path is added into the email as a link.
			saveUrlMapRequest.setMode(AppConstants.SP_IMODE_1); // IMODE 1 for save.
			saveUrlMapRequest.setBusinessActualUrlPath(actualPath); // This is actual business operation for the 
			saveUrlMapRequest.setUrl(HttpUtil.getApplicationDomainURLPath(aRequest)+(aRequest.getContextPath().toString().isEmpty()? "":aRequest.getContextPath()));
			logger.debug("saveUrlMapRequest.getUrlPath(  ====>>>>>>" +saveUrlMapRequest.getUrlPath());
			if(AppConstants.FORGOT_PASSWORD_URL.equals(actualBusinessOperationCMD)){
				saveUrlMapRequest.setExpiryDate(CommonUtil.getNextAddedHourDate(AppConstants.LINK_EXPIRY_TWO_HOUR)); // 2 Hours validity for the URL.	
			}/*else if(AppConstants.ACTIVATE_ACCOUNT_URL.equals(actualBusinessOperationCMD)){
				saveUrlMapRequest.setExpiryDate(CommonUtil.getNextAddedHourDate(AppConstants.LINK_EXPIRY_TWENTY_FOUR_HOUR)); // 24 Hours validity for the URL.
			}else if(AppConstants.RESET_SECURITY_QUESTION_URL.equals(actualBusinessOperationCMD)){
				saveUrlMapRequest.setExpiryDate(CommonUtil.getNextAddedHourDate(AppConstants.LINK_EXPIRY_TWO_HOUR)); // 2 Hours validity for the URL.
			}*/
		}else{
			saveUrlMapRequest.setUserId(userId);
			saveUrlMapRequest.setClientId(clientId);
			saveUrlMapRequest.setProjectId(projectId);
			saveUrlMapRequest.setCellPhone(cellPhone);
			saveUrlMapRequest.setOTPFlag(true);
		}	
		return getSFIAdminWebService().saveUserUrlMap(saveUrlMapRequest);
	
	}

	@Override
	public UserURLMapResult getUserUrlMap(UserURLMapRequest userURLMapRequest)
			throws WsException_Exception {
		return getSFIAdminWebService().getUserUrlMap(userURLMapRequest);
	}

	@Override
	public ChangePasswordResult changePassword(
			ChangePasswordRequest changePasswordRequest)throws WsException_Exception {
		return getSFIAdminWebService().changePasswordWithoutOldPassword(changePasswordRequest);
	}

	@Override
	public UserURLMapResult updateUserUrlMap(UserURLMapRequest userURLMapRequest)
			throws WsException_Exception {
		return getSFIAdminWebService().updateUserUrlMap(userURLMapRequest);
	}

	@Override
	public LoadRolesResult loadRoles(LoadRoleRequest request)
			throws WsException_Exception {
		
		return getSFIAdminWebService().loadRoles(request);
	}

	@Override
	public GetClientListResult getClientListByUser(GetClientListRequest request)
			throws WsException_Exception {
	
		return getSFIAdminWebService().getClientListByUser(request);
	}

	@Override
	public SaveorUpdateRoleResult saveOrUpdateRole(SaveUpdateRoleRequest request)
			throws WsException_Exception {
		
		return getSFIAdminWebService().saveOrUpdateRole(request);
	}

	@Override
	public LoadUsersResult loadUsers(LoadUsersRequest request)
			throws WsException_Exception {
		return getSFIAdminWebService().loadUsers(request);
	}

	@Override
	public ReportToMappingResult loadReportTo(ReportToMappingRequest request)
			throws WsException_Exception {
		
		return getSFIAdminWebService().loadReportTo(request);
	}

	@Override
	public GetUserTypeListByClientIdResult getUserTypeListByClientId(
			GetUserTypeListByClientIdRequest request)
			throws WsException_Exception {
		
		return getSFIAdminWebService().getUserTypeListByClientId(request);
	}

	@Override
	public GetClientLocationResult getClientLocation(
			GetClientLocationRequest request) throws WsException_Exception {
		
		return getSFIAdminWebService().getClientLocation(request);
	}

	@Override
	public IsEmailExistsResult isEmailExists(IsEmailExistRequest request)
			throws WsException_Exception {
		
		return getSFIAdminWebService().isEmailExists(request);
	}

	@Override
	public SaveOrUpdateUserResult saveOrUpdateUsers(
			SaveUpdateUserRequest request) throws WsException_Exception {
		
		return getSFIAdminWebService().saveOrUpdateUsers(request);
	}

	@Override
	public InActivateUserResult inActivateUsers(InActivateUserRequest request)
			throws WsException_Exception {
		
		return getSFIAdminWebService().inActivateUsers(request);
	}

	@Override
	public SaveUpdateUserResult passwordChangeNextTime(int id) throws com.hovs.rule14.sfi.ws.WsException_Exception {
	
		return getSFIWebService().passwordChangeNxtTimeFlag(id);
	}

	@Override
	public SendNotificationResult sendSFINotification(
			SfiNotificationRequest lSfiNotificationRequest)
			throws WsException_Exception {
		return getSFIAdminWebService().sendSFINotification(lSfiNotificationRequest);
		
	}

	@Override
	public AuthenticateResult getUserByLoginName(
			AuthenticateRequest authWSRequest) throws WsException_Exception {
		return getSFIAdminWebService().loadUserIdByUserName(authWSRequest);
	}
	@Override
	public boolean updatePasswordByUserId(com.hovs.rule14.admin.ws.User aUser)
			throws WsException_Exception {
		
		return getSFIAdminWebService().updatePasswordByUserId(aUser);
	}

	@Override
	public LoadUsersResult loadAllUsers(LoadUsersRequest aRequest)
			throws WsException_Exception {
		
		return getSFIAdminWebService().loadAllUsers(aRequest);
	}

	@Override
	public SaveSessionResult saveSessionLog(SaveSessionRequest lSessionRequest)
			throws WsException_Exception {
		return getSFIAdminWebService().saveSession(lSessionRequest);
	}

	@Override
	public UpdateSessionResult updateSessionLog(UpdateSessionRequest updateSessionRequest) throws WsException_Exception {
		return getSFIAdminWebService().updateSession(updateSessionRequest);
	}

	@Override
	public ChangePasswordResult changePasswordAdminUser(
			ChangePasswordRequest changePasswordRequest)
			throws WsException_Exception {
		return getSFIAdminWebService().changePassword(changePasswordRequest);
	}
}
