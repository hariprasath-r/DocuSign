/**
 * RequestEnvelopeWithDocumentFieldsV2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestEnvelopeWithDocumentFieldsV2Response  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeV2 requestEnvelopeWithDocumentFieldsV2Result;

    public RequestEnvelopeWithDocumentFieldsV2Response() {
    }

    public RequestEnvelopeWithDocumentFieldsV2Response(
           net.docusign.www.API._3_0.EnvelopeV2 requestEnvelopeWithDocumentFieldsV2Result) {
           this.requestEnvelopeWithDocumentFieldsV2Result = requestEnvelopeWithDocumentFieldsV2Result;
    }


    /**
     * Gets the requestEnvelopeWithDocumentFieldsV2Result value for this RequestEnvelopeWithDocumentFieldsV2Response.
     * 
     * @return requestEnvelopeWithDocumentFieldsV2Result
     */
    public net.docusign.www.API._3_0.EnvelopeV2 getRequestEnvelopeWithDocumentFieldsV2Result() {
        return requestEnvelopeWithDocumentFieldsV2Result;
    }


    /**
     * Sets the requestEnvelopeWithDocumentFieldsV2Result value for this RequestEnvelopeWithDocumentFieldsV2Response.
     * 
     * @param requestEnvelopeWithDocumentFieldsV2Result
     */
    public void setRequestEnvelopeWithDocumentFieldsV2Result(net.docusign.www.API._3_0.EnvelopeV2 requestEnvelopeWithDocumentFieldsV2Result) {
        this.requestEnvelopeWithDocumentFieldsV2Result = requestEnvelopeWithDocumentFieldsV2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestEnvelopeWithDocumentFieldsV2Response)) return false;
        RequestEnvelopeWithDocumentFieldsV2Response other = (RequestEnvelopeWithDocumentFieldsV2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestEnvelopeWithDocumentFieldsV2Result==null && other.getRequestEnvelopeWithDocumentFieldsV2Result()==null) || 
             (this.requestEnvelopeWithDocumentFieldsV2Result!=null &&
              this.requestEnvelopeWithDocumentFieldsV2Result.equals(other.getRequestEnvelopeWithDocumentFieldsV2Result())));
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
        if (getRequestEnvelopeWithDocumentFieldsV2Result() != null) {
            _hashCode += getRequestEnvelopeWithDocumentFieldsV2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestEnvelopeWithDocumentFieldsV2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestEnvelopeWithDocumentFieldsV2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestEnvelopeWithDocumentFieldsV2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestEnvelopeWithDocumentFieldsV2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeV2"));
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
