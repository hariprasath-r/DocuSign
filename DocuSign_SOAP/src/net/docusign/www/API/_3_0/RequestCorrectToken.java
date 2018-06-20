/**
 * RequestCorrectToken.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class RequestCorrectToken  implements java.io.Serializable {
    private java.lang.String envelopeID;

    private boolean suppressNavigation;

    private java.lang.String returnURL;

    public RequestCorrectToken() {
    }

    public RequestCorrectToken(
           java.lang.String envelopeID,
           boolean suppressNavigation,
           java.lang.String returnURL) {
           this.envelopeID = envelopeID;
           this.suppressNavigation = suppressNavigation;
           this.returnURL = returnURL;
    }


    /**
     * Gets the envelopeID value for this RequestCorrectToken.
     * 
     * @return envelopeID
     */
    public java.lang.String getEnvelopeID() {
        return envelopeID;
    }


    /**
     * Sets the envelopeID value for this RequestCorrectToken.
     * 
     * @param envelopeID
     */
    public void setEnvelopeID(java.lang.String envelopeID) {
        this.envelopeID = envelopeID;
    }


    /**
     * Gets the suppressNavigation value for this RequestCorrectToken.
     * 
     * @return suppressNavigation
     */
    public boolean isSuppressNavigation() {
        return suppressNavigation;
    }


    /**
     * Sets the suppressNavigation value for this RequestCorrectToken.
     * 
     * @param suppressNavigation
     */
    public void setSuppressNavigation(boolean suppressNavigation) {
        this.suppressNavigation = suppressNavigation;
    }


    /**
     * Gets the returnURL value for this RequestCorrectToken.
     * 
     * @return returnURL
     */
    public java.lang.String getReturnURL() {
        return returnURL;
    }


    /**
     * Sets the returnURL value for this RequestCorrectToken.
     * 
     * @param returnURL
     */
    public void setReturnURL(java.lang.String returnURL) {
        this.returnURL = returnURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestCorrectToken)) return false;
        RequestCorrectToken other = (RequestCorrectToken) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeID==null && other.getEnvelopeID()==null) || 
             (this.envelopeID!=null &&
              this.envelopeID.equals(other.getEnvelopeID()))) &&
            this.suppressNavigation == other.isSuppressNavigation() &&
            ((this.returnURL==null && other.getReturnURL()==null) || 
             (this.returnURL!=null &&
              this.returnURL.equals(other.getReturnURL())));
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
        if (getEnvelopeID() != null) {
            _hashCode += getEnvelopeID().hashCode();
        }
        _hashCode += (isSuppressNavigation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReturnURL() != null) {
            _hashCode += getReturnURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestCorrectToken.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">RequestCorrectToken"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppressNavigation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SuppressNavigation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ReturnURL"));
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
