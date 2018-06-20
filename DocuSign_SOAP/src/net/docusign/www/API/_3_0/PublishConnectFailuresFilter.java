/**
 * PublishConnectFailuresFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class PublishConnectFailuresFilter  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.Boolean synchronous;

    private java.lang.String[] envelopeIds;

    public PublishConnectFailuresFilter() {
    }

    public PublishConnectFailuresFilter(
           java.lang.String accountId,
           java.lang.Boolean synchronous,
           java.lang.String[] envelopeIds) {
           this.accountId = accountId;
           this.synchronous = synchronous;
           this.envelopeIds = envelopeIds;
    }


    /**
     * Gets the accountId value for this PublishConnectFailuresFilter.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PublishConnectFailuresFilter.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the synchronous value for this PublishConnectFailuresFilter.
     * 
     * @return synchronous
     */
    public java.lang.Boolean getSynchronous() {
        return synchronous;
    }


    /**
     * Sets the synchronous value for this PublishConnectFailuresFilter.
     * 
     * @param synchronous
     */
    public void setSynchronous(java.lang.Boolean synchronous) {
        this.synchronous = synchronous;
    }


    /**
     * Gets the envelopeIds value for this PublishConnectFailuresFilter.
     * 
     * @return envelopeIds
     */
    public java.lang.String[] getEnvelopeIds() {
        return envelopeIds;
    }


    /**
     * Sets the envelopeIds value for this PublishConnectFailuresFilter.
     * 
     * @param envelopeIds
     */
    public void setEnvelopeIds(java.lang.String[] envelopeIds) {
        this.envelopeIds = envelopeIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishConnectFailuresFilter)) return false;
        PublishConnectFailuresFilter other = (PublishConnectFailuresFilter) obj;
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
            ((this.synchronous==null && other.getSynchronous()==null) || 
             (this.synchronous!=null &&
              this.synchronous.equals(other.getSynchronous()))) &&
            ((this.envelopeIds==null && other.getEnvelopeIds()==null) || 
             (this.envelopeIds!=null &&
              java.util.Arrays.equals(this.envelopeIds, other.getEnvelopeIds())));
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
        if (getSynchronous() != null) {
            _hashCode += getSynchronous().hashCode();
        }
        if (getEnvelopeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvelopeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvelopeIds(), i);
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
        new org.apache.axis.description.TypeDesc(PublishConnectFailuresFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PublishConnectFailuresFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synchronous");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Synchronous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"));
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
