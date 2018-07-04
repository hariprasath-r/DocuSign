package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.AddressInformationInput;
import com.docusign.esign.model.DobInformationInput;
import com.docusign.esign.model.Ssn4InformationInput;
import com.docusign.esign.model.Ssn9InformationInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex element that contains input information related to a recipient ID check. It can include the following information.  addressInformationInput: Used to set recipient address information and consists of:  * addressInformation: consists of six elements, with stree2 and zipPlus4 being optional. The elements are: street1, street2, city, state, zip, zipPlus4. The maximum length of each element is: street1/street2 &#x3D; 150 characters, city &#x3D; 50 characters, state &#x3D; 2 characters, and zip/zipPlus4 &#x3D; 20 characters. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay. * receiveInResponse: A Boolean element that specifies if the information needs to be returned in the response.  dobInformationInput: Used to set recipient date of birth information and consists of:  * dateOfBirth: Specifies the recipient&#39;s date, month and year of birth. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay. * receiveInResponse: A Boolean element that specifies if the information needs to be returned in the response.  ssn4InformationInput: Used to set the last four digits of the recipient&#39;s SSN information and consists of:  * ssn4: Specifies the last four digits of the recipient&#39;s SSN. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay. * receiveInResponse: A Boolean element that specifies if the information needs to be returned in the response.  ssn9InformationInput: Used to set the recipient&#39;s SSN information. Note that the ssn9 information can never be returned in the response. The ssn9 input consists of:  * ssn9: Specifies the recipient&#39;s SSN. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay.
 */
@ApiModel(description = "A complex element that contains input information related to a recipient ID check. It can include the following information.  addressInformationInput: Used to set recipient address information and consists of:  * addressInformation: consists of six elements, with stree2 and zipPlus4 being optional. The elements are: street1, street2, city, state, zip, zipPlus4. The maximum length of each element is: street1/street2 = 150 characters, city = 50 characters, state = 2 characters, and zip/zipPlus4 = 20 characters. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay. * receiveInResponse: A Boolean element that specifies if the information needs to be returned in the response.  dobInformationInput: Used to set recipient date of birth information and consists of:  * dateOfBirth: Specifies the recipient's date, month and year of birth. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay. * receiveInResponse: A Boolean element that specifies if the information needs to be returned in the response.  ssn4InformationInput: Used to set the last four digits of the recipient's SSN information and consists of:  * ssn4: Specifies the last four digits of the recipient's SSN. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay. * receiveInResponse: A Boolean element that specifies if the information needs to be returned in the response.  ssn9InformationInput: Used to set the recipient's SSN information. Note that the ssn9 information can never be returned in the response. The ssn9 input consists of:  * ssn9: Specifies the recipient's SSN. * displayLevelCode: Specifies the display level for the recipient. Values are: ReadOnly, Editable, or DoNotDisplay.")

public class IdCheckInformationInput {
  @JsonProperty("addressInformationInput")
  private AddressInformationInput addressInformationInput = null;

  @JsonProperty("dobInformationInput")
  private DobInformationInput dobInformationInput = null;

  @JsonProperty("ssn4InformationInput")
  private Ssn4InformationInput ssn4InformationInput = null;

  @JsonProperty("ssn9InformationInput")
  private Ssn9InformationInput ssn9InformationInput = null;

  public IdCheckInformationInput addressInformationInput(AddressInformationInput addressInformationInput) {
    this.addressInformationInput = addressInformationInput;
    return this;
  }

   /**
   * Get addressInformationInput
   * @return addressInformationInput
  **/
  @ApiModelProperty(example = "null", value = "")
  public AddressInformationInput getAddressInformationInput() {
    return addressInformationInput;
  }

  public void setAddressInformationInput(AddressInformationInput addressInformationInput) {
    this.addressInformationInput = addressInformationInput;
  }

  public IdCheckInformationInput dobInformationInput(DobInformationInput dobInformationInput) {
    this.dobInformationInput = dobInformationInput;
    return this;
  }

   /**
   * Get dobInformationInput
   * @return dobInformationInput
  **/
  @ApiModelProperty(example = "null", value = "")
  public DobInformationInput getDobInformationInput() {
    return dobInformationInput;
  }

  public void setDobInformationInput(DobInformationInput dobInformationInput) {
    this.dobInformationInput = dobInformationInput;
  }

  public IdCheckInformationInput ssn4InformationInput(Ssn4InformationInput ssn4InformationInput) {
    this.ssn4InformationInput = ssn4InformationInput;
    return this;
  }

   /**
   * Get ssn4InformationInput
   * @return ssn4InformationInput
  **/
  @ApiModelProperty(example = "null", value = "")
  public Ssn4InformationInput getSsn4InformationInput() {
    return ssn4InformationInput;
  }

  public void setSsn4InformationInput(Ssn4InformationInput ssn4InformationInput) {
    this.ssn4InformationInput = ssn4InformationInput;
  }

  public IdCheckInformationInput ssn9InformationInput(Ssn9InformationInput ssn9InformationInput) {
    this.ssn9InformationInput = ssn9InformationInput;
    return this;
  }

   /**
   * Get ssn9InformationInput
   * @return ssn9InformationInput
  **/
  @ApiModelProperty(example = "null", value = "")
  public Ssn9InformationInput getSsn9InformationInput() {
    return ssn9InformationInput;
  }

  public void setSsn9InformationInput(Ssn9InformationInput ssn9InformationInput) {
    this.ssn9InformationInput = ssn9InformationInput;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdCheckInformationInput idCheckInformationInput = (IdCheckInformationInput) o;
    return Objects.equals(this.addressInformationInput, idCheckInformationInput.addressInformationInput) &&
        Objects.equals(this.dobInformationInput, idCheckInformationInput.dobInformationInput) &&
        Objects.equals(this.ssn4InformationInput, idCheckInformationInput.ssn4InformationInput) &&
        Objects.equals(this.ssn9InformationInput, idCheckInformationInput.ssn9InformationInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressInformationInput, dobInformationInput, ssn4InformationInput, ssn9InformationInput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdCheckInformationInput {\n");
    
    sb.append("    addressInformationInput: ").append(toIndentedString(addressInformationInput)).append("\n");
    sb.append("    dobInformationInput: ").append(toIndentedString(dobInformationInput)).append("\n");
    sb.append("    ssn4InformationInput: ").append(toIndentedString(ssn4InformationInput)).append("\n");
    sb.append("    ssn9InformationInput: ").append(toIndentedString(ssn9InformationInput)).append("\n");
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

