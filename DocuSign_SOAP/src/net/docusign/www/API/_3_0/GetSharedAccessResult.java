/**
 * GetSharedAccessResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class GetSharedAccessResult  implements java.io.Serializable {
    private java.lang.String accountId;

    private org.apache.axis.types.NonNegativeInteger resultSetSize;

    private org.apache.axis.types.NonNegativeInteger totalSetSize;

    private org.apache.axis.types.NonNegativeInteger startAtIndex;

    private org.apache.axis.types.NonNegativeInteger endAtIndex;

    private net.docusign.www.API._3_0.SharedAccessItemResult[] sharedItems;

    private net.docusign.www.API._3_0.ErrorDetails errorDetails;

    public GetSharedAccessResult() {
    }

    public GetSharedAccessResult(
           java.lang.String accountId,
           org.apache.axis.types.NonNegativeInteger resultSetSize,
           org.apache.axis.types.NonNegativeInteger totalSetSize,
           org.apache.axis.types.NonNegativeInteger startAtIndex,
           org.apache.axis.types.NonNegativeInteger endAtIndex,
           net.docusign.www.API._3_0.SharedAccessItemResult[] sharedItems,
           net.docusign.www.API._3_0.ErrorDetails errorDetails) {
           this.accountId = accountId;
           this.resultSetSize = resultSetSize;
           this.totalSetSize = totalSetSize;
           this.startAtIndex = startAtIndex;
           this.endAtIndex = endAtIndex;
           this.sharedItems = sharedItems;
           this.errorDetails = errorDetails;
    }


    /**
     * Gets the accountId value for this GetSharedAccessResult.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this GetSharedAccessResult.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the resultSetSize value for this GetSharedAccessResult.
     * 
     * @return resultSetSize
     */
    public org.apache.axis.types.NonNegativeInteger getResultSetSize() {
        return resultSetSize;
    }


    /**
     * Sets the resultSetSize value for this GetSharedAccessResult.
     * 
     * @param resultSetSize
     */
    public void setResultSetSize(org.apache.axis.types.NonNegativeInteger resultSetSize) {
        this.resultSetSize = resultSetSize;
    }


    /**
     * Gets the totalSetSize value for this GetSharedAccessResult.
     * 
     * @return totalSetSize
     */
    public org.apache.axis.types.NonNegativeInteger getTotalSetSize() {
        return totalSetSize;
    }


    /**
     * Sets the totalSetSize value for this GetSharedAccessResult.
     * 
     * @param totalSetSize
     */
    public void setTotalSetSize(org.apache.axis.types.NonNegativeInteger totalSetSize) {
        this.totalSetSize = totalSetSize;
    }


    /**
     * Gets the startAtIndex value for this GetSharedAccessResult.
     * 
     * @return startAtIndex
     */
    public org.apache.axis.types.NonNegativeInteger getStartAtIndex() {
        return startAtIndex;
    }


    /**
     * Sets the startAtIndex value for this GetSharedAccessResult.
     * 
     * @param startAtIndex
     */
    public void setStartAtIndex(org.apache.axis.types.NonNegativeInteger startAtIndex) {
        this.startAtIndex = startAtIndex;
    }


    /**
     * Gets the endAtIndex value for this GetSharedAccessResult.
     * 
     * @return endAtIndex
     */
    public org.apache.axis.types.NonNegativeInteger getEndAtIndex() {
        return endAtIndex;
    }


    /**
     * Sets the endAtIndex value for this GetSharedAccessResult.
     * 
     * @param endAtIndex
     */
    public void setEndAtIndex(org.apache.axis.types.NonNegativeInteger endAtIndex) {
        this.endAtIndex = endAtIndex;
    }


    /**
     * Gets the sharedItems value for this GetSharedAccessResult.
     * 
     * @return sharedItems
     */
    public net.docusign.www.API._3_0.SharedAccessItemResult[] getSharedItems() {
        return sharedItems;
    }


    /**
     * Sets the sharedItems value for this GetSharedAccessResult.
     * 
     * @param sharedItems
     */
    public void setSharedItems(net.docusign.www.API._3_0.SharedAccessItemResult[] sharedItems) {
        this.sharedItems = sharedItems;
    }

    public net.docusign.www.API._3_0.SharedAccessItemResult getSharedItems(int i) {
        return this.sharedItems[i];
    }

    public void setSharedItems(int i, net.docusign.www.API._3_0.SharedAccessItemResult _value) {
        this.sharedItems[i] = _value;
    }


    /**
     * Gets the errorDetails value for this GetSharedAccessResult.
     * 
     * @return errorDetails
     */
    public net.docusign.www.API._3_0.ErrorDetails getErrorDetails() {
        return errorDetails;
    }


    /**
     * Sets the errorDetails value for this GetSharedAccessResult.
     * 
     * @param errorDetails
     */
    public void setErrorDetails(net.docusign.www.API._3_0.ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSharedAccessResult)) return false;
        GetSharedAccessResult other = (GetSharedAccessResult) obj;
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
            ((this.resultSetSize==null && other.getResultSetSize()==null) || 
             (this.resultSetSize!=null &&
              this.resultSetSize.equals(other.getResultSetSize()))) &&
            ((this.totalSetSize==null && other.getTotalSetSize()==null) || 
             (this.totalSetSize!=null &&
              this.totalSetSize.equals(other.getTotalSetSize()))) &&
            ((this.startAtIndex==null && other.getStartAtIndex()==null) || 
             (this.startAtIndex!=null &&
              this.startAtIndex.equals(other.getStartAtIndex()))) &&
            ((this.endAtIndex==null && other.getEndAtIndex()==null) || 
             (this.endAtIndex!=null &&
              this.endAtIndex.equals(other.getEndAtIndex()))) &&
            ((this.sharedItems==null && other.getSharedItems()==null) || 
             (this.sharedItems!=null &&
              java.util.Arrays.equals(this.sharedItems, other.getSharedItems()))) &&
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getResultSetSize() != null) {
            _hashCode += getResultSetSize().hashCode();
        }
        if (getTotalSetSize() != null) {
            _hashCode += getTotalSetSize().hashCode();
        }
        if (getStartAtIndex() != null) {
            _hashCode += getStartAtIndex().hashCode();
        }
        if (getEndAtIndex() != null) {
            _hashCode += getEndAtIndex().hashCode();
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
        if (getErrorDetails() != null) {
            _hashCode += getErrorDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSharedAccessResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetSharedAccessResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultSetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ResultSetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TotalSetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startAtIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "StartAtIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endAtIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EndAtIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SharedAccessItemResult"));
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
