/**
 * SharedAccessItemResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SharedAccessItemResult  implements java.io.Serializable {
    private net.docusign.www.API._3_0.SharedUserInfoResult user;

    private net.docusign.www.API._3_0.SharedItemResult[] sharedItem;

    private net.docusign.www.API._3_0.ErrorDetails errorDetails;

    public SharedAccessItemResult() {
    }

    public SharedAccessItemResult(
           net.docusign.www.API._3_0.SharedUserInfoResult user,
           net.docusign.www.API._3_0.SharedItemResult[] sharedItem,
           net.docusign.www.API._3_0.ErrorDetails errorDetails) {
           this.user = user;
           this.sharedItem = sharedItem;
           this.errorDetails = errorDetails;
    }


    /**
     * Gets the user value for this SharedAccessItemResult.
     * 
     * @return user
     */
    public net.docusign.www.API._3_0.SharedUserInfoResult getUser() {
        return user;
    }


    /**
     * Sets the user value for this SharedAccessItemResult.
     * 
     * @param user
     */
    public void setUser(net.docusign.www.API._3_0.SharedUserInfoResult user) {
        this.user = user;
    }


    /**
     * Gets the sharedItem value for this SharedAccessItemResult.
     * 
     * @return sharedItem
     */
    public net.docusign.www.API._3_0.SharedItemResult[] getSharedItem() {
        return sharedItem;
    }


    /**
     * Sets the sharedItem value for this SharedAccessItemResult.
     * 
     * @param sharedItem
     */
    public void setSharedItem(net.docusign.www.API._3_0.SharedItemResult[] sharedItem) {
        this.sharedItem = sharedItem;
    }

    public net.docusign.www.API._3_0.SharedItemResult getSharedItem(int i) {
        return this.sharedItem[i];
    }

    public void setSharedItem(int i, net.docusign.www.API._3_0.SharedItemResult _value) {
        this.sharedItem[i] = _value;
    }


    /**
     * Gets the errorDetails value for this SharedAccessItemResult.
     * 
     * @return errorDetails
     */
    public net.docusign.www.API._3_0.ErrorDetails getErrorDetails() {
        return errorDetails;
    }


    /**
     * Sets the errorDetails value for this SharedAccessItemResult.
     * 
     * @param errorDetails
     */
    public void setErrorDetails(net.docusign.www.API._3_0.ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedAccessItemResult)) return false;
        SharedAccessItemResult other = (SharedAccessItemResult) obj;
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
              java.util.Arrays.equals(this.sharedItem, other.getSharedItem()))) &&
            ((this.errorDetails==null && other.getErrorDetails()==null) || 
             (this.errorDetails!=null &&
              this.errorDetails.equals(other.getErrorDetails())));
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
        if (getErrorDetails() != null) {
            _hashCode += getErrorDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharedAccessItemResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessItemResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "User"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedUserInfoResult"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItemResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ErrorDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ErrorDetails"));
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
