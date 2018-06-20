/**
 * DocumentPDFs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class DocumentPDFs  implements java.io.Serializable {
    private java.lang.String envelopeId;

    private net.docusign.www.API._3_0.DocumentPDF[] documentPDF;

    public DocumentPDFs() {
    }

    public DocumentPDFs(
           java.lang.String envelopeId,
           net.docusign.www.API._3_0.DocumentPDF[] documentPDF) {
           this.envelopeId = envelopeId;
           this.documentPDF = documentPDF;
    }


    /**
     * Gets the envelopeId value for this DocumentPDFs.
     * 
     * @return envelopeId
     */
    public java.lang.String getEnvelopeId() {
        return envelopeId;
    }


    /**
     * Sets the envelopeId value for this DocumentPDFs.
     * 
     * @param envelopeId
     */
    public void setEnvelopeId(java.lang.String envelopeId) {
        this.envelopeId = envelopeId;
    }


    /**
     * Gets the documentPDF value for this DocumentPDFs.
     * 
     * @return documentPDF
     */
    public net.docusign.www.API._3_0.DocumentPDF[] getDocumentPDF() {
        return documentPDF;
    }


    /**
     * Sets the documentPDF value for this DocumentPDFs.
     * 
     * @param documentPDF
     */
    public void setDocumentPDF(net.docusign.www.API._3_0.DocumentPDF[] documentPDF) {
        this.documentPDF = documentPDF;
    }

    public net.docusign.www.API._3_0.DocumentPDF getDocumentPDF(int i) {
        return this.documentPDF[i];
    }

    public void setDocumentPDF(int i, net.docusign.www.API._3_0.DocumentPDF _value) {
        this.documentPDF[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentPDFs)) return false;
        DocumentPDFs other = (DocumentPDFs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeId==null && other.getEnvelopeId()==null) || 
             (this.envelopeId!=null &&
              this.envelopeId.equals(other.getEnvelopeId()))) &&
            ((this.documentPDF==null && other.getDocumentPDF()==null) || 
             (this.documentPDF!=null &&
              java.util.Arrays.equals(this.documentPDF, other.getDocumentPDF())));
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
        if (getEnvelopeId() != null) {
            _hashCode += getEnvelopeId().hashCode();
        }
        if (getDocumentPDF() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentPDF());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentPDF(), i);
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
        new org.apache.axis.description.TypeDesc(DocumentPDFs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDFs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentPDF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentPDF"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
