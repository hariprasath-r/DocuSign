package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.Tabs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RecipientUpdateResponse
 */

public class RecipientUpdateResponse {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("tabs")
  private Tabs tabs = null;

  public RecipientUpdateResponse errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public RecipientUpdateResponse recipientId(String recipientId) {
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

  public RecipientUpdateResponse tabs(Tabs tabs) {
    this.tabs = tabs;
    return this;
  }

   /**
   * Get tabs
   * @return tabs
  **/
  @ApiModelProperty(example = "null", value = "")
  public Tabs getTabs() {
    return tabs;
  }

  public void setTabs(Tabs tabs) {
    this.tabs = tabs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientUpdateResponse recipientUpdateResponse = (RecipientUpdateResponse) o;
    return Objects.equals(this.errorDetails, recipientUpdateResponse.errorDetails) &&
        Objects.equals(this.recipientId, recipientUpdateResponse.recipientId) &&
        Objects.equals(this.tabs, recipientUpdateResponse.tabs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, recipientId, tabs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientUpdateResponse {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    tabs: ").append(toIndentedString(tabs)).append("\n");
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

