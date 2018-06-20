/**
 * EnvelopeAuditEventsV2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeAuditEventsV2Response  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeAuditEvent[] envelopeAuditEventsV2Result;

    public EnvelopeAuditEventsV2Response() {
    }

    public EnvelopeAuditEventsV2Response(
           net.docusign.www.API._3_0.EnvelopeAuditEvent[] envelopeAuditEventsV2Result) {
           this.envelopeAuditEventsV2Result = envelopeAuditEventsV2Result;
    }


    /**
     * Gets the envelopeAuditEventsV2Result value for this EnvelopeAuditEventsV2Response.
     * 
     * @return envelopeAuditEventsV2Result
     */
    public net.docusign.www.API._3_0.EnvelopeAuditEvent[] getEnvelopeAuditEventsV2Result() {
        return envelopeAuditEventsV2Result;
    }


    /**
     * Sets the envelopeAuditEventsV2Result value for this EnvelopeAuditEventsV2Response.
     * 
     * @param envelopeAuditEventsV2Result
     */
    public void setEnvelopeAuditEventsV2Result(net.docusign.www.API._3_0.EnvelopeAuditEvent[] envelopeAuditEventsV2Result) {
        this.envelopeAuditEventsV2Result = envelopeAuditEventsV2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeAuditEventsV2Response)) return false;
        EnvelopeAuditEventsV2Response other = (EnvelopeAuditEventsV2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeAuditEventsV2Result==null && other.getEnvelopeAuditEventsV2Result()==null) || 
             (this.envelopeAuditEventsV2Result!=null &&
              java.util.Arrays.equals(this.envelopeAuditEventsV2Result, other.getEnvelopeAuditEventsV2Result())));
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
        if (getEnvelopeAuditEventsV2Result() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvelopeAuditEventsV2Result());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvelopeAuditEventsV2Result(), i);
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
        new org.apache.axis.description.TypeDesc(EnvelopeAuditEventsV2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">EnvelopeAuditEventsV2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeAuditEventsV2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEventsV2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeAuditEvent"));
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
