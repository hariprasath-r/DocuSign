package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.EnvelopeDocument;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TemplateDocumentsResult
 */

public class TemplateDocumentsResult {
  @JsonProperty("templateDocuments")
  private java.util.List<EnvelopeDocument> templateDocuments = new java.util.ArrayList<EnvelopeDocument>();

  @JsonProperty("templateId")
  private String templateId = null;

  public TemplateDocumentsResult templateDocuments(java.util.List<EnvelopeDocument> templateDocuments) {
    this.templateDocuments = templateDocuments;
    return this;
  }

  public TemplateDocumentsResult addTemplateDocumentsItem(EnvelopeDocument templateDocumentsItem) {
    this.templateDocuments.add(templateDocumentsItem);
    return this;
  }

   /**
   * 
   * @return templateDocuments
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<EnvelopeDocument> getTemplateDocuments() {
    return templateDocuments;
  }

  public void setTemplateDocuments(java.util.List<EnvelopeDocument> templateDocuments) {
    this.templateDocuments = templateDocuments;
  }

  public TemplateDocumentsResult templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The unique identifier of the template. If this is not provided, DocuSign will generate a value. 
   * @return templateId
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier of the template. If this is not provided, DocuSign will generate a value. ")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDocumentsResult templateDocumentsResult = (TemplateDocumentsResult) o;
    return Objects.equals(this.templateDocuments, templateDocumentsResult.templateDocuments) &&
        Objects.equals(this.templateId, templateDocumentsResult.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateDocuments, templateId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDocumentsResult {\n");
    
    sb.append("    templateDocuments: ").append(toIndentedString(templateDocuments)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

