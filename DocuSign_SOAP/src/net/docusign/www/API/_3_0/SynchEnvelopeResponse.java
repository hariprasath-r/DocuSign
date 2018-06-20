/**
 * SynchEnvelopeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SynchEnvelopeResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.SynchEnvelopeStatus synchEnvelopeResult;

    public SynchEnvelopeResponse() {
    }

    public SynchEnvelopeResponse(
           net.docusign.www.API._3_0.SynchEnvelopeStatus synchEnvelopeResult) {
           this.synchEnvelopeResult = synchEnvelopeResult;
    }


    /**
     * Gets the synchEnvelopeResult value for this SynchEnvelopeResponse.
     * 
     * @return synchEnvelopeResult
     */
    public net.docusign.www.API._3_0.SynchEnvelopeStatus getSynchEnvelopeResult() {
        return synchEnvelopeResult;
    }


    /**
     * Sets the synchEnvelopeResult value for this SynchEnvelopeResponse.
     * 
     * @param synchEnvelopeResult
     */
    public void setSynchEnvelopeResult(net.docusign.www.API._3_0.SynchEnvelopeStatus synchEnvelopeResult) {
        this.synchEnvelopeResult = synchEnvelopeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SynchEnvelopeResponse)) return false;
        SynchEnvelopeResponse other = (SynchEnvelopeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.synchEnvelopeResult==null && other.getSynchEnvelopeResult()==null) || 
             (this.synchEnvelopeResult!=null &&
              this.synchEnvelopeResult.equals(other.getSynchEnvelopeResult())));
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
        if (getSynchEnvelopeResult() != null) {
            _hashCode += getSynchEnvelopeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SynchEnvelopeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">SynchEnvelopeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synchEnvelopeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SynchEnvelopeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SynchEnvelopeStatus"));
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
