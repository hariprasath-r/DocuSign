/**
 * GetConnectFailuresResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class GetConnectFailuresResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.ConnectFailure[] getConnectFailuresResult;

    public GetConnectFailuresResponse() {
    }

    public GetConnectFailuresResponse(
           net.docusign.www.API._3_0.ConnectFailure[] getConnectFailuresResult) {
           this.getConnectFailuresResult = getConnectFailuresResult;
    }


    /**
     * Gets the getConnectFailuresResult value for this GetConnectFailuresResponse.
     * 
     * @return getConnectFailuresResult
     */
    public net.docusign.www.API._3_0.ConnectFailure[] getGetConnectFailuresResult() {
        return getConnectFailuresResult;
    }


    /**
     * Sets the getConnectFailuresResult value for this GetConnectFailuresResponse.
     * 
     * @param getConnectFailuresResult
     */
    public void setGetConnectFailuresResult(net.docusign.www.API._3_0.ConnectFailure[] getConnectFailuresResult) {
        this.getConnectFailuresResult = getConnectFailuresResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetConnectFailuresResponse)) return false;
        GetConnectFailuresResponse other = (GetConnectFailuresResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getConnectFailuresResult==null && other.getGetConnectFailuresResult()==null) || 
             (this.getConnectFailuresResult!=null &&
              java.util.Arrays.equals(this.getConnectFailuresResult, other.getGetConnectFailuresResult())));
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
        if (getGetConnectFailuresResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetConnectFailuresResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetConnectFailuresResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetConnectFailuresResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetConnectFailuresResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getConnectFailuresResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetConnectFailuresResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailure"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailure"));
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
