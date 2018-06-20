/**
 * FolderFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class FolderFilter  implements java.io.Serializable {
    private java.lang.String accountId;

    private net.docusign.www.API._3_0.UserInfo folderOwner;

    private net.docusign.www.API._3_0.FolderTypeInfo folderTypeInfo;

    private java.lang.Integer startPosition;

    private java.util.Calendar fromDate;

    private java.util.Calendar toDate;

    private java.lang.String searchText;

    private net.docusign.www.API._3_0.EnvelopeStatusCode status;

    public FolderFilter() {
    }

    public FolderFilter(
           java.lang.String accountId,
           net.docusign.www.API._3_0.UserInfo folderOwner,
           net.docusign.www.API._3_0.FolderTypeInfo folderTypeInfo,
           java.lang.Integer startPosition,
           java.util.Calendar fromDate,
           java.util.Calendar toDate,
           java.lang.String searchText,
           net.docusign.www.API._3_0.EnvelopeStatusCode status) {
           this.accountId = accountId;
           this.folderOwner = folderOwner;
           this.folderTypeInfo = folderTypeInfo;
           this.startPosition = startPosition;
           this.fromDate = fromDate;
           this.toDate = toDate;
           this.searchText = searchText;
           this.status = status;
    }


    /**
     * Gets the accountId value for this FolderFilter.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this FolderFilter.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the folderOwner value for this FolderFilter.
     * 
     * @return folderOwner
     */
    public net.docusign.www.API._3_0.UserInfo getFolderOwner() {
        return folderOwner;
    }


    /**
     * Sets the folderOwner value for this FolderFilter.
     * 
     * @param folderOwner
     */
    public void setFolderOwner(net.docusign.www.API._3_0.UserInfo folderOwner) {
        this.folderOwner = folderOwner;
    }


    /**
     * Gets the folderTypeInfo value for this FolderFilter.
     * 
     * @return folderTypeInfo
     */
    public net.docusign.www.API._3_0.FolderTypeInfo getFolderTypeInfo() {
        return folderTypeInfo;
    }


    /**
     * Sets the folderTypeInfo value for this FolderFilter.
     * 
     * @param folderTypeInfo
     */
    public void setFolderTypeInfo(net.docusign.www.API._3_0.FolderTypeInfo folderTypeInfo) {
        this.folderTypeInfo = folderTypeInfo;
    }


    /**
     * Gets the startPosition value for this FolderFilter.
     * 
     * @return startPosition
     */
    public java.lang.Integer getStartPosition() {
        return startPosition;
    }


    /**
     * Sets the startPosition value for this FolderFilter.
     * 
     * @param startPosition
     */
    public void setStartPosition(java.lang.Integer startPosition) {
        this.startPosition = startPosition;
    }


    /**
     * Gets the fromDate value for this FolderFilter.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this FolderFilter.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the toDate value for this FolderFilter.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this FolderFilter.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }


    /**
     * Gets the searchText value for this FolderFilter.
     * 
     * @return searchText
     */
    public java.lang.String getSearchText() {
        return searchText;
    }


    /**
     * Sets the searchText value for this FolderFilter.
     * 
     * @param searchText
     */
    public void setSearchText(java.lang.String searchText) {
        this.searchText = searchText;
    }


    /**
     * Gets the status value for this FolderFilter.
     * 
     * @return status
     */
    public net.docusign.www.API._3_0.EnvelopeStatusCode getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FolderFilter.
     * 
     * @param status
     */
    public void setStatus(net.docusign.www.API._3_0.EnvelopeStatusCode status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FolderFilter)) return false;
        FolderFilter other = (FolderFilter) obj;
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
            ((this.folderOwner==null && other.getFolderOwner()==null) || 
             (this.folderOwner!=null &&
              this.folderOwner.equals(other.getFolderOwner()))) &&
            ((this.folderTypeInfo==null && other.getFolderTypeInfo()==null) || 
             (this.folderTypeInfo!=null &&
              this.folderTypeInfo.equals(other.getFolderTypeInfo()))) &&
            ((this.startPosition==null && other.getStartPosition()==null) || 
             (this.startPosition!=null &&
              this.startPosition.equals(other.getStartPosition()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate()))) &&
            ((this.searchText==null && other.getSearchText()==null) || 
             (this.searchText!=null &&
              this.searchText.equals(other.getSearchText()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getFolderOwner() != null) {
            _hashCode += getFolderOwner().hashCode();
        }
        if (getFolderTypeInfo() != null) {
            _hashCode += getFolderTypeInfo().hashCode();
        }
        if (getStartPosition() != null) {
            _hashCode += getStartPosition().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        if (getSearchText() != null) {
            _hashCode += getSearchText().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FolderFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UserInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderTypeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderTypeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "StartPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusCode"));
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
