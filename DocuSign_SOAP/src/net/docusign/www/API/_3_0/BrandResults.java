/**
 * BrandResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class BrandResults  implements java.io.Serializable {
    private java.lang.String recipientBrandIdDefault;

    private java.lang.String senderBrandIdDefault;

    private net.docusign.www.API._3_0.BrandResultItem[] brandResultItems;

    public BrandResults() {
    }

    public BrandResults(
           java.lang.String recipientBrandIdDefault,
           java.lang.String senderBrandIdDefault,
           net.docusign.www.API._3_0.BrandResultItem[] brandResultItems) {
           this.recipientBrandIdDefault = recipientBrandIdDefault;
           this.senderBrandIdDefault = senderBrandIdDefault;
           this.brandResultItems = brandResultItems;
    }


    /**
     * Gets the recipientBrandIdDefault value for this BrandResults.
     * 
     * @return recipientBrandIdDefault
     */
    public java.lang.String getRecipientBrandIdDefault() {
        return recipientBrandIdDefault;
    }


    /**
     * Sets the recipientBrandIdDefault value for this BrandResults.
     * 
     * @param recipientBrandIdDefault
     */
    public void setRecipientBrandIdDefault(java.lang.String recipientBrandIdDefault) {
        this.recipientBrandIdDefault = recipientBrandIdDefault;
    }


    /**
     * Gets the senderBrandIdDefault value for this BrandResults.
     * 
     * @return senderBrandIdDefault
     */
    public java.lang.String getSenderBrandIdDefault() {
        return senderBrandIdDefault;
    }


    /**
     * Sets the senderBrandIdDefault value for this BrandResults.
     * 
     * @param senderBrandIdDefault
     */
    public void setSenderBrandIdDefault(java.lang.String senderBrandIdDefault) {
        this.senderBrandIdDefault = senderBrandIdDefault;
    }


    /**
     * Gets the brandResultItems value for this BrandResults.
     * 
     * @return brandResultItems
     */
    public net.docusign.www.API._3_0.BrandResultItem[] getBrandResultItems() {
        return brandResultItems;
    }


    /**
     * Sets the brandResultItems value for this BrandResults.
     * 
     * @param brandResultItems
     */
    public void setBrandResultItems(net.docusign.www.API._3_0.BrandResultItem[] brandResultItems) {
        this.brandResultItems = brandResultItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrandResults)) return false;
        BrandResults other = (BrandResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recipientBrandIdDefault==null && other.getRecipientBrandIdDefault()==null) || 
             (this.recipientBrandIdDefault!=null &&
              this.recipientBrandIdDefault.equals(other.getRecipientBrandIdDefault()))) &&
            ((this.senderBrandIdDefault==null && other.getSenderBrandIdDefault()==null) || 
             (this.senderBrandIdDefault!=null &&
              this.senderBrandIdDefault.equals(other.getSenderBrandIdDefault()))) &&
            ((this.brandResultItems==null && other.getBrandResultItems()==null) || 
             (this.brandResultItems!=null &&
              java.util.Arrays.equals(this.brandResultItems, other.getBrandResultItems())));
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
        if (getRecipientBrandIdDefault() != null) {
            _hashCode += getRecipientBrandIdDefault().hashCode();
        }
        if (getSenderBrandIdDefault() != null) {
            _hashCode += getSenderBrandIdDefault().hashCode();
        }
        if (getBrandResultItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrandResultItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrandResultItems(), i);
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
        new org.apache.axis.description.TypeDesc(BrandResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientBrandIdDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "RecipientBrandIdDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderBrandIdDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SenderBrandIdDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandResultItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResultItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "BrandResultItem"));
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
