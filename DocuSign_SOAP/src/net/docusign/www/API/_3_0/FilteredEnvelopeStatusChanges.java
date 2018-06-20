/**
 * FilteredEnvelopeStatusChanges.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class FilteredEnvelopeStatusChanges  implements java.io.Serializable {
    private int resultSetSize;

    private net.docusign.www.API._3_0.EnvelopeStatusChange[] envelopeStatusChanges;

    public FilteredEnvelopeStatusChanges() {
    }

    public FilteredEnvelopeStatusChanges(
           int resultSetSize,
           net.docusign.www.API._3_0.EnvelopeStatusChange[] envelopeStatusChanges) {
           this.resultSetSize = resultSetSize;
           this.envelopeStatusChanges = envelopeStatusChanges;
    }


    /**
     * Gets the resultSetSize value for this FilteredEnvelopeStatusChanges.
     * 
     * @return resultSetSize
     */
    public int getResultSetSize() {
        return resultSetSize;
    }


    /**
     * Sets the resultSetSize value for this FilteredEnvelopeStatusChanges.
     * 
     * @param resultSetSize
     */
    public void setResultSetSize(int resultSetSize) {
        this.resultSetSize = resultSetSize;
    }


    /**
     * Gets the envelopeStatusChanges value for this FilteredEnvelopeStatusChanges.
     * 
     * @return envelopeStatusChanges
     */
    public net.docusign.www.API._3_0.EnvelopeStatusChange[] getEnvelopeStatusChanges() {
        return envelopeStatusChanges;
    }


    /**
     * Sets the envelopeStatusChanges value for this FilteredEnvelopeStatusChanges.
     * 
     * @param envelopeStatusChanges
     */
    public void setEnvelopeStatusChanges(net.docusign.www.API._3_0.EnvelopeStatusChange[] envelopeStatusChanges) {
        this.envelopeStatusChanges = envelopeStatusChanges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilteredEnvelopeStatusChanges)) return false;
        FilteredEnvelopeStatusChanges other = (FilteredEnvelopeStatusChanges) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.resultSetSize == other.getResultSetSize() &&
            ((this.envelopeStatusChanges==null && other.getEnvelopeStatusChanges()==null) || 
             (this.envelopeStatusChanges!=null &&
              java.util.Arrays.equals(this.envelopeStatusChanges, other.getEnvelopeStatusChanges())));
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
        _hashCode += getResultSetSize();
        if (getEnvelopeStatusChanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvelopeStatusChanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvelopeStatusChanges(), i);
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
        new org.apache.axis.description.TypeDesc(FilteredEnvelopeStatusChanges.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FilteredEnvelopeStatusChanges"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultSetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ResultSetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeStatusChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChange"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusChange"));
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
