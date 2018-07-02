package in.hari.java.ParserApp.model;

public class Document {

	private String documentBase64 = null;
	
	private String documentId = null;
	
	private String fileExtension = null;
	
	private String name = null;

	public String getDocumentBase64() {
		return documentBase64;
	}

	public void setDocumentBase64(String documentBase64) {
		this.documentBase64 = documentBase64;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Document [documentBase64=" + documentBase64 + ", documentId=" + documentId + ", fileExtension="
				+ fileExtension + ", name=" + name + "]";
	}

}
