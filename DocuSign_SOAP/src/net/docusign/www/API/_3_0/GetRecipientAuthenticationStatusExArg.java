/**
 * GetRecipientAuthenticationStatusExArg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class GetRecipientAuthenticationStatusExArg  implements java.io.Serializable {
    private java.lang.String envelopeId;

    private java.lang.String recipientName;

    private java.lang.String recipientEmail;

    private java.lang.Integer routingOrder;

    public GetRecipientAuthenticationStatusExArg() {
    }

    public GetRecipientAuthenticationStatusExArg(
           java.lang.String envelopeId,
           java.lang.String recipientName,
           java.lang.String recipientEmail,
           java.lang.Integer routingOrder) {
           this.envelopeId = envelopeId;
           this.recipientName = recipientName;
           this.recipientEmail = recipientEmail;
           this.routingOrder = routingOrder;
    }


    /**
     * Gets the envelopeId value for this GetRecipientAuthenticationStatusExArg.
     * 
     * @return envelopeId
     */
    public java.lang.String getEnvelopeId() {
        return envelopeId;
    }


    /**
     * Sets the envelopeId value for this GetRecipientAuthenticationStatusExArg.
     * 
     * @param envelopeId
     */
    public void setEnvelopeId(java.lang.String envelopeId) {
        this.envelopeId = envelopeId;
    }


    /**
     * Gets the recipientName value for this GetRecipientAuthenticationStatusExArg.
     * 
     * @return recipientName
     */
    public java.lang.String getRecipientName() {
        return recipientName;
    }


    /**
     * Sets the recipientName value for this GetRecipientAuthenticationStatusExArg.
     * 
     * @param recipientName
     */
    public void setRecipientName(java.lang.String recipientName) {
        this.recipientName = recipientName;
    }


    /**
     * Gets the recipientEmail value for this GetRecipientAuthenticationStatusExArg.
     * 
     * @return recipientEmail
     */
    public java.lang.String getRecipientEmail() {
        return recipientEmail;
    }


    /**
     * Sets the recipientEmail value for this GetRecipientAuthenticationStatusExArg.
     * 
     * @param recipientEmail
     */
    public void setRecipientEmail(java.lang.String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }


    /**
     * Gets the routingOrder value for this GetRecipientAuthenticationStatusExArg.
     * 
     * @return routingOrder
     */
    public java.lang.Integer getRoutingOrder() {
        return routingOrder;
    }


    /**
     * Sets the routingOrder value for this GetRecipientAuthenticationStatusExArg.
     * 
     * @param routingOrder
     */
    public void setRoutingOrder(java.lang.Integer routingOrder) {
        this.routingOrder = routingOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRecipientAuthenticationStatusExArg)) return false;
        GetRecipientAuthenticationStatusExArg other = (GetRecipientAuthenticationStatusExArg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeId==null && other.getEnvelopeId()==null) || 
             (this.envelopeId!=null &&
              this.envelopeId.equals(other.getEnvelopeId()))) &&
            ((this.recipientName==null && other.getRecipientName()==null) || 
             (this.recipientName!=null &&
              this.recipientName.equals(other.getRecipientName()))) &&
            ((this.recipientEmail==null && other.getRecipientEmail()==null) || 
             (this.recipientEmail!=null &&
              this.recipientEmail.equals(other.getRecipientEmail()))) &&
            ((this.routingOrder==null && other.getRoutingOrder()==null) || 
             (this.routingOrder!=null &&
              this.routingOrder.equals(other.getRoutingOrder())));
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
        if (getEnvelopeId() != null) {
            _hashCode += getEnvelopeId().hashCode();
        }
        if (getRecipientName() != null) {
            _hashCode += getRecipientName().hashCode();
        }
        if (getRecipientEmail() != null) {
            _hashCode += getRecipientEmail().hashCode();
        }
        if (getRoutingOrder() != null) {
            _hashCode += getRoutingOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRecipientAuthenticationStatusExArg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetRecipientAuthenticationStatusExArg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RoutingOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
