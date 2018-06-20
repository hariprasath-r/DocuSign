/**
 * CaptiveRecipientResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class CaptiveRecipientResults  implements java.io.Serializable {
    private net.docusign.www.API._3_0.CaptiveRecipient[] captiveRecipients;

    public CaptiveRecipientResults() {
    }

    public CaptiveRecipientResults(
           net.docusign.www.API._3_0.CaptiveRecipient[] captiveRecipients) {
           this.captiveRecipients = captiveRecipients;
    }


    /**
     * Gets the captiveRecipients value for this CaptiveRecipientResults.
     * 
     * @return captiveRecipients
     */
    public net.docusign.www.API._3_0.CaptiveRecipient[] getCaptiveRecipients() {
        return captiveRecipients;
    }


    /**
     * Sets the captiveRecipients value for this CaptiveRecipientResults.
     * 
     * @param captiveRecipients
     */
    public void setCaptiveRecipients(net.docusign.www.API._3_0.CaptiveRecipient[] captiveRecipients) {
        this.captiveRecipients = captiveRecipients;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaptiveRecipientResults)) return false;
        CaptiveRecipientResults other = (CaptiveRecipientResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.captiveRecipients==null && other.getCaptiveRecipients()==null) || 
             (this.captiveRecipients!=null &&
              java.util.Arrays.equals(this.captiveRecipients, other.getCaptiveRecipients())));
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
        if (getCaptiveRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaptiveRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaptiveRecipients(), i);
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
        new org.apache.axis.description.TypeDesc(CaptiveRecipientResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveRecipientResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captiveRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveRecipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaptiveRecipient"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResultItem"));
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
