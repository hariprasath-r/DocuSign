package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientAttachment
 */

public class RecipientAttachment {
  @JsonProperty("attachmentId")
  private String attachmentId = null;

  @JsonProperty("attachmentType")
  private String attachmentType = null;

  @JsonProperty("data")
  private String data = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("remoteUrl")
  private String remoteUrl = null;

  public RecipientAttachment attachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * 
   * @return attachmentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAttachmentId() {
    return attachmentId;
  }

  public void setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
  }

  public RecipientAttachment attachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
    return this;
  }

   /**
   * 
   * @return attachmentType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAttachmentType() {
    return attachmentType;
  }

  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }

  public RecipientAttachment data(String data) {
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

  public RecipientAttachment label(String label) {
    this.label = label;
    return this;
  }

   /**
   * 
   * @return label
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public RecipientAttachment name(String name) {
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

  public RecipientAttachment remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }

   /**
   * 
   * @return remoteUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRemoteUrl() {
    return remoteUrl;
  }

  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientAttachment recipientAttachment = (RecipientAttachment) o;
    return Objects.equals(this.attachmentId, recipientAttachment.attachmentId) &&
        Objects.equals(this.attachmentType, recipientAttachment.attachmentType) &&
        Objects.equals(this.data, recipientAttachment.data) &&
        Objects.equals(this.label, recipientAttachment.label) &&
        Objects.equals(this.name, recipientAttachment.name) &&
        Objects.equals(this.remoteUrl, recipientAttachment.remoteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, attachmentType, data, label, name, remoteUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientAttachment {\n");
    
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
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

