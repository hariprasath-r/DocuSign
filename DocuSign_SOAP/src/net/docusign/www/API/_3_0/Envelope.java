/**
 * Envelope.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Envelope  implements java.io.Serializable {
    private java.lang.String transactionID;

    private java.lang.Boolean asynchronous;

    private java.lang.String accountId;

    private net.docusign.www.API._3_0.Document[] documents;

    private net.docusign.www.API._3_0.Recipient[] recipients;

    private net.docusign.www.API._3_0.Tab[] tabs;

    private java.lang.String subject;

    private java.lang.String emailBlurb;

    private net.docusign.www.API._3_0.SigningLocationCode signingLocation;

    private net.docusign.www.API._3_0.CustomField[] customFields;

    private net.docusign.www.API._3_0.VaultingOptions vaultingOptions;

    private java.lang.Boolean autoNavigation;

    private java.lang.Boolean envelopeIdStamping;

    private java.lang.Boolean authoritativeCopy;

    private net.docusign.www.API._3_0.Notification notification;

    private net.docusign.www.API._3_0.Attachment[] envelopeAttachment;

    private java.lang.Boolean enforceSignerVisibility;

    private java.lang.Boolean enableWetSign;

    private java.lang.Boolean allowMarkup;

    private net.docusign.www.API._3_0.EventNotification eventNotification;

    private java.lang.Boolean allowReassign;

    private java.lang.String brandId;

    private java.lang.Boolean brandLock;

    private java.lang.String accessibility;

    private java.lang.Boolean messageLock;

    private java.lang.Boolean recipientsLock;

    private java.lang.Boolean useDisclosure;

    private net.docusign.www.API._3_0.EmailSettings emailSettings;

    private java.lang.Boolean authoritativeCopyDefault;

    public Envelope() {
    }

    public Envelope(
           java.lang.String transactionID,
           java.lang.Boolean asynchronous,
           java.lang.String accountId,
           net.docusign.www.API._3_0.Document[] documents,
           net.docusign.www.API._3_0.Recipient[] recipients,
           net.docusign.www.API._3_0.Tab[] tabs,
           java.lang.String subject,
           java.lang.String emailBlurb,
           net.docusign.www.API._3_0.SigningLocationCode signingLocation,
           net.docusign.www.API._3_0.CustomField[] customFields,
           net.docusign.www.API._3_0.VaultingOptions vaultingOptions,
           java.lang.Boolean autoNavigation,
           java.lang.Boolean envelopeIdStamping,
           java.lang.Boolean authoritativeCopy,
           net.docusign.www.API._3_0.Notification notification,
           net.docusign.www.API._3_0.Attachment[] envelopeAttachment,
           java.lang.Boolean enforceSignerVisibility,
           java.lang.Boolean enableWetSign,
           java.lang.Boolean allowMarkup,
           net.docusign.www.API._3_0.EventNotification eventNotification,
           java.lang.Boolean allowReassign,
           java.lang.String brandId,
           java.lang.Boolean brandLock,
           java.lang.String accessibility,
           java.lang.Boolean messageLock,
           java.lang.Boolean recipientsLock,
           java.lang.Boolean useDisclosure,
           net.docusign.www.API._3_0.EmailSettings emailSettings,
           java.lang.Boolean authoritativeCopyDefault) {
           this.transactionID = transactionID;
           this.asynchronous = asynchronous;
           this.accountId = accountId;
           this.documents = documents;
           this.recipients = recipients;
           this.tabs = tabs;
           this.subject = subject;
           this.emailBlurb = emailBlurb;
           this.signingLocation = signingLocation;
           this.customFields = customFields;
           this.vaultingOptions = vaultingOptions;
           this.autoNavigation = autoNavigation;
           this.envelopeIdStamping = envelopeIdStamping;
           this.authoritativeCopy = authoritativeCopy;
           this.notification = notification;
           this.envelopeAttachment = envelopeAttachment;
           this.enforceSignerVisibility = enforceSignerVisibility;
           this.enableWetSign = enableWetSign;
           this.allowMarkup = allowMarkup;
           this.eventNotification = eventNotification;
           this.allowReassign = allowReassign;
           this.brandId = brandId;
           this.brandLock = brandLock;
           this.accessibility = accessibility;
           this.messageLock = messageLock;
           this.recipientsLock = recipientsLock;
           this.useDisclosure = useDisclosure;
           this.emailSettings = emailSettings;
           this.authoritativeCopyDefault = authoritativeCopyDefault;
    }


    /**
     * Gets the transactionID value for this Envelope.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this Envelope.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the asynchronous value for this Envelope.
     * 
     * @return asynchronous
     */
    public java.lang.Boolean getAsynchronous() {
        return asynchronous;
    }


    /**
     * Sets the asynchronous value for this Envelope.
     * 
     * @param asynchronous
     */
    public void setAsynchronous(java.lang.Boolean asynchronous) {
        this.asynchronous = asynchronous;
    }


    /**
     * Gets the accountId value for this Envelope.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Envelope.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the documents value for this Envelope.
     * 
     * @return documents
     */
    public net.docusign.www.API._3_0.Document[] getDocuments() {
        return documents;
    }


    /**
     * Sets the documents value for this Envelope.
     * 
     * @param documents
     */
    public void setDocuments(net.docusign.www.API._3_0.Document[] documents) {
        this.documents = documents;
    }


    /**
     * Gets the recipients value for this Envelope.
     * 
     * @return recipients
     */
    public net.docusign.www.API._3_0.Recipient[] getRecipients() {
        return recipients;
    }


    /**
     * Sets the recipients value for this Envelope.
     * 
     * @param recipients
     */
    public void setRecipients(net.docusign.www.API._3_0.Recipient[] recipients) {
        this.recipients = recipients;
    }


    /**
     * Gets the tabs value for this Envelope.
     * 
     * @return tabs
     */
    public net.docusign.www.API._3_0.Tab[] getTabs() {
        return tabs;
    }


    /**
     * Sets the tabs value for this Envelope.
     * 
     * @param tabs
     */
    public void setTabs(net.docusign.www.API._3_0.Tab[] tabs) {
        this.tabs = tabs;
    }


    /**
     * Gets the subject value for this Envelope.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Envelope.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the emailBlurb value for this Envelope.
     * 
     * @return emailBlurb
     */
    public java.lang.String getEmailBlurb() {
        return emailBlurb;
    }


    /**
     * Sets the emailBlurb value for this Envelope.
     * 
     * @param emailBlurb
     */
    public void setEmailBlurb(java.lang.String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }


    /**
     * Gets the signingLocation value for this Envelope.
     * 
     * @return signingLocation
     */
    public net.docusign.www.API._3_0.SigningLocationCode getSigningLocation() {
        return signingLocation;
    }


    /**
     * Sets the signingLocation value for this Envelope.
     * 
     * @param signingLocation
     */
    public void setSigningLocation(net.docusign.www.API._3_0.SigningLocationCode signingLocation) {
        this.signingLocation = signingLocation;
    }


    /**
     * Gets the customFields value for this Envelope.
     * 
     * @return customFields
     */
    public net.docusign.www.API._3_0.CustomField[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this Envelope.
     * 
     * @param customFields
     */
    public void setCustomFields(net.docusign.www.API._3_0.CustomField[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the vaultingOptions value for this Envelope.
     * 
     * @return vaultingOptions
     */
    public net.docusign.www.API._3_0.VaultingOptions getVaultingOptions() {
        return vaultingOptions;
    }


    /**
     * Sets the vaultingOptions value for this Envelope.
     * 
     * @param vaultingOptions
     */
    public void setVaultingOptions(net.docusign.www.API._3_0.VaultingOptions vaultingOptions) {
        this.vaultingOptions = vaultingOptions;
    }


    /**
     * Gets the autoNavigation value for this Envelope.
     * 
     * @return autoNavigation
     */
    public java.lang.Boolean getAutoNavigation() {
        return autoNavigation;
    }


    /**
     * Sets the autoNavigation value for this Envelope.
     * 
     * @param autoNavigation
     */
    public void setAutoNavigation(java.lang.Boolean autoNavigation) {
        this.autoNavigation = autoNavigation;
    }


    /**
     * Gets the envelopeIdStamping value for this Envelope.
     * 
     * @return envelopeIdStamping
     */
    public java.lang.Boolean getEnvelopeIdStamping() {
        return envelopeIdStamping;
    }


    /**
     * Sets the envelopeIdStamping value for this Envelope.
     * 
     * @param envelopeIdStamping
     */
    public void setEnvelopeIdStamping(java.lang.Boolean envelopeIdStamping) {
        this.envelopeIdStamping = envelopeIdStamping;
    }


    /**
     * Gets the authoritativeCopy value for this Envelope.
     * 
     * @return authoritativeCopy
     */
    public java.lang.Boolean getAuthoritativeCopy() {
        return authoritativeCopy;
    }


    /**
     * Sets the authoritativeCopy value for this Envelope.
     * 
     * @param authoritativeCopy
     */
    public void setAuthoritativeCopy(java.lang.Boolean authoritativeCopy) {
        this.authoritativeCopy = authoritativeCopy;
    }


    /**
     * Gets the notification value for this Envelope.
     * 
     * @return notification
     */
    public net.docusign.www.API._3_0.Notification getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this Envelope.
     * 
     * @param notification
     */
    public void setNotification(net.docusign.www.API._3_0.Notification notification) {
        this.notification = notification;
    }


    /**
     * Gets the envelopeAttachment value for this Envelope.
     * 
     * @return envelopeAttachment
     */
    public net.docusign.www.API._3_0.Attachment[] getEnvelopeAttachment() {
        return envelopeAttachment;
    }


    /**
     * Sets the envelopeAttachment value for this Envelope.
     * 
     * @param envelopeAttachment
     */
    public void setEnvelopeAttachment(net.docusign.www.API._3_0.Attachment[] envelopeAttachment) {
        this.envelopeAttachment = envelopeAttachment;
    }


    /**
     * Gets the enforceSignerVisibility value for this Envelope.
     * 
     * @return enforceSignerVisibility
     */
    public java.lang.Boolean getEnforceSignerVisibility() {
        return enforceSignerVisibility;
    }


    /**
     * Sets the enforceSignerVisibility value for this Envelope.
     * 
     * @param enforceSignerVisibility
     */
    public void setEnforceSignerVisibility(java.lang.Boolean enforceSignerVisibility) {
        this.enforceSignerVisibility = enforceSignerVisibility;
    }


    /**
     * Gets the enableWetSign value for this Envelope.
     * 
     * @return enableWetSign
     */
    public java.lang.Boolean getEnableWetSign() {
        return enableWetSign;
    }


    /**
     * Sets the enableWetSign value for this Envelope.
     * 
     * @param enableWetSign
     */
    public void setEnableWetSign(java.lang.Boolean enableWetSign) {
        this.enableWetSign = enableWetSign;
    }


    /**
     * Gets the allowMarkup value for this Envelope.
     * 
     * @return allowMarkup
     */
    public java.lang.Boolean getAllowMarkup() {
        return allowMarkup;
    }


    /**
     * Sets the allowMarkup value for this Envelope.
     * 
     * @param allowMarkup
     */
    public void setAllowMarkup(java.lang.Boolean allowMarkup) {
        this.allowMarkup = allowMarkup;
    }


    /**
     * Gets the eventNotification value for this Envelope.
     * 
     * @return eventNotification
     */
    public net.docusign.www.API._3_0.EventNotification getEventNotification() {
        return eventNotification;
    }


    /**
     * Sets the eventNotification value for this Envelope.
     * 
     * @param eventNotification
     */
    public void setEventNotification(net.docusign.www.API._3_0.EventNotification eventNotification) {
        this.eventNotification = eventNotification;
    }


    /**
     * Gets the allowReassign value for this Envelope.
     * 
     * @return allowReassign
     */
    public java.lang.Boolean getAllowReassign() {
        return allowReassign;
    }


    /**
     * Sets the allowReassign value for this Envelope.
     * 
     * @param allowReassign
     */
    public void setAllowReassign(java.lang.Boolean allowReassign) {
        this.allowReassign = allowReassign;
    }


    /**
     * Gets the brandId value for this Envelope.
     * 
     * @return brandId
     */
    public java.lang.String getBrandId() {
        return brandId;
    }


    /**
     * Sets the brandId value for this Envelope.
     * 
     * @param brandId
     */
    public void setBrandId(java.lang.String brandId) {
        this.brandId = brandId;
    }


    /**
     * Gets the brandLock value for this Envelope.
     * 
     * @return brandLock
     */
    public java.lang.Boolean getBrandLock() {
        return brandLock;
    }


    /**
     * Sets the brandLock value for this Envelope.
     * 
     * @param brandLock
     */
    public void setBrandLock(java.lang.Boolean brandLock) {
        this.brandLock = brandLock;
    }


    /**
     * Gets the accessibility value for this Envelope.
     * 
     * @return accessibility
     */
    public java.lang.String getAccessibility() {
        return accessibility;
    }


    /**
     * Sets the accessibility value for this Envelope.
     * 
     * @param accessibility
     */
    public void setAccessibility(java.lang.String accessibility) {
        this.accessibility = accessibility;
    }


    /**
     * Gets the messageLock value for this Envelope.
     * 
     * @return messageLock
     */
    public java.lang.Boolean getMessageLock() {
        return messageLock;
    }


    /**
     * Sets the messageLock value for this Envelope.
     * 
     * @param messageLock
     */
    public void setMessageLock(java.lang.Boolean messageLock) {
        this.messageLock = messageLock;
    }


    /**
     * Gets the recipientsLock value for this Envelope.
     * 
     * @return recipientsLock
     */
    public java.lang.Boolean getRecipientsLock() {
        return recipientsLock;
    }


    /**
     * Sets the recipientsLock value for this Envelope.
     * 
     * @param recipientsLock
     */
    public void setRecipientsLock(java.lang.Boolean recipientsLock) {
        this.recipientsLock = recipientsLock;
    }


    /**
     * Gets the useDisclosure value for this Envelope.
     * 
     * @return useDisclosure
     */
    public java.lang.Boolean getUseDisclosure() {
        return useDisclosure;
    }


    /**
     * Sets the useDisclosure value for this Envelope.
     * 
     * @param useDisclosure
     */
    public void setUseDisclosure(java.lang.Boolean useDisclosure) {
        this.useDisclosure = useDisclosure;
    }


    /**
     * Gets the emailSettings value for this Envelope.
     * 
     * @return emailSettings
     */
    public net.docusign.www.API._3_0.EmailSettings getEmailSettings() {
        return emailSettings;
    }


    /**
     * Sets the emailSettings value for this Envelope.
     * 
     * @param emailSettings
     */
    public void setEmailSettings(net.docusign.www.API._3_0.EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }


    /**
     * Gets the authoritativeCopyDefault value for this Envelope.
     * 
     * @return authoritativeCopyDefault
     */
    public java.lang.Boolean getAuthoritativeCopyDefault() {
        return authoritativeCopyDefault;
    }


    /**
     * Sets the authoritativeCopyDefault value for this Envelope.
     * 
     * @param authoritativeCopyDefault
     */
    public void setAuthoritativeCopyDefault(java.lang.Boolean authoritativeCopyDefault) {
        this.authoritativeCopyDefault = authoritativeCopyDefault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Envelope)) return false;
        Envelope other = (Envelope) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.asynchronous==null && other.getAsynchronous()==null) || 
             (this.asynchronous!=null &&
              this.asynchronous.equals(other.getAsynchronous()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.documents==null && other.getDocuments()==null) || 
             (this.documents!=null &&
              java.util.Arrays.equals(this.documents, other.getDocuments()))) &&
            ((this.recipients==null && other.getRecipients()==null) || 
             (this.recipients!=null &&
              java.util.Arrays.equals(this.recipients, other.getRecipients()))) &&
            ((this.tabs==null && other.getTabs()==null) || 
             (this.tabs!=null &&
              java.util.Arrays.equals(this.tabs, other.getTabs()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.emailBlurb==null && other.getEmailBlurb()==null) || 
             (this.emailBlurb!=null &&
              this.emailBlurb.equals(other.getEmailBlurb()))) &&
            ((this.signingLocation==null && other.getSigningLocation()==null) || 
             (this.signingLocation!=null &&
              this.signingLocation.equals(other.getSigningLocation()))) &&
            ((this.customFields==null && other.getCustomFields()==null) || 
             (this.customFields!=null &&
              java.util.Arrays.equals(this.customFields, other.getCustomFields()))) &&
            ((this.vaultingOptions==null && other.getVaultingOptions()==null) || 
             (this.vaultingOptions!=null &&
              this.vaultingOptions.equals(other.getVaultingOptions()))) &&
            ((this.autoNavigation==null && other.getAutoNavigation()==null) || 
             (this.autoNavigation!=null &&
              this.autoNavigation.equals(other.getAutoNavigation()))) &&
            ((this.envelopeIdStamping==null && other.getEnvelopeIdStamping()==null) || 
             (this.envelopeIdStamping!=null &&
              this.envelopeIdStamping.equals(other.getEnvelopeIdStamping()))) &&
            ((this.authoritativeCopy==null && other.getAuthoritativeCopy()==null) || 
             (this.authoritativeCopy!=null &&
              this.authoritativeCopy.equals(other.getAuthoritativeCopy()))) &&
            ((this.notification==null && other.getNotification()==null) || 
             (this.notification!=null &&
              this.notification.equals(other.getNotification()))) &&
            ((this.envelopeAttachment==null && other.getEnvelopeAttachment()==null) || 
             (this.envelopeAttachment!=null &&
              java.util.Arrays.equals(this.envelopeAttachment, other.getEnvelopeAttachment()))) &&
            ((this.enforceSignerVisibility==null && other.getEnforceSignerVisibility()==null) || 
             (this.enforceSignerVisibility!=null &&
              this.enforceSignerVisibility.equals(other.getEnforceSignerVisibility()))) &&
            ((this.enableWetSign==null && other.getEnableWetSign()==null) || 
             (this.enableWetSign!=null &&
              this.enableWetSign.equals(other.getEnableWetSign()))) &&
            ((this.allowMarkup==null && other.getAllowMarkup()==null) || 
             (this.allowMarkup!=null &&
              this.allowMarkup.equals(other.getAllowMarkup()))) &&
            ((this.eventNotification==null && other.getEventNotification()==null) || 
             (this.eventNotification!=null &&
              this.eventNotification.equals(other.getEventNotification()))) &&
            ((this.allowReassign==null && other.getAllowReassign()==null) || 
             (this.allowReassign!=null &&
              this.allowReassign.equals(other.getAllowReassign()))) &&
            ((this.brandId==null && other.getBrandId()==null) || 
             (this.brandId!=null &&
              this.brandId.equals(other.getBrandId()))) &&
            ((this.brandLock==null && other.getBrandLock()==null) || 
             (this.brandLock!=null &&
              this.brandLock.equals(other.getBrandLock()))) &&
            ((this.accessibility==null && other.getAccessibility()==null) || 
             (this.accessibility!=null &&
              this.accessibility.equals(other.getAccessibility()))) &&
            ((this.messageLock==null && other.getMessageLock()==null) || 
             (this.messageLock!=null &&
              this.messageLock.equals(other.getMessageLock()))) &&
            ((this.recipientsLock==null && other.getRecipientsLock()==null) || 
             (this.recipientsLock!=null &&
              this.recipientsLock.equals(other.getRecipientsLock()))) &&
            ((this.useDisclosure==null && other.getUseDisclosure()==null) || 
             (this.useDisclosure!=null &&
              this.useDisclosure.equals(other.getUseDisclosure()))) &&
            ((this.emailSettings==null && other.getEmailSettings()==null) || 
             (this.emailSettings!=null &&
              this.emailSettings.equals(other.getEmailSettings()))) &&
            ((this.authoritativeCopyDefault==null && other.getAuthoritativeCopyDefault()==null) || 
             (this.authoritativeCopyDefault!=null &&
              this.authoritativeCopyDefault.equals(other.getAuthoritativeCopyDefault())));
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getAsynchronous() != null) {
            _hashCode += getAsynchronous().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTabs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTabs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTabs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getEmailBlurb() != null) {
            _hashCode += getEmailBlurb().hashCode();
        }
        if (getSigningLocation() != null) {
            _hashCode += getSigningLocation().hashCode();
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
        if (getVaultingOptions() != null) {
            _hashCode += getVaultingOptions().hashCode();
        }
        if (getAutoNavigation() != null) {
            _hashCode += getAutoNavigation().hashCode();
        }
        if (getEnvelopeIdStamping() != null) {
            _hashCode += getEnvelopeIdStamping().hashCode();
        }
        if (getAuthoritativeCopy() != null) {
            _hashCode += getAuthoritativeCopy().hashCode();
        }
        if (getNotification() != null) {
            _hashCode += getNotification().hashCode();
        }
        if (getEnvelopeAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvelopeAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvelopeAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnforceSignerVisibility() != null) {
            _hashCode += getEnforceSignerVisibility().hashCode();
        }
        if (getEnableWetSign() != null) {
            _hashCode += getEnableWetSign().hashCode();
        }
        if (getAllowMarkup() != null) {
            _hashCode += getAllowMarkup().hashCode();
        }
        if (getEventNotification() != null) {
            _hashCode += getEventNotification().hashCode();
        }
        if (getAllowReassign() != null) {
            _hashCode += getAllowReassign().hashCode();
        }
        if (getBrandId() != null) {
            _hashCode += getBrandId().hashCode();
        }
        if (getBrandLock() != null) {
            _hashCode += getBrandLock().hashCode();
        }
        if (getAccessibility() != null) {
            _hashCode += getAccessibility().hashCode();
        }
        if (getMessageLock() != null) {
            _hashCode += getMessageLock().hashCode();
        }
        if (getRecipientsLock() != null) {
            _hashCode += getRecipientsLock().hashCode();
        }
        if (getUseDisclosure() != null) {
            _hashCode += getUseDisclosure().hashCode();
        }
        if (getEmailSettings() != null) {
            _hashCode += getEmailSettings().hashCode();
        }
        if (getAuthoritativeCopyDefault() != null) {
            _hashCode += getAuthoritativeCopyDefault().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Envelope.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Envelope"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asynchronous");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Asynchronous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Documents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Document"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Document"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Recipient"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Tabs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Tab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Tab"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailBlurb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EmailBlurb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SigningLocationCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CustomField"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vaultingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VaultingOptions"));
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
        elemField.setFieldName("envelopeIdStamping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeIdStamping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authoritativeCopy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Notification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeAttachment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAttachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Attachment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceSignerVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnforceSignerVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableWetSign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnableWetSign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMarkup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AllowMarkup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventNotification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventNotification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventNotification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowReassign");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AllowReassign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandLock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandLock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Accessibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageLock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MessageLock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientsLock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientsLock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDisclosure");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UseDisclosure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EmailSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EmailSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authoritativeCopyDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopyDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
