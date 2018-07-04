package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountPasswordExpirePasswordDays
 */

public class AccountPasswordExpirePasswordDays {
  @JsonProperty("maximumDays")
  private String maximumDays = null;

  @JsonProperty("minimumDays")
  private String minimumDays = null;

  public AccountPasswordExpirePasswordDays maximumDays(String maximumDays) {
    this.maximumDays = maximumDays;
    return this;
  }

   /**
   * 
   * @return maximumDays
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaximumDays() {
    return maximumDays;
  }

  public void setMaximumDays(String maximumDays) {
    this.maximumDays = maximumDays;
  }

  public AccountPasswordExpirePasswordDays minimumDays(String minimumDays) {
    this.minimumDays = minimumDays;
    return this;
  }

   /**
   * 
   * @return minimumDays
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMinimumDays() {
    return minimumDays;
  }

  public void setMinimumDays(String minimumDays) {
    this.minimumDays = minimumDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPasswordExpirePasswordDays accountPasswordExpirePasswordDays = (AccountPasswordExpirePasswordDays) o;
    return Objects.equals(this.maximumDays, accountPasswordExpirePasswordDays.maximumDays) &&
        Objects.equals(this.minimumDays, accountPasswordExpirePasswordDays.minimumDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumDays, minimumDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPasswordExpirePasswordDays {\n");
    
    sb.append("    maximumDays: ").append(toIndentedString(maximumDays)).append("\n");
    sb.append("    minimumDays: ").append(toIndentedString(minimumDays)).append("\n");
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

