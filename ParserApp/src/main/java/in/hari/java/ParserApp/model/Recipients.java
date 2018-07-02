package in.hari.java.ParserApp.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Recipients {

	@JacksonXmlElementWrapper(useWrapping=false)
	private List<CarbonCopy> carbonCopies = new ArrayList<CarbonCopy>();
	
	@JacksonXmlElementWrapper(useWrapping=false)
	private List<Signer> signers = new ArrayList<Signer>();

	public List<CarbonCopy> getCarbonCopies() {
		return carbonCopies;
	}

	public void setCarbonCopies(List<CarbonCopy> carbonCopies) {
		this.carbonCopies = carbonCopies;
	}

	public List<Signer> getSigners() {
		return signers;
	}

	public void setSigners(List<Signer> signers) {
		this.signers = signers;
	}

	@Override
	public String toString() {
		return "Recipients [carbonCopies=" + carbonCopies + ", signers=" + signers + "]";
	}
	
}
