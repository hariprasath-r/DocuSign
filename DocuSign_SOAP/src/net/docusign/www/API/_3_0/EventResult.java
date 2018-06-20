/**
 * EventResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EventResult  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EventStatusCode status;

    private java.util.Calendar eventTimestamp;

    private java.lang.String failureDescription;

    private java.lang.String vendorFailureStatusCode;

    public EventResult() {
    }

    public EventResult(
           net.docusign.www.API._3_0.EventStatusCode status,
           java.util.Calendar eventTimestamp,
           java.lang.String failureDescription,
           java.lang.String vendorFailureStatusCode) {
           this.status = status;
           this.eventTimestamp = eventTimestamp;
           this.failureDescription = failureDescription;
           this.vendorFailureStatusCode = vendorFailureStatusCode;
    }


    /**
     * Gets the status value for this EventResult.
     * 
     * @return status
     */
    public net.docusign.www.API._3_0.EventStatusCode getStatus() {
        return status;
    }


    /**
     * Sets the status value for this EventResult.
     * 
     * @param status
     */
    public void setStatus(net.docusign.www.API._3_0.EventStatusCode status) {
        this.status = status;
    }


    /**
     * Gets the eventTimestamp value for this EventResult.
     * 
     * @return eventTimestamp
     */
    public java.util.Calendar getEventTimestamp() {
        return eventTimestamp;
    }


    /**
     * Sets the eventTimestamp value for this EventResult.
     * 
     * @param eventTimestamp
     */
    public void setEventTimestamp(java.util.Calendar eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }


    /**
     * Gets the failureDescription value for this EventResult.
     * 
     * @return failureDescription
     */
    public java.lang.String getFailureDescription() {
        return failureDescription;
    }


    /**
     * Sets the failureDescription value for this EventResult.
     * 
     * @param failureDescription
     */
    public void setFailureDescription(java.lang.String failureDescription) {
        this.failureDescription = failureDescription;
    }


    /**
     * Gets the vendorFailureStatusCode value for this EventResult.
     * 
     * @return vendorFailureStatusCode
     */
    public java.lang.String getVendorFailureStatusCode() {
        return vendorFailureStatusCode;
    }


    /**
     * Sets the vendorFailureStatusCode value for this EventResult.
     * 
     * @param vendorFailureStatusCode
     */
    public void setVendorFailureStatusCode(java.lang.String vendorFailureStatusCode) {
        this.vendorFailureStatusCode = vendorFailureStatusCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventResult)) return false;
        EventResult other = (EventResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.eventTimestamp==null && other.getEventTimestamp()==null) || 
             (this.eventTimestamp!=null &&
              this.eventTimestamp.equals(other.getEventTimestamp()))) &&
            ((this.failureDescription==null && other.getFailureDescription()==null) || 
             (this.failureDescription!=null &&
              this.failureDescription.equals(other.getFailureDescription()))) &&
            ((this.vendorFailureStatusCode==null && other.getVendorFailureStatusCode()==null) || 
             (this.vendorFailureStatusCode!=null &&
              this.vendorFailureStatusCode.equals(other.getVendorFailureStatusCode())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getEventTimestamp() != null) {
            _hashCode += getEventTimestamp().hashCode();
        }
        if (getFailureDescription() != null) {
            _hashCode += getFailureDescription().hashCode();
        }
        if (getVendorFailureStatusCode() != null) {
            _hashCode += getVendorFailureStatusCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventStatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EventTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FailureDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorFailureStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "VendorFailureStatusCode"));
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
