/**
 * SharedItems.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SharedItems  implements java.io.Serializable {
    private net.docusign.www.API._3_0.SharedUserInfoRequest user;

    private net.docusign.www.API._3_0.SharedItemRequest[] sharedItem;

    public SharedItems() {
    }

    public SharedItems(
           net.docusign.www.API._3_0.SharedUserInfoRequest user,
           net.docusign.www.API._3_0.SharedItemRequest[] sharedItem) {
           this.user = user;
           this.sharedItem = sharedItem;
    }


    /**
     * Gets the user value for this SharedItems.
     * 
     * @return user
     */
    public net.docusign.www.API._3_0.SharedUserInfoRequest getUser() {
        return user;
    }


    /**
     * Sets the user value for this SharedItems.
     * 
     * @param user
     */
    public void setUser(net.docusign.www.API._3_0.SharedUserInfoRequest user) {
        this.user = user;
    }


    /**
     * Gets the sharedItem value for this SharedItems.
     * 
     * @return sharedItem
     */
    public net.docusign.www.API._3_0.SharedItemRequest[] getSharedItem() {
        return sharedItem;
    }


    /**
     * Sets the sharedItem value for this SharedItems.
     * 
     * @param sharedItem
     */
    public void setSharedItem(net.docusign.www.API._3_0.SharedItemRequest[] sharedItem) {
        this.sharedItem = sharedItem;
    }

    public net.docusign.www.API._3_0.SharedItemRequest getSharedItem(int i) {
        return this.sharedItem[i];
    }

    public void setSharedItem(int i, net.docusign.www.API._3_0.SharedItemRequest _value) {
        this.sharedItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedItems)) return false;
        SharedItems other = (SharedItems) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.sharedItem==null && other.getSharedItem()==null) || 
             (this.sharedItem!=null &&
              java.util.Arrays.equals(this.sharedItem, other.getSharedItem())));
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getSharedItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharedItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharedItem(), i);
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
        new org.apache.axis.description.TypeDesc(SharedItems.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItems"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedUserInfoRequest"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItemRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
