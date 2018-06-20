package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountPasswordStrengthTypeOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccountPasswordStrengthType
 */

public class AccountPasswordStrengthType {
  @JsonProperty("options")
  private java.util.List<AccountPasswordStrengthTypeOption> options = new java.util.ArrayList<AccountPasswordStrengthTypeOption>();

  public AccountPasswordStrengthType options(java.util.List<AccountPasswordStrengthTypeOption> options) {
    this.options = options;
    return this;
  }

  public AccountPasswordStrengthType addOptionsItem(AccountPasswordStrengthTypeOption optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * 
   * @return options
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<AccountPasswordStrengthTypeOption> getOptions() {
    return options;
  }

  public void setOptions(java.util.List<AccountPasswordStrengthTypeOption> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPasswordStrengthType accountPasswordStrengthType = (AccountPasswordStrengthType) o;
    return Objects.equals(this.options, accountPasswordStrengthType.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPasswordStrengthType {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

