package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddOn;
import com.docusign.esign.model.FeatureSet;
import com.docusign.esign.model.SeatDiscount;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Contains information about an account billing plan.
 */
@ApiModel(description = "Contains information about an account billing plan.")

public class AccountBillingPlan {
  @JsonProperty("addOns")
  private java.util.List<AddOn> addOns = new java.util.ArrayList<AddOn>();

  @JsonProperty("canCancelRenewal")
  private String canCancelRenewal = null;

  @JsonProperty("canUpgrade")
  private String canUpgrade = null;

  @JsonProperty("currencyCode")
  private String currencyCode = null;

  @JsonProperty("enableSupport")
  private String enableSupport = null;

  @JsonProperty("includedSeats")
  private String includedSeats = null;

  @JsonProperty("incrementalSeats")
  private String incrementalSeats = null;

  @JsonProperty("isDowngrade")
  private String isDowngrade = null;

  @JsonProperty("otherDiscountPercent")
  private String otherDiscountPercent = null;

  @JsonProperty("paymentCycle")
  private String paymentCycle = null;

  @JsonProperty("paymentMethod")
  private String paymentMethod = null;

  @JsonProperty("perSeatPrice")
  private String perSeatPrice = null;

  @JsonProperty("planClassification")
  private String planClassification = null;

  @JsonProperty("planFeatureSets")
  private java.util.List<FeatureSet> planFeatureSets = new java.util.ArrayList<FeatureSet>();

  @JsonProperty("planId")
  private String planId = null;

  @JsonProperty("planName")
  private String planName = null;

  @JsonProperty("renewalStatus")
  private String renewalStatus = null;

  @JsonProperty("seatDiscounts")
  private java.util.List<SeatDiscount> seatDiscounts = new java.util.ArrayList<SeatDiscount>();

  @JsonProperty("supportIncidentFee")
  private String supportIncidentFee = null;

  @JsonProperty("supportPlanFee")
  private String supportPlanFee = null;

  public AccountBillingPlan addOns(java.util.List<AddOn> addOns) {
    this.addOns = addOns;
    return this;
  }

  public AccountBillingPlan addAddOnsItem(AddOn addOnsItem) {
    this.addOns.add(addOnsItem);
    return this;
  }

   /**
   * Reserved:
   * @return addOns
  **/
  @ApiModelProperty(example = "null", value = "Reserved:")
  public java.util.List<AddOn> getAddOns() {
    return addOns;
  }

  public void setAddOns(java.util.List<AddOn> addOns) {
    this.addOns = addOns;
  }

  public AccountBillingPlan canCancelRenewal(String canCancelRenewal) {
    this.canCancelRenewal = canCancelRenewal;
    return this;
  }

   /**
   * Reserved: TBD
   * @return canCancelRenewal
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getCanCancelRenewal() {
    return canCancelRenewal;
  }

  public void setCanCancelRenewal(String canCancelRenewal) {
    this.canCancelRenewal = canCancelRenewal;
  }

  public AccountBillingPlan canUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
    return this;
  }

   /**
   * When set to **true**, specifies that you can upgrade the account through the API.
   * @return canUpgrade
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, specifies that you can upgrade the account through the API.")
  public String getCanUpgrade() {
    return canUpgrade;
  }

  public void setCanUpgrade(String canUpgrade) {
    this.canUpgrade = canUpgrade;
  }

  public AccountBillingPlan currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Specifies the ISO currency code for the account.
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "Specifies the ISO currency code for the account.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public AccountBillingPlan enableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
    return this;
  }

   /**
   * When set to **true**, then customer support is provided as part of the account plan.
   * @return enableSupport
  **/
  @ApiModelProperty(example = "null", value = "When set to **true**, then customer support is provided as part of the account plan.")
  public String getEnableSupport() {
    return enableSupport;
  }

  public void setEnableSupport(String enableSupport) {
    this.enableSupport = enableSupport;
  }

