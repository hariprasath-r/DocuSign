package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CustomField
 */

public class CustomField {
  @JsonProperty("customFieldType")
  private String customFieldType = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("fieldId")
  private String fieldId = null;

  @JsonProperty("listItems")
  private java.util.List<String> listItems = new java.util.ArrayList<String>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("required")
  private String required = null;

  @JsonProperty("show")
  private String show = null;

  @JsonProperty("value")
  private String value = null;

  public CustomField customFieldType(String customFieldType) {
    this.customFieldType = customFieldType;
    return this;
  }

   /**
   * 
   * @return customFieldType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCustomFieldType() {
    return customFieldType;
  }

  public void setCustomFieldType(String customFieldType) {
    this.customFieldType = customFieldType;
  }

  public CustomField errorDetails(ErrorDetails errorDetails) {
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

  public CustomField fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * 
   * @return fieldId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public CustomField listItems(java.util.List<String> listItems) {
    this.listItems = listItems;
    return this;
  }

  public CustomField addListItemsItem(String listItemsItem) {
    this.listItems.add(listItemsItem);
    return this;
  }

   /**
   * 
   * @return listItems
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<String> getListItems() {
    return listItems;
  }

  public void setListItems(java.util.List<String> listItems) {
    this.listItems = listItems;
  }

  public CustomField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomField required(String required) {
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

  public CustomField show(String show) {
    this.show = show;
    return this;
  }

   /**
   * 
   * @return show
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShow() {
    return show;
  }

  public void setShow(String show) {
    this.show = show;
  }

  public CustomField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Specifies the value of the tab. 
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "Specifies the value of the tab. ")
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
    CustomField customField = (CustomField) o;
    return Objects.equals(this.customFieldType, customField.customFieldType) &&
        Objects.equals(this.errorDetails, customField.errorDetails) &&
        Objects.equals(this.fieldId, customField.fieldId) &&
        Objects.equals(this.listItems, customField.listItems) &&
        Objects.equals(this.name, customField.name) &&
        Objects.equals(this.required, customField.required) &&
        Objects.equals(this.show, customField.show) &&
        Objects.equals(this.value, customField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldType, errorDetails, fieldId, listItems, name, required, show, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomField {\n");
    
    sb.append("    customFieldType: ").append(toIndentedString(customFieldType)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    listItems: ").append(toIndentedString(listItems)).append("\n");
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

