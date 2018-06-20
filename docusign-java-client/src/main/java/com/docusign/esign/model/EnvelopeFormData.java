package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.docusign.esign.model.RecipientFormData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeFormData
 */

public class EnvelopeFormData {
  @JsonProperty("emailSubject")
  private String emailSubject = null;

  @JsonProperty("envelopeId")
  private String envelopeId = null;

  @JsonProperty("formData")
  private java.util.List<NameValue> formData = new java.util.ArrayList<NameValue>();

  @JsonProperty("recipientFormData")
  private java.util.List<RecipientFormData> recipientFormData = new java.util.ArrayList<RecipientFormData>();

  @JsonProperty("sentDateTime")
  private String sentDateTime = null;

  @JsonProperty("status")
  private String status = null;

  public EnvelopeFormData emailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
    return this;
  }

   /**
   * Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.
   * @return emailSubject
  **/
  @ApiModelProperty(example = "null", value = "Specifies the subject of the email that is sent to all recipients.  See [ML:Template Email Subject Merge Fields] for information about adding merge field information to the email subject.")
  public String getEmailSubject() {
    return emailSubject;
  }

  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  public EnvelopeFormData envelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
    return this;
  }

   /**
   * The envelope ID of the envelope status that failed to post.
   * @return envelopeId
  **/
  @ApiModelProperty(example = "null", value = "The envelope ID of the envelope status that failed to post.")
  public String getEnvelopeId() {
    return envelopeId;
  }

  public void setEnvelopeId(String envelopeId) {
    this.envelopeId = envelopeId;
  }

  public EnvelopeFormData formData(java.util.List<NameValue> formData) {
    this.formData = formData;
    return this;
  }

  public EnvelopeFormData addFormDataItem(NameValue formDataItem) {
    this.formData.add(formDataItem);
    return this;
  }

   /**
   * 
   * @return formData
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<NameValue> getFormData() {
    return formData;
  }

  public void setFormData(java.util.List<NameValue> formData) {
    this.formData = formData;
  }

  public EnvelopeFormData recipientFormData(java.util.List<RecipientFormData> recipientFormData) {
    this.recipientFormData = recipientFormData;
    return this;
  }

  public EnvelopeFormData addRecipientFormDataItem(RecipientFormData recipientFormDataItem) {
    this.recipientFormData.add(recipientFormDataItem);
    return this;
  }

   /**
   * 
   * @return recipientFormData
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<RecipientFormData> getRecipientFormData() {
    return recipientFormData;
  }

  public void setRecipientFormData(java.util.List<RecipientFormData> recipientFormData) {
    this.recipientFormData = recipientFormData;
  }

  public EnvelopeFormData sentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
    return this;
  }

   /**
   * The date and time the envelope was sent.
   * @return sentDateTime
  **/
  @ApiModelProperty(example = "null", value = "The date and time the envelope was sent.")
  public String getSentDateTime() {
    return sentDateTime;
  }

  public void setSentDateTime(String sentDateTime) {
    this.sentDateTime = sentDateTime;
  }

  public EnvelopeFormData status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeFormData envelopeFormData = (EnvelopeFormData) o;
    return Objects.equals(this.emailSubject, envelopeFormData.emailSubject) &&
        Objects.equals(this.envelopeId, envelopeFormData.envelopeId) &&
        Objects.equals(this.formData, envelopeFormData.formData) &&
        Objects.equals(this.recipientFormData, envelopeFormData.recipientFormData) &&
        Objects.equals(this.sentDateTime, envelopeFormData.sentDateTime) &&
        Objects.equals(this.status, envelopeFormData.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSubject, envelopeId, formData, recipientFormData, sentDateTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeFormData {\n");
    
    sb.append("    emailSubject: ").append(toIndentedString(emailSubject)).append("\n");
    sb.append("    envelopeId: ").append(toIndentedString(envelopeId)).append("\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    recipientFormData: ").append(toIndentedString(recipientFormData)).append("\n");
    sb.append("    sentDateTime: ").append(toIndentedString(sentDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

