package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.SignHashDocument;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CompleteSignHashResponse
 */

public class CompleteSignHashResponse {
  @JsonProperty("documents")
  private java.util.List<SignHashDocument> documents = new java.util.ArrayList<SignHashDocument>();

  @JsonProperty("redirectionUrl")
  private String redirectionUrl = null;

  @JsonProperty("remainingSignatureRequests")
  private String remainingSignatureRequests = null;

  public CompleteSignHashResponse documents(java.util.List<SignHashDocument> documents) {
    this.documents = documents;
    return this;
  }

  public CompleteSignHashResponse addDocumentsItem(SignHashDocument documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Complex element contains the details on the documents in the envelope.
   * @return documents
  **/
  @ApiModelProperty(example = "null", value = "Complex element contains the details on the documents in the envelope.")
  public java.util.List<SignHashDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(java.util.List<SignHashDocument> documents) {
    this.documents = documents;
  }

  public CompleteSignHashResponse redirectionUrl(String redirectionUrl) {
    this.redirectionUrl = redirectionUrl;
    return this;
  }

   /**
   * 
   * @return redirectionUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRedirectionUrl() {
    return redirectionUrl;
  }

  public void setRedirectionUrl(String redirectionUrl) {
    this.redirectionUrl = redirectionUrl;
  }

  public CompleteSignHashResponse remainingSignatureRequests(String remainingSignatureRequests) {
    this.remainingSignatureRequests = remainingSignatureRequests;
    return this;
  }

   /**
   * 
   * @return remainingSignatureRequests
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRemainingSignatureRequests() {
    return remainingSignatureRequests;
  }

  public void setRemainingSignatureRequests(String remainingSignatureRequests) {
    this.remainingSignatureRequests = remainingSignatureRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteSignHashResponse completeSignHashResponse = (CompleteSignHashResponse) o;
    return Objects.equals(this.documents, completeSignHashResponse.documents) &&
        Objects.equals(this.redirectionUrl, completeSignHashResponse.redirectionUrl) &&
        Objects.equals(this.remainingSignatureRequests, completeSignHashResponse.remainingSignatureRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, redirectionUrl, remainingSignatureRequests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteSignHashResponse {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    redirectionUrl: ").append(toIndentedString(redirectionUrl)).append("\n");
    sb.append("    remainingSignatureRequests: ").append(toIndentedString(remainingSignatureRequests)).append("\n");
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

