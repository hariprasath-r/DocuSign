package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.NameValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SupportedLanguages
 */

public class SupportedLanguages {
  @JsonProperty("languages")
  private java.util.List<NameValue> languages = new java.util.ArrayList<NameValue>();

  public SupportedLanguages languages(java.util.List<NameValue> languages) {
    this.languages = languages;
    return this;
  }

  public SupportedLanguages addLanguagesItem(NameValue languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * 
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<NameValue> getLanguages() {
    return languages;
  }

  public void setLanguages(java.util.List<NameValue> languages) {
    this.languages = languages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportedLanguages supportedLanguages = (SupportedLanguages) o;
    return Objects.equals(this.languages, supportedLanguages.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedLanguages {\n");
    
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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

