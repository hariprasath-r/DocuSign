package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.Expirations;
import com.docusign.esign.model.Reminders;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * TemplateNotificationRequest
 */

public class TemplateNotificationRequest {
  @JsonProperty("expirations")
  private Expirations expirations = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("reminders")
  private Reminders reminders = null;

  @JsonProperty("useAccountDefaults")
  private String useAccountDefaults = null;

  public TemplateNotificationRequest expirations(Expirations expirations) {
    this.expirations = expirations;
    return this;
  }

   /**
   * Get expirations
   * @return expirations
  **/
  @ApiModelProperty(example = "null", value = "")
  public Expirations getExpirations() {
    return expirations;
  }

  public void setExpirations(Expirations expirations) {
    this.expirations = expirations;
  }

  public TemplateNotificationRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * 
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public TemplateNotificationRequest reminders(Reminders reminders) {
    this.reminders = reminders;
    return this;
  }

   /**
   * Get reminders
   * @return reminders
  **/
  @ApiModelProperty(example = "null", value = "")
  public Reminders getReminders() {
    return reminders;
  }

  public void setReminders(Reminders reminders) {
    this.reminders = reminders;
  }

  public TemplateNotificationRequest useAccountDefaults(String useAccountDefaults) {
    this.useAccountDefaults = useAccountDefaults;
    return this;
  }

   /**
   * When set to **true**, the account default notification settings are used for the envelope.
   * @return useAccountDefaults
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the account default notification settings are used for the envelope.")
  public String getUseAccountDefaults() {
    return useAccountDefaults;
  }

  public void setUseAccountDefaults(String useAccountDefaults) {
    this.useAccountDefaults = useAccountDefaults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateNotificationRequest templateNotificationRequest = (TemplateNotificationRequest) o;
    return Objects.equals(this.expirations, templateNotificationRequest.expirations) &&
        Objects.equals(this.password, templateNotificationRequest.password) &&
        Objects.equals(this.reminders, templateNotificationRequest.reminders) &&
        Objects.equals(this.useAccountDefaults, templateNotificationRequest.useAccountDefaults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirations, password, reminders, useAccountDefaults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateNotificationRequest {\n");
    
    sb.append("    expirations: ").append(toIndentedString(expirations)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    reminders: ").append(toIndentedString(reminders)).append("\n");
    sb.append("    useAccountDefaults: ").append(toIndentedString(useAccountDefaults)).append("\n");
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

