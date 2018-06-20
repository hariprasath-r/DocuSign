package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex element that specifies reminder settings for the envelope
 */
@ApiModel(description = "A complex element that specifies reminder settings for the envelope")

public class Reminders {
  @JsonProperty("reminderDelay")
  private String reminderDelay = null;

  @JsonProperty("reminderEnabled")
  private String reminderEnabled = null;

  @JsonProperty("reminderFrequency")
  private String reminderFrequency = null;

  public Reminders reminderDelay(String reminderDelay) {
    this.reminderDelay = reminderDelay;
    return this;
  }

   /**
   * An interger that sets the number of days after the recipient receives the envelope that reminder emails are sent to the recipient.
   * @return reminderDelay
  **/
  @ApiModelProperty(example = "null", value = "An interger that sets the number of days after the recipient receives the envelope that reminder emails are sent to the recipient.")
  public String getReminderDelay() {
    return reminderDelay;
  }

  public void setReminderDelay(String reminderDelay) {
    this.reminderDelay = reminderDelay;
  }

  public Reminders reminderEnabled(String reminderEnabled) {
    this.reminderEnabled = reminderEnabled;
    return this;
  }

   /**
   * When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.
   * @return reminderEnabled
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, the envelope expires (is no longer available for signing) in the set number of days. If false, the account default setting is used. If the account does not have an expiration setting, the DocuSign default value of 120 days is used.")
  public String getReminderEnabled() {
    return reminderEnabled;
  }

  public void setReminderEnabled(String reminderEnabled) {
    this.reminderEnabled = reminderEnabled;
  }

  public Reminders reminderFrequency(String reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
    return this;
  }

   /**
   * An interger that sets the interval, in days, between reminder emails.
   * @return reminderFrequency
  **/
  @ApiModelProperty(example = "null", value = "An interger that sets the interval, in days, between reminder emails.")
  public String getReminderFrequency() {
    return reminderFrequency;
  }

  public void setReminderFrequency(String reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reminders reminders = (Reminders) o;
    return Objects.equals(this.reminderDelay, reminders.reminderDelay) &&
        Objects.equals(this.reminderEnabled, reminders.reminderEnabled) &&
        Objects.equals(this.reminderFrequency, reminders.reminderFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reminderDelay, reminderEnabled, reminderFrequency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reminders {\n");
    
    sb.append("    reminderDelay: ").append(toIndentedString(reminderDelay)).append("\n");
    sb.append("    reminderEnabled: ").append(toIndentedString(reminderEnabled)).append("\n");
    sb.append("    reminderFrequency: ").append(toIndentedString(reminderFrequency)).append("\n");
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

