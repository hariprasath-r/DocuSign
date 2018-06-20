/**
 * Correction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Correction  implements java.io.Serializable {
    private java.lang.String envelopeID;

    private net.docusign.www.API._3_0.EnvelopeSettings envelopeSettingsCorrection;

    private net.docusign.www.API._3_0.RecipientCorrection[] recipientCorrections;

    private net.docusign.www.API._3_0.Reminders reminders;

    private net.docusign.www.API._3_0.Expirations expirations;

    public Correction() {
    }

    public Correction(
           java.lang.String envelopeID,
           net.docusign.www.API._3_0.EnvelopeSettings envelopeSettingsCorrection,
           net.docusign.www.API._3_0.RecipientCorrection[] recipientCorrections,
           net.docusign.www.API._3_0.Reminders reminders,
           net.docusign.www.API._3_0.Expirations expirations) {
           this.envelopeID = envelopeID;
           this.envelopeSettingsCorrection = envelopeSettingsCorrection;
           this.recipientCorrections = recipientCorrections;
           this.reminders = reminders;
           this.expirations = expirations;
    }


    /**
     * Gets the envelopeID value for this Correction.
     * 
     * @return envelopeID
     */
    public java.lang.String getEnvelopeID() {
        return envelopeID;
    }


    /**
     * Sets the envelopeID value for this Correction.
     * 
     * @param envelopeID
     */
    public void setEnvelopeID(java.lang.String envelopeID) {
        this.envelopeID = envelopeID;
    }


    /**
     * Gets the envelopeSettingsCorrection value for this Correction.
     * 
     * @return envelopeSettingsCorrection
     */
    public net.docusign.www.API._3_0.EnvelopeSettings getEnvelopeSettingsCorrection() {
        return envelopeSettingsCorrection;
    }


    /**
     * Sets the envelopeSettingsCorrection value for this Correction.
     * 
     * @param envelopeSettingsCorrection
     */
    public void setEnvelopeSettingsCorrection(net.docusign.www.API._3_0.EnvelopeSettings envelopeSettingsCorrection) {
        this.envelopeSettingsCorrection = envelopeSettingsCorrection;
    }


    /**
     * Gets the recipientCorrections value for this Correction.
     * 
     * @return recipientCorrections
     */
    public net.docusign.www.API._3_0.RecipientCorrection[] getRecipientCorrections() {
        return recipientCorrections;
    }


    /**
     * Sets the recipientCorrections value for this Correction.
     * 
     * @param recipientCorrections
     */
    public void setRecipientCorrections(net.docusign.www.API._3_0.RecipientCorrection[] recipientCorrections) {
        this.recipientCorrections = recipientCorrections;
    }


    /**
     * Gets the reminders value for this Correction.
     * 
     * @return reminders
     */
    public net.docusign.www.API._3_0.Reminders getReminders() {
        return reminders;
    }


    /**
     * Sets the reminders value for this Correction.
     * 
     * @param reminders
     */
    public void setReminders(net.docusign.www.API._3_0.Reminders reminders) {
        this.reminders = reminders;
    }


    /**
     * Gets the expirations value for this Correction.
     * 
     * @return expirations
     */
    public net.docusign.www.API._3_0.Expirations getExpirations() {
        return expirations;
    }


    /**
     * Sets the expirations value for this Correction.
     * 
     * @param expirations
     */
    public void setExpirations(net.docusign.www.API._3_0.Expirations expirations) {
        this.expirations = expirations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Correction)) return false;
        Correction other = (Correction) obj;
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
            ((this.envelopeSettingsCorrection==null && other.getEnvelopeSettingsCorrection()==null) || 
             (this.envelopeSettingsCorrection!=null &&
              this.envelopeSettingsCorrection.equals(other.getEnvelopeSettingsCorrection()))) &&
            ((this.recipientCorrections==null && other.getRecipientCorrections()==null) || 
             (this.recipientCorrections!=null &&
              java.util.Arrays.equals(this.recipientCorrections, other.getRecipientCorrections()))) &&
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
        if (getEnvelopeID() != null) {
            _hashCode += getEnvelopeID().hashCode();
        }
        if (getEnvelopeSettingsCorrection() != null) {
            _hashCode += getEnvelopeSettingsCorrection().hashCode();
        }
        if (getRecipientCorrections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipientCorrections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipientCorrections(), i);
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
        new org.apache.axis.description.TypeDesc(Correction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Correction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeSettingsCorrection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeSettingsCorrection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCorrections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientCorrection"));
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
