/**
 * FontSize.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class FontSize implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FontSize(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Size7 = "Size7";
    public static final java.lang.String _Size8 = "Size8";
    public static final java.lang.String _Size9 = "Size9";
    public static final java.lang.String _Size10 = "Size10";
    public static final java.lang.String _Size11 = "Size11";
    public static final java.lang.String _Size12 = "Size12";
    public static final java.lang.String _Size14 = "Size14";
    public static final java.lang.String _Size16 = "Size16";
    public static final java.lang.String _Size18 = "Size18";
    public static final java.lang.String _Size20 = "Size20";
    public static final java.lang.String _Size22 = "Size22";
    public static final java.lang.String _Size24 = "Size24";
    public static final java.lang.String _Size26 = "Size26";
    public static final java.lang.String _Size28 = "Size28";
    public static final java.lang.String _Size36 = "Size36";
    public static final java.lang.String _Size48 = "Size48";
    public static final java.lang.String _Size72 = "Size72";
    public static final FontSize Size7 = new FontSize(_Size7);
    public static final FontSize Size8 = new FontSize(_Size8);
    public static final FontSize Size9 = new FontSize(_Size9);
    public static final FontSize Size10 = new FontSize(_Size10);
    public static final FontSize Size11 = new FontSize(_Size11);
    public static final FontSize Size12 = new FontSize(_Size12);
    public static final FontSize Size14 = new FontSize(_Size14);
    public static final FontSize Size16 = new FontSize(_Size16);
    public static final FontSize Size18 = new FontSize(_Size18);
    public static final FontSize Size20 = new FontSize(_Size20);
    public static final FontSize Size22 = new FontSize(_Size22);
    public static final FontSize Size24 = new FontSize(_Size24);
    public static final FontSize Size26 = new FontSize(_Size26);
    public static final FontSize Size28 = new FontSize(_Size28);
    public static final FontSize Size36 = new FontSize(_Size36);
    public static final FontSize Size48 = new FontSize(_Size48);
    public static final FontSize Size72 = new FontSize(_Size72);
    public java.lang.String getValue() { return _value_;}
    public static FontSize fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FontSize enumeration = (FontSize)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FontSize fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FontSize.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FontSize"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
