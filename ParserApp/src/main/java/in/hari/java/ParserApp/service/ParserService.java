package in.hari.java.ParserApp.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import in.hari.java.ParserApp.model.ESignature;

public class ParserService {

	public ESignature eSignature;
	
	private ObjectMapper mapper = null;
	
	public void xTojConvertor(String data) throws JsonParseException, JsonMappingException, IOException {
		System.out.println(">---Input Data---<\n"+data);
		
		mapper = new XmlMapper();
		eSignature = mapper.readValue(data.getBytes(), ESignature.class);
		System.out.println(">---POJO---<\n"+eSignature);
		
		mapper = new ObjectMapper();
		
//		JsonObject json = mapper.readValue(eSignature, ESignature.class);
		
		
		/*
		 * Converts Object to JSON as string
		 */
		String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(eSignature);
		System.out.println(">---JSON---<\n"+jsonData);
	}
	
	
}
