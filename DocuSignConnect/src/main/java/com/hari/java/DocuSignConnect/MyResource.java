package com.hari.java.DocuSignConnect;

import java.io.IOException;
import java.io.StringReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * @author Hariprasath.Ravi
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @POST
    public String listener(String data) {
    	System.out.println("Entered");
    	System.out.println("Data received :: \n"+data);
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		
		org.w3c.dom.Document xml = null;
		try {
			builder = factory.newDocumentBuilder();
			xml = builder.parse(new InputSource(new StringReader(data)));
			xml.getDocumentElement().normalize();
			System.out.println("Normalized");
			Element envelopeStatus = (Element) xml.getElementsByTagName("EnvelopeStatus").item(0);
			String envelopeId = envelopeStatus.getElementsByTagName("EnvelopeID").item(0).getChildNodes().item(0).getNodeValue();
			System.out.println("Envelope ID :: "+envelopeId);
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		xml.getDocumentElement ().normalize();
		System.out.println("Connect data parsed!");
		Element envelopeStatus = (Element) xml.getElementsByTagName("EnvelopeStatus").item(0);
		String envelopeId = envelopeStatus.getElementsByTagName("EnvelopeID").item(0).getChildNodes().item(0).getNodeValue();
		System.out.println("Envelope ID : "+envelopeId);
		
		return data;
    }
    
}
