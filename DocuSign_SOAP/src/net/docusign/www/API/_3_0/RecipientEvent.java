/**
 * RecipientEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RecipientEvent  implements java.io.Serializable {
    private net.docusign.www.API._3_0.RecipientEventStatusCode recipientEventStatusCode;

    private boolean includeDocuments;

    public RecipientEvent() {
    }

    public RecipientEvent(
           net.docusign.www.API._3_0.RecipientEventStatusCode recipientEventStatusCode,
           boolean includeDocuments) {
           this.recipientEventStatusCode = recipientEventStatusCode;
           this.includeDocuments = includeDocuments;
    }


    /**
     * Gets the recipientEventStatusCode value for this RecipientEvent.
     * 
     * @return recipientEventStatusCode
     */
    public net.docusign.www.API._3_0.RecipientEventStatusCode getRecipientEventStatusCode() {
        return recipientEventStatusCode;
    }


    /**
     * Sets the recipientEventStatusCode value for this RecipientEvent.
     * 
     * @param recipientEventStatusCode
     */
    public void setRecipientEventStatusCode(net.docusign.www.API._3_0.RecipientEventStatusCode recipientEventStatusCode) {
        this.recipientEventStatusCode = recipientEventStatusCode;
    }


    /**
     * Gets the includeDocuments value for this RecipientEvent.
     * 
     * @return includeDocuments
     */
    public boolean isIncludeDocuments() {
        return includeDocuments;
    }


    /**
     * Sets the includeDocuments value for this RecipientEvent.
     * 
     * @param includeDocuments
     */
    public void setIncludeDocuments(boolean includeDocuments) {
        this.includeDocuments = includeDocuments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientEvent)) return false;
        RecipientEvent other = (RecipientEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recipientEventStatusCode==null && other.getRecipientEventStatusCode()==null) || 
             (this.recipientEventStatusCode!=null &&
              this.recipientEventStatusCode.equals(other.getRecipientEventStatusCode()))) &&
            this.includeDocuments == other.isIncludeDocuments();
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
        if (getRecipientEventStatusCode() != null) {
            _hashCode += getRecipientEventStatusCode().hashCode();
        }
        _hashCode += (isIncludeDocuments() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecipientEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientEventStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEventStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEventStatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IncludeDocuments"));
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
