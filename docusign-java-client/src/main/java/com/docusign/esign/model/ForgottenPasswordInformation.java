package com.docusign.esign.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex element that has up to four Question/Answer pairs for forgotten password information.
 */
@ApiModel(description = "A complex element that has up to four Question/Answer pairs for forgotten password information.")

public class ForgottenPasswordInformation {
  @JsonProperty("forgottenPasswordAnswer1")
  private String forgottenPasswordAnswer1 = null;

  @JsonProperty("forgottenPasswordAnswer2")
  private String forgottenPasswordAnswer2 = null;

  @JsonProperty("forgottenPasswordAnswer3")
  private String forgottenPasswordAnswer3 = null;

  @JsonProperty("forgottenPasswordAnswer4")
  private String forgottenPasswordAnswer4 = null;

  @JsonProperty("forgottenPasswordQuestion1")
  private String forgottenPasswordQuestion1 = null;

  @JsonProperty("forgottenPasswordQuestion2")
  private String forgottenPasswordQuestion2 = null;

  @JsonProperty("forgottenPasswordQuestion3")
  private String forgottenPasswordQuestion3 = null;

  @JsonProperty("forgottenPasswordQuestion4")
  private String forgottenPasswordQuestion4 = null;

  public ForgottenPasswordInformation forgottenPasswordAnswer1(String forgottenPasswordAnswer1) {
    this.forgottenPasswordAnswer1 = forgottenPasswordAnswer1;
    return this;
  }

   /**
   * The answer to the first forgotten password challenge question.
   * @return forgottenPasswordAnswer1
  **/
  @ApiModelProperty(example = "null", value = "The answer to the first forgotten password challenge question.")
  public String getForgottenPasswordAnswer1() {
    return forgottenPasswordAnswer1;
  }

  public void setForgottenPasswordAnswer1(String forgottenPasswordAnswer1) {
    this.forgottenPasswordAnswer1 = forgottenPasswordAnswer1;
  }

  public ForgottenPasswordInformation forgottenPasswordAnswer2(String forgottenPasswordAnswer2) {
    this.forgottenPasswordAnswer2 = forgottenPasswordAnswer2;
    return this;
  }

   /**
   * The answer to the second forgotten password challenge question.
   * @return forgottenPasswordAnswer2
  **/
  @ApiModelProperty(example = "null", value = "The answer to the second forgotten password challenge question.")
  public String getForgottenPasswordAnswer2() {
    return forgottenPasswordAnswer2;
  }

  public void setForgottenPasswordAnswer2(String forgottenPasswordAnswer2) {
    this.forgottenPasswordAnswer2 = forgottenPasswordAnswer2;
  }

  public ForgottenPasswordInformation forgottenPasswordAnswer3(String forgottenPasswordAnswer3) {
    this.forgottenPasswordAnswer3 = forgottenPasswordAnswer3;
    return this;
  }

   /**
   * The answer to the third forgotten password challenge question.
   * @return forgottenPasswordAnswer3
  **/
  @ApiModelProperty(example = "null", value = "The answer to the third forgotten password challenge question.")
  public String getForgottenPasswordAnswer3() {
    return forgottenPasswordAnswer3;
  }

  public void setForgottenPasswordAnswer3(String forgottenPasswordAnswer3) {
    this.forgottenPasswordAnswer3 = forgottenPasswordAnswer3;
  }

  public ForgottenPasswordInformation forgottenPasswordAnswer4(String forgottenPasswordAnswer4) {
    this.forgottenPasswordAnswer4 = forgottenPasswordAnswer4;
    return this;
  }

   /**
   * The answer to the fourth forgotten password challenge question.
   * @return forgottenPasswordAnswer4
  **/
  @ApiModelProperty(example = "null", value = "The answer to the fourth forgotten password challenge question.")
  public String getForgottenPasswordAnswer4() {
    return forgottenPasswordAnswer4;
  }

  public void setForgottenPasswordAnswer4(String forgottenPasswordAnswer4) {
    this.forgottenPasswordAnswer4 = forgottenPasswordAnswer4;
  }

  public ForgottenPasswordInformation forgottenPasswordQuestion1(String forgottenPasswordQuestion1) {
    this.forgottenPasswordQuestion1 = forgottenPasswordQuestion1;
    return this;
  }

   /**
   * The first challenge question presented to a user who has forgotten their password.
   * @return forgottenPasswordQuestion1
  **/
  @ApiModelProperty(example = "null", value = "The first challenge question presented to a user who has forgotten their password.")
  public String getForgottenPasswordQuestion1() {
    return forgottenPasswordQuestion1;
  }

  public void setForgottenPasswordQuestion1(String forgottenPasswordQuestion1) {
    this.forgottenPasswordQuestion1 = forgottenPasswordQuestion1;
  }

