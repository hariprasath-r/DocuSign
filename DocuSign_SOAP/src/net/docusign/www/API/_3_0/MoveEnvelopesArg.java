/**
 * MoveEnvelopesArg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class MoveEnvelopesArg  implements java.io.Serializable {
    private java.lang.String[] envelopeIds;

    private java.lang.String accountId;

    private net.docusign.www.API._3_0.FolderTypeInfo folderFrom;

    private net.docusign.www.API._3_0.FolderTypeInfo folderTo;

    public MoveEnvelopesArg() {
    }

    public MoveEnvelopesArg(
           java.lang.String[] envelopeIds,
           java.lang.String accountId,
           net.docusign.www.API._3_0.FolderTypeInfo folderFrom,
           net.docusign.www.API._3_0.FolderTypeInfo folderTo) {
           this.envelopeIds = envelopeIds;
           this.accountId = accountId;
           this.folderFrom = folderFrom;
           this.folderTo = folderTo;
    }


    /**
     * Gets the envelopeIds value for this MoveEnvelopesArg.
     * 
     * @return envelopeIds
     */
    public java.lang.String[] getEnvelopeIds() {
        return envelopeIds;
    }


    /**
     * Sets the envelopeIds value for this MoveEnvelopesArg.
     * 
     * @param envelopeIds
     */
    public void setEnvelopeIds(java.lang.String[] envelopeIds) {
        this.envelopeIds = envelopeIds;
    }


    /**
     * Gets the accountId value for this MoveEnvelopesArg.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this MoveEnvelopesArg.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the folderFrom value for this MoveEnvelopesArg.
     * 
     * @return folderFrom
     */
    public net.docusign.www.API._3_0.FolderTypeInfo getFolderFrom() {
        return folderFrom;
    }


    /**
     * Sets the folderFrom value for this MoveEnvelopesArg.
     * 
     * @param folderFrom
     */
    public void setFolderFrom(net.docusign.www.API._3_0.FolderTypeInfo folderFrom) {
        this.folderFrom = folderFrom;
    }


    /**
     * Gets the folderTo value for this MoveEnvelopesArg.
     * 
     * @return folderTo
     */
    public net.docusign.www.API._3_0.FolderTypeInfo getFolderTo() {
        return folderTo;
    }


    /**
     * Sets the folderTo value for this MoveEnvelopesArg.
     * 
     * @param folderTo
     */
    public void setFolderTo(net.docusign.www.API._3_0.FolderTypeInfo folderTo) {
        this.folderTo = folderTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoveEnvelopesArg)) return false;
        MoveEnvelopesArg other = (MoveEnvelopesArg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.envelopeIds==null && other.getEnvelopeIds()==null) || 
             (this.envelopeIds!=null &&
              java.util.Arrays.equals(this.envelopeIds, other.getEnvelopeIds()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.folderFrom==null && other.getFolderFrom()==null) || 
             (this.folderFrom!=null &&
              this.folderFrom.equals(other.getFolderFrom()))) &&
            ((this.folderTo==null && other.getFolderTo()==null) || 
             (this.folderTo!=null &&
              this.folderTo.equals(other.getFolderTo())));
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
        if (getEnvelopeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvelopeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvelopeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getFolderFrom() != null) {
            _hashCode += getFolderFrom().hashCode();
        }
        if (getFolderTo() != null) {
            _hashCode += getFolderTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoveEnvelopesArg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MoveEnvelopesArg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderTypeInfo"));
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
