/**
 * RequestTemplateListWithDocumentFieldsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestTemplateListWithDocumentFieldsResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeTemplate[] requestTemplateListWithDocumentFieldsResult;

    public RequestTemplateListWithDocumentFieldsResponse() {
    }

    public RequestTemplateListWithDocumentFieldsResponse(
           net.docusign.www.API._3_0.EnvelopeTemplate[] requestTemplateListWithDocumentFieldsResult) {
           this.requestTemplateListWithDocumentFieldsResult = requestTemplateListWithDocumentFieldsResult;
    }


    /**
     * Gets the requestTemplateListWithDocumentFieldsResult value for this RequestTemplateListWithDocumentFieldsResponse.
     * 
     * @return requestTemplateListWithDocumentFieldsResult
     */
    public net.docusign.www.API._3_0.EnvelopeTemplate[] getRequestTemplateListWithDocumentFieldsResult() {
        return requestTemplateListWithDocumentFieldsResult;
    }


    /**
     * Sets the requestTemplateListWithDocumentFieldsResult value for this RequestTemplateListWithDocumentFieldsResponse.
     * 
     * @param requestTemplateListWithDocumentFieldsResult
     */
    public void setRequestTemplateListWithDocumentFieldsResult(net.docusign.www.API._3_0.EnvelopeTemplate[] requestTemplateListWithDocumentFieldsResult) {
        this.requestTemplateListWithDocumentFieldsResult = requestTemplateListWithDocumentFieldsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestTemplateListWithDocumentFieldsResponse)) return false;
        RequestTemplateListWithDocumentFieldsResponse other = (RequestTemplateListWithDocumentFieldsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestTemplateListWithDocumentFieldsResult==null && other.getRequestTemplateListWithDocumentFieldsResult()==null) || 
             (this.requestTemplateListWithDocumentFieldsResult!=null &&
              java.util.Arrays.equals(this.requestTemplateListWithDocumentFieldsResult, other.getRequestTemplateListWithDocumentFieldsResult())));
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
        if (getRequestTemplateListWithDocumentFieldsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestTemplateListWithDocumentFieldsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestTemplateListWithDocumentFieldsResult(), i);
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
        new org.apache.axis.description.TypeDesc(RequestTemplateListWithDocumentFieldsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplateListWithDocumentFieldsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTemplateListWithDocumentFieldsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplateListWithDocumentFieldsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeTemplate"));
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
