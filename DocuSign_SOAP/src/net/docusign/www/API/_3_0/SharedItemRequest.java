/**
 * SharedItemRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SharedItemRequest  implements java.io.Serializable {
    private net.docusign.www.API._3_0.SharedUserInfoRequest user;

    private net.docusign.www.API._3_0.SharedAccessShareType shared;

    private net.docusign.www.API._3_0.SharedAccessItemType itemType;

    public SharedItemRequest() {
    }

    public SharedItemRequest(
           net.docusign.www.API._3_0.SharedUserInfoRequest user,
           net.docusign.www.API._3_0.SharedAccessShareType shared,
           net.docusign.www.API._3_0.SharedAccessItemType itemType) {
           this.user = user;
           this.shared = shared;
           this.itemType = itemType;
    }


    /**
     * Gets the user value for this SharedItemRequest.
     * 
     * @return user
     */
    public net.docusign.www.API._3_0.SharedUserInfoRequest getUser() {
        return user;
    }


    /**
     * Sets the user value for this SharedItemRequest.
     * 
     * @param user
     */
    public void setUser(net.docusign.www.API._3_0.SharedUserInfoRequest user) {
        this.user = user;
    }


    /**
     * Gets the shared value for this SharedItemRequest.
     * 
     * @return shared
     */
    public net.docusign.www.API._3_0.SharedAccessShareType getShared() {
        return shared;
    }


    /**
     * Sets the shared value for this SharedItemRequest.
     * 
     * @param shared
     */
    public void setShared(net.docusign.www.API._3_0.SharedAccessShareType shared) {
        this.shared = shared;
    }


    /**
     * Gets the itemType value for this SharedItemRequest.
     * 
     * @return itemType
     */
    public net.docusign.www.API._3_0.SharedAccessItemType getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this SharedItemRequest.
     * 
     * @param itemType
     */
    public void setItemType(net.docusign.www.API._3_0.SharedAccessItemType itemType) {
        this.itemType = itemType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedItemRequest)) return false;
        SharedItemRequest other = (SharedItemRequest) obj;
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
            ((this.shared==null && other.getShared()==null) || 
             (this.shared!=null &&
              this.shared.equals(other.getShared()))) &&
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType())));
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
        if (getShared() != null) {
            _hashCode += getShared().hashCode();
        }
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharedItemRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItemRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedUserInfoRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shared");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Shared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessShareType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessItemType"));
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
