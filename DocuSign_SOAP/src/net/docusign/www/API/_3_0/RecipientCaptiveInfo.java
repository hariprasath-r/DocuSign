/**
 * RecipientCaptiveInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientCaptiveInfo  implements java.io.Serializable {
    private java.lang.String clientUserId;

    private java.lang.String embeddedRecipientStartURL;

    public RecipientCaptiveInfo() {
    }

    public RecipientCaptiveInfo(
           java.lang.String clientUserId,
           java.lang.String embeddedRecipientStartURL) {
           this.clientUserId = clientUserId;
           this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    }


    /**
     * Gets the clientUserId value for this RecipientCaptiveInfo.
     * 
     * @return clientUserId
     */
    public java.lang.String getClientUserId() {
        return clientUserId;
    }


    /**
     * Sets the clientUserId value for this RecipientCaptiveInfo.
     * 
     * @param clientUserId
     */
    public void setClientUserId(java.lang.String clientUserId) {
        this.clientUserId = clientUserId;
    }


    /**
     * Gets the embeddedRecipientStartURL value for this RecipientCaptiveInfo.
     * 
     * @return embeddedRecipientStartURL
     */
    public java.lang.String getEmbeddedRecipientStartURL() {
        return embeddedRecipientStartURL;
    }


    /**
     * Sets the embeddedRecipientStartURL value for this RecipientCaptiveInfo.
     * 
     * @param embeddedRecipientStartURL
     */
    public void setEmbeddedRecipientStartURL(java.lang.String embeddedRecipientStartURL) {
        this.embeddedRecipientStartURL = embeddedRecipientStartURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientCaptiveInfo)) return false;
        RecipientCaptiveInfo other = (RecipientCaptiveInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clientUserId==null && other.getClientUserId()==null) || 
             (this.clientUserId!=null &&
              this.clientUserId.equals(other.getClientUserId()))) &&
            ((this.embeddedRecipientStartURL==null && other.getEmbeddedRecipientStartURL()==null) || 
             (this.embeddedRecipientStartURL!=null &&
              this.embeddedRecipientStartURL.equals(other.getEmbeddedRecipientStartURL())));
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
        if (getClientUserId() != null) {
            _hashCode += getClientUserId().hashCode();
        }
        if (getEmbeddedRecipientStartURL() != null) {
            _hashCode += getEmbeddedRecipientStartURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientCaptiveInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCaptiveInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ClientUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("embeddedRecipientStartURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EmbeddedRecipientStartURL"));
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
