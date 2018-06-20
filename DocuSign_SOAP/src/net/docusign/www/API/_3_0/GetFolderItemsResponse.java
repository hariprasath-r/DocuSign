/**
 * GetFolderItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class GetFolderItemsResponse  implements java.io.Serializable {
    private net.docusign.www.API._3_0.FolderResults getFolderItemsResult;

    public GetFolderItemsResponse() {
    }

    public GetFolderItemsResponse(
           net.docusign.www.API._3_0.FolderResults getFolderItemsResult) {
           this.getFolderItemsResult = getFolderItemsResult;
    }


    /**
     * Gets the getFolderItemsResult value for this GetFolderItemsResponse.
     * 
     * @return getFolderItemsResult
     */
    public net.docusign.www.API._3_0.FolderResults getGetFolderItemsResult() {
        return getFolderItemsResult;
    }


    /**
     * Sets the getFolderItemsResult value for this GetFolderItemsResponse.
     * 
     * @param getFolderItemsResult
     */
    public void setGetFolderItemsResult(net.docusign.www.API._3_0.FolderResults getFolderItemsResult) {
        this.getFolderItemsResult = getFolderItemsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFolderItemsResponse)) return false;
        GetFolderItemsResponse other = (GetFolderItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getFolderItemsResult==null && other.getGetFolderItemsResult()==null) || 
             (this.getFolderItemsResult!=null &&
              this.getFolderItemsResult.equals(other.getGetFolderItemsResult())));
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
        if (getGetFolderItemsResult() != null) {
            _hashCode += getGetFolderItemsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFolderItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetFolderItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFolderItemsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "GetFolderItemsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderResults"));
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
