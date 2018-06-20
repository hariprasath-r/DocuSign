/**
 * FontColor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class FontColor implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FontColor(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Black = "Black";
    public static final java.lang.String _BrightBlue = "BrightBlue";
    public static final java.lang.String _BrightRed = "BrightRed";
    public static final java.lang.String _DarkRed = "DarkRed";
    public static final java.lang.String _DarkGreen = "DarkGreen";
    public static final java.lang.String _Gold = "Gold";
    public static final java.lang.String _Green = "Green";
    public static final java.lang.String _NavyBlue = "NavyBlue";
    public static final java.lang.String _Purple = "Purple";
    public static final java.lang.String _White = "White";
    public static final FontColor Black = new FontColor(_Black);
    public static final FontColor BrightBlue = new FontColor(_BrightBlue);
    public static final FontColor BrightRed = new FontColor(_BrightRed);
    public static final FontColor DarkRed = new FontColor(_DarkRed);
    public static final FontColor DarkGreen = new FontColor(_DarkGreen);
    public static final FontColor Gold = new FontColor(_Gold);
    public static final FontColor Green = new FontColor(_Green);
    public static final FontColor NavyBlue = new FontColor(_NavyBlue);
    public static final FontColor Purple = new FontColor(_Purple);
    public static final FontColor White = new FontColor(_White);
    public java.lang.String getValue() { return _value_;}
    public static FontColor fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FontColor enumeration = (FontColor)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FontColor fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FontColor.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FontColor"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
