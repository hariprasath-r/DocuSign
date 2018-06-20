/**
 * EmailSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EmailSettings  implements java.io.Serializable {
    private java.lang.String replyEmailAddressOverride;

    private java.lang.String replyEmailNameOverride;

    private net.docusign.www.API._3_0.BCCEmailAddress[] BCCEmailAddresses;

    public EmailSettings() {
    }

    public EmailSettings(
           java.lang.String replyEmailAddressOverride,
           java.lang.String replyEmailNameOverride,
           net.docusign.www.API._3_0.BCCEmailAddress[] BCCEmailAddresses) {
           this.replyEmailAddressOverride = replyEmailAddressOverride;
           this.replyEmailNameOverride = replyEmailNameOverride;
           this.BCCEmailAddresses = BCCEmailAddresses;
    }


    /**
     * Gets the replyEmailAddressOverride value for this EmailSettings.
     * 
     * @return replyEmailAddressOverride
     */
    public java.lang.String getReplyEmailAddressOverride() {
        return replyEmailAddressOverride;
    }


    /**
     * Sets the replyEmailAddressOverride value for this EmailSettings.
     * 
     * @param replyEmailAddressOverride
     */
    public void setReplyEmailAddressOverride(java.lang.String replyEmailAddressOverride) {
        this.replyEmailAddressOverride = replyEmailAddressOverride;
    }


    /**
     * Gets the replyEmailNameOverride value for this EmailSettings.
     * 
     * @return replyEmailNameOverride
     */
    public java.lang.String getReplyEmailNameOverride() {
        return replyEmailNameOverride;
    }


    /**
     * Sets the replyEmailNameOverride value for this EmailSettings.
     * 
     * @param replyEmailNameOverride
     */
    public void setReplyEmailNameOverride(java.lang.String replyEmailNameOverride) {
        this.replyEmailNameOverride = replyEmailNameOverride;
    }


    /**
     * Gets the BCCEmailAddresses value for this EmailSettings.
     * 
     * @return BCCEmailAddresses
     */
    public net.docusign.www.API._3_0.BCCEmailAddress[] getBCCEmailAddresses() {
        return BCCEmailAddresses;
    }


    /**
     * Sets the BCCEmailAddresses value for this EmailSettings.
     * 
     * @param BCCEmailAddresses
     */
    public void setBCCEmailAddresses(net.docusign.www.API._3_0.BCCEmailAddress[] BCCEmailAddresses) {
        this.BCCEmailAddresses = BCCEmailAddresses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailSettings)) return false;
        EmailSettings other = (EmailSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.replyEmailAddressOverride==null && other.getReplyEmailAddressOverride()==null) || 
             (this.replyEmailAddressOverride!=null &&
              this.replyEmailAddressOverride.equals(other.getReplyEmailAddressOverride()))) &&
            ((this.replyEmailNameOverride==null && other.getReplyEmailNameOverride()==null) || 
             (this.replyEmailNameOverride!=null &&
              this.replyEmailNameOverride.equals(other.getReplyEmailNameOverride()))) &&
            ((this.BCCEmailAddresses==null && other.getBCCEmailAddresses()==null) || 
             (this.BCCEmailAddresses!=null &&
              java.util.Arrays.equals(this.BCCEmailAddresses, other.getBCCEmailAddresses())));
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
        if (getReplyEmailAddressOverride() != null) {
            _hashCode += getReplyEmailAddressOverride().hashCode();
        }
        if (getReplyEmailNameOverride() != null) {
            _hashCode += getReplyEmailNameOverride().hashCode();
        }
        if (getBCCEmailAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBCCEmailAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBCCEmailAddresses(), i);
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
        new org.apache.axis.description.TypeDesc(EmailSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EmailSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyEmailAddressOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReplyEmailAddressOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyEmailNameOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReplyEmailNameOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BCCEmailAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BCCEmailAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BCCEmailAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BCCEmailAddress"));
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
