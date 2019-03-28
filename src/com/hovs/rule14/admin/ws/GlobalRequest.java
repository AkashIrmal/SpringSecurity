
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for globalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="globalRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="efileFormId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="efileId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eformId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "globalRequest", propOrder = {
    "clientId",
    "efileFormId",
    "efileId",
    "eformId",
    "projectId",
    "userId"
})
@XmlSeeAlso({
    LoadAllLabelsRequest.class,
    SendNotificationRequest.class,
    StatusUpdateSocialAccountRequest.class,
    LoadManagersRequest.class,
    InActivateRoleRequest.class,
    InActivateClientRequest.class,
    GetManagersRequest.class,
    LoadUsersRequest.class,
    GetTwitterConfigListRequest.class,
    IsUniqueClientNameRequest.class,
    GetMenuDetailRequest.class,
    IsUniqueClientCodeRequest.class,
    GetParentMenusRequest.class,
    InActivateIconConfigRequest.class,
    InActivateTwitterConfigRequest.class,
    LoadAllIconConfigRequest.class,
    ValidModuleRequest.class,
    GetClientListRequest.class,
    LoadMenusRequest.class,
    GetModulesRequest.class,
    MonitoringSocialAccountsRequest.class,
    InActivateMenuRequest.class,
    GetAutoResponseTwitterConfigTopicsRequest.class,
    LoadIconConfigRequest.class,
    DefaultChildMenuRequest.class,
    InActivateUserRequest.class,
    LoadProjectRequest.class,
    InActivateModuleRequest.class,
    IsModuleExistsRequest.class,
    SaveOrUpdateSocialAccountRequest.class,
    SendNotificationToUsersRequest.class,
    DtsListRequest.class,
    ReportToMappingRequest.class,
    LoadSocialAccountDetailsByIdRequest.class,
    UpdateAutoReponseTwitterConfigRequest.class,
    SaveUpdateLabelsByClientRequest.class,
    GetCheckedMenusByRoleRequest.class,
    GetLastLoginTimeRequest.class,
    UpdateQuestionListRequest.class,
    GetCheckedLabelsByClientLanguageRequest.class,
    SaveUpdateClientRequest.class,
    ImportDataWithDtsRequest.class,
    GetMenuByRoleRequest.class,
    SaveUserMenuRequest.class,
    OtpRequest.class,
    AssignUserPermissionRequest.class,
    GetCheckedMenuByUserRequest.class,
    SaveUserURLMapRequest.class,
    SaveUpdateModuleRequest.class,
    UpdateRolesofUsersRequest.class,
    LoadClientsRequest.class,
    GetCurrentUsersByRoleRequest.class,
    AssignMenuByRoleRequest.class,
    SaveUpdateIconConfigByClientRequest.class,
    SaveUpdateRoleRequest.class,
    TreasuryMessageRequest.class,
    DownloadExportedDataWithDtsRequest.class,
    SaveUpdateUserRequest.class,
    ExportDataWithDtsRequest.class,
    IsUserIdExistRequest.class,
    GetDtsTemplateDetailsRequest.class,
    SaveOrUpdateClientLocationRequest.class,
    IsEmailExistRequest.class,
    UpdateSessionRequest.class,
    GetRoleRequest.class,
    AssignMenuPermissionRequest.class,
    IsSsnExistRequest.class,
    LoadRoleRequest.class,
    DownloadDtsTemplateRequest.class,
    UserURLMapRequest.class,
    SaveSessionRequest.class,
    GetMenuByManagerRequest.class,
    SaveUpdateIconConfigRequest.class,
    GetDtsExportSummaryRequest.class,
    SaveUpdateMenuRequest.class,
    GetAssignedUsersByRoleRequest.class,
    GetCheckedIconByClientRequest.class,
    IsExistAppNameByClientRequest.class,
    IsSupervisorRequest.class,
    KbaSecurityRequest.class,
    AssignRolestoUsersRequest.class,
    SaveUpdateTwitterConfigRequest.class,
    GetClientLocationRequest.class,
    FailedTinValRequest.class,
    LangLabelRequest.class,
    GetUserTypeListByClientIdRequest.class
})
public abstract class GlobalRequest {

    protected Integer clientId;
    protected Integer efileFormId;
    protected long efileId;
    protected long eformId;
    protected Integer projectId;
    protected Integer userId;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientId(Integer value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the efileFormId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEfileFormId() {
        return efileFormId;
    }

    /**
     * Sets the value of the efileFormId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEfileFormId(Integer value) {
        this.efileFormId = value;
    }

    /**
     * Gets the value of the efileId property.
     * 
     */
    public long getEfileId() {
        return efileId;
    }

    /**
     * Sets the value of the efileId property.
     * 
     */
    public void setEfileId(long value) {
        this.efileId = value;
    }

    /**
     * Gets the value of the eformId property.
     * 
     */
    public long getEformId() {
        return eformId;
    }

    /**
     * Sets the value of the eformId property.
     * 
     */
    public void setEformId(long value) {
        this.eformId = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectId(Integer value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

}
