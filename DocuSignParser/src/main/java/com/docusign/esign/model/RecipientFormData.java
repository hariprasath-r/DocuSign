package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientFormData
 */

public class RecipientFormData {
  @JsonProperty("declinedTime")
  private String declinedTime = null;

  @JsonProperty("deliveredTime")
  private String deliveredTime = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("formData")
  private java.util.List<NameValue> formData = new java.util.ArrayList<NameValue>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("sentTime")
  private String sentTime = null;

  @JsonProperty("signedTime")
  private String signedTime = null;

  public RecipientFormData declinedTime(String declinedTime) {
    this.declinedTime = declinedTime;
    return this;
  }

   /**
   * 
   * @return declinedTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDeclinedTime() {
    return declinedTime;
  }

  public void setDeclinedTime(String declinedTime) {
    this.declinedTime = declinedTime;
  }

  public RecipientFormData deliveredTime(String deliveredTime) {
    this.deliveredTime = deliveredTime;
    return this;
  }

   /**
   * 
   * @return deliveredTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDeliveredTime() {
    return deliveredTime;
  }

  public void setDeliveredTime(String deliveredTime) {
    this.deliveredTime = deliveredTime;
  }

  public RecipientFormData email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RecipientFormData formData(java.util.List<NameValue> formData) {
    this.formData = formData;
    return this;
  }

  public RecipientFormData addFormDataItem(NameValue formDataItem) {
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

  public RecipientFormData name(String name) {
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

  public RecipientFormData recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(example = "null", value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public RecipientFormData sentTime(String sentTime) {
    this.sentTime = sentTime;
    return this;
  }

   /**
   * 
   * @return sentTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSentTime() {
    return sentTime;
  }

  public void setSentTime(String sentTime) {
    this.sentTime = sentTime;
  }

  public RecipientFormData signedTime(String signedTime) {
    this.signedTime = signedTime;
    return this;
  }

   /**
   * 
   * @return signedTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignedTime() {
    return signedTime;
  }

  public void setSignedTime(String signedTime) {
    this.signedTime = signedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientFormData recipientFormData = (RecipientFormData) o;
    return Objects.equals(this.declinedTime, recipientFormData.declinedTime) &&
        Objects.equals(this.deliveredTime, recipientFormData.deliveredTime) &&
        Objects.equals(this.email, recipientFormData.email) &&
        Objects.equals(this.formData, recipientFormData.formData) &&
        Objects.equals(this.name, recipientFormData.name) &&
        Objects.equals(this.recipientId, recipientFormData.recipientId) &&
        Objects.equals(this.sentTime, recipientFormData.sentTime) &&
        Objects.equals(this.signedTime, recipientFormData.signedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(declinedTime, deliveredTime, email, formData, name, recipientId, sentTime, signedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientFormData {\n");
    
    sb.append("    declinedTime: ").append(toIndentedString(declinedTime)).append("\n");
    sb.append("    deliveredTime: ").append(toIndentedString(deliveredTime)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    formData: ").append(toIndentedString(formData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    sentTime: ").append(toIndentedString(sentTime)).append("\n");
    sb.append("    signedTime: ").append(toIndentedString(signedTime)).append("\n");
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

