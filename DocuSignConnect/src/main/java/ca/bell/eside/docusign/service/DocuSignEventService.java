package ca.bell.eside.docusign.service;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import ca.bell.eside.logger.ESIDELoggerUtil;

/**
 * Service that handles the data received from DocuSign and stores the logs the data
 * @author Hariprasath.Ravi
 *
 */
public class DocuSignEventService {
	
	private final String fileName = "";
	private final String source = "DocuSign";
	private final String destination = "ESIDE";
	private final String logMessage = "DocuSign Event Request";
	
	private boolean saveAsFile = false;
	private final String xmlFileDirectory = "DocuSignEvents/";
	private File filesDirectory = null;
	
	public DocuSignEventService() {
		filesDirectory = new File("/temp/"+xmlFileDirectory);
	}

	/**
	 * Method processes the incoming DocuSign Connect data and saves as XML.
	 * 
	 * Note: The processing time of this method must be less than 100 seconds to ensure DocuSign's request doesn't timeout.
	 * Future enhancement: 
	 * 	1.	Create a queue to receive data from DocuSign.
	 * 	2.	Create a separate service to consume messages from queue and process using this method.  
	 * 
	 * @param data
	 * @return
	 */
	public String payloadParser(String data) {
		System.out.println(">---Received the package---<");
//		System.out.println(data);
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		String envelopeID;
		String timeGenerated;
		String status;
		
		try {
			
			builder = documentFactory.newDocumentBuilder();
			Document xml = builder.parse(new InputSource(new StringReader(data)));
			Element envelopeStatus = (Element) xml.getElementsByTagName("EnvelopeStatus").item(0);
			envelopeID = envelopeStatus.getElementsByTagName("EnvelopeID").item(0).getChildNodes().item(0).getNodeValue();
			timeGenerated = envelopeStatus.getElementsByTagName("TimeGenerated").item(0).getChildNodes().item(0).getNodeValue();
			status = envelopeStatus.getElementsByTagName("Status").item(0).getChildNodes().item(0).getNodeValue();
			
			System.out.println(">---Envelope ID :: "+envelopeID+"---<");
			System.out.println(">---Envelope Generated Time :: "+timeGenerated+"---<");
			
			ESIDELoggerUtil.logMessage(data, fileName, logMessage, source, destination, envelopeID, status);
			if(saveAsFile)
				saveAsFile(envelopeID, timeGenerated, data);
			
			
		} catch (ParserConfigurationException e) {
			System.out.println(">---DocumentBuilder creation failed :: "+e.getLocalizedMessage()+"---<");
			e.printStackTrace();
		} catch (SAXException | IOException e) {
			System.out.println(">---Document parsing failed :: "+"---<");
			e.printStackTrace();
		}
		
		return "received";
	}
	
	/**
	 * Method to save the data received from DocuSign as XML file
	 * 
	 * Checks existence of a directory, if not creates directory, sets permission to read, write and execute to the directory
	 * 
	 * @param envelopeID
	 * @param timeGenerated
	 * @param data
	 */
	public void saveAsFile(String envelopeID, String timeGenerated, String data) {
		if(!filesDirectory.isDirectory()) {
			if(!filesDirectory.mkdir())
				System.out.println(">---Directory creation failed---<");
			filesDirectory.setReadable(true, false);
			filesDirectory.setWritable(true, false);
			filesDirectory.setExecutable(true, false);
		}
	}
	
}
