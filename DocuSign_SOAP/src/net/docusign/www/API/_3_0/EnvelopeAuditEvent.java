/**
 * EnvelopeAuditEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeAuditEvent  implements java.io.Serializable {
    private java.lang.String logTime;

    private java.lang.String source;

    private java.lang.String userName;

    private java.lang.String userId;

    private java.lang.String action;

    private java.lang.String message;

    private java.lang.String envelopeStatus;

    private java.lang.String clientIPAddress;

    private java.lang.String information;

    private java.lang.String geoLocation;

    private java.lang.String language;

    public EnvelopeAuditEvent() {
    }

    public EnvelopeAuditEvent(
           java.lang.String logTime,
           java.lang.String source,
           java.lang.String userName,
           java.lang.String userId,
           java.lang.String action,
           java.lang.String message,
           java.lang.String envelopeStatus,
           java.lang.String clientIPAddress,
           java.lang.String information,
           java.lang.String geoLocation,
           java.lang.String language) {
           this.logTime = logTime;
           this.source = source;
           this.userName = userName;
           this.userId = userId;
           this.action = action;
           this.message = message;
           this.envelopeStatus = envelopeStatus;
           this.clientIPAddress = clientIPAddress;
           this.information = information;
           this.geoLocation = geoLocation;
           this.language = language;
    }


    /**
     * Gets the logTime value for this EnvelopeAuditEvent.
     * 
     * @return logTime
     */
    public java.lang.String getLogTime() {
        return logTime;
    }


    /**
     * Sets the logTime value for this EnvelopeAuditEvent.
     * 
     * @param logTime
     */
    public void setLogTime(java.lang.String logTime) {
        this.logTime = logTime;
    }


    /**
     * Gets the source value for this EnvelopeAuditEvent.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this EnvelopeAuditEvent.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the userName value for this EnvelopeAuditEvent.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this EnvelopeAuditEvent.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userId value for this EnvelopeAuditEvent.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this EnvelopeAuditEvent.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }


    /**
     * Gets the action value for this EnvelopeAuditEvent.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this EnvelopeAuditEvent.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the message value for this EnvelopeAuditEvent.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this EnvelopeAuditEvent.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the envelopeStatus value for this EnvelopeAuditEvent.
     * 
     * @return envelopeStatus
     */
    public java.lang.String getEnvelopeStatus() {
        return envelopeStatus;
    }


    /**
     * Sets the envelopeStatus value for this EnvelopeAuditEvent.
     * 
     * @param envelopeStatus
     */
    public void setEnvelopeStatus(java.lang.String envelopeStatus) {
        this.envelopeStatus = envelopeStatus;
    }


    /**
     * Gets the clientIPAddress value for this EnvelopeAuditEvent.
     * 
     * @return clientIPAddress
     */
    public java.lang.String getClientIPAddress() {
        return clientIPAddress;
    }


    /**
     * Sets the clientIPAddress value for this EnvelopeAuditEvent.
     * 
     * @param clientIPAddress
     */
    public void setClientIPAddress(java.lang.String clientIPAddress) {
        this.clientIPAddress = clientIPAddress;
    }


    /**
     * Gets the information value for this EnvelopeAuditEvent.
     * 
     * @return information
     */
    public java.lang.String getInformation() {
        return information;
    }


    /**
     * Sets the information value for this EnvelopeAuditEvent.
     * 
     * @param information
     */
    public void setInformation(java.lang.String information) {
        this.information = information;
    }


    /**
     * Gets the geoLocation value for this EnvelopeAuditEvent.
     * 
     * @return geoLocation
     */
    public java.lang.String getGeoLocation() {
        return geoLocation;
    }


    /**
     * Sets the geoLocation value for this EnvelopeAuditEvent.
     * 
     * @param geoLocation
     */
    public void setGeoLocation(java.lang.String geoLocation) {
        this.geoLocation = geoLocation;
    }


    /**
     * Gets the language value for this EnvelopeAuditEvent.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this EnvelopeAuditEvent.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeAuditEvent)) return false;
        EnvelopeAuditEvent other = (EnvelopeAuditEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logTime==null && other.getLogTime()==null) || 
             (this.logTime!=null &&
              this.logTime.equals(other.getLogTime()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.envelopeStatus==null && other.getEnvelopeStatus()==null) || 
             (this.envelopeStatus!=null &&
              this.envelopeStatus.equals(other.getEnvelopeStatus()))) &&
            ((this.clientIPAddress==null && other.getClientIPAddress()==null) || 
             (this.clientIPAddress!=null &&
              this.clientIPAddress.equals(other.getClientIPAddress()))) &&
            ((this.information==null && other.getInformation()==null) || 
             (this.information!=null &&
              this.information.equals(other.getInformation()))) &&
            ((this.geoLocation==null && other.getGeoLocation()==null) || 
             (this.geoLocation!=null &&
              this.geoLocation.equals(other.getGeoLocation()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage())));
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
        if (getLogTime() != null) {
            _hashCode += getLogTime().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getEnvelopeStatus() != null) {
            _hashCode += getEnvelopeStatus().hashCode();
        }
        if (getClientIPAddress() != null) {
            _hashCode += getClientIPAddress().hashCode();
        }
        if (getInformation() != null) {
            _hashCode += getInformation().hashCode();
        }
        if (getGeoLocation() != null) {
            _hashCode += getGeoLocation().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeAuditEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "LogTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("information");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Information"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GeoLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
