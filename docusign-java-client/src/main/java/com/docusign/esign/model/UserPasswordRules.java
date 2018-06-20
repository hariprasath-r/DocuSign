package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AccountPasswordRules;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserPasswordRules
 */

public class UserPasswordRules {
  @JsonProperty("passwordRules")
  private AccountPasswordRules passwordRules = null;

  @JsonProperty("userId")
  private String userId = null;

  public UserPasswordRules passwordRules(AccountPasswordRules passwordRules) {
    this.passwordRules = passwordRules;
    return this;
  }

   /**
   * Get passwordRules
   * @return passwordRules
  **/
  @ApiModelProperty(example = "null", value = "")
  public AccountPasswordRules getPasswordRules() {
    return passwordRules;
  }

  public void setPasswordRules(AccountPasswordRules passwordRules) {
    this.passwordRules = passwordRules;
  }

  public UserPasswordRules userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPasswordRules userPasswordRules = (UserPasswordRules) o;
    return Objects.equals(this.passwordRules, userPasswordRules.passwordRules) &&
        Objects.equals(this.userId, userPasswordRules.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordRules, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPasswordRules {\n");
    
    sb.append("    passwordRules: ").append(toIndentedString(passwordRules)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

