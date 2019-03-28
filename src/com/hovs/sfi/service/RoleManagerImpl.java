package com.hovs.sfi.service;

import org.springframework.stereotype.Service;

import com.hovs.rule14.admin.ws.AssignMenuPermissionRequest;
import com.hovs.rule14.admin.ws.AssignMenuPermissionResult;
import com.hovs.rule14.admin.ws.AssignRolestoUsersRequest;
import com.hovs.rule14.admin.ws.AssignRolestoUsersResult;
import com.hovs.rule14.admin.ws.AssignUserPermissionRequest;
import com.hovs.rule14.admin.ws.AssignUserPermissionResult;
import com.hovs.rule14.admin.ws.GetAssignedUsersByRoleRequest;
import com.hovs.rule14.admin.ws.GetAssignedUsersByRoleResult;
import com.hovs.rule14.admin.ws.GetCheckedMenuByRoleResult;
import com.hovs.rule14.admin.ws.GetCheckedMenuByUserRequest;
import com.hovs.rule14.admin.ws.GetCheckedMenuByUserResult;
import com.hovs.rule14.admin.ws.GetCheckedMenusByRoleRequest;
import com.hovs.rule14.admin.ws.GetCurrentUsersByRoleRequest;
import com.hovs.rule14.admin.ws.GetCurrentUsersByRoleResult;
import com.hovs.rule14.admin.ws.GetManagersRequest;
import com.hovs.rule14.admin.ws.GetManagersResult;
import com.hovs.rule14.admin.ws.GetMenuByManagerRequest;
import com.hovs.rule14.admin.ws.GetMenuByRoleRequest;
import com.hovs.rule14.admin.ws.GetMenusByManagerResult;
import com.hovs.rule14.admin.ws.GetMenusByRolesResult;
import com.hovs.rule14.admin.ws.GetRoleRequest;
import com.hovs.rule14.admin.ws.GetRolesResult;
import com.hovs.rule14.admin.ws.InActivateRoleRequest;
import com.hovs.rule14.admin.ws.InActivateRoleResult;
import com.hovs.rule14.admin.ws.WsException_Exception;



@Service
public class RoleManagerImpl extends BaseManagerImpl implements RoleManager {

	@Override
	public GetManagersResult getManagers(GetManagersRequest request) throws WsException_Exception
		 {
		
			return getSFIAdminWebService().getManagers(request);
		
	}

	@Override
	public GetRolesResult getRoles(GetRoleRequest request)
			throws WsException_Exception {
		
		return getSFIAdminWebService().getRoles(request);
	}

	@Override
	public GetMenusByRolesResult getMenusByRole(GetMenuByRoleRequest request)
			throws WsException_Exception {
		
		return getSFIAdminWebService().getMenusByRole(request);
	}

	@Override
	public GetCheckedMenuByRoleResult getCheckedMenusByRole(
			GetCheckedMenusByRoleRequest request) throws WsException_Exception {
		
		return getSFIAdminWebService().getCheckedMenusByRole(request);
	}

	@Override
	public AssignMenuPermissionResult assignMenuPermissions(
			AssignMenuPermissionRequest request) throws WsException_Exception {
		
		return getSFIAdminWebService().assignMenuPermissions(request);
	}

	@Override
	public GetMenusByManagerResult getMenusByManager(
			GetMenuByManagerRequest request) throws WsException_Exception {
		return getSFIAdminWebService().getMenusByManager(request);
	}

	@Override
	public GetCheckedMenuByUserResult getCheckedMenusByUser(
			GetCheckedMenuByUserRequest request) throws WsException_Exception {
		
		return getSFIAdminWebService().getCheckedMenusByUser(request);
	}

	@Override
	public GetCurrentUsersByRoleResult getCurrentUsersByRole(
			GetCurrentUsersByRoleRequest request) throws WsException_Exception {
		
		return getSFIAdminWebService().getCurrentUsersByRole(request);
	}

	@Override
	public GetAssignedUsersByRoleResult getAssignedUsersByRole(
			GetAssignedUsersByRoleRequest request) throws WsException_Exception {
		
		return getSFIAdminWebService().getAssignedUsersByRole(request);
	}

	@Override
	public AssignRolestoUsersResult assignRolestoCurrentUsers(
			AssignRolestoUsersRequest request) throws WsException_Exception {
	
		return getSFIAdminWebService().assignRolestoCurrentUsers(request);
	}

	@Override
	public AssignUserPermissionResult assignUserPermissions(
			AssignUserPermissionRequest request) throws WsException_Exception {
		
		return getSFIAdminWebService().assignUserPermissions(request);
	}

	@Override
	public InActivateRoleResult inActivateRoles(InActivateRoleRequest request)
			throws WsException_Exception {
		
		return getSFIAdminWebService().inActivateRoles(request);
	}

}
