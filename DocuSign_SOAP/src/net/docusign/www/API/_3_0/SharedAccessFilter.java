/**
 * SharedAccessFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SharedAccessFilter  implements java.io.Serializable {
    private java.lang.String[] userIds;

    private net.docusign.www.API._3_0.SharedAccessItemType itemType;

    private java.lang.String searchText;

    private net.docusign.www.API._3_0.SharedAccessShareType shared;

    private org.apache.axis.types.NonNegativeInteger startAtIndex;

    private org.apache.axis.types.NonNegativeInteger count;

    public SharedAccessFilter() {
    }

    public SharedAccessFilter(
           java.lang.String[] userIds,
           net.docusign.www.API._3_0.SharedAccessItemType itemType,
           java.lang.String searchText,
           net.docusign.www.API._3_0.SharedAccessShareType shared,
           org.apache.axis.types.NonNegativeInteger startAtIndex,
           org.apache.axis.types.NonNegativeInteger count) {
           this.userIds = userIds;
           this.itemType = itemType;
           this.searchText = searchText;
           this.shared = shared;
           this.startAtIndex = startAtIndex;
           this.count = count;
    }


    /**
     * Gets the userIds value for this SharedAccessFilter.
     * 
     * @return userIds
     */
    public java.lang.String[] getUserIds() {
        return userIds;
    }


    /**
     * Sets the userIds value for this SharedAccessFilter.
     * 
     * @param userIds
     */
    public void setUserIds(java.lang.String[] userIds) {
        this.userIds = userIds;
    }


    /**
     * Gets the itemType value for this SharedAccessFilter.
     * 
     * @return itemType
     */
    public net.docusign.www.API._3_0.SharedAccessItemType getItemType() {
        return itemType;
    }


    /**
     * Sets the itemType value for this SharedAccessFilter.
     * 
     * @param itemType
     */
    public void setItemType(net.docusign.www.API._3_0.SharedAccessItemType itemType) {
        this.itemType = itemType;
    }


    /**
     * Gets the searchText value for this SharedAccessFilter.
     * 
     * @return searchText
     */
    public java.lang.String getSearchText() {
        return searchText;
    }


    /**
     * Sets the searchText value for this SharedAccessFilter.
     * 
     * @param searchText
     */
    public void setSearchText(java.lang.String searchText) {
        this.searchText = searchText;
    }


    /**
     * Gets the shared value for this SharedAccessFilter.
     * 
     * @return shared
     */
    public net.docusign.www.API._3_0.SharedAccessShareType getShared() {
        return shared;
    }


    /**
     * Sets the shared value for this SharedAccessFilter.
     * 
     * @param shared
     */
    public void setShared(net.docusign.www.API._3_0.SharedAccessShareType shared) {
        this.shared = shared;
    }


    /**
     * Gets the startAtIndex value for this SharedAccessFilter.
     * 
     * @return startAtIndex
     */
    public org.apache.axis.types.NonNegativeInteger getStartAtIndex() {
        return startAtIndex;
    }


    /**
     * Sets the startAtIndex value for this SharedAccessFilter.
     * 
     * @param startAtIndex
     */
    public void setStartAtIndex(org.apache.axis.types.NonNegativeInteger startAtIndex) {
        this.startAtIndex = startAtIndex;
    }


    /**
     * Gets the count value for this SharedAccessFilter.
     * 
     * @return count
     */
    public org.apache.axis.types.NonNegativeInteger getCount() {
        return count;
    }


    /**
     * Sets the count value for this SharedAccessFilter.
     * 
     * @param count
     */
    public void setCount(org.apache.axis.types.NonNegativeInteger count) {
        this.count = count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SharedAccessFilter)) return false;
        SharedAccessFilter other = (SharedAccessFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userIds==null && other.getUserIds()==null) || 
             (this.userIds!=null &&
              java.util.Arrays.equals(this.userIds, other.getUserIds()))) &&
            ((this.itemType==null && other.getItemType()==null) || 
             (this.itemType!=null &&
              this.itemType.equals(other.getItemType()))) &&
            ((this.searchText==null && other.getSearchText()==null) || 
             (this.searchText!=null &&
              this.searchText.equals(other.getSearchText()))) &&
            ((this.shared==null && other.getShared()==null) || 
             (this.shared!=null &&
              this.shared.equals(other.getShared()))) &&
            ((this.startAtIndex==null && other.getStartAtIndex()==null) || 
             (this.startAtIndex!=null &&
              this.startAtIndex.equals(other.getStartAtIndex()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount())));
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
        if (getUserIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemType() != null) {
            _hashCode += getItemType().hashCode();
        }
        if (getSearchText() != null) {
            _hashCode += getSearchText().hashCode();
        }
        if (getShared() != null) {
            _hashCode += getShared().hashCode();
        }
        if (getStartAtIndex() != null) {
            _hashCode += getStartAtIndex().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SharedAccessFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessItemType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SearchText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shared");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Shared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessShareType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startAtIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "StartAtIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
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
