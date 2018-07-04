package in.hari.java.ParserApp.resource;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import in.hari.java.ParserApp.service.ParserService;

@Path("/parser")
@Produces(MediaType.TEXT_PLAIN)
public class ParserResource {

	private ParserService _parser = new ParserService();

	@GET
	public String connectivityStatusCheck() {
		return "PARSER IS ALIVE";
	}

	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public String convertXtoJ(String data) {
		String result = "Input Received";
		try {
			result = _parser.xmlToJsonConverter(data);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String convertJtoX(String data) {
		String result = "Input Received";
		try {
			result = _parser.jsonToXmlConverter(data);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
