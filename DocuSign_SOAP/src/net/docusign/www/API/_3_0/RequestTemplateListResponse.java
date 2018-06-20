/**
 * RequestTemplateListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestTemplateListResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeTemplate[] requestTemplateListResult;

    public RequestTemplateListResponse() {
    }

    public RequestTemplateListResponse(
           net.docusign.www.API._3_0.EnvelopeTemplate[] requestTemplateListResult) {
           this.requestTemplateListResult = requestTemplateListResult;
    }


    /**
     * Gets the requestTemplateListResult value for this RequestTemplateListResponse.
     * 
     * @return requestTemplateListResult
     */
    public net.docusign.www.API._3_0.EnvelopeTemplate[] getRequestTemplateListResult() {
        return requestTemplateListResult;
    }


    /**
     * Sets the requestTemplateListResult value for this RequestTemplateListResponse.
     * 
     * @param requestTemplateListResult
     */
    public void setRequestTemplateListResult(net.docusign.www.API._3_0.EnvelopeTemplate[] requestTemplateListResult) {
        this.requestTemplateListResult = requestTemplateListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestTemplateListResponse)) return false;
        RequestTemplateListResponse other = (RequestTemplateListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestTemplateListResult==null && other.getRequestTemplateListResult()==null) || 
             (this.requestTemplateListResult!=null &&
              java.util.Arrays.equals(this.requestTemplateListResult, other.getRequestTemplateListResult())));
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
        if (getRequestTemplateListResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestTemplateListResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestTemplateListResult(), i);
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
        new org.apache.axis.description.TypeDesc(RequestTemplateListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestTemplateListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTemplateListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestTemplateListResult"));
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
