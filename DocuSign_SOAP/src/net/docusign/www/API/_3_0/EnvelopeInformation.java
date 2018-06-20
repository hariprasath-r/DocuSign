/**
 * EnvelopeInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeInformation  implements java.io.Serializable {
    private java.lang.String transactionID;

    private java.lang.Boolean asynchronous;

    private java.lang.String accountId;

    private java.lang.String emailBlurb;

    private java.lang.String subject;

    private net.docusign.www.API._3_0.SigningLocationCode signingLocation;

    private net.docusign.www.API._3_0.CustomField[] customFields;

    private net.docusign.www.API._3_0.VaultingOptions vaultingOptions;

    private java.lang.Boolean autoNavigation;

    private java.lang.Boolean envelopeIdStamping;

    private java.lang.Boolean authoritativeCopy;

    private java.lang.Boolean authoritativeCopyDefault;

    private net.docusign.www.API._3_0.Notification notification;

    private java.lang.Boolean enforceSignerVisibility;

    private java.lang.Boolean enableWetSign;

    private java.lang.Boolean allowRecipientRecursion;

    private java.lang.Boolean allowMarkup;

    private java.lang.String brandId;

    private net.docusign.www.API._3_0.EventNotification eventNotification;

    private java.lang.Boolean allowReassign;

    private java.lang.String accessibility;

    private java.lang.Boolean messageLock;

    private java.lang.Boolean recipientsLock;

    private java.lang.Boolean useDisclosure;

    private net.docusign.www.API._3_0.EmailSettings emailSettings;

    public EnvelopeInformation() {
    }

    public EnvelopeInformation(
           java.lang.String transactionID,
           java.lang.Boolean asynchronous,
           java.lang.String accountId,
           java.lang.String emailBlurb,
           java.lang.String subject,
           net.docusign.www.API._3_0.SigningLocationCode signingLocation,
           net.docusign.www.API._3_0.CustomField[] customFields,
           net.docusign.www.API._3_0.VaultingOptions vaultingOptions,
           java.lang.Boolean autoNavigation,
           java.lang.Boolean envelopeIdStamping,
           java.lang.Boolean authoritativeCopy,
           java.lang.Boolean authoritativeCopyDefault,
           net.docusign.www.API._3_0.Notification notification,
           java.lang.Boolean enforceSignerVisibility,
           java.lang.Boolean enableWetSign,
           java.lang.Boolean allowRecipientRecursion,
           java.lang.Boolean allowMarkup,
           java.lang.String brandId,
           net.docusign.www.API._3_0.EventNotification eventNotification,
           java.lang.Boolean allowReassign,
           java.lang.String accessibility,
           java.lang.Boolean messageLock,
           java.lang.Boolean recipientsLock,
           java.lang.Boolean useDisclosure,
           net.docusign.www.API._3_0.EmailSettings emailSettings) {
           this.transactionID = transactionID;
           this.asynchronous = asynchronous;
           this.accountId = accountId;
           this.emailBlurb = emailBlurb;
           this.subject = subject;
           this.signingLocation = signingLocation;
           this.customFields = customFields;
           this.vaultingOptions = vaultingOptions;
           this.autoNavigation = autoNavigation;
           this.envelopeIdStamping = envelopeIdStamping;
           this.authoritativeCopy = authoritativeCopy;
           this.authoritativeCopyDefault = authoritativeCopyDefault;
           this.notification = notification;
           this.enforceSignerVisibility = enforceSignerVisibility;
           this.enableWetSign = enableWetSign;
           this.allowRecipientRecursion = allowRecipientRecursion;
           this.allowMarkup = allowMarkup;
           this.brandId = brandId;
           this.eventNotification = eventNotification;
           this.allowReassign = allowReassign;
           this.accessibility = accessibility;
           this.messageLock = messageLock;
           this.recipientsLock = recipientsLock;
           this.useDisclosure = useDisclosure;
           this.emailSettings = emailSettings;
    }


    /**
     * Gets the transactionID value for this EnvelopeInformation.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this EnvelopeInformation.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the asynchronous value for this EnvelopeInformation.
     * 
     * @return asynchronous
     */
    public java.lang.Boolean getAsynchronous() {
        return asynchronous;
    }


    /**
     * Sets the asynchronous value for this EnvelopeInformation.
     * 
     * @param asynchronous
     */
    public void setAsynchronous(java.lang.Boolean asynchronous) {
        this.asynchronous = asynchronous;
    }


    /**
     * Gets the accountId value for this EnvelopeInformation.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this EnvelopeInformation.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the emailBlurb value for this EnvelopeInformation.
     * 
     * @return emailBlurb
     */
    public java.lang.String getEmailBlurb() {
        return emailBlurb;
    }


    /**
     * Sets the emailBlurb value for this EnvelopeInformation.
     * 
     * @param emailBlurb
     */
    public void setEmailBlurb(java.lang.String emailBlurb) {
        this.emailBlurb = emailBlurb;
    }


    /**
     * Gets the subject value for this EnvelopeInformation.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this EnvelopeInformation.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the signingLocation value for this EnvelopeInformation.
     * 
     * @return signingLocation
     */
    public net.docusign.www.API._3_0.SigningLocationCode getSigningLocation() {
        return signingLocation;
    }


    /**
     * Sets the signingLocation value for this EnvelopeInformation.
     * 
     * @param signingLocation
     */
    public void setSigningLocation(net.docusign.www.API._3_0.SigningLocationCode signingLocation) {
        this.signingLocation = signingLocation;
    }


    /**
     * Gets the customFields value for this EnvelopeInformation.
     * 
     * @return customFields
     */
    public net.docusign.www.API._3_0.CustomField[] getCustomFields() {
        return customFields;
    }


    /**
     * Sets the customFields value for this EnvelopeInformation.
     * 
     * @param customFields
     */
    public void setCustomFields(net.docusign.www.API._3_0.CustomField[] customFields) {
        this.customFields = customFields;
    }


    /**
     * Gets the vaultingOptions value for this EnvelopeInformation.
     * 
     * @return vaultingOptions
     */
    public net.docusign.www.API._3_0.VaultingOptions getVaultingOptions() {
        return vaultingOptions;
    }


    /**
     * Sets the vaultingOptions value for this EnvelopeInformation.
     * 
     * @param vaultingOptions
     */
    public void setVaultingOptions(net.docusign.www.API._3_0.VaultingOptions vaultingOptions) {
        this.vaultingOptions = vaultingOptions;
    }


    /**
     * Gets the autoNavigation value for this EnvelopeInformation.
     * 
     * @return autoNavigation
     */
    public java.lang.Boolean getAutoNavigation() {
        return autoNavigation;
    }


    /**
     * Sets the autoNavigation value for this EnvelopeInformation.
     * 
     * @param autoNavigation
     */
    public void setAutoNavigation(java.lang.Boolean autoNavigation) {
        this.autoNavigation = autoNavigation;
    }


    /**
     * Gets the envelopeIdStamping value for this EnvelopeInformation.
     * 
     * @return envelopeIdStamping
     */
    public java.lang.Boolean getEnvelopeIdStamping() {
        return envelopeIdStamping;
    }


    /**
     * Sets the envelopeIdStamping value for this EnvelopeInformation.
     * 
     * @param envelopeIdStamping
     */
    public void setEnvelopeIdStamping(java.lang.Boolean envelopeIdStamping) {
        this.envelopeIdStamping = envelopeIdStamping;
    }


    /**
     * Gets the authoritativeCopy value for this EnvelopeInformation.
     * 
     * @return authoritativeCopy
     */
    public java.lang.Boolean getAuthoritativeCopy() {
        return authoritativeCopy;
    }


    /**
     * Sets the authoritativeCopy value for this EnvelopeInformation.
     * 
     * @param authoritativeCopy
     */
    public void setAuthoritativeCopy(java.lang.Boolean authoritativeCopy) {
        this.authoritativeCopy = authoritativeCopy;
    }


    /**
     * Gets the authoritativeCopyDefault value for this EnvelopeInformation.
     * 
     * @return authoritativeCopyDefault
     */
    public java.lang.Boolean getAuthoritativeCopyDefault() {
        return authoritativeCopyDefault;
    }


    /**
     * Sets the authoritativeCopyDefault value for this EnvelopeInformation.
     * 
     * @param authoritativeCopyDefault
     */
    public void setAuthoritativeCopyDefault(java.lang.Boolean authoritativeCopyDefault) {
        this.authoritativeCopyDefault = authoritativeCopyDefault;
    }


    /**
     * Gets the notification value for this EnvelopeInformation.
     * 
     * @return notification
     */
    public net.docusign.www.API._3_0.Notification getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this EnvelopeInformation.
     * 
     * @param notification
     */
    public void setNotification(net.docusign.www.API._3_0.Notification notification) {
        this.notification = notification;
    }


    /**
     * Gets the enforceSignerVisibility value for this EnvelopeInformation.
     * 
     * @return enforceSignerVisibility
     */
    public java.lang.Boolean getEnforceSignerVisibility() {
        return enforceSignerVisibility;
    }


    /**
     * Sets the enforceSignerVisibility value for this EnvelopeInformation.
     * 
     * @param enforceSignerVisibility
     */
    public void setEnforceSignerVisibility(java.lang.Boolean enforceSignerVisibility) {
        this.enforceSignerVisibility = enforceSignerVisibility;
    }


    /**
     * Gets the enableWetSign value for this EnvelopeInformation.
     * 
     * @return enableWetSign
     */
    public java.lang.Boolean getEnableWetSign() {
        return enableWetSign;
    }


    /**
     * Sets the enableWetSign value for this EnvelopeInformation.
     * 
     * @param enableWetSign
     */
    public void setEnableWetSign(java.lang.Boolean enableWetSign) {
        this.enableWetSign = enableWetSign;
    }


    /**
     * Gets the allowRecipientRecursion value for this EnvelopeInformation.
     * 
     * @return allowRecipientRecursion
     */
    public java.lang.Boolean getAllowRecipientRecursion() {
        return allowRecipientRecursion;
    }


    /**
     * Sets the allowRecipientRecursion value for this EnvelopeInformation.
     * 
     * @param allowRecipientRecursion
     */
    public void setAllowRecipientRecursion(java.lang.Boolean allowRecipientRecursion) {
        this.allowRecipientRecursion = allowRecipientRecursion;
    }


    /**
     * Gets the allowMarkup value for this EnvelopeInformation.
     * 
     * @return allowMarkup
     */
    public java.lang.Boolean getAllowMarkup() {
        return allowMarkup;
    }


    /**
     * Sets the allowMarkup value for this EnvelopeInformation.
     * 
     * @param allowMarkup
     */
    public void setAllowMarkup(java.lang.Boolean allowMarkup) {
        this.allowMarkup = allowMarkup;
    }


    /**
     * Gets the brandId value for this EnvelopeInformation.
     * 
     * @return brandId
     */
    public java.lang.String getBrandId() {
        return brandId;
    }


    /**
     * Sets the brandId value for this EnvelopeInformation.
     * 
     * @param brandId
     */
    public void setBrandId(java.lang.String brandId) {
        this.brandId = brandId;
    }


    /**
     * Gets the eventNotification value for this EnvelopeInformation.
     * 
     * @return eventNotification
     */
    public net.docusign.www.API._3_0.EventNotification getEventNotification() {
        return eventNotification;
    }


    /**
     * Sets the eventNotification value for this EnvelopeInformation.
     * 
     * @param eventNotification
     */
    public void setEventNotification(net.docusign.www.API._3_0.EventNotification eventNotification) {
        this.eventNotification = eventNotification;
    }


    /**
     * Gets the allowReassign value for this EnvelopeInformation.
     * 
     * @return allowReassign
     */
    public java.lang.Boolean getAllowReassign() {
        return allowReassign;
    }


    /**
     * Sets the allowReassign value for this EnvelopeInformation.
     * 
     * @param allowReassign
     */
    public void setAllowReassign(java.lang.Boolean allowReassign) {
        this.allowReassign = allowReassign;
    }


    /**
     * Gets the accessibility value for this EnvelopeInformation.
     * 
     * @return accessibility
     */
    public java.lang.String getAccessibility() {
        return accessibility;
    }


    /**
     * Sets the accessibility value for this EnvelopeInformation.
     * 
     * @param accessibility
     */
    public void setAccessibility(java.lang.String accessibility) {
        this.accessibility = accessibility;
    }


    /**
     * Gets the messageLock value for this EnvelopeInformation.
     * 
     * @return messageLock
     */
    public java.lang.Boolean getMessageLock() {
        return messageLock;
    }


    /**
     * Sets the messageLock value for this EnvelopeInformation.
     * 
     * @param messageLock
     */
    public void setMessageLock(java.lang.Boolean messageLock) {
        this.messageLock = messageLock;
    }


    /**
     * Gets the recipientsLock value for this EnvelopeInformation.
     * 
     * @return recipientsLock
     */
    public java.lang.Boolean getRecipientsLock() {
        return recipientsLock;
    }


    /**
     * Sets the recipientsLock value for this EnvelopeInformation.
     * 
     * @param recipientsLock
     */
    public void setRecipientsLock(java.lang.Boolean recipientsLock) {
        this.recipientsLock = recipientsLock;
    }


    /**
     * Gets the useDisclosure value for this EnvelopeInformation.
     * 
     * @return useDisclosure
     */
    public java.lang.Boolean getUseDisclosure() {
        return useDisclosure;
    }


    /**
     * Sets the useDisclosure value for this EnvelopeInformation.
     * 
     * @param useDisclosure
     */
    public void setUseDisclosure(java.lang.Boolean useDisclosure) {
        this.useDisclosure = useDisclosure;
    }


    /**
     * Gets the emailSettings value for this EnvelopeInformation.
     * 
     * @return emailSettings
     */
    public net.docusign.www.API._3_0.EmailSettings getEmailSettings() {
        return emailSettings;
    }


    /**
     * Sets the emailSettings value for this EnvelopeInformation.
     * 
     * @param emailSettings
     */
    public void setEmailSettings(net.docusign.www.API._3_0.EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeInformation)) return false;
        EnvelopeInformation other = (EnvelopeInformation) obj;
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
            ((this.emailBlurb==null && other.getEmailBlurb()==null) || 
             (this.emailBlurb!=null &&
              this.emailBlurb.equals(other.getEmailBlurb()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
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
            ((this.authoritativeCopyDefault==null && other.getAuthoritativeCopyDefault()==null) || 
             (this.authoritativeCopyDefault!=null &&
              this.authoritativeCopyDefault.equals(other.getAuthoritativeCopyDefault()))) &&
            ((this.notification==null && other.getNotification()==null) || 
             (this.notification!=null &&
              this.notification.equals(other.getNotification()))) &&
            ((this.enforceSignerVisibility==null && other.getEnforceSignerVisibility()==null) || 
             (this.enforceSignerVisibility!=null &&
              this.enforceSignerVisibility.equals(other.getEnforceSignerVisibility()))) &&
            ((this.enableWetSign==null && other.getEnableWetSign()==null) || 
             (this.enableWetSign!=null &&
              this.enableWetSign.equals(other.getEnableWetSign()))) &&
            ((this.allowRecipientRecursion==null && other.getAllowRecipientRecursion()==null) || 
             (this.allowRecipientRecursion!=null &&
              this.allowRecipientRecursion.equals(other.getAllowRecipientRecursion()))) &&
            ((this.allowMarkup==null && other.getAllowMarkup()==null) || 
             (this.allowMarkup!=null &&
              this.allowMarkup.equals(other.getAllowMarkup()))) &&
            ((this.brandId==null && other.getBrandId()==null) || 
             (this.brandId!=null &&
              this.brandId.equals(other.getBrandId()))) &&
            ((this.eventNotification==null && other.getEventNotification()==null) || 
             (this.eventNotification!=null &&
              this.eventNotification.equals(other.getEventNotification()))) &&
            ((this.allowReassign==null && other.getAllowReassign()==null) || 
             (this.allowReassign!=null &&
              this.allowReassign.equals(other.getAllowReassign()))) &&
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
              this.emailSettings.equals(other.getEmailSettings())));
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
        if (getEmailBlurb() != null) {
            _hashCode += getEmailBlurb().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
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
        if (getAuthoritativeCopyDefault() != null) {
            _hashCode += getAuthoritativeCopyDefault().hashCode();
        }
        if (getNotification() != null) {
            _hashCode += getNotification().hashCode();
        }
        if (getEnforceSignerVisibility() != null) {
            _hashCode += getEnforceSignerVisibility().hashCode();
        }
        if (getEnableWetSign() != null) {
            _hashCode += getEnableWetSign().hashCode();
        }
        if (getAllowRecipientRecursion() != null) {
            _hashCode += getAllowRecipientRecursion().hashCode();
        }
        if (getAllowMarkup() != null) {
            _hashCode += getAllowMarkup().hashCode();
        }
        if (getBrandId() != null) {
            _hashCode += getBrandId().hashCode();
        }
        if (getEventNotification() != null) {
            _hashCode += getEventNotification().hashCode();
        }
        if (getAllowReassign() != null) {
            _hashCode += getAllowReassign().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeInformation"));
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
        elemField.setFieldName("emailBlurb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EmailBlurb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Subject"));
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
        elemField.setFieldName("authoritativeCopyDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopyDefault"));
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
        elemField.setFieldName("allowRecipientRecursion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AllowRecipientRecursion"));
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
        elemField.setFieldName("brandId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
