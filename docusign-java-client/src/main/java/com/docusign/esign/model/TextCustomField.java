package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TextCustomField
 */

public class TextCustomField {
  @JsonProperty("configurationType")
  private String configurationType = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("fieldId")
  private String fieldId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("required")
  private String required = null;

  @JsonProperty("show")
  private String show = null;

  @JsonProperty("value")
  private String value = null;

  public TextCustomField configurationType(String configurationType) {
    this.configurationType = configurationType;
    return this;
  }

   /**
   * If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.
   * @return configurationType
  **/
  @ApiModelProperty(example = "null", value = "If merge field's are being used, specifies the type of the merge field. The only  supported value is **salesforce**.")
  public String getConfigurationType() {
    return configurationType;
  }

  public void setConfigurationType(String configurationType) {
    this.configurationType = configurationType;
  }

  public TextCustomField errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public TextCustomField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * An ID used to specify a custom field.
   * @return fieldId
  **/
  @ApiModelProperty(example = "null", value = "An ID used to specify a custom field.")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public TextCustomField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the custom field.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the custom field.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TextCustomField required(String required) {
    this.required = required;
    return this;
  }

   /**
   * When set to **true**, the signer is required to fill out this tab
   * @return required
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the signer is required to fill out this tab")
  public String getRequired() {
    return required;
  }

  public void setRequired(String required) {
    this.required = required;
  }

  public TextCustomField show(String show) {
    this.show = show;
    return this;
  }

   /**
   * A boolean indicating if the value should be displayed.
   * @return show
  **/
  @ApiModelProperty(example = "null", value = "A boolean indicating if the value should be displayed.")
  public String getShow() {
    return show;
  }

  public void setShow(String show) {
    this.show = show;
  }

  public TextCustomField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the custom field.
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "The value of the custom field.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextCustomField textCustomField = (TextCustomField) o;
    return Objects.equals(this.configurationType, textCustomField.configurationType) &&
        Objects.equals(this.errorDetails, textCustomField.errorDetails) &&
        Objects.equals(this.fieldId, textCustomField.fieldId) &&
        Objects.equals(this.name, textCustomField.name) &&
        Objects.equals(this.required, textCustomField.required) &&
        Objects.equals(this.show, textCustomField.show) &&
        Objects.equals(this.value, textCustomField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationType, errorDetails, fieldId, name, required, show, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextCustomField {\n");
    
    sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    show: ").append(toIndentedString(show)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

