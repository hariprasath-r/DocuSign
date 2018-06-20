/**
 * EnvelopeStatusChangeFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeStatusChangeFilter  implements java.io.Serializable {
    private java.lang.String accountId;

    private net.docusign.www.API._3_0.UserInfo userInfo;

    private java.util.Calendar statusChangedSince;

    private net.docusign.www.API._3_0.EnvelopeStatusCode[] statuses;

    public EnvelopeStatusChangeFilter() {
    }

    public EnvelopeStatusChangeFilter(
           java.lang.String accountId,
           net.docusign.www.API._3_0.UserInfo userInfo,
           java.util.Calendar statusChangedSince,
           net.docusign.www.API._3_0.EnvelopeStatusCode[] statuses) {
           this.accountId = accountId;
           this.userInfo = userInfo;
           this.statusChangedSince = statusChangedSince;
           this.statuses = statuses;
    }


    /**
     * Gets the accountId value for this EnvelopeStatusChangeFilter.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this EnvelopeStatusChangeFilter.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the userInfo value for this EnvelopeStatusChangeFilter.
     * 
     * @return userInfo
     */
    public net.docusign.www.API._3_0.UserInfo getUserInfo() {
        return userInfo;
    }


    /**
     * Sets the userInfo value for this EnvelopeStatusChangeFilter.
     * 
     * @param userInfo
     */
    public void setUserInfo(net.docusign.www.API._3_0.UserInfo userInfo) {
        this.userInfo = userInfo;
    }


    /**
     * Gets the statusChangedSince value for this EnvelopeStatusChangeFilter.
     * 
     * @return statusChangedSince
     */
    public java.util.Calendar getStatusChangedSince() {
        return statusChangedSince;
    }


    /**
     * Sets the statusChangedSince value for this EnvelopeStatusChangeFilter.
     * 
     * @param statusChangedSince
     */
    public void setStatusChangedSince(java.util.Calendar statusChangedSince) {
        this.statusChangedSince = statusChangedSince;
    }


    /**
     * Gets the statuses value for this EnvelopeStatusChangeFilter.
     * 
     * @return statuses
     */
    public net.docusign.www.API._3_0.EnvelopeStatusCode[] getStatuses() {
        return statuses;
    }


    /**
     * Sets the statuses value for this EnvelopeStatusChangeFilter.
     * 
     * @param statuses
     */
    public void setStatuses(net.docusign.www.API._3_0.EnvelopeStatusCode[] statuses) {
        this.statuses = statuses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeStatusChangeFilter)) return false;
        EnvelopeStatusChangeFilter other = (EnvelopeStatusChangeFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.userInfo==null && other.getUserInfo()==null) || 
             (this.userInfo!=null &&
              this.userInfo.equals(other.getUserInfo()))) &&
            ((this.statusChangedSince==null && other.getStatusChangedSince()==null) || 
             (this.statusChangedSince!=null &&
              this.statusChangedSince.equals(other.getStatusChangedSince()))) &&
            ((this.statuses==null && other.getStatuses()==null) || 
             (this.statuses!=null &&
              java.util.Arrays.equals(this.statuses, other.getStatuses())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getUserInfo() != null) {
            _hashCode += getUserInfo().hashCode();
        }
        if (getStatusChangedSince() != null) {
            _hashCode += getStatusChangedSince().hashCode();
        }
        if (getStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatuses(), i);
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
        new org.apache.axis.description.TypeDesc(EnvelopeStatusChangeFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChangeFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusChangedSince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "StatusChangedSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Statuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));
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
