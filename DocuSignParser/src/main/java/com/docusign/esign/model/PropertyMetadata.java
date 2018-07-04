package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PropertyMetadata
 */

public class PropertyMetadata {
  @JsonProperty("options")
  private java.util.List<String> options = new java.util.ArrayList<String>();

  @JsonProperty("rights")
  private String rights = null;

  public PropertyMetadata options(java.util.List<String> options) {
    this.options = options;
    return this;
  }

  public PropertyMetadata addOptionsItem(String optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * 
   * @return options
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getOptions() {
    return options;
  }

  public void setOptions(java.util.List<String> options) {
    this.options = options;
  }

  public PropertyMetadata rights(String rights) {
    this.rights = rights;
    return this;
  }

   /**
   * 
   * @return rights
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRights() {
    return rights;
  }

  public void setRights(String rights) {
    this.rights = rights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyMetadata propertyMetadata = (PropertyMetadata) o;
    return Objects.equals(this.options, propertyMetadata.options) &&
        Objects.equals(this.rights, propertyMetadata.rights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, rights);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyMetadata {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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

