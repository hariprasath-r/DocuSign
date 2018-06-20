/**
 * GetSharedAccessResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class GetSharedAccessResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.GetSharedAccessResult getSharedAccessResult;

    public GetSharedAccessResponse() {
    }

    public GetSharedAccessResponse(
           net.docusign.www.API._3_0.GetSharedAccessResult getSharedAccessResult) {
           this.getSharedAccessResult = getSharedAccessResult;
    }


    /**
     * Gets the getSharedAccessResult value for this GetSharedAccessResponse.
     * 
     * @return getSharedAccessResult
     */
    public net.docusign.www.API._3_0.GetSharedAccessResult getGetSharedAccessResult() {
        return getSharedAccessResult;
    }


    /**
     * Sets the getSharedAccessResult value for this GetSharedAccessResponse.
     * 
     * @param getSharedAccessResult
     */
    public void setGetSharedAccessResult(net.docusign.www.API._3_0.GetSharedAccessResult getSharedAccessResult) {
        this.getSharedAccessResult = getSharedAccessResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSharedAccessResponse)) return false;
        GetSharedAccessResponse other = (GetSharedAccessResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSharedAccessResult==null && other.getGetSharedAccessResult()==null) || 
             (this.getSharedAccessResult!=null &&
              this.getSharedAccessResult.equals(other.getGetSharedAccessResult())));
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
        if (getGetSharedAccessResult() != null) {
            _hashCode += getGetSharedAccessResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSharedAccessResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetSharedAccessResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSharedAccessResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetSharedAccessResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetSharedAccessResult"));
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
