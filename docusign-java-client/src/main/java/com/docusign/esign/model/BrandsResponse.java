package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Brand;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BrandsResponse
 */

public class BrandsResponse {
  @JsonProperty("brands")
  private java.util.List<Brand> brands = new java.util.ArrayList<Brand>();

  @JsonProperty("recipientBrandIdDefault")
  private String recipientBrandIdDefault = null;

  @JsonProperty("senderBrandIdDefault")
  private String senderBrandIdDefault = null;

  public BrandsResponse brands(java.util.List<Brand> brands) {
    this.brands = brands;
    return this;
  }

  public BrandsResponse addBrandsItem(Brand brandsItem) {
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * The list of brands.
   * @return brands
  **/
  @ApiModelProperty(example = "null", value = "The list of brands.")
  public java.util.List<Brand> getBrands() {
    return brands;
  }

  public void setBrands(java.util.List<Brand> brands) {
    this.brands = brands;
  }

  public BrandsResponse recipientBrandIdDefault(String recipientBrandIdDefault) {
    this.recipientBrandIdDefault = recipientBrandIdDefault;
    return this;
  }

   /**
   * The brand seen by envelope recipients when a brand is not explicitly set.
   * @return recipientBrandIdDefault
  **/
  @ApiModelProperty(example = "null", value = "The brand seen by envelope recipients when a brand is not explicitly set.")
  public String getRecipientBrandIdDefault() {
    return recipientBrandIdDefault;
  }

  public void setRecipientBrandIdDefault(String recipientBrandIdDefault) {
    this.recipientBrandIdDefault = recipientBrandIdDefault;
  }

  public BrandsResponse senderBrandIdDefault(String senderBrandIdDefault) {
    this.senderBrandIdDefault = senderBrandIdDefault;
    return this;
  }

   /**
   * The brand seen by envelope senders when a brand is not explicitly set.
   * @return senderBrandIdDefault
  **/
  @ApiModelProperty(example = "null", value = "The brand seen by envelope senders when a brand is not explicitly set.")
  public String getSenderBrandIdDefault() {
    return senderBrandIdDefault;
  }

  public void setSenderBrandIdDefault(String senderBrandIdDefault) {
    this.senderBrandIdDefault = senderBrandIdDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandsResponse brandsResponse = (BrandsResponse) o;
    return Objects.equals(this.brands, brandsResponse.brands) &&
        Objects.equals(this.recipientBrandIdDefault, brandsResponse.recipientBrandIdDefault) &&
        Objects.equals(this.senderBrandIdDefault, brandsResponse.senderBrandIdDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands, recipientBrandIdDefault, senderBrandIdDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandsResponse {\n");
    
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
    sb.append("    recipientBrandIdDefault: ").append(toIndentedString(recipientBrandIdDefault)).append("\n");
    sb.append("    senderBrandIdDefault: ").append(toIndentedString(senderBrandIdDefault)).append("\n");
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

