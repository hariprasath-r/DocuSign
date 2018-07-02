package in.hari.java.ParserApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="ESignatureCreateRequest")
@JsonRootName(value="ESignatureCreateRequest")
public class ESignature {

	public class InputDO {
		
		private String dsOperation;
		
		private String sourceSystem;
		
		@JsonProperty("envelopeInformation")
		private EnvelopeDefinition envelopeDefinition = null;
		
		public String getDsOperation() {
			return dsOperation;
		}

		public void setDsOperation(String dsOperation) {
			this.dsOperation = dsOperation;
		}

		public String getSourceSystem() {
			return sourceSystem;
		}

		public void setSourceSystem(String sourceSystem) {
			this.sourceSystem = sourceSystem;
		}

		public EnvelopeDefinition getEnvelopeDefinition() {
			return envelopeDefinition;
		}

		public void setEnvelopeDefinition(EnvelopeDefinition envelopeDefinition) {
			this.envelopeDefinition = envelopeDefinition;
		}

		@Override
		public String toString() {
			return "InputDO [dsOperation=" + dsOperation + ", sourceSystem=" + sourceSystem + ", envelopeDefinition="
					+ envelopeDefinition + "]";
		}

	}
	
	private InputDO inputDO;

	public InputDO getInputDO() {
		return inputDO;
	}

	public void setInputDO(InputDO inputDO) {
		this.inputDO = inputDO;
	}

	@Override
	public String toString() {
		return "ESignature [inputDO=" + inputDO + "]";
	}
	
}
