/**
 * RequestEnvelopeWithDocumentFieldsV2Options.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestEnvelopeWithDocumentFieldsV2Options  implements java.io.Serializable {
    private java.lang.Boolean includeDocumentBytes;

    private java.lang.Boolean includeSummary;

    private java.lang.Boolean includeUsedResponsiveSigning;

    private java.lang.String certLanguage;

    public RequestEnvelopeWithDocumentFieldsV2Options() {
    }

    public RequestEnvelopeWithDocumentFieldsV2Options(
           java.lang.Boolean includeDocumentBytes,
           java.lang.Boolean includeSummary,
           java.lang.Boolean includeUsedResponsiveSigning,
           java.lang.String certLanguage) {
           this.includeDocumentBytes = includeDocumentBytes;
           this.includeSummary = includeSummary;
           this.includeUsedResponsiveSigning = includeUsedResponsiveSigning;
           this.certLanguage = certLanguage;
    }


    /**
     * Gets the includeDocumentBytes value for this RequestEnvelopeWithDocumentFieldsV2Options.
     * 
     * @return includeDocumentBytes
     */
    public java.lang.Boolean getIncludeDocumentBytes() {
        return includeDocumentBytes;
    }


    /**
     * Sets the includeDocumentBytes value for this RequestEnvelopeWithDocumentFieldsV2Options.
     * 
     * @param includeDocumentBytes
     */
    public void setIncludeDocumentBytes(java.lang.Boolean includeDocumentBytes) {
        this.includeDocumentBytes = includeDocumentBytes;
    }


    /**
     * Gets the includeSummary value for this RequestEnvelopeWithDocumentFieldsV2Options.
     * 
     * @return includeSummary
     */
    public java.lang.Boolean getIncludeSummary() {
        return includeSummary;
    }


    /**
     * Sets the includeSummary value for this RequestEnvelopeWithDocumentFieldsV2Options.
     * 
     * @param includeSummary
     */
    public void setIncludeSummary(java.lang.Boolean includeSummary) {
        this.includeSummary = includeSummary;
    }


    /**
     * Gets the includeUsedResponsiveSigning value for this RequestEnvelopeWithDocumentFieldsV2Options.
     * 
     * @return includeUsedResponsiveSigning
     */
    public java.lang.Boolean getIncludeUsedResponsiveSigning() {
        return includeUsedResponsiveSigning;
    }


    /**
     * Sets the includeUsedResponsiveSigning value for this RequestEnvelopeWithDocumentFieldsV2Options.
     * 
     * @param includeUsedResponsiveSigning
     */
    public void setIncludeUsedResponsiveSigning(java.lang.Boolean includeUsedResponsiveSigning) {
        this.includeUsedResponsiveSigning = includeUsedResponsiveSigning;
    }


    /**
     * Gets the certLanguage value for this RequestEnvelopeWithDocumentFieldsV2Options.
     * 
     * @return certLanguage
     */
    public java.lang.String getCertLanguage() {
        return certLanguage;
    }


    /**
     * Sets the certLanguage value for this RequestEnvelopeWithDocumentFieldsV2Options.
     * 
     * @param certLanguage
     */
    public void setCertLanguage(java.lang.String certLanguage) {
        this.certLanguage = certLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEnvelopeWithDocumentFieldsV2Options)) return false;
        RequestEnvelopeWithDocumentFieldsV2Options other = (RequestEnvelopeWithDocumentFieldsV2Options) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeDocumentBytes==null && other.getIncludeDocumentBytes()==null) || 
             (this.includeDocumentBytes!=null &&
              this.includeDocumentBytes.equals(other.getIncludeDocumentBytes()))) &&
            ((this.includeSummary==null && other.getIncludeSummary()==null) || 
             (this.includeSummary!=null &&
              this.includeSummary.equals(other.getIncludeSummary()))) &&
            ((this.includeUsedResponsiveSigning==null && other.getIncludeUsedResponsiveSigning()==null) || 
             (this.includeUsedResponsiveSigning!=null &&
              this.includeUsedResponsiveSigning.equals(other.getIncludeUsedResponsiveSigning()))) &&
            ((this.certLanguage==null && other.getCertLanguage()==null) || 
             (this.certLanguage!=null &&
              this.certLanguage.equals(other.getCertLanguage())));
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
        if (getIncludeDocumentBytes() != null) {
            _hashCode += getIncludeDocumentBytes().hashCode();
        }
        if (getIncludeSummary() != null) {
            _hashCode += getIncludeSummary().hashCode();
        }
        if (getIncludeUsedResponsiveSigning() != null) {
            _hashCode += getIncludeUsedResponsiveSigning().hashCode();
        }
        if (getCertLanguage() != null) {
            _hashCode += getCertLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEnvelopeWithDocumentFieldsV2Options.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeWithDocumentFieldsV2Options"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDocumentBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocumentBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeUsedResponsiveSigning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeUsedResponsiveSigning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CertLanguage"));
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
