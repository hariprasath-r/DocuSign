/**
 * EnvelopeStatusChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeStatusChange  implements java.io.Serializable {
    private java.lang.String envelopeID;

    private net.docusign.www.API._3_0.EnvelopeStatusCode status;

    private java.util.Calendar statusChanged;

    public EnvelopeStatusChange() {
    }

    public EnvelopeStatusChange(
           java.lang.String envelopeID,
           net.docusign.www.API._3_0.EnvelopeStatusCode status,
           java.util.Calendar statusChanged) {
           this.envelopeID = envelopeID;
           this.status = status;
           this.statusChanged = statusChanged;
    }


    /**
     * Gets the envelopeID value for this EnvelopeStatusChange.
     * 
     * @return envelopeID
     */
    public java.lang.String getEnvelopeID() {
        return envelopeID;
    }


    /**
     * Sets the envelopeID value for this EnvelopeStatusChange.
     * 
     * @param envelopeID
     */
    public void setEnvelopeID(java.lang.String envelopeID) {
        this.envelopeID = envelopeID;
    }


    /**
     * Gets the status value for this EnvelopeStatusChange.
     * 
     * @return status
     */
    public net.docusign.www.API._3_0.EnvelopeStatusCode getStatus() {
        return status;
    }


    /**
     * Sets the status value for this EnvelopeStatusChange.
     * 
     * @param status
     */
    public void setStatus(net.docusign.www.API._3_0.EnvelopeStatusCode status) {
        this.status = status;
    }


    /**
     * Gets the statusChanged value for this EnvelopeStatusChange.
     * 
     * @return statusChanged
     */
    public java.util.Calendar getStatusChanged() {
        return statusChanged;
    }


    /**
     * Sets the statusChanged value for this EnvelopeStatusChange.
     * 
     * @param statusChanged
     */
    public void setStatusChanged(java.util.Calendar statusChanged) {
        this.statusChanged = statusChanged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeStatusChange)) return false;
        EnvelopeStatusChange other = (EnvelopeStatusChange) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.statusChanged==null && other.getStatusChanged()==null) || 
             (this.statusChanged!=null &&
              this.statusChanged.equals(other.getStatusChanged())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStatusChanged() != null) {
            _hashCode += getStatusChanged().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeStatusChange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "StatusChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
