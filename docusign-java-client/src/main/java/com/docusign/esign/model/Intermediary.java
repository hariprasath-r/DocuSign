package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AuthenticationStatus;
import com.docusign.esign.model.DocumentVisibility;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.IdCheckInformationInput;
import com.docusign.esign.model.RecipientAttachment;
import com.docusign.esign.model.RecipientEmailNotification;
import com.docusign.esign.model.RecipientPhoneAuthentication;
import com.docusign.esign.model.RecipientSAMLAuthentication;
import com.docusign.esign.model.RecipientSMSAuthentication;
import com.docusign.esign.model.SocialAuthentication;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Intermediary
 */

public class Intermediary {
  @JsonProperty("accessCode")
  private String accessCode = null;

  @JsonProperty("addAccessCodeToEmail")
  private String addAccessCodeToEmail = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("customFields")
  private java.util.List<String> customFields = new java.util.ArrayList<String>();

  @JsonProperty("declinedDateTime")
  private String declinedDateTime = null;

  @JsonProperty("declinedReason")
  private String declinedReason = null;

  @JsonProperty("deliveredDateTime")
  private String deliveredDateTime = null;

  @JsonProperty("deliveryMethod")
  private String deliveryMethod = null;

  @JsonProperty("documentVisibility")
  private java.util.List<DocumentVisibility> documentVisibility = new java.util.ArrayList<DocumentVisibility>();

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("emailNotification")
  private RecipientEmailNotification emailNotification = null;

  @JsonProperty("emailRecipientPostSigningURL")
  private String emailRecipientPostSigningURL = null;

  @JsonProperty("embeddedRecipientStartURL")
  private String embeddedRecipientStartURL = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("excludedDocuments")
  private java.util.List<String> excludedDocuments = new java.util.ArrayList<String>();

  @JsonProperty("faxNumber")
  private String faxNumber = null;

  @JsonProperty("idCheckConfigurationName")
  private String idCheckConfigurationName = null;

  @JsonProperty("idCheckInformationInput")
  private IdCheckInformationInput idCheckInformationInput = null;

  @JsonProperty("inheritEmailNotificationConfiguration")
  private String inheritEmailNotificationConfiguration = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("note")
  private String note = null;

  @JsonProperty("phoneAuthentication")
  private RecipientPhoneAuthentication phoneAuthentication = null;

  @JsonProperty("recipientAttachments")
  private java.util.List<RecipientAttachment> recipientAttachments = new java.util.ArrayList<RecipientAttachment>();

  @JsonProperty("recipientAuthenticationStatus")
  private AuthenticationStatus recipientAuthenticationStatus = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("requireIdLookup")
  private String requireIdLookup = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("routingOrder")
  private String routingOrder = null;

  @JsonProperty("samlAuthentication")
  private RecipientSAMLAuthentication samlAuthentication = null;

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("signedDateTime")
  private String signedDateTime = null;

  @JsonProperty("signingGroupId")
  private String signingGroupId = null;

  @JsonProperty("signingGroupName")
  private String signingGroupName = null;

  @JsonProperty("signingGroupUsers")
  private java.util.List<UserInfo> signingGroupUsers = new java.util.ArrayList<UserInfo>();

  @JsonProperty("smsAuthentication")
  private RecipientSMSAuthentication smsAuthentication = null;

  @JsonProperty("socialAuthentications")
  private java.util.List<SocialAuthentication> socialAuthentications = new java.util.ArrayList<SocialAuthentication>();

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("totalTabCount")
  private String totalTabCount = null;

  @JsonProperty("userId")
  private String userId = null;

