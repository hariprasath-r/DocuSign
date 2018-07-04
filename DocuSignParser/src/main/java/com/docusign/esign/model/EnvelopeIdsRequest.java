package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * EnvelopeIdsRequest
 */

public class EnvelopeIdsRequest {
  @JsonProperty("envelopeIds")
  private java.util.List<String> envelopeIds = new java.util.ArrayList<String>();

  @JsonProperty("transactionIds")
  private java.util.List<String> transactionIds = new java.util.ArrayList<String>();

  public EnvelopeIdsRequest envelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
    return this;
  }

  public EnvelopeIdsRequest addEnvelopeIdsItem(String envelopeIdsItem) {
    this.envelopeIds.add(envelopeIdsItem);
    return this;
  }

   /**
   * 
   * @return envelopeIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getEnvelopeIds() {
    return envelopeIds;
  }

  public void setEnvelopeIds(java.util.List<String> envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  public EnvelopeIdsRequest transactionIds(java.util.List<String> transactionIds) {
    this.transactionIds = transactionIds;
    return this;
  }

  public EnvelopeIdsRequest addTransactionIdsItem(String transactionIdsItem) {
    this.transactionIds.add(transactionIdsItem);
    return this;
  }

   /**
   *  A list of transaction Id's used to determining the status of envelopes sent asynchronously. See **transactionId** property on envelopes.
   * @return transactionIds
  **/
  @ApiModelProperty(example = "null", value = " A list of transaction Id's used to determining the status of envelopes sent asynchronously. See **transactionId** property on envelopes.")
  public java.util.List<String> getTransactionIds() {
    return transactionIds;
  }

  public void setTransactionIds(java.util.List<String> transactionIds) {
    this.transactionIds = transactionIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvelopeIdsRequest envelopeIdsRequest = (EnvelopeIdsRequest) o;
    return Objects.equals(this.envelopeIds, envelopeIdsRequest.envelopeIds) &&
        Objects.equals(this.transactionIds, envelopeIdsRequest.transactionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(envelopeIds, transactionIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvelopeIdsRequest {\n");
    
    sb.append("    envelopeIds: ").append(toIndentedString(envelopeIds)).append("\n");
    sb.append("    transactionIds: ").append(toIndentedString(transactionIds)).append("\n");
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

