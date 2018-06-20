/**
 * GetConnectFailures.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class GetConnectFailures  implements java.io.Serializable {
    private net.docusign.www.API._3_0.ConnectFailuresFilter connectFailuresFilter;

    public GetConnectFailures() {
    }

    public GetConnectFailures(
           net.docusign.www.API._3_0.ConnectFailuresFilter connectFailuresFilter) {
           this.connectFailuresFilter = connectFailuresFilter;
    }


    /**
     * Gets the connectFailuresFilter value for this GetConnectFailures.
     * 
     * @return connectFailuresFilter
     */
    public net.docusign.www.API._3_0.ConnectFailuresFilter getConnectFailuresFilter() {
        return connectFailuresFilter;
    }


    /**
     * Sets the connectFailuresFilter value for this GetConnectFailures.
     * 
     * @param connectFailuresFilter
     */
    public void setConnectFailuresFilter(net.docusign.www.API._3_0.ConnectFailuresFilter connectFailuresFilter) {
        this.connectFailuresFilter = connectFailuresFilter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetConnectFailures)) return false;
        GetConnectFailures other = (GetConnectFailures) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.connectFailuresFilter==null && other.getConnectFailuresFilter()==null) || 
             (this.connectFailuresFilter!=null &&
              this.connectFailuresFilter.equals(other.getConnectFailuresFilter())));
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
        if (getConnectFailuresFilter() != null) {
            _hashCode += getConnectFailuresFilter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetConnectFailures.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", ">GetConnectFailures"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectFailuresFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailuresFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ConnectFailuresFilter"));
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
