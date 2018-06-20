/**
 * AnchorTab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class AnchorTab  implements java.io.Serializable {
    private java.lang.String anchorTabString;

    private java.lang.Double XOffset;

    private java.lang.Double YOffset;

    private net.docusign.www.API._3_0.UnitTypeCode unit;

    private java.lang.Boolean ignoreIfNotPresent;

    private java.lang.Boolean matchWholeWord;

    private java.lang.Boolean caseSensitive;

    private net.docusign.www.API._3_0.AnchorTabProcessorVersion anchorTabProcessorVersion;

    private net.docusign.www.API._3_0.HorizontalAlignmentType horizontalAlignment;

    public AnchorTab() {
    }

    public AnchorTab(
           java.lang.String anchorTabString,
           java.lang.Double XOffset,
           java.lang.Double YOffset,
           net.docusign.www.API._3_0.UnitTypeCode unit,
           java.lang.Boolean ignoreIfNotPresent,
           java.lang.Boolean matchWholeWord,
           java.lang.Boolean caseSensitive,
           net.docusign.www.API._3_0.AnchorTabProcessorVersion anchorTabProcessorVersion,
           net.docusign.www.API._3_0.HorizontalAlignmentType horizontalAlignment) {
           this.anchorTabString = anchorTabString;
           this.XOffset = XOffset;
           this.YOffset = YOffset;
           this.unit = unit;
           this.ignoreIfNotPresent = ignoreIfNotPresent;
           this.matchWholeWord = matchWholeWord;
           this.caseSensitive = caseSensitive;
           this.anchorTabProcessorVersion = anchorTabProcessorVersion;
           this.horizontalAlignment = horizontalAlignment;
    }


    /**
     * Gets the anchorTabString value for this AnchorTab.
     * 
     * @return anchorTabString
     */
    public java.lang.String getAnchorTabString() {
        return anchorTabString;
    }


    /**
     * Sets the anchorTabString value for this AnchorTab.
     * 
     * @param anchorTabString
     */
    public void setAnchorTabString(java.lang.String anchorTabString) {
        this.anchorTabString = anchorTabString;
    }


    /**
     * Gets the XOffset value for this AnchorTab.
     * 
     * @return XOffset
     */
    public java.lang.Double getXOffset() {
        return XOffset;
    }


    /**
     * Sets the XOffset value for this AnchorTab.
     * 
     * @param XOffset
     */
    public void setXOffset(java.lang.Double XOffset) {
        this.XOffset = XOffset;
    }


    /**
     * Gets the YOffset value for this AnchorTab.
     * 
     * @return YOffset
     */
    public java.lang.Double getYOffset() {
        return YOffset;
    }


    /**
     * Sets the YOffset value for this AnchorTab.
     * 
     * @param YOffset
     */
    public void setYOffset(java.lang.Double YOffset) {
        this.YOffset = YOffset;
    }


    /**
     * Gets the unit value for this AnchorTab.
     * 
     * @return unit
     */
    public net.docusign.www.API._3_0.UnitTypeCode getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this AnchorTab.
     * 
     * @param unit
     */
    public void setUnit(net.docusign.www.API._3_0.UnitTypeCode unit) {
        this.unit = unit;
    }


    /**
     * Gets the ignoreIfNotPresent value for this AnchorTab.
     * 
     * @return ignoreIfNotPresent
     */
    public java.lang.Boolean getIgnoreIfNotPresent() {
        return ignoreIfNotPresent;
    }


    /**
     * Sets the ignoreIfNotPresent value for this AnchorTab.
     * 
     * @param ignoreIfNotPresent
     */
    public void setIgnoreIfNotPresent(java.lang.Boolean ignoreIfNotPresent) {
        this.ignoreIfNotPresent = ignoreIfNotPresent;
    }


    /**
     * Gets the matchWholeWord value for this AnchorTab.
     * 
     * @return matchWholeWord
     */
    public java.lang.Boolean getMatchWholeWord() {
        return matchWholeWord;
    }


    /**
     * Sets the matchWholeWord value for this AnchorTab.
     * 
     * @param matchWholeWord
     */
    public void setMatchWholeWord(java.lang.Boolean matchWholeWord) {
        this.matchWholeWord = matchWholeWord;
    }


    /**
     * Gets the caseSensitive value for this AnchorTab.
     * 
     * @return caseSensitive
     */
    public java.lang.Boolean getCaseSensitive() {
        return caseSensitive;
    }


    /**
     * Sets the caseSensitive value for this AnchorTab.
     * 
     * @param caseSensitive
     */
    public void setCaseSensitive(java.lang.Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }


    /**
     * Gets the anchorTabProcessorVersion value for this AnchorTab.
     * 
     * @return anchorTabProcessorVersion
     */
    public net.docusign.www.API._3_0.AnchorTabProcessorVersion getAnchorTabProcessorVersion() {
        return anchorTabProcessorVersion;
    }


    /**
     * Sets the anchorTabProcessorVersion value for this AnchorTab.
     * 
     * @param anchorTabProcessorVersion
     */
    public void setAnchorTabProcessorVersion(net.docusign.www.API._3_0.AnchorTabProcessorVersion anchorTabProcessorVersion) {
        this.anchorTabProcessorVersion = anchorTabProcessorVersion;
    }


    /**
     * Gets the horizontalAlignment value for this AnchorTab.
     * 
     * @return horizontalAlignment
     */
    public net.docusign.www.API._3_0.HorizontalAlignmentType getHorizontalAlignment() {
        return horizontalAlignment;
    }


    /**
     * Sets the horizontalAlignment value for this AnchorTab.
     * 
     * @param horizontalAlignment
     */
    public void setHorizontalAlignment(net.docusign.www.API._3_0.HorizontalAlignmentType horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnchorTab)) return false;
        AnchorTab other = (AnchorTab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anchorTabString==null && other.getAnchorTabString()==null) || 
             (this.anchorTabString!=null &&
              this.anchorTabString.equals(other.getAnchorTabString()))) &&
            ((this.XOffset==null && other.getXOffset()==null) || 
             (this.XOffset!=null &&
              this.XOffset.equals(other.getXOffset()))) &&
            ((this.YOffset==null && other.getYOffset()==null) || 
             (this.YOffset!=null &&
              this.YOffset.equals(other.getYOffset()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.ignoreIfNotPresent==null && other.getIgnoreIfNotPresent()==null) || 
             (this.ignoreIfNotPresent!=null &&
              this.ignoreIfNotPresent.equals(other.getIgnoreIfNotPresent()))) &&
            ((this.matchWholeWord==null && other.getMatchWholeWord()==null) || 
             (this.matchWholeWord!=null &&
              this.matchWholeWord.equals(other.getMatchWholeWord()))) &&
            ((this.caseSensitive==null && other.getCaseSensitive()==null) || 
             (this.caseSensitive!=null &&
              this.caseSensitive.equals(other.getCaseSensitive()))) &&
            ((this.anchorTabProcessorVersion==null && other.getAnchorTabProcessorVersion()==null) || 
             (this.anchorTabProcessorVersion!=null &&
              this.anchorTabProcessorVersion.equals(other.getAnchorTabProcessorVersion()))) &&
            ((this.horizontalAlignment==null && other.getHorizontalAlignment()==null) || 
             (this.horizontalAlignment!=null &&
              this.horizontalAlignment.equals(other.getHorizontalAlignment())));
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
        if (getAnchorTabString() != null) {
            _hashCode += getAnchorTabString().hashCode();
        }
        if (getXOffset() != null) {
            _hashCode += getXOffset().hashCode();
        }
        if (getYOffset() != null) {
            _hashCode += getYOffset().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getIgnoreIfNotPresent() != null) {
            _hashCode += getIgnoreIfNotPresent().hashCode();
        }
        if (getMatchWholeWord() != null) {
            _hashCode += getMatchWholeWord().hashCode();
        }
        if (getCaseSensitive() != null) {
            _hashCode += getCaseSensitive().hashCode();
        }
        if (getAnchorTabProcessorVersion() != null) {
            _hashCode += getAnchorTabProcessorVersion().hashCode();
        }
        if (getHorizontalAlignment() != null) {
            _hashCode += getHorizontalAlignment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnchorTab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anchorTabString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTabString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "XOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "YOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "UnitTypeCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreIfNotPresent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "IgnoreIfNotPresent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchWholeWord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchWholeWord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseSensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "CaseSensitive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anchorTabProcessorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTabProcessorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AnchorTabProcessorVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horizontalAlignment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "HorizontalAlignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "HorizontalAlignmentType"));
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
