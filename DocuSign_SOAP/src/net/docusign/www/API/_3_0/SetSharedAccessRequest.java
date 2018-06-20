/**
 * SetSharedAccessRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SetSharedAccessRequest  implements java.io.Serializable {
    private java.lang.String accountId;

    private net.docusign.www.API._3_0.SharedItems[] sharedItems;

    public SetSharedAccessRequest() {
    }

    public SetSharedAccessRequest(
           java.lang.String accountId,
           net.docusign.www.API._3_0.SharedItems[] sharedItems) {
           this.accountId = accountId;
           this.sharedItems = sharedItems;
    }


    /**
     * Gets the accountId value for this SetSharedAccessRequest.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this SetSharedAccessRequest.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the sharedItems value for this SetSharedAccessRequest.
     * 
     * @return sharedItems
     */
    public net.docusign.www.API._3_0.SharedItems[] getSharedItems() {
        return sharedItems;
    }


    /**
     * Sets the sharedItems value for this SetSharedAccessRequest.
     * 
     * @param sharedItems
     */
    public void setSharedItems(net.docusign.www.API._3_0.SharedItems[] sharedItems) {
        this.sharedItems = sharedItems;
    }

    public net.docusign.www.API._3_0.SharedItems getSharedItems(int i) {
        return this.sharedItems[i];
    }

    public void setSharedItems(int i, net.docusign.www.API._3_0.SharedItems _value) {
        this.sharedItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetSharedAccessRequest)) return false;
        SetSharedAccessRequest other = (SetSharedAccessRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.sharedItems==null && other.getSharedItems()==null) || 
             (this.sharedItems!=null &&
              java.util.Arrays.equals(this.sharedItems, other.getSharedItems())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getSharedItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharedItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharedItems(), i);
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
        new org.apache.axis.description.TypeDesc(SetSharedAccessRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SetSharedAccessRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItems"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
