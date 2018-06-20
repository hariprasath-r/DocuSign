/**
 * RecipientSAMLAuthentication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientSAMLAuthentication  implements java.io.Serializable {
    private net.docusign.www.API._3_0.SAMLAttribute[] SAMLAttributes;

    public RecipientSAMLAuthentication() {
    }

    public RecipientSAMLAuthentication(
           net.docusign.www.API._3_0.SAMLAttribute[] SAMLAttributes) {
           this.SAMLAttributes = SAMLAttributes;
    }


    /**
     * Gets the SAMLAttributes value for this RecipientSAMLAuthentication.
     * 
     * @return SAMLAttributes
     */
    public net.docusign.www.API._3_0.SAMLAttribute[] getSAMLAttributes() {
        return SAMLAttributes;
    }


    /**
     * Sets the SAMLAttributes value for this RecipientSAMLAuthentication.
     * 
     * @param SAMLAttributes
     */
    public void setSAMLAttributes(net.docusign.www.API._3_0.SAMLAttribute[] SAMLAttributes) {
        this.SAMLAttributes = SAMLAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientSAMLAuthentication)) return false;
        RecipientSAMLAuthentication other = (RecipientSAMLAuthentication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SAMLAttributes==null && other.getSAMLAttributes()==null) || 
             (this.SAMLAttributes!=null &&
              java.util.Arrays.equals(this.SAMLAttributes, other.getSAMLAttributes())));
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
        if (getSAMLAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSAMLAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSAMLAttributes(), i);
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
        new org.apache.axis.description.TypeDesc(RecipientSAMLAuthentication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSAMLAuthentication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SAMLAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SAMLAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SAMLAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SAMLAttribute"));
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