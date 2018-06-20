/**
 * PhoneNumberDesignation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class PhoneNumberDesignation implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PhoneNumberDesignation(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Home = "Home";
    public static final java.lang.String _Mobile = "Mobile";
    public static final java.lang.String _Work = "Work";
    public static final java.lang.String _Other = "Other";
    public static final java.lang.String _Fax = "Fax";
    public static final PhoneNumberDesignation Home = new PhoneNumberDesignation(_Home);
    public static final PhoneNumberDesignation Mobile = new PhoneNumberDesignation(_Mobile);
    public static final PhoneNumberDesignation Work = new PhoneNumberDesignation(_Work);
    public static final PhoneNumberDesignation Other = new PhoneNumberDesignation(_Other);
    public static final PhoneNumberDesignation Fax = new PhoneNumberDesignation(_Fax);
    public java.lang.String getValue() { return _value_;}
    public static PhoneNumberDesignation fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PhoneNumberDesignation enumeration = (PhoneNumberDesignation)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PhoneNumberDesignation fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PhoneNumberDesignation.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PhoneNumberDesignation"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
