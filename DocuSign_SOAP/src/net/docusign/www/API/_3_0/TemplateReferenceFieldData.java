/**
 * TemplateReferenceFieldData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class TemplateReferenceFieldData  implements java.io.Serializable {
    private net.docusign.www.API._3_0.TemplateReferenceFieldDataDataValue[] dataValues;

    public TemplateReferenceFieldData() {
    }

    public TemplateReferenceFieldData(
           net.docusign.www.API._3_0.TemplateReferenceFieldDataDataValue[] dataValues) {
           this.dataValues = dataValues;
    }


    /**
     * Gets the dataValues value for this TemplateReferenceFieldData.
     * 
     * @return dataValues
     */
    public net.docusign.www.API._3_0.TemplateReferenceFieldDataDataValue[] getDataValues() {
        return dataValues;
    }


    /**
     * Sets the dataValues value for this TemplateReferenceFieldData.
     * 
     * @param dataValues
     */
    public void setDataValues(net.docusign.www.API._3_0.TemplateReferenceFieldDataDataValue[] dataValues) {
        this.dataValues = dataValues;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateReferenceFieldData)) return false;
        TemplateReferenceFieldData other = (TemplateReferenceFieldData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataValues==null && other.getDataValues()==null) || 
             (this.dataValues!=null &&
              java.util.Arrays.equals(this.dataValues, other.getDataValues())));
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
        if (getDataValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataValues(), i);
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
        new org.apache.axis.description.TypeDesc(TemplateReferenceFieldData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferenceFieldData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DataValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TemplateReferenceFieldDataDataValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DataValue"));
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
