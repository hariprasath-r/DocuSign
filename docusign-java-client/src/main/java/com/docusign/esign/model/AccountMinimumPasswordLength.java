package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountMinimumPasswordLength
 */

public class AccountMinimumPasswordLength {
  @JsonProperty("maximumLength")
  private String maximumLength = null;

  @JsonProperty("minimumLength")
  private String minimumLength = null;

  public AccountMinimumPasswordLength maximumLength(String maximumLength) {
    this.maximumLength = maximumLength;
    return this;
  }

   /**
   * 
   * @return maximumLength
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaximumLength() {
    return maximumLength;
  }

  public void setMaximumLength(String maximumLength) {
    this.maximumLength = maximumLength;
  }

  public AccountMinimumPasswordLength minimumLength(String minimumLength) {
    this.minimumLength = minimumLength;
    return this;
  }

   /**
   * 
   * @return minimumLength
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMinimumLength() {
    return minimumLength;
  }

  public void setMinimumLength(String minimumLength) {
    this.minimumLength = minimumLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMinimumPasswordLength accountMinimumPasswordLength = (AccountMinimumPasswordLength) o;
    return Objects.equals(this.maximumLength, accountMinimumPasswordLength.maximumLength) &&
        Objects.equals(this.minimumLength, accountMinimumPasswordLength.minimumLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumLength, minimumLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMinimumPasswordLength {\n");
    
    sb.append("    maximumLength: ").append(toIndentedString(maximumLength)).append("\n");
    sb.append("    minimumLength: ").append(toIndentedString(minimumLength)).append("\n");
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

