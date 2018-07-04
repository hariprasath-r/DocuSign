package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LockInformation
 */

public class LockInformation {
  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("lockDurationInSeconds")
  private String lockDurationInSeconds = null;

  @JsonProperty("lockedByApp")
  private String lockedByApp = null;

  @JsonProperty("lockedByUser")
  private UserInfo lockedByUser = null;

  @JsonProperty("lockedUntilDateTime")
  private String lockedUntilDateTime = null;

  @JsonProperty("lockToken")
  private String lockToken = null;

  @JsonProperty("lockType")
  private String lockType = null;

  @JsonProperty("useScratchPad")
  private String useScratchPad = null;

  public LockInformation errorDetails(ErrorDetails errorDetails) {
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

  public LockInformation lockDurationInSeconds(String lockDurationInSeconds) {
    this.lockDurationInSeconds = lockDurationInSeconds;
    return this;
  }

   /**
   * Sets the time, in seconds, until the lock expires when there is no activity on the envelope.  If no value is entered, then the default value of 300 seconds is used. The maximum value is 1,800 seconds.  The lock duration can be extended. 
   * @return lockDurationInSeconds
  **/
  @ApiModelProperty(example = "null", value = "Sets the time, in seconds, until the lock expires when there is no activity on the envelope.  If no value is entered, then the default value of 300 seconds is used. The maximum value is 1,800 seconds.  The lock duration can be extended. ")
  public String getLockDurationInSeconds() {
    return lockDurationInSeconds;
  }

  public void setLockDurationInSeconds(String lockDurationInSeconds) {
    this.lockDurationInSeconds = lockDurationInSeconds;
  }

  public LockInformation lockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
    return this;
  }

   /**
   * Specifies the friendly name of  the application that is locking the envelope.
   * @return lockedByApp
  **/
  @ApiModelProperty(example = "null", value = "Specifies the friendly name of  the application that is locking the envelope.")
  public String getLockedByApp() {
    return lockedByApp;
  }

  public void setLockedByApp(String lockedByApp) {
    this.lockedByApp = lockedByApp;
  }

  public LockInformation lockedByUser(UserInfo lockedByUser) {
    this.lockedByUser = lockedByUser;
    return this;
  }

   /**
   * Get lockedByUser
   * @return lockedByUser
  **/
  @ApiModelProperty(example = "null", value = "")
  public UserInfo getLockedByUser() {
    return lockedByUser;
  }

  public void setLockedByUser(UserInfo lockedByUser) {
    this.lockedByUser = lockedByUser;
  }

  public LockInformation lockedUntilDateTime(String lockedUntilDateTime) {
    this.lockedUntilDateTime = lockedUntilDateTime;
    return this;
  }

   /**
   * The datetime until the envelope lock expires.
   * @return lockedUntilDateTime
  **/
  @ApiModelProperty(example = "null", value = "The datetime until the envelope lock expires.")
  public String getLockedUntilDateTime() {
    return lockedUntilDateTime;
  }

  public void setLockedUntilDateTime(String lockedUntilDateTime) {
    this.lockedUntilDateTime = lockedUntilDateTime;
  }

  public LockInformation lockToken(String lockToken) {
    this.lockToken = lockToken;
    return this;
  }

   /**
   * A unique identifier provided to the owner of the envelope lock.   Used to prove ownership of the lock.
   * @return lockToken
  **/
  @ApiModelProperty(example = "null", value = "A unique identifier provided to the owner of the envelope lock.   Used to prove ownership of the lock.")
  public String getLockToken() {
    return lockToken;
  }

  public void setLockToken(String lockToken) {
    this.lockToken = lockToken;
  }

  public LockInformation lockType(String lockType) {
    this.lockType = lockType;
    return this;
  }

   /**
   * The type of envelope lock.  Currently \"edit\" is the only supported type.
   * @return lockType
  **/
  @ApiModelProperty(example = "null", value = "The type of envelope lock.  Currently \"edit\" is the only supported type.")
  public String getLockType() {
    return lockType;
  }

  public void setLockType(String lockType) {
    this.lockType = lockType;
  }

  public LockInformation useScratchPad(String useScratchPad) {
    this.useScratchPad = useScratchPad;
    return this;
  }

   /**
   * Reserved for future use.  Indicates whether a scratchpad is used for editing information.  
   * @return useScratchPad
  **/
  @ApiModelProperty(example = "null", value = "Reserved for future use.  Indicates whether a scratchpad is used for editing information.  ")
  public String getUseScratchPad() {
    return useScratchPad;
  }

  public void setUseScratchPad(String useScratchPad) {
    this.useScratchPad = useScratchPad;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockInformation lockInformation = (LockInformation) o;
    return Objects.equals(this.errorDetails, lockInformation.errorDetails) &&
        Objects.equals(this.lockDurationInSeconds, lockInformation.lockDurationInSeconds) &&
        Objects.equals(this.lockedByApp, lockInformation.lockedByApp) &&
        Objects.equals(this.lockedByUser, lockInformation.lockedByUser) &&
        Objects.equals(this.lockedUntilDateTime, lockInformation.lockedUntilDateTime) &&
        Objects.equals(this.lockToken, lockInformation.lockToken) &&
        Objects.equals(this.lockType, lockInformation.lockType) &&
        Objects.equals(this.useScratchPad, lockInformation.useScratchPad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails, lockDurationInSeconds, lockedByApp, lockedByUser, lockedUntilDateTime, lockToken, lockType, useScratchPad);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockInformation {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    lockDurationInSeconds: ").append(toIndentedString(lockDurationInSeconds)).append("\n");
    sb.append("    lockedByApp: ").append(toIndentedString(lockedByApp)).append("\n");
    sb.append("    lockedByUser: ").append(toIndentedString(lockedByUser)).append("\n");
    sb.append("    lockedUntilDateTime: ").append(toIndentedString(lockedUntilDateTime)).append("\n");
    sb.append("    lockToken: ").append(toIndentedString(lockToken)).append("\n");
    sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
    sb.append("    useScratchPad: ").append(toIndentedString(useScratchPad)).append("\n");
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

