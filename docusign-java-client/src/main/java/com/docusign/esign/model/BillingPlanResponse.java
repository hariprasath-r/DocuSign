package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BillingPlan;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Defines a billing plan response object.
 */
@ApiModel(description = "Defines a billing plan response object.")

public class BillingPlanResponse {
  @JsonProperty("billingPlan")
  private BillingPlan billingPlan = null;

  @JsonProperty("successorPlans")
  private java.util.List<BillingPlan> successorPlans = new java.util.ArrayList<BillingPlan>();

  public BillingPlanResponse billingPlan(BillingPlan billingPlan) {
    this.billingPlan = billingPlan;
    return this;
  }

   /**
   * Get billingPlan
   * @return billingPlan
  **/
  @ApiModelProperty(example = "null", value = "")
  public BillingPlan getBillingPlan() {
    return billingPlan;
  }

  public void setBillingPlan(BillingPlan billingPlan) {
    this.billingPlan = billingPlan;
  }

  public BillingPlanResponse successorPlans(java.util.List<BillingPlan> successorPlans) {
    this.successorPlans = successorPlans;
    return this;
  }

  public BillingPlanResponse addSuccessorPlansItem(BillingPlan successorPlansItem) {
    this.successorPlans.add(successorPlansItem);
    return this;
  }

   /**
   * 
   * @return successorPlans
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<BillingPlan> getSuccessorPlans() {
    return successorPlans;
  }

  public void setSuccessorPlans(java.util.List<BillingPlan> successorPlans) {
    this.successorPlans = successorPlans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingPlanResponse billingPlanResponse = (BillingPlanResponse) o;
    return Objects.equals(this.billingPlan, billingPlanResponse.billingPlan) &&
        Objects.equals(this.successorPlans, billingPlanResponse.successorPlans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPlan, successorPlans);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPlanResponse {\n");
    
    sb.append("    billingPlan: ").append(toIndentedString(billingPlan)).append("\n");
    sb.append("    successorPlans: ").append(toIndentedString(successorPlans)).append("\n");
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

