/**
 * DocuSignEnvelopeInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class DocuSignEnvelopeInformation  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeStatus envelopeStatus;

    private net.docusign.www.API._3_0.DocumentPDF[] documentPDFs;

    private java.lang.String timeZone;

    private java.lang.Integer timeZoneOffset;

    public DocuSignEnvelopeInformation() {
    }

    public DocuSignEnvelopeInformation(
           net.docusign.www.API._3_0.EnvelopeStatus envelopeStatus,
           net.docusign.www.API._3_0.DocumentPDF[] documentPDFs,
           java.lang.String timeZone,
           java.lang.Integer timeZoneOffset) {
           this.envelopeStatus = envelopeStatus;
           this.documentPDFs = documentPDFs;
           this.timeZone = timeZone;
           this.timeZoneOffset = timeZoneOffset;
    }


    /**
     * Gets the envelopeStatus value for this DocuSignEnvelopeInformation.
     * 
     * @return envelopeStatus
     */
    public net.docusign.www.API._3_0.EnvelopeStatus getEnvelopeStatus() {
        return envelopeStatus;
    }


    /**
     * Sets the envelopeStatus value for this DocuSignEnvelopeInformation.
     * 
     * @param envelopeStatus
     */
    public void setEnvelopeStatus(net.docusign.www.API._3_0.EnvelopeStatus envelopeStatus) {
        this.envelopeStatus = envelopeStatus;
    }


    /**
     * Gets the documentPDFs value for this DocuSignEnvelopeInformation.
     * 
     * @return documentPDFs
     */
    public net.docusign.www.API._3_0.DocumentPDF[] getDocumentPDFs() {
        return documentPDFs;
    }


    /**
     * Sets the documentPDFs value for this DocuSignEnvelopeInformation.
     * 
     * @param documentPDFs
     */
    public void setDocumentPDFs(net.docusign.www.API._3_0.DocumentPDF[] documentPDFs) {
        this.documentPDFs = documentPDFs;
    }


    /**
     * Gets the timeZone value for this DocuSignEnvelopeInformation.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this DocuSignEnvelopeInformation.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the timeZoneOffset value for this DocuSignEnvelopeInformation.
     * 
     * @return timeZoneOffset
     */
    public java.lang.Integer getTimeZoneOffset() {
        return timeZoneOffset;
    }


    /**
     * Sets the timeZoneOffset value for this DocuSignEnvelopeInformation.
     * 
     * @param timeZoneOffset
     */
    public void setTimeZoneOffset(java.lang.Integer timeZoneOffset) {
        this.timeZoneOffset = timeZoneOffset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocuSignEnvelopeInformation)) return false;
        DocuSignEnvelopeInformation other = (DocuSignEnvelopeInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeStatus==null && other.getEnvelopeStatus()==null) || 
             (this.envelopeStatus!=null &&
              this.envelopeStatus.equals(other.getEnvelopeStatus()))) &&
            ((this.documentPDFs==null && other.getDocumentPDFs()==null) || 
             (this.documentPDFs!=null &&
              java.util.Arrays.equals(this.documentPDFs, other.getDocumentPDFs()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.timeZoneOffset==null && other.getTimeZoneOffset()==null) || 
             (this.timeZoneOffset!=null &&
              this.timeZoneOffset.equals(other.getTimeZoneOffset())));
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
        if (getEnvelopeStatus() != null) {
            _hashCode += getEnvelopeStatus().hashCode();
        }
        if (getDocumentPDFs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentPDFs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentPDFs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getTimeZoneOffset() != null) {
            _hashCode += getTimeZoneOffset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocuSignEnvelopeInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocuSignEnvelopeInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentPDFs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDFs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TimeZoneOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
