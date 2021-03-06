/**
 * PDFOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class PDFOptions  implements java.io.Serializable {
    private boolean showChanges;

    private boolean addWaterMark;

    private boolean includeCert;

    private java.lang.String certificateLanguage;

    public PDFOptions() {
    }

    public PDFOptions(
           boolean showChanges,
           boolean addWaterMark,
           boolean includeCert,
           java.lang.String certificateLanguage) {
           this.showChanges = showChanges;
           this.addWaterMark = addWaterMark;
           this.includeCert = includeCert;
           this.certificateLanguage = certificateLanguage;
    }


    /**
     * Gets the showChanges value for this PDFOptions.
     * 
     * @return showChanges
     */
    public boolean isShowChanges() {
        return showChanges;
    }


    /**
     * Sets the showChanges value for this PDFOptions.
     * 
     * @param showChanges
     */
    public void setShowChanges(boolean showChanges) {
        this.showChanges = showChanges;
    }


    /**
     * Gets the addWaterMark value for this PDFOptions.
     * 
     * @return addWaterMark
     */
    public boolean isAddWaterMark() {
        return addWaterMark;
    }


    /**
     * Sets the addWaterMark value for this PDFOptions.
     * 
     * @param addWaterMark
     */
    public void setAddWaterMark(boolean addWaterMark) {
        this.addWaterMark = addWaterMark;
    }


    /**
     * Gets the includeCert value for this PDFOptions.
     * 
     * @return includeCert
     */
    public boolean isIncludeCert() {
        return includeCert;
    }


    /**
     * Sets the includeCert value for this PDFOptions.
     * 
     * @param includeCert
     */
    public void setIncludeCert(boolean includeCert) {
        this.includeCert = includeCert;
    }


    /**
     * Gets the certificateLanguage value for this PDFOptions.
     * 
     * @return certificateLanguage
     */
    public java.lang.String getCertificateLanguage() {
        return certificateLanguage;
    }


    /**
     * Sets the certificateLanguage value for this PDFOptions.
     * 
     * @param certificateLanguage
     */
    public void setCertificateLanguage(java.lang.String certificateLanguage) {
        this.certificateLanguage = certificateLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDFOptions)) return false;
        PDFOptions other = (PDFOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.showChanges == other.isShowChanges() &&
            this.addWaterMark == other.isAddWaterMark() &&
            this.includeCert == other.isIncludeCert() &&
            ((this.certificateLanguage==null && other.getCertificateLanguage()==null) || 
             (this.certificateLanguage!=null &&
              this.certificateLanguage.equals(other.getCertificateLanguage())));
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
        _hashCode += (isShowChanges() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAddWaterMark() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludeCert() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCertificateLanguage() != null) {
            _hashCode += getCertificateLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PDFOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ShowChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addWaterMark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AddWaterMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeCert");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CertificateLanguage"));
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
