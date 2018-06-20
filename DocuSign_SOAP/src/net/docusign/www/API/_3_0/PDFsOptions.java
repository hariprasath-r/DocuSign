/**
 * PDFsOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class PDFsOptions  implements java.io.Serializable {
    private boolean showChanges;

    private java.lang.String documentID;

    private java.lang.String certificateLanguage;

    public PDFsOptions() {
    }

    public PDFsOptions(
           boolean showChanges,
           java.lang.String documentID,
           java.lang.String certificateLanguage) {
           this.showChanges = showChanges;
           this.documentID = documentID;
           this.certificateLanguage = certificateLanguage;
    }


    /**
     * Gets the showChanges value for this PDFsOptions.
     * 
     * @return showChanges
     */
    public boolean isShowChanges() {
        return showChanges;
    }


    /**
     * Sets the showChanges value for this PDFsOptions.
     * 
     * @param showChanges
     */
    public void setShowChanges(boolean showChanges) {
        this.showChanges = showChanges;
    }


    /**
     * Gets the documentID value for this PDFsOptions.
     * 
     * @return documentID
     */
    public java.lang.String getDocumentID() {
        return documentID;
    }


    /**
     * Sets the documentID value for this PDFsOptions.
     * 
     * @param documentID
     */
    public void setDocumentID(java.lang.String documentID) {
        this.documentID = documentID;
    }


    /**
     * Gets the certificateLanguage value for this PDFsOptions.
     * 
     * @return certificateLanguage
     */
    public java.lang.String getCertificateLanguage() {
        return certificateLanguage;
    }


    /**
     * Sets the certificateLanguage value for this PDFsOptions.
     * 
     * @param certificateLanguage
     */
    public void setCertificateLanguage(java.lang.String certificateLanguage) {
        this.certificateLanguage = certificateLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PDFsOptions)) return false;
        PDFsOptions other = (PDFsOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.showChanges == other.isShowChanges() &&
            ((this.documentID==null && other.getDocumentID()==null) || 
             (this.documentID!=null &&
              this.documentID.equals(other.getDocumentID()))) &&
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
        if (getDocumentID() != null) {
            _hashCode += getDocumentID().hashCode();
        }
        if (getCertificateLanguage() != null) {
            _hashCode += getCertificateLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PDFsOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFsOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ShowChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
