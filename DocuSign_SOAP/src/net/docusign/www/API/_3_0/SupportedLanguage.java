/**
 * SupportedLanguage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class SupportedLanguage implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SupportedLanguage(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ar = "ar";
    public static final java.lang.String _bg = "bg";
    public static final java.lang.String _cs = "cs";
    public static final java.lang.String _da = "da";
    public static final java.lang.String _de = "de";
    public static final java.lang.String _el = "el";
    public static final java.lang.String _en = "en";
    public static final java.lang.String _en_GB = "en_GB";
    public static final java.lang.String _es = "es";
    public static final java.lang.String _es_MX = "es_MX";
    public static final java.lang.String _et = "et";
    public static final java.lang.String _fa = "fa";
    public static final java.lang.String _fi = "fi";
    public static final java.lang.String _fr = "fr";
    public static final java.lang.String _fr_CA = "fr_CA";
    public static final java.lang.String _he = "he";
    public static final java.lang.String _hi = "hi";
    public static final java.lang.String _hr = "hr";
    public static final java.lang.String _hu = "hu";
    public static final java.lang.String _id = "id";
    public static final java.lang.String _it = "it";
    public static final java.lang.String _ja = "ja";
    public static final java.lang.String _ko = "ko";
    public static final java.lang.String _lt = "lt";
    public static final java.lang.String _lv = "lv";
    public static final java.lang.String _ms = "ms";
    public static final java.lang.String _nl = "nl";
    public static final java.lang.String _no = "no";
    public static final java.lang.String _pl = "pl";
    public static final java.lang.String _pt = "pt";
    public static final java.lang.String _pt_BR = "pt_BR";
    public static final java.lang.String _ro = "ro";
    public static final java.lang.String _ru = "ru";
    public static final java.lang.String _sk = "sk";
    public static final java.lang.String _sl = "sl";
    public static final java.lang.String _sr = "sr";
    public static final java.lang.String _sv = "sv";
    public static final java.lang.String _th = "th";
    public static final java.lang.String _tr = "tr";
    public static final java.lang.String _uk = "uk";
    public static final java.lang.String _vi = "vi";
    public static final java.lang.String _zh_CN = "zh_CN";
    public static final java.lang.String _zh_TW = "zh_TW";
    public static final SupportedLanguage ar = new SupportedLanguage(_ar);
    public static final SupportedLanguage bg = new SupportedLanguage(_bg);
    public static final SupportedLanguage cs = new SupportedLanguage(_cs);
    public static final SupportedLanguage da = new SupportedLanguage(_da);
    public static final SupportedLanguage de = new SupportedLanguage(_de);
    public static final SupportedLanguage el = new SupportedLanguage(_el);
    public static final SupportedLanguage en = new SupportedLanguage(_en);
    public static final SupportedLanguage en_GB = new SupportedLanguage(_en_GB);
    public static final SupportedLanguage es = new SupportedLanguage(_es);
    public static final SupportedLanguage es_MX = new SupportedLanguage(_es_MX);
    public static final SupportedLanguage et = new SupportedLanguage(_et);
    public static final SupportedLanguage fa = new SupportedLanguage(_fa);
    public static final SupportedLanguage fi = new SupportedLanguage(_fi);
    public static final SupportedLanguage fr = new SupportedLanguage(_fr);
    public static final SupportedLanguage fr_CA = new SupportedLanguage(_fr_CA);
    public static final SupportedLanguage he = new SupportedLanguage(_he);
    public static final SupportedLanguage hi = new SupportedLanguage(_hi);
    public static final SupportedLanguage hr = new SupportedLanguage(_hr);
    public static final SupportedLanguage hu = new SupportedLanguage(_hu);
    public static final SupportedLanguage id = new SupportedLanguage(_id);
    public static final SupportedLanguage it = new SupportedLanguage(_it);
    public static final SupportedLanguage ja = new SupportedLanguage(_ja);
    public static final SupportedLanguage ko = new SupportedLanguage(_ko);
    public static final SupportedLanguage lt = new SupportedLanguage(_lt);
    public static final SupportedLanguage lv = new SupportedLanguage(_lv);
    public static final SupportedLanguage ms = new SupportedLanguage(_ms);
    public static final SupportedLanguage nl = new SupportedLanguage(_nl);
    public static final SupportedLanguage no = new SupportedLanguage(_no);
    public static final SupportedLanguage pl = new SupportedLanguage(_pl);
    public static final SupportedLanguage pt = new SupportedLanguage(_pt);
    public static final SupportedLanguage pt_BR = new SupportedLanguage(_pt_BR);
    public static final SupportedLanguage ro = new SupportedLanguage(_ro);
    public static final SupportedLanguage ru = new SupportedLanguage(_ru);
    public static final SupportedLanguage sk = new SupportedLanguage(_sk);
    public static final SupportedLanguage sl = new SupportedLanguage(_sl);
    public static final SupportedLanguage sr = new SupportedLanguage(_sr);
    public static final SupportedLanguage sv = new SupportedLanguage(_sv);
    public static final SupportedLanguage th = new SupportedLanguage(_th);
    public static final SupportedLanguage tr = new SupportedLanguage(_tr);
    public static final SupportedLanguage uk = new SupportedLanguage(_uk);
    public static final SupportedLanguage vi = new SupportedLanguage(_vi);
    public static final SupportedLanguage zh_CN = new SupportedLanguage(_zh_CN);
    public static final SupportedLanguage zh_TW = new SupportedLanguage(_zh_TW);
    public java.lang.String getValue() { return _value_;}
    public static SupportedLanguage fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SupportedLanguage enumeration = (SupportedLanguage)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SupportedLanguage fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SupportedLanguage.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "SupportedLanguage"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
