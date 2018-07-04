package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Revision;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SignHashDocument
 */

public class SignHashDocument {
  @JsonProperty("data")
  private String data = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("remainingSignatures")
  private String remainingSignatures = null;

  @JsonProperty("revisions")
  private java.util.List<Revision> revisions = new java.util.ArrayList<Revision>();

  @JsonProperty("signatureType")
  private String signatureType = null;

  public SignHashDocument data(String data) {
    this.data = data;
    return this;
  }

   /**
   * 
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public SignHashDocument documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   * @return documentId
  **/
  @ApiModelProperty(example = "null", value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public SignHashDocument format(String format) {
    this.format = format;
    return this;
  }

   /**
   * 
   * @return format
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public SignHashDocument name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SignHashDocument remainingSignatures(String remainingSignatures) {
    this.remainingSignatures = remainingSignatures;
    return this;
  }

   /**
   * 
   * @return remainingSignatures
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRemainingSignatures() {
    return remainingSignatures;
  }

  public void setRemainingSignatures(String remainingSignatures) {
    this.remainingSignatures = remainingSignatures;
  }

  public SignHashDocument revisions(java.util.List<Revision> revisions) {
    this.revisions = revisions;
    return this;
  }

  public SignHashDocument addRevisionsItem(Revision revisionsItem) {
    this.revisions.add(revisionsItem);
    return this;
  }

   /**
   * 
   * @return revisions
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<Revision> getRevisions() {
    return revisions;
  }

  public void setRevisions(java.util.List<Revision> revisions) {
    this.revisions = revisions;
  }

  public SignHashDocument signatureType(String signatureType) {
    this.signatureType = signatureType;
    return this;
  }

   /**
   * 
   * @return signatureType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignatureType() {
    return signatureType;
  }

  public void setSignatureType(String signatureType) {
    this.signatureType = signatureType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignHashDocument signHashDocument = (SignHashDocument) o;
    return Objects.equals(this.data, signHashDocument.data) &&
        Objects.equals(this.documentId, signHashDocument.documentId) &&
        Objects.equals(this.format, signHashDocument.format) &&
        Objects.equals(this.name, signHashDocument.name) &&
        Objects.equals(this.remainingSignatures, signHashDocument.remainingSignatures) &&
        Objects.equals(this.revisions, signHashDocument.revisions) &&
        Objects.equals(this.signatureType, signHashDocument.signatureType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, documentId, format, name, remainingSignatures, revisions, signatureType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignHashDocument {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remainingSignatures: ").append(toIndentedString(remainingSignatures)).append("\n");
    sb.append("    revisions: ").append(toIndentedString(revisions)).append("\n");
    sb.append("    signatureType: ").append(toIndentedString(signatureType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