  public Intermediary accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.
   * @return accessCode
  **/
  @ApiModelProperty(example = "null", value = "If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.   Maximum Length: 50 characters and it must conform to the account's access code format setting.  If blank, but the signer `accessCode` property is set in the envelope, then that value is used.  If blank and the signer `accessCode` property is not set, then the access code is not required.")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public Intermediary addAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
    return this;
  }

   /**
   * This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.
   * @return addAccessCodeToEmail
  **/
  @ApiModelProperty(example = "null", value = "This Optional attribute indicates that the access code will be added to the email sent to the recipient; this nullifies the Security measure of Access Code on the recipient.")
  public String getAddAccessCodeToEmail() {
    return addAccessCodeToEmail;
  }

  public void setAddAccessCodeToEmail(String addAccessCodeToEmail) {
    this.addAccessCodeToEmail = addAccessCodeToEmail;
  }

  public Intermediary clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. 
   * @return clientUserId
  **/
  @ApiModelProperty(example = "null", value = "Specifies whether the recipient is embedded or remote.   If the `clientUserId` property is not null then the recipient is embedded. Note that if the `ClientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**, an error is generated on sending.ng.   Maximum length: 100 characters. ")
  public String getClientUserId() {
    return clientUserId;
  }

  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  public Intermediary customFields(java.util.List<String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Intermediary addCustomFieldsItem(String customFieldsItem) {
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.
   * @return customFields
  **/
  @ApiModelProperty(example = "null", value = "An optional array of strings that allows the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not used by DocuSign. Each customField string can be a maximum of 100 characters.")
  public java.util.List<String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(java.util.List<String> customFields) {
    this.customFields = customFields;
  }

  public Intermediary declinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
    return this;
  }

   /**
   * The date and time the recipient declined the document.
   * @return declinedDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the recipient declined the document.")
  public String getDeclinedDateTime() {
    return declinedDateTime;
  }

  public void setDeclinedDateTime(String declinedDateTime) {
    this.declinedDateTime = declinedDateTime;
  }

  public Intermediary declinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
    return this;
  }

   /**
   * The reason the recipient declined the document.
   * @return declinedReason
  **/
  @ApiModelProperty(example = "null", value = "The reason the recipient declined the document.")
  public String getDeclinedReason() {
    return declinedReason;
  }

  public void setDeclinedReason(String declinedReason) {
    this.declinedReason = declinedReason;
  }

  public Intermediary deliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
    return this;
  }

   /**
   * Reserved: For DocuSign use only.
   * @return deliveredDateTime
  **/
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only.")
  public String getDeliveredDateTime() {
    return deliveredDateTime;
  }

  public void setDeliveredDateTime(String deliveredDateTime) {
    this.deliveredDateTime = deliveredDateTime;
  }

  public Intermediary deliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Reserved: For DocuSign use only.
   * @return deliveryMethod
  **/
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only.")
  public String getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(String deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public Intermediary documentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
    return this;
  }

  public Intermediary addDocumentVisibilityItem(DocumentVisibility documentVisibilityItem) {
    this.documentVisibility.add(documentVisibilityItem);
    return this;
  }

   /**
   * 
   * @return documentVisibility
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<DocumentVisibility> getDocumentVisibility() {
    return documentVisibility;
  }

  public void setDocumentVisibility(java.util.List<DocumentVisibility> documentVisibility) {
    this.documentVisibility = documentVisibility;
  }

  public Intermediary email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email id of the recipient. Notification of the document to sign is sent to this email id.   Maximum length: 100 characters. 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "Email id of the recipient. Notification of the document to sign is sent to this email id.   Maximum length: 100 characters. ")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Intermediary emailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
    return this;
  }

   /**
   * Get emailNotification
   * @return emailNotification
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientEmailNotification getEmailNotification() {
    return emailNotification;
  }

  public void setEmailNotification(RecipientEmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }

  public Intermediary emailRecipientPostSigningURL(String emailRecipientPostSigningURL) {
    this.emailRecipientPostSigningURL = emailRecipientPostSigningURL;
    return this;
  }

   /**
   * 
   * @return emailRecipientPostSigningURL
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmailRecipientPostSigningURL() {
    return emailRecipientPostSigningURL;
  }

  public void setEmailRecipientPostSigningURL(String emailRecipientPostSigningURL) {
    this.emailRecipientPostSigningURL = emailRecipientPostSigningURL;
  }

  public Intermediary embeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    return this;
  }

   /**
   * Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` 
   * @return embeddedRecipientStartURL
  **/
  @ApiModelProperty(example = "null", value = "Specifies a sender provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign, just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions. When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.   If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded signing or viewing operation that is launched by any partner.  It is important to remember that in a typical embedded workflow the authentication of an embedded recipient is the responsibility of the sending application, DocuSign expects that senders will follow their own process for establishing the recipient's identity. In this workflow the recipient goes through the sending application before the embedded signing or viewing process in initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`, the recipient goes directly to the embedded signing or viewing process bypassing the sending application and any authentication steps the sending application would use. In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.) to verify the identity of the recipient.  If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: envelopeId, recipientId, recipientName, recipientEmail, and customFields. The `customFields` property must be set fort the recipient or envelope. The merge fields are enclosed in double brackets.   *Example*:   `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]` ")
  public String getEmbeddedRecipientStartURL() {
    return embeddedRecipientStartURL;
  }

  public void setEmbeddedRecipientStartURL(String embeddedRecipientStartURL) {
    this.embeddedRecipientStartURL = embeddedRecipientStartURL;
  }

  public Intermediary errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public Intermediary excludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
    return this;
  }

  public Intermediary addExcludedDocumentsItem(String excludedDocumentsItem) {
    this.excludedDocuments.add(excludedDocumentsItem);
    return this;
  }

   /**
   * Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.
   * @return excludedDocuments
  **/
  @ApiModelProperty(example = "null", value = "Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true** for the envelope to use this.  When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope, unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless they are specifically excluded using this setting when an envelope is sent.")
  public java.util.List<String> getExcludedDocuments() {
    return excludedDocuments;
  }

  public void setExcludedDocuments(java.util.List<String> excludedDocuments) {
    this.excludedDocuments = excludedDocuments;
  }

  public Intermediary faxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
    return this;
  }

   /**
   * Reserved:
   * @return faxNumber
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public String getFaxNumber() {
    return faxNumber;
  }

  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }

  public Intermediary idCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
    return this;
  }

   /**
   * Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.
   * @return idCheckConfigurationName
  **/
  @ApiModelProperty(example = "null", value = "Specifies authentication check by name. The names used here must be the same as the authentication type names used by the account (these name can also be found in the web console sending interface in the Identify list for a recipient,) This overrides any default authentication setting.  *Example*: Your account has ID Check and SMS Authentication available and in the web console Identify list these appear as 'ID Check $' and 'SMS Auth $'. To use ID check in an envelope, the idCheckConfigurationName should be 'ID Check '. If you wanted to use SMS, it would be 'SMS Auth $' and you would need to add you would need to add phone number information to the `smsAuthentication` node.")
  public String getIdCheckConfigurationName() {
    return idCheckConfigurationName;
  }

  public void setIdCheckConfigurationName(String idCheckConfigurationName) {
    this.idCheckConfigurationName = idCheckConfigurationName;
  }

  public Intermediary idCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
    return this;
  }

   /**
   * Get idCheckInformationInput
   * @return idCheckInformationInput
  **/
  @ApiModelProperty(example = "null", value = "")
  public IdCheckInformationInput getIdCheckInformationInput() {
    return idCheckInformationInput;
  }

  public void setIdCheckInformationInput(IdCheckInformationInput idCheckInformationInput) {
    this.idCheckInformationInput = idCheckInformationInput;
  }

  public Intermediary inheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
    return this;
  }

   /**
   * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. 
   * @return inheritEmailNotificationConfiguration
  **/
  @ApiModelProperty(example = "null", value = "When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the default settings for the recipient's account. ")
  public String getInheritEmailNotificationConfiguration() {
    return inheritEmailNotificationConfiguration;
  }

  public void setInheritEmailNotificationConfiguration(String inheritEmailNotificationConfiguration) {
    this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
  }

  public Intermediary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Intermediary note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "Specifies a note that is unique to this recipient. This note is sent to the recipient via the signing email. The note displays in the signing UI near the upper left corner of the document on the signing screen.  Maximum Length: 1000 characters.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Intermediary phoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
    return this;
  }

   /**
   * Get phoneAuthentication
   * @return phoneAuthentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientPhoneAuthentication getPhoneAuthentication() {
    return phoneAuthentication;
  }

  public void setPhoneAuthentication(RecipientPhoneAuthentication phoneAuthentication) {
    this.phoneAuthentication = phoneAuthentication;
  }

  public Intermediary recipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
    return this;
  }

  public Intermediary addRecipientAttachmentsItem(RecipientAttachment recipientAttachmentsItem) {
    this.recipientAttachments.add(recipientAttachmentsItem);
    return this;
  }

   /**
   * Reserved:
   * @return recipientAttachments
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public java.util.List<RecipientAttachment> getRecipientAttachments() {
    return recipientAttachments;
  }

  public void setRecipientAttachments(java.util.List<RecipientAttachment> recipientAttachments) {
    this.recipientAttachments = recipientAttachments;
  }

  public Intermediary recipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
    return this;
  }

   /**
   * Get recipientAuthenticationStatus
   * @return recipientAuthenticationStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public AuthenticationStatus getRecipientAuthenticationStatus() {
    return recipientAuthenticationStatus;
  }

  public void setRecipientAuthenticationStatus(AuthenticationStatus recipientAuthenticationStatus) {
    this.recipientAuthenticationStatus = recipientAuthenticationStatus;
  }

  public Intermediary recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public Intermediary recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

   /**
   * 
   * @return recipientIdGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  public Intermediary requireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
    return this;
  }

   /**
   * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. 
   * @return requireIdLookup
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity. ")
  public String getRequireIdLookup() {
    return requireIdLookup;
  }

  public void setRequireIdLookup(String requireIdLookup) {
    this.requireIdLookup = requireIdLookup;
  }

  public Intermediary roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.
   * @return roleName
  **/
  @ApiModelProperty(example = "null", value = "Optional element. Specifies the role name associated with the recipient.<br/><br/>This is required when working with template recipients.")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public Intermediary routingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
    return this;
  }

   /**
   * Specifies the routing order of the recipient in the envelope. 
   * @return routingOrder
  **/
  @ApiModelProperty(example = "null", value = "Specifies the routing order of the recipient in the envelope. ")
  public String getRoutingOrder() {
    return routingOrder;
  }

  public void setRoutingOrder(String routingOrder) {
    this.routingOrder = routingOrder;
  }

  public Intermediary samlAuthentication(RecipientSAMLAuthentication samlAuthentication) {
    this.samlAuthentication = samlAuthentication;
    return this;
  }

   /**
   * Get samlAuthentication
   * @return samlAuthentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientSAMLAuthentication getSamlAuthentication() {
    return samlAuthentication;
  }

  public void setSamlAuthentication(RecipientSAMLAuthentication samlAuthentication) {
    this.samlAuthentication = samlAuthentication;
  }

  public Intermediary sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

   /**
   * The date and time the envelope was sent.
   * @return sentDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  public Intermediary signedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
    return this;
  }

   /**
   * Reserved: For DocuSign use only. 
   * @return signedDateTime
  **/
  @ApiModelProperty(example = "null", value = "Reserved: For DocuSign use only. ")
  public String getSignedDateTime() {
    return signedDateTime;
  }

  public void setSignedDateTime(String signedDateTime) {
    this.signedDateTime = signedDateTime;
  }

  public Intermediary signingGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
    return this;
  }

   /**
   * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).
   * @return signingGroupId
  **/
  @ApiModelProperty(example = "null", value = "When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each signature/initial tab ( instead of adopting a signature/initial style or only drawing a signature/initial once).")
  public String getSigningGroupId() {
    return signingGroupId;
  }

  public void setSigningGroupId(String signingGroupId) {
    this.signingGroupId = signingGroupId;
  }

  public Intermediary signingGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
    return this;
  }

   /**
   * The display name for the signing group.   Maximum Length: 100 characters. 
   * @return signingGroupName
  **/
  @ApiModelProperty(example = "null", value = "The display name for the signing group.   Maximum Length: 100 characters. ")
  public String getSigningGroupName() {
    return signingGroupName;
  }

  public void setSigningGroupName(String signingGroupName) {
    this.signingGroupName = signingGroupName;
  }

  public Intermediary signingGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
    return this;
  }

  public Intermediary addSigningGroupUsersItem(UserInfo signingGroupUsersItem) {
    this.signingGroupUsers.add(signingGroupUsersItem);
    return this;
  }

   /**
   * A complex type that contains information about users in the signing group.
   * @return signingGroupUsers
  **/
  @ApiModelProperty(example = "null", value = "A complex type that contains information about users in the signing group.")
  public java.util.List<UserInfo> getSigningGroupUsers() {
    return signingGroupUsers;
  }

  public void setSigningGroupUsers(java.util.List<UserInfo> signingGroupUsers) {
    this.signingGroupUsers = signingGroupUsers;
  }

  public Intermediary smsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
    return this;
  }

   /**
   * Get smsAuthentication
   * @return smsAuthentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public RecipientSMSAuthentication getSmsAuthentication() {
    return smsAuthentication;
  }

  public void setSmsAuthentication(RecipientSMSAuthentication smsAuthentication) {
    this.smsAuthentication = smsAuthentication;
  }

  public Intermediary socialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
    return this;
  }

  public Intermediary addSocialAuthenticationsItem(SocialAuthentication socialAuthenticationsItem) {
    this.socialAuthentications.add(socialAuthenticationsItem);
    return this;
  }

   /**
   *  Lists the social ID type that can be used for recipient authentication.
   * @return socialAuthentications
  **/
  @ApiModelProperty(example = "null", value = " Lists the social ID type that can be used for recipient authentication.")
  public java.util.List<SocialAuthentication> getSocialAuthentications() {
    return socialAuthentications;
  }

  public void setSocialAuthentications(java.util.List<SocialAuthentication> socialAuthentications) {
    this.socialAuthentications = socialAuthentications;
  }

  public Intermediary status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Intermediary templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

   /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. 
   * @return templateLocked
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  public Intermediary templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

   /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   * @return templateRequired
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  public Intermediary totalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
    return this;
  }

   /**
   * 
   * @return totalTabCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTotalTabCount() {
    return totalTabCount;
  }

  public void setTotalTabCount(String totalTabCount) {
    this.totalTabCount = totalTabCount;
  }

  public Intermediary userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Intermediary intermediary = (Intermediary) o;
    return Objects.equals(this.accessCode, intermediary.accessCode) &&
        Objects.equals(this.addAccessCodeToEmail, intermediary.addAccessCodeToEmail) &&
        Objects.equals(this.clientUserId, intermediary.clientUserId) &&
        Objects.equals(this.customFields, intermediary.customFields) &&
        Objects.equals(this.declinedDateTime, intermediary.declinedDateTime) &&
        Objects.equals(this.declinedReason, intermediary.declinedReason) &&
        Objects.equals(this.deliveredDateTime, intermediary.deliveredDateTime) &&
        Objects.equals(this.deliveryMethod, intermediary.deliveryMethod) &&
        Objects.equals(this.documentVisibility, intermediary.documentVisibility) &&
        Objects.equals(this.email, intermediary.email) &&
        Objects.equals(this.emailNotification, intermediary.emailNotification) &&
        Objects.equals(this.emailRecipientPostSigningURL, intermediary.emailRecipientPostSigningURL) &&
        Objects.equals(this.embeddedRecipientStartURL, intermediary.embeddedRecipientStartURL) &&
        Objects.equals(this.errorDetails, intermediary.errorDetails) &&
        Objects.equals(this.excludedDocuments, intermediary.excludedDocuments) &&
        Objects.equals(this.faxNumber, intermediary.faxNumber) &&
        Objects.equals(this.idCheckConfigurationName, intermediary.idCheckConfigurationName) &&
        Objects.equals(this.idCheckInformationInput, intermediary.idCheckInformationInput) &&
        Objects.equals(this.inheritEmailNotificationConfiguration, intermediary.inheritEmailNotificationConfiguration) &&
        Objects.equals(this.name, intermediary.name) &&
        Objects.equals(this.note, intermediary.note) &&
        Objects.equals(this.phoneAuthentication, intermediary.phoneAuthentication) &&
        Objects.equals(this.recipientAttachments, intermediary.recipientAttachments) &&
        Objects.equals(this.recipientAuthenticationStatus, intermediary.recipientAuthenticationStatus) &&
        Objects.equals(this.recipientId, intermediary.recipientId) &&
        Objects.equals(this.recipientIdGuid, intermediary.recipientIdGuid) &&
        Objects.equals(this.requireIdLookup, intermediary.requireIdLookup) &&
        Objects.equals(this.roleName, intermediary.roleName) &&
        Objects.equals(this.routingOrder, intermediary.routingOrder) &&
        Objects.equals(this.samlAuthentication, intermediary.samlAuthentication) &&
        Objects.equals(this.sentDateTime, intermediary.sentDateTime) &&
        Objects.equals(this.signedDateTime, intermediary.signedDateTime) &&
        Objects.equals(this.signingGroupId, intermediary.signingGroupId) &&
        Objects.equals(this.signingGroupName, intermediary.signingGroupName) &&
        Objects.equals(this.signingGroupUsers, intermediary.signingGroupUsers) &&
        Objects.equals(this.smsAuthentication, intermediary.smsAuthentication) &&
        Objects.equals(this.socialAuthentications, intermediary.socialAuthentications) &&
        Objects.equals(this.status, intermediary.status) &&
        Objects.equals(this.templateLocked, intermediary.templateLocked) &&
        Objects.equals(this.templateRequired, intermediary.templateRequired) &&
        Objects.equals(this.totalTabCount, intermediary.totalTabCount) &&
        Objects.equals(this.userId, intermediary.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCode, addAccessCodeToEmail, clientUserId, customFields, declinedDateTime, declinedReason, deliveredDateTime, deliveryMethod, documentVisibility, email, emailNotification, emailRecipientPostSigningURL, embeddedRecipientStartURL, errorDetails, excludedDocuments, faxNumber, idCheckConfigurationName, idCheckInformationInput, inheritEmailNotificationConfiguration, name, note, phoneAuthentication, recipientAttachments, recipientAuthenticationStatus, recipientId, recipientIdGuid, requireIdLookup, roleName, routingOrder, samlAuthentication, sentDateTime, signedDateTime, signingGroupId, signingGroupName, signingGroupUsers, smsAuthentication, socialAuthentications, status, templateLocked, templateRequired, totalTabCount, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Intermediary {\n");
    
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    addAccessCodeToEmail: ").append(toIndentedString(addAccessCodeToEmail)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    declinedDateTime: ").append(toIndentedString(declinedDateTime)).append("\n");
    sb.append("    declinedReason: ").append(toIndentedString(declinedReason)).append("\n");
    sb.append("    deliveredDateTime: ").append(toIndentedString(deliveredDateTime)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    documentVisibility: ").append(toIndentedString(documentVisibility)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailNotification: ").append(toIndentedString(emailNotification)).append("\n");
    sb.append("    emailRecipientPostSigningURL: ").append(toIndentedString(emailRecipientPostSigningURL)).append("\n");
    sb.append("    embeddedRecipientStartURL: ").append(toIndentedString(embeddedRecipientStartURL)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    excludedDocuments: ").append(toIndentedString(excludedDocuments)).append("\n");
    sb.append("    faxNumber: ").append(toIndentedString(faxNumber)).append("\n");
    sb.append("    idCheckConfigurationName: ").append(toIndentedString(idCheckConfigurationName)).append("\n");
    sb.append("    idCheckInformationInput: ").append(toIndentedString(idCheckInformationInput)).append("\n");
    sb.append("    inheritEmailNotificationConfiguration: ").append(toIndentedString(inheritEmailNotificationConfiguration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    phoneAuthentication: ").append(toIndentedString(phoneAuthentication)).append("\n");
    sb.append("    recipientAttachments: ").append(toIndentedString(recipientAttachments)).append("\n");
    sb.append("    recipientAuthenticationStatus: ").append(toIndentedString(recipientAuthenticationStatus)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    requireIdLookup: ").append(toIndentedString(requireIdLookup)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    routingOrder: ").append(toIndentedString(routingOrder)).append("\n");
    sb.append("    samlAuthentication: ").append(toIndentedString(samlAuthentication)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    signedDateTime: ").append(toIndentedString(signedDateTime)).append("\n");
    sb.append("    signingGroupId: ").append(toIndentedString(signingGroupId)).append("\n");
    sb.append("    signingGroupName: ").append(toIndentedString(signingGroupName)).append("\n");
    sb.append("    signingGroupUsers: ").append(toIndentedString(signingGroupUsers)).append("\n");
    sb.append("    smsAuthentication: ").append(toIndentedString(smsAuthentication)).append("\n");
    sb.append("    socialAuthentications: ").append(toIndentedString(socialAuthentications)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    totalTabCount: ").append(toIndentedString(totalTabCount)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

