package in.hari.java.ParserApp.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class EnvelopeDefinition {

	private List<Document> documents = new ArrayList<>();
	
	private String emailSubject = null;
	
	private Recipients recipients = null;
	
	private String status = null;

	@JacksonXmlElementWrapper(useWrapping=false)
	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public Recipients getRecipients() {
		return recipients;
	}

	public void setRecipients(Recipients recipients) {
		this.recipients = recipients;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EnvelopeDefinition [documents=" + documents + ", emailSubject=" + emailSubject + ", recipients="
				+ recipients + ", status=" + status + "]";
	}
	
}
