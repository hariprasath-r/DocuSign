/**
 * RecipientSignatureProvider.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientSignatureProvider  implements java.io.Serializable {
    private java.lang.String signatureProviderName;

    private net.docusign.www.API._3_0.SignatureProviderOptions signatureProviderOptions;

    public RecipientSignatureProvider() {
    }

    public RecipientSignatureProvider(
           java.lang.String signatureProviderName,
           net.docusign.www.API._3_0.SignatureProviderOptions signatureProviderOptions) {
           this.signatureProviderName = signatureProviderName;
           this.signatureProviderOptions = signatureProviderOptions;
    }


    /**
     * Gets the signatureProviderName value for this RecipientSignatureProvider.
     * 
     * @return signatureProviderName
     */
    public java.lang.String getSignatureProviderName() {
        return signatureProviderName;
    }


    /**
     * Sets the signatureProviderName value for this RecipientSignatureProvider.
     * 
     * @param signatureProviderName
     */
    public void setSignatureProviderName(java.lang.String signatureProviderName) {
        this.signatureProviderName = signatureProviderName;
    }


    /**
     * Gets the signatureProviderOptions value for this RecipientSignatureProvider.
     * 
     * @return signatureProviderOptions
     */
    public net.docusign.www.API._3_0.SignatureProviderOptions getSignatureProviderOptions() {
        return signatureProviderOptions;
    }


    /**
     * Sets the signatureProviderOptions value for this RecipientSignatureProvider.
     * 
     * @param signatureProviderOptions
     */
    public void setSignatureProviderOptions(net.docusign.www.API._3_0.SignatureProviderOptions signatureProviderOptions) {
        this.signatureProviderOptions = signatureProviderOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientSignatureProvider)) return false;
        RecipientSignatureProvider other = (RecipientSignatureProvider) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.signatureProviderName==null && other.getSignatureProviderName()==null) || 
             (this.signatureProviderName!=null &&
              this.signatureProviderName.equals(other.getSignatureProviderName()))) &&
            ((this.signatureProviderOptions==null && other.getSignatureProviderOptions()==null) || 
             (this.signatureProviderOptions!=null &&
              this.signatureProviderOptions.equals(other.getSignatureProviderOptions())));
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
        if (getSignatureProviderName() != null) {
            _hashCode += getSignatureProviderName().hashCode();
        }
        if (getSignatureProviderOptions() != null) {
            _hashCode += getSignatureProviderOptions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientSignatureProvider.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientSignatureProvider"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureProviderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureProviderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureProviderOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureProviderOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureProviderOptions"));
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
