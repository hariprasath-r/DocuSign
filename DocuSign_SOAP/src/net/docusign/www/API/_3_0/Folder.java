/**
 * Folder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Folder  implements java.io.Serializable {
    private net.docusign.www.API._3_0.UserInfo folderOwner;

    private net.docusign.www.API._3_0.FolderTypeInfo folderTypeInfo;

    public Folder() {
    }

    public Folder(
           net.docusign.www.API._3_0.UserInfo folderOwner,
           net.docusign.www.API._3_0.FolderTypeInfo folderTypeInfo) {
           this.folderOwner = folderOwner;
           this.folderTypeInfo = folderTypeInfo;
    }


    /**
     * Gets the folderOwner value for this Folder.
     * 
     * @return folderOwner
     */
    public net.docusign.www.API._3_0.UserInfo getFolderOwner() {
        return folderOwner;
    }


    /**
     * Sets the folderOwner value for this Folder.
     * 
     * @param folderOwner
     */
    public void setFolderOwner(net.docusign.www.API._3_0.UserInfo folderOwner) {
        this.folderOwner = folderOwner;
    }


    /**
     * Gets the folderTypeInfo value for this Folder.
     * 
     * @return folderTypeInfo
     */
    public net.docusign.www.API._3_0.FolderTypeInfo getFolderTypeInfo() {
        return folderTypeInfo;
    }


    /**
     * Sets the folderTypeInfo value for this Folder.
     * 
     * @param folderTypeInfo
     */
    public void setFolderTypeInfo(net.docusign.www.API._3_0.FolderTypeInfo folderTypeInfo) {
        this.folderTypeInfo = folderTypeInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Folder)) return false;
        Folder other = (Folder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.folderOwner==null && other.getFolderOwner()==null) || 
             (this.folderOwner!=null &&
              this.folderOwner.equals(other.getFolderOwner()))) &&
            ((this.folderTypeInfo==null && other.getFolderTypeInfo()==null) || 
             (this.folderTypeInfo!=null &&
              this.folderTypeInfo.equals(other.getFolderTypeInfo())));
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
        if (getFolderOwner() != null) {
            _hashCode += getFolderOwner().hashCode();
        }
        if (getFolderTypeInfo() != null) {
            _hashCode += getFolderTypeInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Folder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Folder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
