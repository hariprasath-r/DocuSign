package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BrandRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BrandsRequest
 */

public class BrandsRequest {
  @JsonProperty("brands")
  private java.util.List<BrandRequest> brands = new java.util.ArrayList<BrandRequest>();

  public BrandsRequest brands(java.util.List<BrandRequest> brands) {
    this.brands = brands;
    return this;
  }

  public BrandsRequest addBrandsItem(BrandRequest brandsItem) {
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * The list of brands.
   * @return brands
  **/
  @ApiModelProperty(example = "null", value = "The list of brands.")
  public java.util.List<BrandRequest> getBrands() {
    return brands;
  }

  public void setBrands(java.util.List<BrandRequest> brands) {
    this.brands = brands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandsRequest brandsRequest = (BrandsRequest) o;
    return Objects.equals(this.brands, brandsRequest.brands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brands);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandsRequest {\n");
    
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
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

