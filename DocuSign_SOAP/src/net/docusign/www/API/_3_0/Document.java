/**
 * Document.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class Document  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger ID;

    private java.lang.String name;

    private byte[] PDFBytes;

    private java.lang.String password;

    private java.lang.Boolean transformPdfFields;

    private java.lang.String fileExtension;

    private net.docusign.www.API._3_0.MatchBox[] matchBoxes;

    private java.lang.String attachmentDescription;

    private net.docusign.www.API._3_0.DocumentField[] documentFields;

    private java.lang.Boolean authoritativeCopy;

    public Document() {
    }

    public Document(
           org.apache.axis.types.PositiveInteger ID,
           java.lang.String name,
           byte[] PDFBytes,
           java.lang.String password,
           java.lang.Boolean transformPdfFields,
           java.lang.String fileExtension,
           net.docusign.www.API._3_0.MatchBox[] matchBoxes,
           java.lang.String attachmentDescription,
           net.docusign.www.API._3_0.DocumentField[] documentFields,
           java.lang.Boolean authoritativeCopy) {
           this.ID = ID;
           this.name = name;
           this.PDFBytes = PDFBytes;
           this.password = password;
           this.transformPdfFields = transformPdfFields;
           this.fileExtension = fileExtension;
           this.matchBoxes = matchBoxes;
           this.attachmentDescription = attachmentDescription;
           this.documentFields = documentFields;
           this.authoritativeCopy = authoritativeCopy;
    }


    /**
     * Gets the ID value for this Document.
     * 
     * @return ID
     */
    public org.apache.axis.types.PositiveInteger getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Document.
     * 
     * @param ID
     */
    public void setID(org.apache.axis.types.PositiveInteger ID) {
        this.ID = ID;
    }


    /**
     * Gets the name value for this Document.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Document.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the PDFBytes value for this Document.
     * 
     * @return PDFBytes
     */
    public byte[] getPDFBytes() {
        return PDFBytes;
    }


    /**
     * Sets the PDFBytes value for this Document.
     * 
     * @param PDFBytes
     */
    public void setPDFBytes(byte[] PDFBytes) {
        this.PDFBytes = PDFBytes;
    }


    /**
     * Gets the password value for this Document.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Document.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the transformPdfFields value for this Document.
     * 
     * @return transformPdfFields
     */
    public java.lang.Boolean getTransformPdfFields() {
        return transformPdfFields;
    }


    /**
     * Sets the transformPdfFields value for this Document.
     * 
     * @param transformPdfFields
     */
    public void setTransformPdfFields(java.lang.Boolean transformPdfFields) {
        this.transformPdfFields = transformPdfFields;
    }


    /**
     * Gets the fileExtension value for this Document.
     * 
     * @return fileExtension
     */
    public java.lang.String getFileExtension() {
        return fileExtension;
    }


    /**
     * Sets the fileExtension value for this Document.
     * 
     * @param fileExtension
     */
    public void setFileExtension(java.lang.String fileExtension) {
        this.fileExtension = fileExtension;
    }


    /**
     * Gets the matchBoxes value for this Document.
     * 
     * @return matchBoxes
     */
    public net.docusign.www.API._3_0.MatchBox[] getMatchBoxes() {
        return matchBoxes;
    }


    /**
     * Sets the matchBoxes value for this Document.
     * 
     * @param matchBoxes
     */
    public void setMatchBoxes(net.docusign.www.API._3_0.MatchBox[] matchBoxes) {
        this.matchBoxes = matchBoxes;
    }


    /**
     * Gets the attachmentDescription value for this Document.
     * 
     * @return attachmentDescription
     */
    public java.lang.String getAttachmentDescription() {
        return attachmentDescription;
    }


    /**
     * Sets the attachmentDescription value for this Document.
     * 
     * @param attachmentDescription
     */
    public void setAttachmentDescription(java.lang.String attachmentDescription) {
        this.attachmentDescription = attachmentDescription;
    }


    /**
     * Gets the documentFields value for this Document.
     * 
     * @return documentFields
     */
    public net.docusign.www.API._3_0.DocumentField[] getDocumentFields() {
        return documentFields;
    }


    /**
     * Sets the documentFields value for this Document.
     * 
     * @param documentFields
     */
    public void setDocumentFields(net.docusign.www.API._3_0.DocumentField[] documentFields) {
        this.documentFields = documentFields;
    }


    /**
     * Gets the authoritativeCopy value for this Document.
     * 
     * @return authoritativeCopy
     */
    public java.lang.Boolean getAuthoritativeCopy() {
        return authoritativeCopy;
    }


    /**
     * Sets the authoritativeCopy value for this Document.
     * 
     * @param authoritativeCopy
     */
    public void setAuthoritativeCopy(java.lang.Boolean authoritativeCopy) {
        this.authoritativeCopy = authoritativeCopy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Document)) return false;
        Document other = (Document) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.PDFBytes==null && other.getPDFBytes()==null) || 
             (this.PDFBytes!=null &&
              java.util.Arrays.equals(this.PDFBytes, other.getPDFBytes()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.transformPdfFields==null && other.getTransformPdfFields()==null) || 
             (this.transformPdfFields!=null &&
              this.transformPdfFields.equals(other.getTransformPdfFields()))) &&
            ((this.fileExtension==null && other.getFileExtension()==null) || 
             (this.fileExtension!=null &&
              this.fileExtension.equals(other.getFileExtension()))) &&
            ((this.matchBoxes==null && other.getMatchBoxes()==null) || 
             (this.matchBoxes!=null &&
              java.util.Arrays.equals(this.matchBoxes, other.getMatchBoxes()))) &&
            ((this.attachmentDescription==null && other.getAttachmentDescription()==null) || 
             (this.attachmentDescription!=null &&
              this.attachmentDescription.equals(other.getAttachmentDescription()))) &&
            ((this.documentFields==null && other.getDocumentFields()==null) || 
             (this.documentFields!=null &&
              java.util.Arrays.equals(this.documentFields, other.getDocumentFields()))) &&
            ((this.authoritativeCopy==null && other.getAuthoritativeCopy()==null) || 
             (this.authoritativeCopy!=null &&
              this.authoritativeCopy.equals(other.getAuthoritativeCopy())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPDFBytes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPDFBytes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPDFBytes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getTransformPdfFields() != null) {
            _hashCode += getTransformPdfFields().hashCode();
        }
        if (getFileExtension() != null) {
            _hashCode += getFileExtension().hashCode();
        }
        if (getMatchBoxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchBoxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchBoxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachmentDescription() != null) {
            _hashCode += getAttachmentDescription().hashCode();
        }
        if (getDocumentFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthoritativeCopy() != null) {
            _hashCode += getAuthoritativeCopy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Document.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Document"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PDFBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "PDFBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformPdfFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "TransformPdfFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FileExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchBoxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchBoxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchBox"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "MatchBox"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AttachmentDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "DocumentField"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authoritativeCopy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "AuthoritativeCopy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
