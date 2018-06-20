/**
 * CorrectionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class CorrectionStatus  implements java.io.Serializable {
    private net.docusign.www.API._3_0.EnvelopeSettings envelopeSettingsCorrectionStatus;

    private net.docusign.www.API._3_0.RecipientCorrectionStatus[] recipientCorrectionStatuses;

    private net.docusign.www.API._3_0.Reminders reminders;

    private net.docusign.www.API._3_0.Expirations expirations;

    public CorrectionStatus() {
    }

    public CorrectionStatus(
           net.docusign.www.API._3_0.EnvelopeSettings envelopeSettingsCorrectionStatus,
           net.docusign.www.API._3_0.RecipientCorrectionStatus[] recipientCorrectionStatuses,
           net.docusign.www.API._3_0.Reminders reminders,
           net.docusign.www.API._3_0.Expirations expirations) {
           this.envelopeSettingsCorrectionStatus = envelopeSettingsCorrectionStatus;
           this.recipientCorrectionStatuses = recipientCorrectionStatuses;
           this.reminders = reminders;
           this.expirations = expirations;
    }


    /**
     * Gets the envelopeSettingsCorrectionStatus value for this CorrectionStatus.
     * 
     * @return envelopeSettingsCorrectionStatus
     */
    public net.docusign.www.API._3_0.EnvelopeSettings getEnvelopeSettingsCorrectionStatus() {
        return envelopeSettingsCorrectionStatus;
    }


    /**
     * Sets the envelopeSettingsCorrectionStatus value for this CorrectionStatus.
     * 
     * @param envelopeSettingsCorrectionStatus
     */
    public void setEnvelopeSettingsCorrectionStatus(net.docusign.www.API._3_0.EnvelopeSettings envelopeSettingsCorrectionStatus) {
        this.envelopeSettingsCorrectionStatus = envelopeSettingsCorrectionStatus;
    }


    /**
     * Gets the recipientCorrectionStatuses value for this CorrectionStatus.
     * 
     * @return recipientCorrectionStatuses
     */
    public net.docusign.www.API._3_0.RecipientCorrectionStatus[] getRecipientCorrectionStatuses() {
        return recipientCorrectionStatuses;
    }


    /**
     * Sets the recipientCorrectionStatuses value for this CorrectionStatus.
     * 
     * @param recipientCorrectionStatuses
     */
    public void setRecipientCorrectionStatuses(net.docusign.www.API._3_0.RecipientCorrectionStatus[] recipientCorrectionStatuses) {
        this.recipientCorrectionStatuses = recipientCorrectionStatuses;
    }


    /**
     * Gets the reminders value for this CorrectionStatus.
     * 
     * @return reminders
     */
    public net.docusign.www.API._3_0.Reminders getReminders() {
        return reminders;
    }


    /**
     * Sets the reminders value for this CorrectionStatus.
     * 
     * @param reminders
     */
    public void setReminders(net.docusign.www.API._3_0.Reminders reminders) {
        this.reminders = reminders;
    }


    /**
     * Gets the expirations value for this CorrectionStatus.
     * 
     * @return expirations
     */
    public net.docusign.www.API._3_0.Expirations getExpirations() {
        return expirations;
    }


    /**
     * Sets the expirations value for this CorrectionStatus.
     * 
     * @param expirations
     */
    public void setExpirations(net.docusign.www.API._3_0.Expirations expirations) {
        this.expirations = expirations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorrectionStatus)) return false;
        CorrectionStatus other = (CorrectionStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeSettingsCorrectionStatus==null && other.getEnvelopeSettingsCorrectionStatus()==null) || 
             (this.envelopeSettingsCorrectionStatus!=null &&
              this.envelopeSettingsCorrectionStatus.equals(other.getEnvelopeSettingsCorrectionStatus()))) &&
            ((this.recipientCorrectionStatuses==null && other.getRecipientCorrectionStatuses()==null) || 
             (this.recipientCorrectionStatuses!=null &&
              java.util.Arrays.equals(this.recipientCorrectionStatuses, other.getRecipientCorrectionStatuses()))) &&
            ((this.reminders==null && other.getReminders()==null) || 
             (this.reminders!=null &&
              this.reminders.equals(other.getReminders()))) &&
            ((this.expirations==null && other.getExpirations()==null) || 
             (this.expirations!=null &&
              this.expirations.equals(other.getExpirations())));
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
        if (getEnvelopeSettingsCorrectionStatus() != null) {
            _hashCode += getEnvelopeSettingsCorrectionStatus().hashCode();
        }
        if (getRecipientCorrectionStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientCorrectionStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientCorrectionStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReminders() != null) {
            _hashCode += getReminders().hashCode();
        }
        if (getExpirations() != null) {
            _hashCode += getExpirations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorrectionStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CorrectionStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeSettingsCorrectionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeSettingsCorrectionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCorrectionStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrectionStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Reminders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Reminders"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Expirations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Expirations"));
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
