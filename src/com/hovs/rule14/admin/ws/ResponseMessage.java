
package com.hovs.rule14.admin.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for responseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="responseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exceptionMessaage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="responseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseMessage", propOrder = {
    "exceptionMessaage",
    "responseCode",
    "responseMessage"
})
@XmlSeeAlso({
    AuthenticateResult.class,
    GetMenusByRolesResult.class,
    SendNotificationToUsersResult.class,
    IsEmailExistsResult.class,
    AssignRolestoUsersResult.class,
    LoadUsersResult.class,
    GetRolesResult.class,
    GetCheckedMenuByRoleResult.class,
    ReportToMappingResult.class,
    LoadRolesResult.class,
    GetCheckedLabelsByClientLanguageResult.class,
    StatusUpdateSocialAccountResult.class,
    LoadManagersResult.class,
    DtsListResult.class,
    GetMenusByManagerResult.class,
    SendNotificationResult.class,
    GeneratePasswordResult.class,
    SaveOrUpdateSocialAccountResult.class,
    GetAssignedUsersByRoleResult.class,
    LoadClientsResult.class,
    ChangePasswordResult.class,
    LoadProjectsResult.class,
    LoadSocialAccountDetailsByIdResult.class,
    LoadMenusResult.class,
    GetCheckedMenuByUserResult.class,
    ForgotLoginNameResult.class,
    GetCheckedIconsByClientResult.class,
    ForgotPasswordResult.class,
    GetCurrentUsersByRoleResult.class,
    MonitoringSocialAccountsResult.class,
    UpdateRolesofUsersResult.class,
    GetMenuDetailResult.class,
    IsModuleExistsResult.class,
    ImportDataWithDtsResult.class,
    InActivateMenuResult.class,
    DownloadDtsTemplateResult.class,
    SaveOrUpdateClientLocationResult.class,
    GetTwitterConfigListResult.class,
    UserActivateResult.class,
    AccountTypeResult.class,
    SaveOrUpdateUserResult.class,
    GetAutoResponseTwitterConfigTopicsResult.class,
    LoadIconConfigResult.class,
    GetParentMenusResult.class,
    TreasuryMessageResult.class,
    SaveOrUpdateMenuResult.class,
    IsValidModuleResult.class,
    GetLastLoginTimeResult.class,
    AssignUserPermissionResult.class,
    IsUniqueClientCodeResult.class,
    InActivateIconConfigResult.class,
    IsUserIdExistsResult.class,
    SaveOrUpdateIconConfigByClientResult.class,
    LoadAllIconConfigResult.class,
    GetDtsExportSummaryResult.class,
    GetDtsTemplateDetailsResult.class,
    InActivateUserResult.class,
    SaveOrUpdateLabelsByClientResult.class,
    GetClientLocationResult.class,
    SaveOrUpdateModuleResult.class,
    KbaQuestionResult.class,
    IsSsnExistsResult.class,
    LoadAllLabelsResult.class,
    PasswordListResult.class,
    AssignMenuPermissionResult.class,
    UpdateSessionResult.class,
    InActivateTwitterConfigResult.class,
    IsExistsAppNameByClientResult.class,
    AssignMenuByRoleResult.class,
    IsUniqueClientNameResult.class,
    GetUserTypeListByClientIdResult.class,
    SaveOrUpdateIconConfigResult.class,
    IsSupervisorResult.class,
    GetManagersResult.class,
    SaveOrUpdateTwitterConfigResult.class,
    GetModulesResult.class,
    SaveOrUpdateClientResult.class,
    UpdateAutoResponseTwitterConfigResult.class,
    OtpResult.class,
    SaveSessionResult.class,
    LanguageResult.class,
    InActivateClientResult.class,
    InActivateRoleResult.class,
    DownloadExportedDataWithDtsResult.class,
    SaveorUpdateRoleResult.class,
    UpdateQuestionListResult.class,
    ExportDataWithDtsResult.class,
    UserURLMapResult.class,
    SaveUserMenuResult.class,
    FailedTinValResult.class,
    GetClientListResult.class,
    LangLabelResult.class,
    InActivateModuleResult.class
})
public abstract class ResponseMessage {

    protected String exceptionMessaage;
    protected int responseCode;
    protected String responseMessage;

    /**
     * Gets the value of the exceptionMessaage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionMessaage() {
        return exceptionMessaage;
    }

    /**
     * Sets the value of the exceptionMessaage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionMessaage(String value) {
        this.exceptionMessaage = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

}
