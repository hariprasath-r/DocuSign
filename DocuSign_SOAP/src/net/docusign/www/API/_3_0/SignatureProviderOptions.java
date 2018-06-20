/**
 * SignatureProviderOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SignatureProviderOptions  implements java.io.Serializable {
    private java.lang.String sms;

    private java.lang.String oneTimePassword;

    private java.lang.String CPFNumber;

    private java.lang.String signerRole;

    public SignatureProviderOptions() {
    }

    public SignatureProviderOptions(
           java.lang.String sms,
           java.lang.String oneTimePassword,
           java.lang.String CPFNumber,
           java.lang.String signerRole) {
           this.sms = sms;
           this.oneTimePassword = oneTimePassword;
           this.CPFNumber = CPFNumber;
           this.signerRole = signerRole;
    }


    /**
     * Gets the sms value for this SignatureProviderOptions.
     * 
     * @return sms
     */
    public java.lang.String getSms() {
        return sms;
    }


    /**
     * Sets the sms value for this SignatureProviderOptions.
     * 
     * @param sms
     */
    public void setSms(java.lang.String sms) {
        this.sms = sms;
    }


    /**
     * Gets the oneTimePassword value for this SignatureProviderOptions.
     * 
     * @return oneTimePassword
     */
    public java.lang.String getOneTimePassword() {
        return oneTimePassword;
    }


    /**
     * Sets the oneTimePassword value for this SignatureProviderOptions.
     * 
     * @param oneTimePassword
     */
    public void setOneTimePassword(java.lang.String oneTimePassword) {
        this.oneTimePassword = oneTimePassword;
    }


    /**
     * Gets the CPFNumber value for this SignatureProviderOptions.
     * 
     * @return CPFNumber
     */
    public java.lang.String getCPFNumber() {
        return CPFNumber;
    }


    /**
     * Sets the CPFNumber value for this SignatureProviderOptions.
     * 
     * @param CPFNumber
     */
    public void setCPFNumber(java.lang.String CPFNumber) {
        this.CPFNumber = CPFNumber;
    }


    /**
     * Gets the signerRole value for this SignatureProviderOptions.
     * 
     * @return signerRole
     */
    public java.lang.String getSignerRole() {
        return signerRole;
    }


    /**
     * Sets the signerRole value for this SignatureProviderOptions.
     * 
     * @param signerRole
     */
    public void setSignerRole(java.lang.String signerRole) {
        this.signerRole = signerRole;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignatureProviderOptions)) return false;
        SignatureProviderOptions other = (SignatureProviderOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sms==null && other.getSms()==null) || 
             (this.sms!=null &&
              this.sms.equals(other.getSms()))) &&
            ((this.oneTimePassword==null && other.getOneTimePassword()==null) || 
             (this.oneTimePassword!=null &&
              this.oneTimePassword.equals(other.getOneTimePassword()))) &&
            ((this.CPFNumber==null && other.getCPFNumber()==null) || 
             (this.CPFNumber!=null &&
              this.CPFNumber.equals(other.getCPFNumber()))) &&
            ((this.signerRole==null && other.getSignerRole()==null) || 
             (this.signerRole!=null &&
              this.signerRole.equals(other.getSignerRole())));
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
        if (getSms() != null) {
            _hashCode += getSms().hashCode();
        }
        if (getOneTimePassword() != null) {
            _hashCode += getOneTimePassword().hashCode();
        }
        if (getCPFNumber() != null) {
            _hashCode += getCPFNumber().hashCode();
        }
        if (getSignerRole() != null) {
            _hashCode += getSignerRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignatureProviderOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignatureProviderOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Sms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneTimePassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "OneTimePassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPFNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CPFNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SignerRole"));
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
