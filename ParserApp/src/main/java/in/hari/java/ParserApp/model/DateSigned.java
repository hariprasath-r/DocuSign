package in.hari.java.ParserApp.model;

public class DateSigned {
	
	private String documentId = null;
	
	private String fontSize = null;
	
	private String name = null;
	
	private String pageNumber = null;
	
	private String recipientId = null;
	
	private String tabLabel = null;

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getFontSize() {
		return fontSize;
	}

	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	public String getTabLabel() {
		return tabLabel;
	}

	public void setTabLabel(String tabLabel) {
		this.tabLabel = tabLabel;
	}

	@Override
	public String toString() {
		return "DateSigned [documentId=" + documentId + ", fontSize=" + fontSize + ", name=" + name + ", pageNumber="
				+ pageNumber + ", recipientId=" + recipientId + ", tabLabel=" + tabLabel + "]";
	}
	
}
