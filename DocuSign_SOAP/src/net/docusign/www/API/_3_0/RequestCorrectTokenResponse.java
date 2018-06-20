/**
 * RequestCorrectTokenResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestCorrectTokenResponse  implements java.io.Serializable {
    private java.lang.String requestCorrectTokenResult;

    public RequestCorrectTokenResponse() {
    }

    public RequestCorrectTokenResponse(
           java.lang.String requestCorrectTokenResult) {
           this.requestCorrectTokenResult = requestCorrectTokenResult;
    }


    /**
     * Gets the requestCorrectTokenResult value for this RequestCorrectTokenResponse.
     * 
     * @return requestCorrectTokenResult
     */
    public java.lang.String getRequestCorrectTokenResult() {
        return requestCorrectTokenResult;
    }


    /**
     * Sets the requestCorrectTokenResult value for this RequestCorrectTokenResponse.
     * 
     * @param requestCorrectTokenResult
     */
    public void setRequestCorrectTokenResult(java.lang.String requestCorrectTokenResult) {
        this.requestCorrectTokenResult = requestCorrectTokenResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestCorrectTokenResponse)) return false;
        RequestCorrectTokenResponse other = (RequestCorrectTokenResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestCorrectTokenResult==null && other.getRequestCorrectTokenResult()==null) || 
             (this.requestCorrectTokenResult!=null &&
              this.requestCorrectTokenResult.equals(other.getRequestCorrectTokenResult())));
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
        if (getRequestCorrectTokenResult() != null) {
            _hashCode += getRequestCorrectTokenResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestCorrectTokenResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestCorrectTokenResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestCorrectTokenResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RequestCorrectTokenResult"));
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
