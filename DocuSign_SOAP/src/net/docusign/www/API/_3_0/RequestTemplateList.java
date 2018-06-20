/**
 * RequestTemplateList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestTemplateList  implements java.io.Serializable {
    private java.lang.String[] templateIDs;

    private boolean includeDocumentBytes;

    public RequestTemplateList() {
    }

    public RequestTemplateList(
           java.lang.String[] templateIDs,
           boolean includeDocumentBytes) {
           this.templateIDs = templateIDs;
           this.includeDocumentBytes = includeDocumentBytes;
    }


    /**
     * Gets the templateIDs value for this RequestTemplateList.
     * 
     * @return templateIDs
     */
    public java.lang.String[] getTemplateIDs() {
        return templateIDs;
    }


    /**
     * Sets the templateIDs value for this RequestTemplateList.
     * 
     * @param templateIDs
     */
    public void setTemplateIDs(java.lang.String[] templateIDs) {
        this.templateIDs = templateIDs;
    }


    /**
     * Gets the includeDocumentBytes value for this RequestTemplateList.
     * 
     * @return includeDocumentBytes
     */
    public boolean isIncludeDocumentBytes() {
        return includeDocumentBytes;
    }


    /**
     * Sets the includeDocumentBytes value for this RequestTemplateList.
     * 
     * @param includeDocumentBytes
     */
    public void setIncludeDocumentBytes(boolean includeDocumentBytes) {
        this.includeDocumentBytes = includeDocumentBytes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestTemplateList)) return false;
        RequestTemplateList other = (RequestTemplateList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.templateIDs==null && other.getTemplateIDs()==null) || 
             (this.templateIDs!=null &&
              java.util.Arrays.equals(this.templateIDs, other.getTemplateIDs()))) &&
            this.includeDocumentBytes == other.isIncludeDocumentBytes();
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
        if (getTemplateIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemplateIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemplateIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isIncludeDocumentBytes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestTemplateList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplateList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDocumentBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocumentBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
