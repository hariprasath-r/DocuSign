package in.hari.java.ParserApp.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Tabs {

	@JacksonXmlElementWrapper(useWrapping=false)
	private List<DateSigned> dateSignedTabs = new ArrayList<DateSigned>();

	public List<DateSigned> getDateSignedTabs() {
		return dateSignedTabs;
	}

	public void setDateSignedTabs(List<DateSigned> dateSignedTabs) {
		this.dateSignedTabs = dateSignedTabs;
	}

	@Override
	public String toString() {
		return "Tabs [dateSignedTabs=" + dateSignedTabs + "]";
	}
	
}
