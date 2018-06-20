/**
 * Font.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Font implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Font(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Arial = "Arial";
    public static final java.lang.String _ArialNarrow = "ArialNarrow";
    public static final java.lang.String _Calibri = "Calibri";
    public static final java.lang.String _CourierNew = "CourierNew";
    public static final java.lang.String _Garamond = "Garamond";
    public static final java.lang.String _Georgia = "Georgia";
    public static final java.lang.String _Helvetica = "Helvetica";
    public static final java.lang.String _LucidaConsole = "LucidaConsole";
    public static final java.lang.String _Tahoma = "Tahoma";
    public static final java.lang.String _TimesNewRoman = "TimesNewRoman";
    public static final java.lang.String _Trebuchet = "Trebuchet";
    public static final java.lang.String _Verdana = "Verdana";
    public static final java.lang.String _MSGothic = "MSGothic";
    public static final java.lang.String _MSMincho = "MSMincho";
    public static final java.lang.String _OcrA = "OcrA";
    public static final Font Arial = new Font(_Arial);
    public static final Font ArialNarrow = new Font(_ArialNarrow);
    public static final Font Calibri = new Font(_Calibri);
    public static final Font CourierNew = new Font(_CourierNew);
    public static final Font Garamond = new Font(_Garamond);
    public static final Font Georgia = new Font(_Georgia);
    public static final Font Helvetica = new Font(_Helvetica);
    public static final Font LucidaConsole = new Font(_LucidaConsole);
    public static final Font Tahoma = new Font(_Tahoma);
    public static final Font TimesNewRoman = new Font(_TimesNewRoman);
    public static final Font Trebuchet = new Font(_Trebuchet);
    public static final Font Verdana = new Font(_Verdana);
    public static final Font MSGothic = new Font(_MSGothic);
    public static final Font MSMincho = new Font(_MSMincho);
    public static final Font OcrA = new Font(_OcrA);
    public java.lang.String getValue() { return _value_;}
    public static Font fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Font enumeration = (Font)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Font fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Font.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Font"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
