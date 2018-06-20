/**
 * FontStyleCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class FontStyleCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FontStyleCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RageItalic = "RageItalic";
    public static final java.lang.String _Mistral = "Mistral";
    public static final java.lang.String _BradleyHandITC = "BradleyHandITC";
    public static final java.lang.String _KaufmannBT = "KaufmannBT";
    public static final java.lang.String _Freehand575 = "Freehand575";
    public static final java.lang.String _LuciaBT = "LuciaBT";
    public static final java.lang.String _DocuSign1 = "DocuSign1";
    public static final java.lang.String _DocuSign2 = "DocuSign2";
    public static final java.lang.String _DocuSign3 = "DocuSign3";
    public static final java.lang.String _DocuSign4 = "DocuSign4";
    public static final java.lang.String _DocuSign5 = "DocuSign5";
    public static final java.lang.String _DocuSign6 = "DocuSign6";
    public static final java.lang.String _DocuSign7 = "DocuSign7";
    public static final java.lang.String _DocuSign8 = "DocuSign8";
    public static final java.lang.String _TAYubiHyojyunKaisyo = "TAYubiHyojyunKaisyo";
    public static final java.lang.String _TASourinFude02 = "TASourinFude02";
    public static final java.lang.String _TAAkiko = "TAAkiko";
    public static final java.lang.String _TAAsako = "TAAsako";
    public static final FontStyleCode RageItalic = new FontStyleCode(_RageItalic);
    public static final FontStyleCode Mistral = new FontStyleCode(_Mistral);
    public static final FontStyleCode BradleyHandITC = new FontStyleCode(_BradleyHandITC);
    public static final FontStyleCode KaufmannBT = new FontStyleCode(_KaufmannBT);
    public static final FontStyleCode Freehand575 = new FontStyleCode(_Freehand575);
    public static final FontStyleCode LuciaBT = new FontStyleCode(_LuciaBT);
    public static final FontStyleCode DocuSign1 = new FontStyleCode(_DocuSign1);
    public static final FontStyleCode DocuSign2 = new FontStyleCode(_DocuSign2);
    public static final FontStyleCode DocuSign3 = new FontStyleCode(_DocuSign3);
    public static final FontStyleCode DocuSign4 = new FontStyleCode(_DocuSign4);
    public static final FontStyleCode DocuSign5 = new FontStyleCode(_DocuSign5);
    public static final FontStyleCode DocuSign6 = new FontStyleCode(_DocuSign6);
    public static final FontStyleCode DocuSign7 = new FontStyleCode(_DocuSign7);
    public static final FontStyleCode DocuSign8 = new FontStyleCode(_DocuSign8);
    public static final FontStyleCode TAYubiHyojyunKaisyo = new FontStyleCode(_TAYubiHyojyunKaisyo);
    public static final FontStyleCode TASourinFude02 = new FontStyleCode(_TASourinFude02);
    public static final FontStyleCode TAAkiko = new FontStyleCode(_TAAkiko);
    public static final FontStyleCode TAAsako = new FontStyleCode(_TAAsako);
    public java.lang.String getValue() { return _value_;}
    public static FontStyleCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FontStyleCode enumeration = (FontStyleCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FontStyleCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FontStyleCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FontStyleCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