  public ForgottenPasswordInformation forgottenPasswordQuestion2(String forgottenPasswordQuestion2) {
    this.forgottenPasswordQuestion2 = forgottenPasswordQuestion2;
    return this;
  }

   /**
   * The second challenge question presented to a user who has forgotten their password.
   * @return forgottenPasswordQuestion2
  **/
  @ApiModelProperty(example = "null", value = "The second challenge question presented to a user who has forgotten their password.")
  public String getForgottenPasswordQuestion2() {
    return forgottenPasswordQuestion2;
  }

  public void setForgottenPasswordQuestion2(String forgottenPasswordQuestion2) {
    this.forgottenPasswordQuestion2 = forgottenPasswordQuestion2;
  }

  public ForgottenPasswordInformation forgottenPasswordQuestion3(String forgottenPasswordQuestion3) {
    this.forgottenPasswordQuestion3 = forgottenPasswordQuestion3;
    return this;
  }

   /**
   * The third challenge question presented to a user who has forgotten their password.
   * @return forgottenPasswordQuestion3
  **/
  @ApiModelProperty(example = "null", value = "The third challenge question presented to a user who has forgotten their password.")
  public String getForgottenPasswordQuestion3() {
    return forgottenPasswordQuestion3;
  }

  public void setForgottenPasswordQuestion3(String forgottenPasswordQuestion3) {
    this.forgottenPasswordQuestion3 = forgottenPasswordQuestion3;
  }

  public ForgottenPasswordInformation forgottenPasswordQuestion4(String forgottenPasswordQuestion4) {
    this.forgottenPasswordQuestion4 = forgottenPasswordQuestion4;
    return this;
  }

   /**
   * The fourth challenge question presented to a user who has forgotten their password.
   * @return forgottenPasswordQuestion4
  **/
  @ApiModelProperty(example = "null", value = "The fourth challenge question presented to a user who has forgotten their password.")
  public String getForgottenPasswordQuestion4() {
    return forgottenPasswordQuestion4;
  }

  public void setForgottenPasswordQuestion4(String forgottenPasswordQuestion4) {
    this.forgottenPasswordQuestion4 = forgottenPasswordQuestion4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForgottenPasswordInformation forgottenPasswordInformation = (ForgottenPasswordInformation) o;
    return Objects.equals(this.forgottenPasswordAnswer1, forgottenPasswordInformation.forgottenPasswordAnswer1) &&
        Objects.equals(this.forgottenPasswordAnswer2, forgottenPasswordInformation.forgottenPasswordAnswer2) &&
        Objects.equals(this.forgottenPasswordAnswer3, forgottenPasswordInformation.forgottenPasswordAnswer3) &&
        Objects.equals(this.forgottenPasswordAnswer4, forgottenPasswordInformation.forgottenPasswordAnswer4) &&
        Objects.equals(this.forgottenPasswordQuestion1, forgottenPasswordInformation.forgottenPasswordQuestion1) &&
        Objects.equals(this.forgottenPasswordQuestion2, forgottenPasswordInformation.forgottenPasswordQuestion2) &&
        Objects.equals(this.forgottenPasswordQuestion3, forgottenPasswordInformation.forgottenPasswordQuestion3) &&
        Objects.equals(this.forgottenPasswordQuestion4, forgottenPasswordInformation.forgottenPasswordQuestion4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forgottenPasswordAnswer1, forgottenPasswordAnswer2, forgottenPasswordAnswer3, forgottenPasswordAnswer4, forgottenPasswordQuestion1, forgottenPasswordQuestion2, forgottenPasswordQuestion3, forgottenPasswordQuestion4);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForgottenPasswordInformation {\n");
    
    sb.append("    forgottenPasswordAnswer1: ").append(toIndentedString(forgottenPasswordAnswer1)).append("\n");
    sb.append("    forgottenPasswordAnswer2: ").append(toIndentedString(forgottenPasswordAnswer2)).append("\n");
    sb.append("    forgottenPasswordAnswer3: ").append(toIndentedString(forgottenPasswordAnswer3)).append("\n");
    sb.append("    forgottenPasswordAnswer4: ").append(toIndentedString(forgottenPasswordAnswer4)).append("\n");
    sb.append("    forgottenPasswordQuestion1: ").append(toIndentedString(forgottenPasswordQuestion1)).append("\n");
    sb.append("    forgottenPasswordQuestion2: ").append(toIndentedString(forgottenPasswordQuestion2)).append("\n");
    sb.append("    forgottenPasswordQuestion3: ").append(toIndentedString(forgottenPasswordQuestion3)).append("\n");
    sb.append("    forgottenPasswordQuestion4: ").append(toIndentedString(forgottenPasswordQuestion4)).append("\n");
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

