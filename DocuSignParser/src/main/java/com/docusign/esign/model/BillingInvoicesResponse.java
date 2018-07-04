package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingInvoice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines a billing invoice response object.
 */
@ApiModel(description = "Defines a billing invoice response object.")

public class BillingInvoicesResponse {
  @JsonProperty("billingInvoices")
  private java.util.List<BillingInvoice> billingInvoices = new java.util.ArrayList<BillingInvoice>();

  @JsonProperty("nextUri")
  private String nextUri = null;

  @JsonProperty("previousUri")
  private String previousUri = null;

  public BillingInvoicesResponse billingInvoices(java.util.List<BillingInvoice> billingInvoices) {
    this.billingInvoices = billingInvoices;
    return this;
  }

  public BillingInvoicesResponse addBillingInvoicesItem(BillingInvoice billingInvoicesItem) {
    this.billingInvoices.add(billingInvoicesItem);
    return this;
  }

   /**
   * Reserved: TBD
   * @return billingInvoices
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public java.util.List<BillingInvoice> getBillingInvoices() {
    return billingInvoices;
  }

  public void setBillingInvoices(java.util.List<BillingInvoice> billingInvoices) {
    this.billingInvoices = billingInvoices;
  }

  public BillingInvoicesResponse nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }

   /**
   * The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. 
   * @return nextUri
  **/
  @ApiModelProperty(example = "null", value = "The URI to the next chunk of records based on the search request. If the endPosition is the entire results of the search, this is null. ")
  public String getNextUri() {
    return nextUri;
  }

  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  public BillingInvoicesResponse previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }

   /**
   * The postal code for the billing address.
   * @return previousUri
  **/
  @ApiModelProperty(example = "null", value = "The postal code for the billing address.")
  public String getPreviousUri() {
    return previousUri;
  }

  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingInvoicesResponse billingInvoicesResponse = (BillingInvoicesResponse) o;
    return Objects.equals(this.billingInvoices, billingInvoicesResponse.billingInvoices) &&
        Objects.equals(this.nextUri, billingInvoicesResponse.nextUri) &&
        Objects.equals(this.previousUri, billingInvoicesResponse.previousUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingInvoices, nextUri, previousUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingInvoicesResponse {\n");
    
    sb.append("    billingInvoices: ").append(toIndentedString(billingInvoices)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
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

