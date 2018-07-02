package in.hari.java.ParserApp.resource;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.hari.java.ParserApp.service.ParserService;

@Path("/parser")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.TEXT_PLAIN)
public class ParserResource {
	
	private ParserService _parser = new ParserService();
	
	@GET
	public String connectivityStatusCheck() {
		return "PARSER IS ALIVE";
	}

	@POST
	public String convertTest(String data) {
		try {
			_parser.xTojConvertor(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Input Received";
	}
}
