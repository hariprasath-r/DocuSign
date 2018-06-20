/**
 * Recipient.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Recipient  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger ID;

    private java.lang.String userName;

    private java.lang.String signerName;

    private java.lang.String email;

    private net.docusign.www.API._3_0.RecipientTypeCode type;

    private java.lang.String accessCode;

    private java.lang.Boolean addAccessCodeToEmail;

    private java.lang.Boolean requireIDLookup;

    private java.lang.String IDCheckConfigurationName;

    private net.docusign.www.API._3_0.DeliveryMethod deliveryMethod;

    private java.lang.String faxNumber;

    private java.lang.Boolean liveIDRecipientAuthentication;

    private java.lang.Boolean facebookRecipientAuthentication;

    private java.lang.Boolean linkedinRecipientAuthentication;

    private java.lang.Boolean googleRecipientAuthentication;

    private java.lang.Boolean salesforceRecipientAuthentication;

    private java.lang.Boolean twitterRecipientAuthentication;

    private java.lang.Boolean yahooRecipientAuthentication;

    private java.lang.Boolean openIDRecipientAuthentication;

    private java.lang.Boolean anySocialIDRecipientAuthentication;

    private net.docusign.www.API._3_0.RecipientPhoneAuthentication phoneAuthentication;

    private net.docusign.www.API._3_0.RecipientSAMLAuthentication SAMLAuthentication;

    private net.docusign.www.API._3_0.RecipientSMSAuthentication SMSAuthentication;

    private net.docusign.www.API._3_0.RecipientSignatureInfo signatureInfo;

    private net.docusign.www.API._3_0.RecipientCaptiveInfo captiveInfo;

    private java.lang.String[] customFields;

    private org.apache.axis.types.UnsignedShort routingOrder;

    private net.docusign.www.API._3_0.IDCheckInformationInput IDCheckInformationInput;

    private java.lang.Boolean autoNavigation;

    private net.docusign.www.API._3_0.Attachment[] recipientAttachment;

    private java.lang.String note;

    private java.lang.String roleName;

    private java.lang.Boolean templateLocked;

    private java.lang.Boolean templateRequired;

    private java.lang.Boolean templateAccessCodeRequired;

    private java.lang.Boolean defaultRecipient;

    private net.docusign.www.API._3_0.RecipientEmailNotification emailNotification;

    private java.lang.Boolean agentCanEditEmail;

    private java.lang.Boolean agentCanEditName;

    private java.lang.Boolean signInEachLocation;

    private org.apache.axis.types.PositiveInteger[] excludedDocuments;

    private java.lang.String requireSignerCertificate;

    private java.lang.String requireNotary;

    private java.lang.Boolean inheritEmailNotificationConfiguration;

    private java.lang.String hostedSigner;

    private java.lang.Boolean isNotaryTransaction;

    private java.lang.Long signingGroupId;

    private net.docusign.www.API._3_0.RecipientSignatureProvider[] recipientSignatureProviders;

    public Recipient() {
    }

    public Recipient(
           org.apache.axis.types.PositiveInteger ID,
           java.lang.String userName,
           java.lang.String signerName,
           java.lang.String email,
           net.docusign.www.API._3_0.RecipientTypeCode type,
           java.lang.String accessCode,
           java.lang.Boolean addAccessCodeToEmail,
           java.lang.Boolean requireIDLookup,
           java.lang.String IDCheckConfigurationName,
           net.docusign.www.API._3_0.DeliveryMethod deliveryMethod,
           java.lang.String faxNumber,
           java.lang.Boolean liveIDRecipientAuthentication,
           java.lang.Boolean facebookRecipientAuthentication,
           java.lang.Boolean linkedinRecipientAuthentication,
           java.lang.Boolean googleRecipientAuthentication,
           java.lang.Boolean salesforceRecipientAuthentication,
           java.lang.Boolean twitterRecipientAuthentication,
           java.lang.Boolean yahooRecipientAuthentication,
           java.lang.Boolean openIDRecipientAuthentication,
           java.lang.Boolean anySocialIDRecipientAuthentication,
           net.docusign.www.API._3_0.RecipientPhoneAuthentication phoneAuthentication,
           net.docusign.www.API._3_0.RecipientSAMLAuthentication SAMLAuthentication,
           net.docusign.www.API._3_0.RecipientSMSAuthentication SMSAuthentication,
           net.docusign.www.API._3_0.RecipientSignatureInfo signatureInfo,
           net.docusign.www.API._3_0.RecipientCaptiveInfo captiveInfo,
           java.lang.String[] customFields,
           org.apache.axis.types.UnsignedShort routingOrder,
           net.docusign.www.API._3_0.IDCheckInformationInput IDCheckInformationInput,
           java.lang.Boolean autoNavigation,
           net.docusign.www.API._3_0.Attachment[] recipientAttachment,
           java.lang.String note,
           java.lang.String roleName,
           java.lang.Boolean templateLocked,
           java.lang.Boolean templateRequired,
           java.lang.Boolean templateAccessCodeRequired,
           java.lang.Boolean defaultRecipient,
           net.docusign.www.API._3_0.RecipientEmailNotification emailNotification,
           java.lang.Boolean agentCanEditEmail,
           java.lang.Boolean agentCanEditName,
           java.lang.Boolean signInEachLocation,
           org.apache.axis.types.PositiveInteger[] excludedDocuments,
           java.lang.String requireSignerCertificate,
           java.lang.String requireNotary,
           java.lang.Boolean inheritEmailNotificationConfiguration,
           java.lang.String hostedSigner,
           java.lang.Boolean isNotaryTransaction,
           java.lang.Long signingGroupId,
           net.docusign.www.API._3_0.RecipientSignatureProvider[] recipientSignatureProviders) {
           this.ID = ID;
           this.userName = userName;
           this.signerName = signerName;
           this.email = email;
           this.type = type;
           this.accessCode = accessCode;
           this.addAccessCodeToEmail = addAccessCodeToEmail;
           this.requireIDLookup = requireIDLookup;
           this.IDCheckConfigurationName = IDCheckConfigurationName;
           this.deliveryMethod = deliveryMethod;
           this.faxNumber = faxNumber;
           this.liveIDRecipientAuthentication = liveIDRecipientAuthentication;
           this.facebookRecipientAuthentication = facebookRecipientAuthentication;
           this.linkedinRecipientAuthentication = linkedinRecipientAuthentication;
           this.googleRecipientAuthentication = googleRecipientAuthentication;
           this.salesforceRecipientAuthentication = salesforceRecipientAuthentication;
           this.twitterRecipientAuthentication = twitterRecipientAuthentication;
           this.yahooRecipientAuthentication = yahooRecipientAuthentication;
           this.openIDRecipientAuthentication = openIDRecipientAuthentication;
           this.anySocialIDRecipientAuthentication = anySocialIDRecipientAuthentication;
           this.phoneAuthentication = phoneAuthentication;
           this.SAMLAuthentication = SAMLAuthentication;
           this.SMSAuthentication = SMSAuthentication;
           this.signatureInfo = signatureInfo;
           this.captiveInfo = captiveInfo;
           this.customFields = customFields;
           this.routingOrder = routingOrder;
           this.IDCheckInformationInput = IDCheckInformationInput;
           this.autoNavigation = autoNavigation;
           this.recipientAttachment = recipientAttachment;
           this.note = note;
           this.roleName = roleName;
           this.templateLocked = templateLocked;
           this.templateRequired = templateRequired;
           this.templateAccessCodeRequired = templateAccessCodeRequired;
           this.defaultRecipient = defaultRecipient;
           this.emailNotification = emailNotification;
           this.agentCanEditEmail = agentCanEditEmail;
           this.agentCanEditName = agentCanEditName;
           this.signInEachLocation = signInEachLocation;
           this.excludedDocuments = excludedDocuments;
           this.requireSignerCertificate = requireSignerCertificate;
           this.requireNotary = requireNotary;
           this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
           this.hostedSigner = hostedSigner;
           this.isNotaryTransaction = isNotaryTransaction;
           this.signingGroupId = signingGroupId;
           this.recipientSignatureProviders = recipientSignatureProviders;
    }


    /**
     * Gets the ID value for this Recipient.
     * 
     * @return ID
     */
    public org.apache.axis.types.PositiveInteger getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Recipient.
     * 
     * @param ID
     */
    public void setID(org.apache.axis.types.PositiveInteger ID) {
        this.ID = ID;
    }


    /**
     * Gets the userName value for this Recipient.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this Recipient.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the signerName value for this Recipient.
     * 
     * @return signerName
     */
    public java.lang.String getSignerName() {
        return signerName;
    }


    /**
     * Sets the signerName value for this Recipient.
     * 
     * @param signerName
     */
    public void setSignerName(java.lang.String signerName) {
        this.signerName = signerName;
    }


    /**
     * Gets the email value for this Recipient.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Recipient.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the type value for this Recipient.
     * 
     * @return type
     */
    public net.docusign.www.API._3_0.RecipientTypeCode getType() {
        return type;
    }


    /**
     * Sets the type value for this Recipient.
     * 
     * @param type
     */
    public void setType(net.docusign.www.API._3_0.RecipientTypeCode type) {
        this.type = type;
    }


    /**
     * Gets the accessCode value for this Recipient.
     * 
     * @return accessCode
     */
    public java.lang.String getAccessCode() {
        return accessCode;
    }


    /**
     * Sets the accessCode value for this Recipient.
     * 
     * @param accessCode
     */
    public void setAccessCode(java.lang.String accessCode) {
        this.accessCode = accessCode;
    }


    /**
     * Gets the addAccessCodeToEmail value for this Recipient.
     * 
     * @return addAccessCodeToEmail
     */
    public java.lang.Boolean getAddAccessCodeToEmail() {
        return addAccessCodeToEmail;
    }


    /**
     * Sets the addAccessCodeToEmail value for this Recipient.
     * 
     * @param addAccessCodeToEmail
     */
    public void setAddAccessCodeToEmail(java.lang.Boolean addAccessCodeToEmail) {
        this.addAccessCodeToEmail = addAccessCodeToEmail;
    }


    /**
     * Gets the requireIDLookup value for this Recipient.
     * 
     * @return requireIDLookup
     */
    public java.lang.Boolean getRequireIDLookup() {
        return requireIDLookup;
    }


    /**
     * Sets the requireIDLookup value for this Recipient.
     * 
     * @param requireIDLookup
     */
    public void setRequireIDLookup(java.lang.Boolean requireIDLookup) {
        this.requireIDLookup = requireIDLookup;
    }


    /**
     * Gets the IDCheckConfigurationName value for this Recipient.
     * 
     * @return IDCheckConfigurationName
     */
    public java.lang.String getIDCheckConfigurationName() {
        return IDCheckConfigurationName;
    }


    /**
     * Sets the IDCheckConfigurationName value for this Recipient.
     * 
     * @param IDCheckConfigurationName
     */
    public void setIDCheckConfigurationName(java.lang.String IDCheckConfigurationName) {
        this.IDCheckConfigurationName = IDCheckConfigurationName;
    }


    /**
     * Gets the deliveryMethod value for this Recipient.
     * 
     * @return deliveryMethod
     */
    public net.docusign.www.API._3_0.DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }


    /**
     * Sets the deliveryMethod value for this Recipient.
     * 
     * @param deliveryMethod
     */
    public void setDeliveryMethod(net.docusign.www.API._3_0.DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }


    /**
     * Gets the faxNumber value for this Recipient.
     * 
     * @return faxNumber
     */
    public java.lang.String getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this Recipient.
     * 
     * @param faxNumber
     */
    public void setFaxNumber(java.lang.String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the liveIDRecipientAuthentication value for this Recipient.
     * 
     * @return liveIDRecipientAuthentication
     */
    public java.lang.Boolean getLiveIDRecipientAuthentication() {
        return liveIDRecipientAuthentication;
    }


    /**
     * Sets the liveIDRecipientAuthentication value for this Recipient.
     * 
     * @param liveIDRecipientAuthentication
     */
    public void setLiveIDRecipientAuthentication(java.lang.Boolean liveIDRecipientAuthentication) {
        this.liveIDRecipientAuthentication = liveIDRecipientAuthentication;
    }


    /**
     * Gets the facebookRecipientAuthentication value for this Recipient.
     * 
     * @return facebookRecipientAuthentication
     */
    public java.lang.Boolean getFacebookRecipientAuthentication() {
        return facebookRecipientAuthentication;
    }


    /**
     * Sets the facebookRecipientAuthentication value for this Recipient.
     * 
     * @param facebookRecipientAuthentication
     */
    public void setFacebookRecipientAuthentication(java.lang.Boolean facebookRecipientAuthentication) {
        this.facebookRecipientAuthentication = facebookRecipientAuthentication;
    }


    /**
     * Gets the linkedinRecipientAuthentication value for this Recipient.
     * 
     * @return linkedinRecipientAuthentication
     */
    public java.lang.Boolean getLinkedinRecipientAuthentication() {
        return linkedinRecipientAuthentication;
    }


    /**
     * Sets the linkedinRecipientAuthentication value for this Recipient.
     * 
     * @param linkedinRecipientAuthentication
     */
    public void setLinkedinRecipientAuthentication(java.lang.Boolean linkedinRecipientAuthentication) {
        this.linkedinRecipientAuthentication = linkedinRecipientAuthentication;
    }


    /**
     * Gets the googleRecipientAuthentication value for this Recipient.
     * 
     * @return googleRecipientAuthentication
     */
    public java.lang.Boolean getGoogleRecipientAuthentication() {
        return googleRecipientAuthentication;
    }


    /**
     * Sets the googleRecipientAuthentication value for this Recipient.
     * 
     * @param googleRecipientAuthentication
     */
    public void setGoogleRecipientAuthentication(java.lang.Boolean googleRecipientAuthentication) {
        this.googleRecipientAuthentication = googleRecipientAuthentication;
    }


    /**
     * Gets the salesforceRecipientAuthentication value for this Recipient.
     * 
     * @return salesforceRecipientAuthentication
     */
    public java.lang.Boolean getSalesforceRecipientAuthentication() {
        return salesforceRecipientAuthentication;
    }


    /**
     * Sets the salesforceRecipientAuthentication value for this Recipient.
     * 
     * @param salesforceRecipientAuthentication
     */
    public void setSalesforceRecipientAuthentication(java.lang.Boolean salesforceRecipientAuthentication) {
        this.salesforceRecipientAuthentication = salesforceRecipientAuthentication;
    }


    /**
     * Gets the twitterRecipientAuthentication value for this Recipient.
     * 
     * @return twitterRecipientAuthentication
     */
    public java.lang.Boolean getTwitterRecipientAuthentication() {
        return twitterRecipientAuthentication;
    }


    /**
     * Sets the twitterRecipientAuthentication value for this Recipient.
     * 
     * @param twitterRecipientAuthentication
     */
    public void setTwitterRecipientAuthentication(java.lang.Boolean twitterRecipientAuthentication) {
        this.twitterRecipientAuthentication = twitterRecipientAuthentication;
    }


    /**
     * Gets the yahooRecipientAuthentication value for this Recipient.
     * 
     * @return yahooRecipientAuthentication
     */
    public java.lang.Boolean getYahooRecipientAuthentication() {
        return yahooRecipientAuthentication;
    }


    /**
     * Sets the yahooRecipientAuthentication value for this Recipient.
     * 
     * @param yahooRecipientAuthentication
     */
    public void setYahooRecipientAuthentication(java.lang.Boolean yahooRecipientAuthentication) {
        this.yahooRecipientAuthentication = yahooRecipientAuthentication;
    }


    /**
     * Gets the openIDRecipientAuthentication value for this Recipient.
     * 
     * @return openIDRecipientAuthentication
     */
    public java.lang.Boolean getOpenIDRecipientAuthentication() {
        return openIDRecipientAuthentication;
    }


    /**
     * Sets the openIDRecipientAuthentication value for this Recipient.
     * 
     * @param openIDRecipientAuthentication
     */
    public void setOpenIDRecipientAuthentication(java.lang.Boolean openIDRecipientAuthentication) {
        this.openIDRecipientAuthentication = openIDRecipientAuthentication;
    }


    /**
     * Gets the anySocialIDRecipientAuthentication value for this Recipient.
     * 
     * @return anySocialIDRecipientAuthentication
     */
    public java.lang.Boolean getAnySocialIDRecipientAuthentication() {
        return anySocialIDRecipientAuthentication;
    }


    /**
     * Sets the anySocialIDRecipientAuthentication value for this Recipient.
     * 
     * @param anySocialIDRecipientAuthentication
     */
    public void setAnySocialIDRecipientAuthentication(java.lang.Boolean anySocialIDRecipientAuthentication) {
        this.anySocialIDRecipientAuthentication = anySocialIDRecipientAuthentication;
    }


    /**
     * Gets the phoneAuthentication value for this Recipient.
     * 
     * @return phoneAuthentication
     */
    public net.docusign.www.API._3_0.RecipientPhoneAuthentication getPhoneAuthentication() {
        return phoneAuthentication;
    }


    /**
     * Sets the phoneAuthentication value for this Recipient.
     * 
     * @param phoneAuthentication
     */
    public void setPhoneAuthentication(net.docusign.www.API._3_0.RecipientPhoneAuthentication phoneAuthentication) {
        this.phoneAuthentication = phoneAuthentication;
    }


    /**
     * Gets the SAMLAuthentication value for this Recipient.
     * 
     * @return SAMLAuthentication
     */
    public net.docusign.www.API._3_0.RecipientSAMLAuthentication getSAMLAuthentication() {
        return SAMLAuthentication;
    }


    /**
     * Sets the SAMLAuthentication value for this Recipient.
     * 
     * @param SAMLAuthentication
     */
    public void setSAMLAuthentication(net.docusign.www.API._3_0.RecipientSAMLAuthentication SAMLAuthentication) {
        this.SAMLAuthentication = SAMLAuthentication;
    }


    /**
     * Gets the SMSAuthentication value for this Recipient.
     * 
     * @return SMSAuthentication
     */
    public net.docusign.www.API._3_0.RecipientSMSAuthentication getSMSAuthentication() {
        return SMSAuthentication;
    }


    /**
     * Sets the SMSAuthentication value for this Recipient.
     * 
     * @param SMSAuthentication
     */
    public void setSMSAuthentication(net.docusign.www.API._3_0.RecipientSMSAuthentication SMSAuthentication) {
        this.SMSAuthentication = SMSAuthentication;
    }


    /**
     * Gets the signatureInfo value for this Recipient.
     * 
     * @return signatureInfo
     */
    public net.docusign.www.API._3_0.RecipientSignatureInfo getSignatureInfo() {
        return signatureInfo;
    }


    /**
     * Sets the signatureInfo value for this Recipient.
     * 
     * @param signatureInfo
     */
    public void setSignatureInfo(net.docusign.www.API._3_0.RecipientSignatureInfo signatureInfo) {
        this.signatureInfo = signatureInfo;
    }


    /**
     * Gets the captiveInfo value for this Recipient.
     * 
     * @return captiveInfo
     */
    public net.docusign.www.API._3_0.RecipientCaptiveInfo getCaptiveInfo() {
        return captiveInfo;
    }


    /**
     * Sets the captiveInfo value for this Recipient.
     * 
     * @param captiveInfo
     */
    public void setCaptiveInfo(net.docusign.www.API._3_0.RecipientCaptiveInfo captiveInfo) {
        this.captiveInfo = captiveInfo;
    }


    /**
     * Gets the customFields value for this Recipient.
     * 
     * @return customFields
     */
    public java.lang.String[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this Recipient.
     * 
     * @param customFields
     */
    public void setCustomFields(java.lang.String[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the routingOrder value for this Recipient.
     * 
     * @return routingOrder
     */
    public org.apache.axis.types.UnsignedShort getRoutingOrder() {
        return routingOrder;
    }


    /**
     * Sets the routingOrder value for this Recipient.
     * 
     * @param routingOrder
     */
    public void setRoutingOrder(org.apache.axis.types.UnsignedShort routingOrder) {
        this.routingOrder = routingOrder;
    }


    /**
     * Gets the IDCheckInformationInput value for this Recipient.
     * 
     * @return IDCheckInformationInput
     */
    public net.docusign.www.API._3_0.IDCheckInformationInput getIDCheckInformationInput() {
        return IDCheckInformationInput;
    }


    /**
     * Sets the IDCheckInformationInput value for this Recipient.
     * 
     * @param IDCheckInformationInput
     */
    public void setIDCheckInformationInput(net.docusign.www.API._3_0.IDCheckInformationInput IDCheckInformationInput) {
        this.IDCheckInformationInput = IDCheckInformationInput;
    }


    /**
     * Gets the autoNavigation value for this Recipient.
     * 
     * @return autoNavigation
     */
    public java.lang.Boolean getAutoNavigation() {
        return autoNavigation;
    }


    /**
     * Sets the autoNavigation value for this Recipient.
     * 
     * @param autoNavigation
     */
    public void setAutoNavigation(java.lang.Boolean autoNavigation) {
        this.autoNavigation = autoNavigation;
    }


    /**
     * Gets the recipientAttachment value for this Recipient.
     * 
     * @return recipientAttachment
     */
    public net.docusign.www.API._3_0.Attachment[] getRecipientAttachment() {
        return recipientAttachment;
    }


    /**
     * Sets the recipientAttachment value for this Recipient.
     * 
     * @param recipientAttachment
     */
    public void setRecipientAttachment(net.docusign.www.API._3_0.Attachment[] recipientAttachment) {
        this.recipientAttachment = recipientAttachment;
    }


    /**
     * Gets the note value for this Recipient.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this Recipient.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the roleName value for this Recipient.
     * 
     * @return roleName
     */
    public java.lang.String getRoleName() {
        return roleName;
    }


    /**
     * Sets the roleName value for this Recipient.
     * 
     * @param roleName
     */
    public void setRoleName(java.lang.String roleName) {
        this.roleName = roleName;
    }


    /**
     * Gets the templateLocked value for this Recipient.
     * 
     * @return templateLocked
     */
    public java.lang.Boolean getTemplateLocked() {
        return templateLocked;
    }


    /**
     * Sets the templateLocked value for this Recipient.
     * 
     * @param templateLocked
     */
    public void setTemplateLocked(java.lang.Boolean templateLocked) {
        this.templateLocked = templateLocked;
    }


    /**
     * Gets the templateRequired value for this Recipient.
     * 
     * @return templateRequired
     */
    public java.lang.Boolean getTemplateRequired() {
        return templateRequired;
    }


    /**
     * Sets the templateRequired value for this Recipient.
     * 
     * @param templateRequired
     */
    public void setTemplateRequired(java.lang.Boolean templateRequired) {
        this.templateRequired = templateRequired;
    }


    /**
     * Gets the templateAccessCodeRequired value for this Recipient.
     * 
     * @return templateAccessCodeRequired
     */
    public java.lang.Boolean getTemplateAccessCodeRequired() {
        return templateAccessCodeRequired;
    }


    /**
     * Sets the templateAccessCodeRequired value for this Recipient.
     * 
     * @param templateAccessCodeRequired
     */
    public void setTemplateAccessCodeRequired(java.lang.Boolean templateAccessCodeRequired) {
        this.templateAccessCodeRequired = templateAccessCodeRequired;
    }


    /**
     * Gets the defaultRecipient value for this Recipient.
     * 
     * @return defaultRecipient
     */
    public java.lang.Boolean getDefaultRecipient() {
        return defaultRecipient;
    }


    /**
     * Sets the defaultRecipient value for this Recipient.
     * 
     * @param defaultRecipient
     */
    public void setDefaultRecipient(java.lang.Boolean defaultRecipient) {
        this.defaultRecipient = defaultRecipient;
    }


    /**
     * Gets the emailNotification value for this Recipient.
     * 
     * @return emailNotification
     */
    public net.docusign.www.API._3_0.RecipientEmailNotification getEmailNotification() {
        return emailNotification;
    }


    /**
     * Sets the emailNotification value for this Recipient.
     * 
     * @param emailNotification
     */
    public void setEmailNotification(net.docusign.www.API._3_0.RecipientEmailNotification emailNotification) {
        this.emailNotification = emailNotification;
    }


    /**
     * Gets the agentCanEditEmail value for this Recipient.
     * 
     * @return agentCanEditEmail
     */
    public java.lang.Boolean getAgentCanEditEmail() {
        return agentCanEditEmail;
    }


    /**
     * Sets the agentCanEditEmail value for this Recipient.
     * 
     * @param agentCanEditEmail
     */
    public void setAgentCanEditEmail(java.lang.Boolean agentCanEditEmail) {
        this.agentCanEditEmail = agentCanEditEmail;
    }


    /**
     * Gets the agentCanEditName value for this Recipient.
     * 
     * @return agentCanEditName
     */
    public java.lang.Boolean getAgentCanEditName() {
        return agentCanEditName;
    }


    /**
     * Sets the agentCanEditName value for this Recipient.
     * 
     * @param agentCanEditName
     */
    public void setAgentCanEditName(java.lang.Boolean agentCanEditName) {
        this.agentCanEditName = agentCanEditName;
    }


    /**
     * Gets the signInEachLocation value for this Recipient.
     * 
     * @return signInEachLocation
     */
    public java.lang.Boolean getSignInEachLocation() {
        return signInEachLocation;
    }


    /**
     * Sets the signInEachLocation value for this Recipient.
     * 
     * @param signInEachLocation
     */
    public void setSignInEachLocation(java.lang.Boolean signInEachLocation) {
        this.signInEachLocation = signInEachLocation;
    }


    /**
     * Gets the excludedDocuments value for this Recipient.
     * 
     * @return excludedDocuments
     */
    public org.apache.axis.types.PositiveInteger[] getExcludedDocuments() {
        return excludedDocuments;
    }


    /**
     * Sets the excludedDocuments value for this Recipient.
     * 
     * @param excludedDocuments
     */
    public void setExcludedDocuments(org.apache.axis.types.PositiveInteger[] excludedDocuments) {
        this.excludedDocuments = excludedDocuments;
    }


    /**
     * Gets the requireSignerCertificate value for this Recipient.
     * 
     * @return requireSignerCertificate
     */
    public java.lang.String getRequireSignerCertificate() {
        return requireSignerCertificate;
    }


    /**
     * Sets the requireSignerCertificate value for this Recipient.
     * 
     * @param requireSignerCertificate
     */
    public void setRequireSignerCertificate(java.lang.String requireSignerCertificate) {
        this.requireSignerCertificate = requireSignerCertificate;
    }


    /**
     * Gets the requireNotary value for this Recipient.
     * 
     * @return requireNotary
     */
    public java.lang.String getRequireNotary() {
        return requireNotary;
    }


    /**
     * Sets the requireNotary value for this Recipient.
     * 
     * @param requireNotary
     */
    public void setRequireNotary(java.lang.String requireNotary) {
        this.requireNotary = requireNotary;
    }


    /**
     * Gets the inheritEmailNotificationConfiguration value for this Recipient.
     * 
     * @return inheritEmailNotificationConfiguration
     */
    public java.lang.Boolean getInheritEmailNotificationConfiguration() {
        return inheritEmailNotificationConfiguration;
    }


    /**
     * Sets the inheritEmailNotificationConfiguration value for this Recipient.
     * 
     * @param inheritEmailNotificationConfiguration
     */
    public void setInheritEmailNotificationConfiguration(java.lang.Boolean inheritEmailNotificationConfiguration) {
        this.inheritEmailNotificationConfiguration = inheritEmailNotificationConfiguration;
    }


    /**
     * Gets the hostedSigner value for this Recipient.
     * 
     * @return hostedSigner
     */
    public java.lang.String getHostedSigner() {
        return hostedSigner;
    }


    /**
     * Sets the hostedSigner value for this Recipient.
     * 
     * @param hostedSigner
     */
    public void setHostedSigner(java.lang.String hostedSigner) {
        this.hostedSigner = hostedSigner;
    }


    /**
     * Gets the isNotaryTransaction value for this Recipient.
     * 
     * @return isNotaryTransaction
     */
    public java.lang.Boolean getIsNotaryTransaction() {
        return isNotaryTransaction;
    }


    /**
     * Sets the isNotaryTransaction value for this Recipient.
     * 
     * @param isNotaryTransaction
     */
    public void setIsNotaryTransaction(java.lang.Boolean isNotaryTransaction) {
        this.isNotaryTransaction = isNotaryTransaction;
    }


    /**
     * Gets the signingGroupId value for this Recipient.
     * 
     * @return signingGroupId
     */
    public java.lang.Long getSigningGroupId() {
        return signingGroupId;
    }


    /**
     * Sets the signingGroupId value for this Recipient.
     * 
     * @param signingGroupId
     */
    public void setSigningGroupId(java.lang.Long signingGroupId) {
        this.signingGroupId = signingGroupId;
    }


    /**
     * Gets the recipientSignatureProviders value for this Recipient.
     * 
     * @return recipientSignatureProviders
     */
    public net.docusign.www.API._3_0.RecipientSignatureProvider[] getRecipientSignatureProviders() {
        return recipientSignatureProviders;
    }


    /**
     * Sets the recipientSignatureProviders value for this Recipient.
     * 
     * @param recipientSignatureProviders
     */
    public void setRecipientSignatureProviders(net.docusign.www.API._3_0.RecipientSignatureProvider[] recipientSignatureProviders) {
        this.recipientSignatureProviders = recipientSignatureProviders;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Recipient)) return false;
        Recipient other = (Recipient) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.signerName==null && other.getSignerName()==null) || 
             (this.signerName!=null &&
              this.signerName.equals(other.getSignerName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.accessCode==null && other.getAccessCode()==null) || 
             (this.accessCode!=null &&
              this.accessCode.equals(other.getAccessCode()))) &&
            ((this.addAccessCodeToEmail==null && other.getAddAccessCodeToEmail()==null) || 
             (this.addAccessCodeToEmail!=null &&
              this.addAccessCodeToEmail.equals(other.getAddAccessCodeToEmail()))) &&
            ((this.requireIDLookup==null && other.getRequireIDLookup()==null) || 
             (this.requireIDLookup!=null &&
              this.requireIDLookup.equals(other.getRequireIDLookup()))) &&
            ((this.IDCheckConfigurationName==null && other.getIDCheckConfigurationName()==null) || 
             (this.IDCheckConfigurationName!=null &&
              this.IDCheckConfigurationName.equals(other.getIDCheckConfigurationName()))) &&
            ((this.deliveryMethod==null && other.getDeliveryMethod()==null) || 
             (this.deliveryMethod!=null &&
              this.deliveryMethod.equals(other.getDeliveryMethod()))) &&
            ((this.faxNumber==null && other.getFaxNumber()==null) || 
             (this.faxNumber!=null &&
              this.faxNumber.equals(other.getFaxNumber()))) &&
            ((this.liveIDRecipientAuthentication==null && other.getLiveIDRecipientAuthentication()==null) || 
             (this.liveIDRecipientAuthentication!=null &&
              this.liveIDRecipientAuthentication.equals(other.getLiveIDRecipientAuthentication()))) &&
            ((this.facebookRecipientAuthentication==null && other.getFacebookRecipientAuthentication()==null) || 
             (this.facebookRecipientAuthentication!=null &&
              this.facebookRecipientAuthentication.equals(other.getFacebookRecipientAuthentication()))) &&
            ((this.linkedinRecipientAuthentication==null && other.getLinkedinRecipientAuthentication()==null) || 
             (this.linkedinRecipientAuthentication!=null &&
              this.linkedinRecipientAuthentication.equals(other.getLinkedinRecipientAuthentication()))) &&
            ((this.googleRecipientAuthentication==null && other.getGoogleRecipientAuthentication()==null) || 
             (this.googleRecipientAuthentication!=null &&
              this.googleRecipientAuthentication.equals(other.getGoogleRecipientAuthentication()))) &&
            ((this.salesforceRecipientAuthentication==null && other.getSalesforceRecipientAuthentication()==null) || 
             (this.salesforceRecipientAuthentication!=null &&
              this.salesforceRecipientAuthentication.equals(other.getSalesforceRecipientAuthentication()))) &&
            ((this.twitterRecipientAuthentication==null && other.getTwitterRecipientAuthentication()==null) || 
             (this.twitterRecipientAuthentication!=null &&
              this.twitterRecipientAuthentication.equals(other.getTwitterRecipientAuthentication()))) &&
            ((this.yahooRecipientAuthentication==null && other.getYahooRecipientAuthentication()==null) || 
             (this.yahooRecipientAuthentication!=null &&
              this.yahooRecipientAuthentication.equals(other.getYahooRecipientAuthentication()))) &&
            ((this.openIDRecipientAuthentication==null && other.getOpenIDRecipientAuthentication()==null) || 
             (this.openIDRecipientAuthentication!=null &&
              this.openIDRecipientAuthentication.equals(other.getOpenIDRecipientAuthentication()))) &&
            ((this.anySocialIDRecipientAuthentication==null && other.getAnySocialIDRecipientAuthentication()==null) || 
             (this.anySocialIDRecipientAuthentication!=null &&
              this.anySocialIDRecipientAuthentication.equals(other.getAnySocialIDRecipientAuthentication()))) &&
            ((this.phoneAuthentication==null && other.getPhoneAuthentication()==null) || 
             (this.phoneAuthentication!=null &&
              this.phoneAuthentication.equals(other.getPhoneAuthentication()))) &&
            ((this.SAMLAuthentication==null && other.getSAMLAuthentication()==null) || 
             (this.SAMLAuthentication!=null &&
              this.SAMLAuthentication.equals(other.getSAMLAuthentication()))) &&
            ((this.SMSAuthentication==null && other.getSMSAuthentication()==null) || 
             (this.SMSAuthentication!=null &&
              this.SMSAuthentication.equals(other.getSMSAuthentication()))) &&
            ((this.signatureInfo==null && other.getSignatureInfo()==null) || 
             (this.signatureInfo!=null &&
              this.signatureInfo.equals(other.getSignatureInfo()))) &&
            ((this.captiveInfo==null && other.getCaptiveInfo()==null) || 
             (this.captiveInfo!=null &&
              this.captiveInfo.equals(other.getCaptiveInfo()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields()))) &&
            ((this.routingOrder==null && other.getRoutingOrder()==null) || 
             (this.routingOrder!=null &&
              this.routingOrder.equals(other.getRoutingOrder()))) &&
            ((this.IDCheckInformationInput==null && other.getIDCheckInformationInput()==null) || 
             (this.IDCheckInformationInput!=null &&
              this.IDCheckInformationInput.equals(other.getIDCheckInformationInput()))) &&
            ((this.autoNavigation==null && other.getAutoNavigation()==null) || 
             (this.autoNavigation!=null &&
              this.autoNavigation.equals(other.getAutoNavigation()))) &&
            ((this.recipientAttachment==null && other.getRecipientAttachment()==null) || 
             (this.recipientAttachment!=null &&
              java.util.Arrays.equals(this.recipientAttachment, other.getRecipientAttachment()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.roleName==null && other.getRoleName()==null) || 
             (this.roleName!=null &&
              this.roleName.equals(other.getRoleName()))) &&
            ((this.templateLocked==null && other.getTemplateLocked()==null) || 
             (this.templateLocked!=null &&
              this.templateLocked.equals(other.getTemplateLocked()))) &&
            ((this.templateRequired==null && other.getTemplateRequired()==null) || 
             (this.templateRequired!=null &&
              this.templateRequired.equals(other.getTemplateRequired()))) &&
            ((this.templateAccessCodeRequired==null && other.getTemplateAccessCodeRequired()==null) || 
             (this.templateAccessCodeRequired!=null &&
              this.templateAccessCodeRequired.equals(other.getTemplateAccessCodeRequired()))) &&
            ((this.defaultRecipient==null && other.getDefaultRecipient()==null) || 
             (this.defaultRecipient!=null &&
              this.defaultRecipient.equals(other.getDefaultRecipient()))) &&
            ((this.emailNotification==null && other.getEmailNotification()==null) || 
             (this.emailNotification!=null &&
              this.emailNotification.equals(other.getEmailNotification()))) &&
            ((this.agentCanEditEmail==null && other.getAgentCanEditEmail()==null) || 
             (this.agentCanEditEmail!=null &&
              this.agentCanEditEmail.equals(other.getAgentCanEditEmail()))) &&
            ((this.agentCanEditName==null && other.getAgentCanEditName()==null) || 
             (this.agentCanEditName!=null &&
              this.agentCanEditName.equals(other.getAgentCanEditName()))) &&
            ((this.signInEachLocation==null && other.getSignInEachLocation()==null) || 
             (this.signInEachLocation!=null &&
              this.signInEachLocation.equals(other.getSignInEachLocation()))) &&
            ((this.excludedDocuments==null && other.getExcludedDocuments()==null) || 
             (this.excludedDocuments!=null &&
              java.util.Arrays.equals(this.excludedDocuments, other.getExcludedDocuments()))) &&
            ((this.requireSignerCertificate==null && other.getRequireSignerCertificate()==null) || 
             (this.requireSignerCertificate!=null &&
              this.requireSignerCertificate.equals(other.getRequireSignerCertificate()))) &&
            ((this.requireNotary==null && other.getRequireNotary()==null) || 
             (this.requireNotary!=null &&
              this.requireNotary.equals(other.getRequireNotary()))) &&
            ((this.inheritEmailNotificationConfiguration==null && other.getInheritEmailNotificationConfiguration()==null) || 
             (this.inheritEmailNotificationConfiguration!=null &&
              this.inheritEmailNotificationConfiguration.equals(other.getInheritEmailNotificationConfiguration()))) &&
            ((this.hostedSigner==null && other.getHostedSigner()==null) || 
             (this.hostedSigner!=null &&
              this.hostedSigner.equals(other.getHostedSigner()))) &&
            ((this.isNotaryTransaction==null && other.getIsNotaryTransaction()==null) || 
             (this.isNotaryTransaction!=null &&
              this.isNotaryTransaction.equals(other.getIsNotaryTransaction()))) &&
            ((this.signingGroupId==null && other.getSigningGroupId()==null) || 
             (this.signingGroupId!=null &&
              this.signingGroupId.equals(other.getSigningGroupId()))) &&
            ((this.recipientSignatureProviders==null && other.getRecipientSignatureProviders()==null) || 
             (this.recipientSignatureProviders!=null &&
              java.util.Arrays.equals(this.recipientSignatureProviders, other.getRecipientSignatureProviders())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getSignerName() != null) {
            _hashCode += getSignerName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAccessCode() != null) {
            _hashCode += getAccessCode().hashCode();
        }
        if (getAddAccessCodeToEmail() != null) {
            _hashCode += getAddAccessCodeToEmail().hashCode();
        }
        if (getRequireIDLookup() != null) {
            _hashCode += getRequireIDLookup().hashCode();
        }
        if (getIDCheckConfigurationName() != null) {
            _hashCode += getIDCheckConfigurationName().hashCode();
        }
        if (getDeliveryMethod() != null) {
            _hashCode += getDeliveryMethod().hashCode();
        }
        if (getFaxNumber() != null) {
            _hashCode += getFaxNumber().hashCode();
        }
        if (getLiveIDRecipientAuthentication() != null) {
            _hashCode += getLiveIDRecipientAuthentication().hashCode();
        }
        if (getFacebookRecipientAuthentication() != null) {
            _hashCode += getFacebookRecipientAuthentication().hashCode();
        }
        if (getLinkedinRecipientAuthentication() != null) {
            _hashCode += getLinkedinRecipientAuthentication().hashCode();
        }
        if (getGoogleRecipientAuthentication() != null) {
            _hashCode += getGoogleRecipientAuthentication().hashCode();
        }
        if (getSalesforceRecipientAuthentication() != null) {
            _hashCode += getSalesforceRecipientAuthentication().hashCode();
        }
        if (getTwitterRecipientAuthentication() != null) {
            _hashCode += getTwitterRecipientAuthentication().hashCode();
        }
        if (getYahooRecipientAuthentication() != null) {
            _hashCode += getYahooRecipientAuthentication().hashCode();
        }
        if (getOpenIDRecipientAuthentication() != null) {
            _hashCode += getOpenIDRecipientAuthentication().hashCode();
        }
        if (getAnySocialIDRecipientAuthentication() != null) {
            _hashCode += getAnySocialIDRecipientAuthentication().hashCode();
        }
        if (getPhoneAuthentication() != null) {
            _hashCode += getPhoneAuthentication().hashCode();
        }
        if (getSAMLAuthentication() != null) {
            _hashCode += getSAMLAuthentication().hashCode();
        }
        if (getSMSAuthentication() != null) {
            _hashCode += getSMSAuthentication().hashCode();
        }
        if (getSignatureInfo() != null) {
            _hashCode += getSignatureInfo().hashCode();
        }
        if (getCaptiveInfo() != null) {
            _hashCode += getCaptiveInfo().hashCode();
        }
        if (getCustomFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoutingOrder() != null) {
            _hashCode += getRoutingOrder().hashCode();
        }
        if (getIDCheckInformationInput() != null) {
            _hashCode += getIDCheckInformationInput().hashCode();
        }
        if (getAutoNavigation() != null) {
            _hashCode += getAutoNavigation().hashCode();
        }
        if (getRecipientAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getRoleName() != null) {
            _hashCode += getRoleName().hashCode();
        }
        if (getTemplateLocked() != null) {
            _hashCode += getTemplateLocked().hashCode();
        }
        if (getTemplateRequired() != null) {
            _hashCode += getTemplateRequired().hashCode();
        }
        if (getTemplateAccessCodeRequired() != null) {
            _hashCode += getTemplateAccessCodeRequired().hashCode();
        }
        if (getDefaultRecipient() != null) {
            _hashCode += getDefaultRecipient().hashCode();
        }
        if (getEmailNotification() != null) {
            _hashCode += getEmailNotification().hashCode();
        }
        if (getAgentCanEditEmail() != null) {
            _hashCode += getAgentCanEditEmail().hashCode();
        }
        if (getAgentCanEditName() != null) {
            _hashCode += getAgentCanEditName().hashCode();
        }
        if (getSignInEachLocation() != null) {
            _hashCode += getSignInEachLocation().hashCode();
        }
        if (getExcludedDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequireSignerCertificate() != null) {
            _hashCode += getRequireSignerCertificate().hashCode();
        }
        if (getRequireNotary() != null) {
            _hashCode += getRequireNotary().hashCode();
        }
        if (getInheritEmailNotificationConfiguration() != null) {
            _hashCode += getInheritEmailNotificationConfiguration().hashCode();
        }
        if (getHostedSigner() != null) {
            _hashCode += getHostedSigner().hashCode();
        }
        if (getIsNotaryTransaction() != null) {
            _hashCode += getIsNotaryTransaction().hashCode();
        }
        if (getSigningGroupId() != null) {
            _hashCode += getSigningGroupId().hashCode();
        }
        if (getRecipientSignatureProviders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientSignatureProviders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientSignatureProviders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Recipient.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientTypeCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccessCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addAccessCodeToEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddAccessCodeToEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireIDLookup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequireIDLookup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCheckConfigurationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckConfigurationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeliveryMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DeliveryMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FaxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveIDRecipientAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "LiveIDRecipientAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facebookRecipientAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FacebookRecipientAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedinRecipientAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "LinkedinRecipientAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("googleRecipientAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GoogleRecipientAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesforceRecipientAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SalesforceRecipientAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twitterRecipientAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TwitterRecipientAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yahooRecipientAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "YahooRecipientAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openIDRecipientAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OpenIDRecipientAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anySocialIDRecipientAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnySocialIDRecipientAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientPhoneAuthentication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAMLAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SAMLAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSAMLAuthentication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SMSAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SMSAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSMSAuthentication"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captiveInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCaptiveInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoutingOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCheckInformationInput");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformationInput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IDCheckInformationInput"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoNavigation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AutoNavigation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateLocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateLocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateAccessCodeRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateAccessCodeRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultRecipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DefaultRecipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EmailNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEmailNotification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCanEditEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AgentCanEditEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentCanEditName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AgentCanEditName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signInEachLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignInEachLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ExcludedDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentID"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireSignerCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequireSignerCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireNotary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequireNotary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inheritEmailNotificationConfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "InheritEmailNotificationConfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostedSigner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "HostedSigner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNotaryTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IsNotaryTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientSignatureProviders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureProviders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureProvider"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureProvider"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
