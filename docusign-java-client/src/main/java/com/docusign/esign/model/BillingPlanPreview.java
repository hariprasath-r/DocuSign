package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingInvoice;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about a preview billing plan.
 */
@ApiModel(description = "Contains information about a preview billing plan.")

public class BillingPlanPreview {
  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("invoice")
  private BillingInvoice invoice = null;

  @JsonProperty("isProrated")
  private String isProrated = null;

  @JsonProperty("subtotalAmount")
  private String subtotalAmount = null;

  @JsonProperty("taxAmount")
  private String taxAmount = null;

  @JsonProperty("totalAmount")
  private String totalAmount = null;

  public BillingPlanPreview currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Specifies the ISO currency code for the account.
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "Specifies the ISO currency code for the account.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public BillingPlanPreview invoice(BillingInvoice invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @ApiModelProperty(example = "null", value = "")
  public BillingInvoice getInvoice() {
    return invoice;
  }

  public void setInvoice(BillingInvoice invoice) {
    this.invoice = invoice;
  }

  public BillingPlanPreview isProrated(String isProrated) {
    this.isProrated = isProrated;
    return this;
  }

   /**
   * 
   * @return isProrated
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsProrated() {
    return isProrated;
  }

  public void setIsProrated(String isProrated) {
    this.isProrated = isProrated;
  }

  public BillingPlanPreview subtotalAmount(String subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
    return this;
  }

   /**
   * 
   * @return subtotalAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubtotalAmount() {
    return subtotalAmount;
  }

  public void setSubtotalAmount(String subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }

  public BillingPlanPreview taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * 
   * @return taxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public BillingPlanPreview totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 
   * @return totalAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlanPreview billingPlanPreview = (BillingPlanPreview) o;
    return Objects.equals(this.currencyCode, billingPlanPreview.currencyCode) &&
        Objects.equals(this.invoice, billingPlanPreview.invoice) &&
        Objects.equals(this.isProrated, billingPlanPreview.isProrated) &&
        Objects.equals(this.subtotalAmount, billingPlanPreview.subtotalAmount) &&
        Objects.equals(this.taxAmount, billingPlanPreview.taxAmount) &&
        Objects.equals(this.totalAmount, billingPlanPreview.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, invoice, isProrated, subtotalAmount, taxAmount, totalAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanPreview {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    isProrated: ").append(toIndentedString(isProrated)).append("\n");
    sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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

