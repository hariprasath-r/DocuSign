package ca.bell.eside.docusign.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ca.bell.eside.docusign.service.DocuSignEventService;

/**
 * Resource to accept DocuSign events through DocuSign Connect
 * @author Hariprasath.Ravi
 *
 */
@Path("/eventListener")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class DocuSignResource {
	
	private DocuSignEventService eventService = new DocuSignEventService();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String serviceStatus() {
		return "Service is Up and Running";
	}
	
	/**
	 * Resource to receive Event details and Notifications from DocuSign through DocuSign Connect
	 * @param data
	 * @return
	 */
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String docuSignListener(String data) {
		String responseMessage = null;
		System.out.println(">---DocuSign call initiated---<");
		responseMessage = eventService.payloadParser(data);
		if(null == responseMessage)
			System.out.println(">---Error in parsing---<");
		return responseMessage;
	}
}
