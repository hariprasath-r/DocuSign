/**
 * DocumentV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class DocumentV2  extends net.docusign.www.API._3_0.Document  implements java.io.Serializable {
    private net.docusign.www.API._3_0.DocumentType documentType;

    public DocumentV2() {
    }

    public DocumentV2(
           org.apache.axis.types.PositiveInteger ID,
           java.lang.String name,
           byte[] PDFBytes,
           java.lang.String password,
           java.lang.Boolean transformPdfFields,
           java.lang.String fileExtension,
           net.docusign.www.API._3_0.MatchBox[] matchBoxes,
           java.lang.String attachmentDescription,
           net.docusign.www.API._3_0.DocumentField[] documentFields,
           java.lang.Boolean authoritativeCopy,
           net.docusign.www.API._3_0.DocumentType documentType) {
        super(
            ID,
            name,
            PDFBytes,
            password,
            transformPdfFields,
            fileExtension,
            matchBoxes,
            attachmentDescription,
            documentFields,
            authoritativeCopy);
        this.documentType = documentType;
    }


    /**
     * Gets the documentType value for this DocumentV2.
     * 
     * @return documentType
     */
    public net.docusign.www.API._3_0.DocumentType getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this DocumentV2.
     * 
     * @param documentType
     */
    public void setDocumentType(net.docusign.www.API._3_0.DocumentType documentType) {
        this.documentType = documentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentV2)) return false;
        DocumentV2 other = (DocumentV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentType"));
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
