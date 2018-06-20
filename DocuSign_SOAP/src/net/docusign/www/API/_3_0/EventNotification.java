/**
 * EventNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EventNotification  implements java.io.Serializable {
    private java.lang.String URL;

    private java.lang.Boolean loggingEnabled;

    private java.lang.Boolean requireAcknowledgment;

    private java.lang.Boolean useSoapInterface;

    private java.lang.String soapNameSpace;

    private java.lang.Boolean includeCertificateWithSoap;

    private java.lang.Boolean signMessageWithX509Cert;

    private java.lang.Boolean includeDocuments;

    private java.lang.Boolean includeTimeZone;

    private java.lang.Boolean includeEnvelopeVoidReason;

    private java.lang.Boolean includeDocumentFields;

    private java.lang.Boolean includeCertificateOfCompletion;

    private java.lang.Boolean includeSenderAccountAsCustomField;

    private net.docusign.www.API._3_0.EnvelopeEvent[] envelopeEvents;

    private net.docusign.www.API._3_0.RecipientEvent[] recipientEvents;

    public EventNotification() {
    }

    public EventNotification(
           java.lang.String URL,
           java.lang.Boolean loggingEnabled,
           java.lang.Boolean requireAcknowledgment,
           java.lang.Boolean useSoapInterface,
           java.lang.String soapNameSpace,
           java.lang.Boolean includeCertificateWithSoap,
           java.lang.Boolean signMessageWithX509Cert,
           java.lang.Boolean includeDocuments,
           java.lang.Boolean includeTimeZone,
           java.lang.Boolean includeEnvelopeVoidReason,
           java.lang.Boolean includeDocumentFields,
           java.lang.Boolean includeCertificateOfCompletion,
           java.lang.Boolean includeSenderAccountAsCustomField,
           net.docusign.www.API._3_0.EnvelopeEvent[] envelopeEvents,
           net.docusign.www.API._3_0.RecipientEvent[] recipientEvents) {
           this.URL = URL;
           this.loggingEnabled = loggingEnabled;
           this.requireAcknowledgment = requireAcknowledgment;
           this.useSoapInterface = useSoapInterface;
           this.soapNameSpace = soapNameSpace;
           this.includeCertificateWithSoap = includeCertificateWithSoap;
           this.signMessageWithX509Cert = signMessageWithX509Cert;
           this.includeDocuments = includeDocuments;
           this.includeTimeZone = includeTimeZone;
           this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
           this.includeDocumentFields = includeDocumentFields;
           this.includeCertificateOfCompletion = includeCertificateOfCompletion;
           this.includeSenderAccountAsCustomField = includeSenderAccountAsCustomField;
           this.envelopeEvents = envelopeEvents;
           this.recipientEvents = recipientEvents;
    }


    /**
     * Gets the URL value for this EventNotification.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this EventNotification.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the loggingEnabled value for this EventNotification.
     * 
     * @return loggingEnabled
     */
    public java.lang.Boolean getLoggingEnabled() {
        return loggingEnabled;
    }


    /**
     * Sets the loggingEnabled value for this EventNotification.
     * 
     * @param loggingEnabled
     */
    public void setLoggingEnabled(java.lang.Boolean loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
    }


    /**
     * Gets the requireAcknowledgment value for this EventNotification.
     * 
     * @return requireAcknowledgment
     */
    public java.lang.Boolean getRequireAcknowledgment() {
        return requireAcknowledgment;
    }


    /**
     * Sets the requireAcknowledgment value for this EventNotification.
     * 
     * @param requireAcknowledgment
     */
    public void setRequireAcknowledgment(java.lang.Boolean requireAcknowledgment) {
        this.requireAcknowledgment = requireAcknowledgment;
    }


    /**
     * Gets the useSoapInterface value for this EventNotification.
     * 
     * @return useSoapInterface
     */
    public java.lang.Boolean getUseSoapInterface() {
        return useSoapInterface;
    }


    /**
     * Sets the useSoapInterface value for this EventNotification.
     * 
     * @param useSoapInterface
     */
    public void setUseSoapInterface(java.lang.Boolean useSoapInterface) {
        this.useSoapInterface = useSoapInterface;
    }


    /**
     * Gets the soapNameSpace value for this EventNotification.
     * 
     * @return soapNameSpace
     */
    public java.lang.String getSoapNameSpace() {
        return soapNameSpace;
    }


    /**
     * Sets the soapNameSpace value for this EventNotification.
     * 
     * @param soapNameSpace
     */
    public void setSoapNameSpace(java.lang.String soapNameSpace) {
        this.soapNameSpace = soapNameSpace;
    }


    /**
     * Gets the includeCertificateWithSoap value for this EventNotification.
     * 
     * @return includeCertificateWithSoap
     */
    public java.lang.Boolean getIncludeCertificateWithSoap() {
        return includeCertificateWithSoap;
    }


    /**
     * Sets the includeCertificateWithSoap value for this EventNotification.
     * 
     * @param includeCertificateWithSoap
     */
    public void setIncludeCertificateWithSoap(java.lang.Boolean includeCertificateWithSoap) {
        this.includeCertificateWithSoap = includeCertificateWithSoap;
    }


    /**
     * Gets the signMessageWithX509Cert value for this EventNotification.
     * 
     * @return signMessageWithX509Cert
     */
    public java.lang.Boolean getSignMessageWithX509Cert() {
        return signMessageWithX509Cert;
    }


    /**
     * Sets the signMessageWithX509Cert value for this EventNotification.
     * 
     * @param signMessageWithX509Cert
     */
    public void setSignMessageWithX509Cert(java.lang.Boolean signMessageWithX509Cert) {
        this.signMessageWithX509Cert = signMessageWithX509Cert;
    }


    /**
     * Gets the includeDocuments value for this EventNotification.
     * 
     * @return includeDocuments
     */
    public java.lang.Boolean getIncludeDocuments() {
        return includeDocuments;
    }


    /**
     * Sets the includeDocuments value for this EventNotification.
     * 
     * @param includeDocuments
     */
    public void setIncludeDocuments(java.lang.Boolean includeDocuments) {
        this.includeDocuments = includeDocuments;
    }


    /**
     * Gets the includeTimeZone value for this EventNotification.
     * 
     * @return includeTimeZone
     */
    public java.lang.Boolean getIncludeTimeZone() {
        return includeTimeZone;
    }


    /**
     * Sets the includeTimeZone value for this EventNotification.
     * 
     * @param includeTimeZone
     */
    public void setIncludeTimeZone(java.lang.Boolean includeTimeZone) {
        this.includeTimeZone = includeTimeZone;
    }


    /**
     * Gets the includeEnvelopeVoidReason value for this EventNotification.
     * 
     * @return includeEnvelopeVoidReason
     */
    public java.lang.Boolean getIncludeEnvelopeVoidReason() {
        return includeEnvelopeVoidReason;
    }


    /**
     * Sets the includeEnvelopeVoidReason value for this EventNotification.
     * 
     * @param includeEnvelopeVoidReason
     */
    public void setIncludeEnvelopeVoidReason(java.lang.Boolean includeEnvelopeVoidReason) {
        this.includeEnvelopeVoidReason = includeEnvelopeVoidReason;
    }


    /**
     * Gets the includeDocumentFields value for this EventNotification.
     * 
     * @return includeDocumentFields
     */
    public java.lang.Boolean getIncludeDocumentFields() {
        return includeDocumentFields;
    }


    /**
     * Sets the includeDocumentFields value for this EventNotification.
     * 
     * @param includeDocumentFields
     */
    public void setIncludeDocumentFields(java.lang.Boolean includeDocumentFields) {
        this.includeDocumentFields = includeDocumentFields;
    }


    /**
     * Gets the includeCertificateOfCompletion value for this EventNotification.
     * 
     * @return includeCertificateOfCompletion
     */
    public java.lang.Boolean getIncludeCertificateOfCompletion() {
        return includeCertificateOfCompletion;
    }


    /**
     * Sets the includeCertificateOfCompletion value for this EventNotification.
     * 
     * @param includeCertificateOfCompletion
     */
    public void setIncludeCertificateOfCompletion(java.lang.Boolean includeCertificateOfCompletion) {
        this.includeCertificateOfCompletion = includeCertificateOfCompletion;
    }


    /**
     * Gets the includeSenderAccountAsCustomField value for this EventNotification.
     * 
     * @return includeSenderAccountAsCustomField
     */
    public java.lang.Boolean getIncludeSenderAccountAsCustomField() {
        return includeSenderAccountAsCustomField;
    }


    /**
     * Sets the includeSenderAccountAsCustomField value for this EventNotification.
     * 
     * @param includeSenderAccountAsCustomField
     */
    public void setIncludeSenderAccountAsCustomField(java.lang.Boolean includeSenderAccountAsCustomField) {
        this.includeSenderAccountAsCustomField = includeSenderAccountAsCustomField;
    }


    /**
     * Gets the envelopeEvents value for this EventNotification.
     * 
     * @return envelopeEvents
     */
    public net.docusign.www.API._3_0.EnvelopeEvent[] getEnvelopeEvents() {
        return envelopeEvents;
    }


    /**
     * Sets the envelopeEvents value for this EventNotification.
     * 
     * @param envelopeEvents
     */
    public void setEnvelopeEvents(net.docusign.www.API._3_0.EnvelopeEvent[] envelopeEvents) {
        this.envelopeEvents = envelopeEvents;
    }


    /**
     * Gets the recipientEvents value for this EventNotification.
     * 
     * @return recipientEvents
     */
    public net.docusign.www.API._3_0.RecipientEvent[] getRecipientEvents() {
        return recipientEvents;
    }


    /**
     * Sets the recipientEvents value for this EventNotification.
     * 
     * @param recipientEvents
     */
    public void setRecipientEvents(net.docusign.www.API._3_0.RecipientEvent[] recipientEvents) {
        this.recipientEvents = recipientEvents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventNotification)) return false;
        EventNotification other = (EventNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.loggingEnabled==null && other.getLoggingEnabled()==null) || 
             (this.loggingEnabled!=null &&
              this.loggingEnabled.equals(other.getLoggingEnabled()))) &&
            ((this.requireAcknowledgment==null && other.getRequireAcknowledgment()==null) || 
             (this.requireAcknowledgment!=null &&
              this.requireAcknowledgment.equals(other.getRequireAcknowledgment()))) &&
            ((this.useSoapInterface==null && other.getUseSoapInterface()==null) || 
             (this.useSoapInterface!=null &&
              this.useSoapInterface.equals(other.getUseSoapInterface()))) &&
            ((this.soapNameSpace==null && other.getSoapNameSpace()==null) || 
             (this.soapNameSpace!=null &&
              this.soapNameSpace.equals(other.getSoapNameSpace()))) &&
            ((this.includeCertificateWithSoap==null && other.getIncludeCertificateWithSoap()==null) || 
             (this.includeCertificateWithSoap!=null &&
              this.includeCertificateWithSoap.equals(other.getIncludeCertificateWithSoap()))) &&
            ((this.signMessageWithX509Cert==null && other.getSignMessageWithX509Cert()==null) || 
             (this.signMessageWithX509Cert!=null &&
              this.signMessageWithX509Cert.equals(other.getSignMessageWithX509Cert()))) &&
            ((this.includeDocuments==null && other.getIncludeDocuments()==null) || 
             (this.includeDocuments!=null &&
              this.includeDocuments.equals(other.getIncludeDocuments()))) &&
            ((this.includeTimeZone==null && other.getIncludeTimeZone()==null) || 
             (this.includeTimeZone!=null &&
              this.includeTimeZone.equals(other.getIncludeTimeZone()))) &&
            ((this.includeEnvelopeVoidReason==null && other.getIncludeEnvelopeVoidReason()==null) || 
             (this.includeEnvelopeVoidReason!=null &&
              this.includeEnvelopeVoidReason.equals(other.getIncludeEnvelopeVoidReason()))) &&
            ((this.includeDocumentFields==null && other.getIncludeDocumentFields()==null) || 
             (this.includeDocumentFields!=null &&
              this.includeDocumentFields.equals(other.getIncludeDocumentFields()))) &&
            ((this.includeCertificateOfCompletion==null && other.getIncludeCertificateOfCompletion()==null) || 
             (this.includeCertificateOfCompletion!=null &&
              this.includeCertificateOfCompletion.equals(other.getIncludeCertificateOfCompletion()))) &&
            ((this.includeSenderAccountAsCustomField==null && other.getIncludeSenderAccountAsCustomField()==null) || 
             (this.includeSenderAccountAsCustomField!=null &&
              this.includeSenderAccountAsCustomField.equals(other.getIncludeSenderAccountAsCustomField()))) &&
            ((this.envelopeEvents==null && other.getEnvelopeEvents()==null) || 
             (this.envelopeEvents!=null &&
              java.util.Arrays.equals(this.envelopeEvents, other.getEnvelopeEvents()))) &&
            ((this.recipientEvents==null && other.getRecipientEvents()==null) || 
             (this.recipientEvents!=null &&
              java.util.Arrays.equals(this.recipientEvents, other.getRecipientEvents())));
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
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getLoggingEnabled() != null) {
            _hashCode += getLoggingEnabled().hashCode();
        }
        if (getRequireAcknowledgment() != null) {
            _hashCode += getRequireAcknowledgment().hashCode();
        }
        if (getUseSoapInterface() != null) {
            _hashCode += getUseSoapInterface().hashCode();
        }
        if (getSoapNameSpace() != null) {
            _hashCode += getSoapNameSpace().hashCode();
        }
        if (getIncludeCertificateWithSoap() != null) {
            _hashCode += getIncludeCertificateWithSoap().hashCode();
        }
        if (getSignMessageWithX509Cert() != null) {
            _hashCode += getSignMessageWithX509Cert().hashCode();
        }
        if (getIncludeDocuments() != null) {
            _hashCode += getIncludeDocuments().hashCode();
        }
        if (getIncludeTimeZone() != null) {
            _hashCode += getIncludeTimeZone().hashCode();
        }
        if (getIncludeEnvelopeVoidReason() != null) {
            _hashCode += getIncludeEnvelopeVoidReason().hashCode();
        }
        if (getIncludeDocumentFields() != null) {
            _hashCode += getIncludeDocumentFields().hashCode();
        }
        if (getIncludeCertificateOfCompletion() != null) {
            _hashCode += getIncludeCertificateOfCompletion().hashCode();
        }
        if (getIncludeSenderAccountAsCustomField() != null) {
            _hashCode += getIncludeSenderAccountAsCustomField().hashCode();
        }
        if (getEnvelopeEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvelopeEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvelopeEvents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipientEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientEvents(), i);
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
        new org.apache.axis.description.TypeDesc(EventNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loggingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "LoggingEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireAcknowledgment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequireAcknowledgment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSoapInterface");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UseSoapInterface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soapNameSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SoapNameSpace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCertificateWithSoap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeCertificateWithSoap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signMessageWithX509Cert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignMessageWithX509Cert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeEnvelopeVoidReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeEnvelopeVoidReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDocumentFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocumentFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCertificateOfCompletion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeCertificateOfCompletion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSenderAccountAsCustomField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeSenderAccountAsCustomField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeEvent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEvent"));
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