  public AccountBillingPlan includedSeats(String includedSeats) {
    this.includedSeats = includedSeats;
    return this;
  }

   /**
   * The number of seats (users) included.
   * @return includedSeats
  **/
  @ApiModelProperty(example = "null", value = "The number of seats (users) included.")
  public String getIncludedSeats() {
    return includedSeats;
  }

  public void setIncludedSeats(String includedSeats) {
    this.includedSeats = includedSeats;
  }

  public AccountBillingPlan incrementalSeats(String incrementalSeats) {
    this.incrementalSeats = incrementalSeats;
    return this;
  }

   /**
   * Reserved: TBD
   * @return incrementalSeats
  **/
  @ApiModelProperty(example = "null", value = "Reserved: TBD")
  public String getIncrementalSeats() {
    return incrementalSeats;
  }

  public void setIncrementalSeats(String incrementalSeats) {
    this.incrementalSeats = incrementalSeats;
  }

  public AccountBillingPlan isDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
    return this;
  }

   /**
   * 
   * @return isDowngrade
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsDowngrade() {
    return isDowngrade;
  }

  public void setIsDowngrade(String isDowngrade) {
    this.isDowngrade = isDowngrade;
  }

  public AccountBillingPlan otherDiscountPercent(String otherDiscountPercent) {
    this.otherDiscountPercent = otherDiscountPercent;
    return this;
  }

   /**
   *  Any other percentage discount for the plan. 
   * @return otherDiscountPercent
  **/
  @ApiModelProperty(example = "null", value = " Any other percentage discount for the plan. ")
  public String getOtherDiscountPercent() {
    return otherDiscountPercent;
  }

  public void setOtherDiscountPercent(String otherDiscountPercent) {
    this.otherDiscountPercent = otherDiscountPercent;
  }

  public AccountBillingPlan paymentCycle(String paymentCycle) {
    this.paymentCycle = paymentCycle;
    return this;
  }

   /**
   * 
   * @return paymentCycle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPaymentCycle() {
    return paymentCycle;
  }

  public void setPaymentCycle(String paymentCycle) {
    this.paymentCycle = paymentCycle;
  }

  public AccountBillingPlan paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   *  The payment method used with the plan. The possible values are: CreditCard, PurchaseOrder, Premium, or Freemium. 
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "null", value = " The payment method used with the plan. The possible values are: CreditCard, PurchaseOrder, Premium, or Freemium. ")
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public AccountBillingPlan perSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
    return this;
  }

   /**
   * 
   * @return perSeatPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPerSeatPrice() {
    return perSeatPrice;
  }

  public void setPerSeatPrice(String perSeatPrice) {
    this.perSeatPrice = perSeatPrice;
  }

  public AccountBillingPlan planClassification(String planClassification) {
    this.planClassification = planClassification;
    return this;
  }

   /**
   * Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.
   * @return planClassification
  **/
  @ApiModelProperty(example = "null", value = "Identifies the type of plan. Examples include Business, Corporate, Enterprise, Free.")
  public String getPlanClassification() {
    return planClassification;
  }

  public void setPlanClassification(String planClassification) {
    this.planClassification = planClassification;
  }

  public AccountBillingPlan planFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
    return this;
  }

  public AccountBillingPlan addPlanFeatureSetsItem(FeatureSet planFeatureSetsItem) {
    this.planFeatureSets.add(planFeatureSetsItem);
    return this;
  }

   /**
   * A complex type that sets the feature sets for the account. It contains the following information (all string content):  * currencyFeatureSetPrices - Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, seatFee that are configured for this plan feature set. * envelopeFee - An incremental envelope cost for plans with envelope overages (when isEnabled=true). * featureSetId - A unique ID for the feature set. * fixedFee - A one-time fee associated with the plan (when isEnabled=true). * isActive - Specifies whether the feature set is actively set as part of the plan. * isEnabled - Specifies whether the feature set is actively enabled as part of the plan. * name - The name of the feature set. * seatFee - An incremental seat cost for seat-based plans (when isEnabled=true). 
   * @return planFeatureSets
  **/
  @ApiModelProperty(example = "null", value = "A complex type that sets the feature sets for the account. It contains the following information (all string content):  * currencyFeatureSetPrices - Contains the currencyCode and currencySymbol for the alternate currency values for envelopeFee, fixedFee, seatFee that are configured for this plan feature set. * envelopeFee - An incremental envelope cost for plans with envelope overages (when isEnabled=true). * featureSetId - A unique ID for the feature set. * fixedFee - A one-time fee associated with the plan (when isEnabled=true). * isActive - Specifies whether the feature set is actively set as part of the plan. * isEnabled - Specifies whether the feature set is actively enabled as part of the plan. * name - The name of the feature set. * seatFee - An incremental seat cost for seat-based plans (when isEnabled=true). ")
  public java.util.List<FeatureSet> getPlanFeatureSets() {
    return planFeatureSets;
  }

  public void setPlanFeatureSets(java.util.List<FeatureSet> planFeatureSets) {
    this.planFeatureSets = planFeatureSets;
  }

  public AccountBillingPlan planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * 
   * @return planId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public AccountBillingPlan planName(String planName) {
    this.planName = planName;
    return this;
  }

   /**
   * The name of the Billing Plan.
   * @return planName
  **/
  @ApiModelProperty(example = "null", value = "The name of the Billing Plan.")
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }

  public AccountBillingPlan renewalStatus(String renewalStatus) {
    this.renewalStatus = renewalStatus;
    return this;
  }

   /**
   * The renewal status for the account. The acceptable values are:  * auto: The account automatically renews. * queued_for_close: Account will be closed at the billingPeriodEndDate. * queued_for_downgrade: Account will be downgraded at the billingPeriodEndDate.
   * @return renewalStatus
  **/
  @ApiModelProperty(example = "null", value = "The renewal status for the account. The acceptable values are:  * auto: The account automatically renews. * queued_for_close: Account will be closed at the billingPeriodEndDate. * queued_for_downgrade: Account will be downgraded at the billingPeriodEndDate.")
  public String getRenewalStatus() {
    return renewalStatus;
  }

  public void setRenewalStatus(String renewalStatus) {
    this.renewalStatus = renewalStatus;
  }

  public AccountBillingPlan seatDiscounts(java.util.List<SeatDiscount> seatDiscounts) {
    this.seatDiscounts = seatDiscounts;
    return this;
  }

  public AccountBillingPlan addSeatDiscountsItem(SeatDiscount seatDiscountsItem) {
    this.seatDiscounts.add(seatDiscountsItem);
    return this;
  }

   /**
   *  A complex type that contains any seat discount information.  Values are: BeginSeatCount, EndSeatCount, and SeatDiscountPercent.  
   * @return seatDiscounts
  **/
  @ApiModelProperty(example = "null", value = " A complex type that contains any seat discount information.  Values are: BeginSeatCount, EndSeatCount, and SeatDiscountPercent.  ")
  public java.util.List<SeatDiscount> getSeatDiscounts() {
    return seatDiscounts;
  }

  public void setSeatDiscounts(java.util.List<SeatDiscount> seatDiscounts) {
    this.seatDiscounts = seatDiscounts;
  }

  public AccountBillingPlan supportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
    return this;
  }

   /**
   * The support incident fee charged for each support incident.
   * @return supportIncidentFee
  **/
  @ApiModelProperty(example = "null", value = "The support incident fee charged for each support incident.")
  public String getSupportIncidentFee() {
    return supportIncidentFee;
  }

  public void setSupportIncidentFee(String supportIncidentFee) {
    this.supportIncidentFee = supportIncidentFee;
  }

  public AccountBillingPlan supportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
    return this;
  }

   /**
   * The support plan fee charged for this plan.
   * @return supportPlanFee
  **/
  @ApiModelProperty(example = "null", value = "The support plan fee charged for this plan.")
  public String getSupportPlanFee() {
    return supportPlanFee;
  }

  public void setSupportPlanFee(String supportPlanFee) {
    this.supportPlanFee = supportPlanFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBillingPlan accountBillingPlan = (AccountBillingPlan) o;
    return Objects.equals(this.addOns, accountBillingPlan.addOns) &&
        Objects.equals(this.canCancelRenewal, accountBillingPlan.canCancelRenewal) &&
        Objects.equals(this.canUpgrade, accountBillingPlan.canUpgrade) &&
        Objects.equals(this.currencyCode, accountBillingPlan.currencyCode) &&
        Objects.equals(this.enableSupport, accountBillingPlan.enableSupport) &&
        Objects.equals(this.includedSeats, accountBillingPlan.includedSeats) &&
        Objects.equals(this.incrementalSeats, accountBillingPlan.incrementalSeats) &&
        Objects.equals(this.isDowngrade, accountBillingPlan.isDowngrade) &&
        Objects.equals(this.otherDiscountPercent, accountBillingPlan.otherDiscountPercent) &&
        Objects.equals(this.paymentCycle, accountBillingPlan.paymentCycle) &&
        Objects.equals(this.paymentMethod, accountBillingPlan.paymentMethod) &&
        Objects.equals(this.perSeatPrice, accountBillingPlan.perSeatPrice) &&
        Objects.equals(this.planClassification, accountBillingPlan.planClassification) &&
        Objects.equals(this.planFeatureSets, accountBillingPlan.planFeatureSets) &&
        Objects.equals(this.planId, accountBillingPlan.planId) &&
        Objects.equals(this.planName, accountBillingPlan.planName) &&
        Objects.equals(this.renewalStatus, accountBillingPlan.renewalStatus) &&
        Objects.equals(this.seatDiscounts, accountBillingPlan.seatDiscounts) &&
        Objects.equals(this.supportIncidentFee, accountBillingPlan.supportIncidentFee) &&
        Objects.equals(this.supportPlanFee, accountBillingPlan.supportPlanFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOns, canCancelRenewal, canUpgrade, currencyCode, enableSupport, includedSeats, incrementalSeats, isDowngrade, otherDiscountPercent, paymentCycle, paymentMethod, perSeatPrice, planClassification, planFeatureSets, planId, planName, renewalStatus, seatDiscounts, supportIncidentFee, supportPlanFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBillingPlan {\n");
    
    sb.append("    addOns: ").append(toIndentedString(addOns)).append("\n");
    sb.append("    canCancelRenewal: ").append(toIndentedString(canCancelRenewal)).append("\n");
    sb.append("    canUpgrade: ").append(toIndentedString(canUpgrade)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    enableSupport: ").append(toIndentedString(enableSupport)).append("\n");
    sb.append("    includedSeats: ").append(toIndentedString(includedSeats)).append("\n");
    sb.append("    incrementalSeats: ").append(toIndentedString(incrementalSeats)).append("\n");
    sb.append("    isDowngrade: ").append(toIndentedString(isDowngrade)).append("\n");
    sb.append("    otherDiscountPercent: ").append(toIndentedString(otherDiscountPercent)).append("\n");
    sb.append("    paymentCycle: ").append(toIndentedString(paymentCycle)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    perSeatPrice: ").append(toIndentedString(perSeatPrice)).append("\n");
    sb.append("    planClassification: ").append(toIndentedString(planClassification)).append("\n");
    sb.append("    planFeatureSets: ").append(toIndentedString(planFeatureSets)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    renewalStatus: ").append(toIndentedString(renewalStatus)).append("\n");
    sb.append("    seatDiscounts: ").append(toIndentedString(seatDiscounts)).append("\n");
    sb.append("    supportIncidentFee: ").append(toIndentedString(supportIncidentFee)).append("\n");
    sb.append("    supportPlanFee: ").append(toIndentedString(supportPlanFee)).append("\n");
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

