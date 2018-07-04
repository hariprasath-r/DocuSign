package in.hari.java.ParserApp.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import in.hari.java.ParserApp.model.ESignature;

public class ParserService {

	public ESignature eSignature;
	
	private ObjectMapper mapper = null;
	
	public String xmlToJsonConverter(String data) throws JsonParseException, JsonMappingException, IOException {
		System.out.println(">---Input XML---<\n"+data);
		
		/*
		 * Converting XML to POJO
		 */
		mapper = new XmlMapper();
		eSignature = mapper.readValue(data.getBytes(), ESignature.class);
		System.out.println(">---POJO---<\n"+eSignature);
		
		/*
		 * Converting POJO to JSON as string
		 * 1. SerializationFeature.WRAP_ROOT_VALUE is used to get Root element also
		 * 2. We can configure the ObjectMapper using configure or refer next method on how to use enable
		 */
		mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
		String jsonData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(eSignature);
		System.out.println(">---JSON---<\n"+jsonData);
		
		return jsonData;
	}
	
	public String jsonToXmlConverter(String data) throws JsonParseException, JsonMappingException, IOException {
		System.out.println(">---Input JSON---<\n"+data);
		
		/*
		 * Converting JSON to POJO
		 * 1. DeserializationFeature.UNWRAP_ROOT_VALUE to unwrap root value. 
		 * 2. Instead of configuring, we can use enable method to enable that specific configuration
		 */
		mapper = new ObjectMapper();
		mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
		eSignature = mapper.readValue(data.getBytes(), ESignature.class);
		System.out.println(">---POJO---<\n"+eSignature);
		
		/*
		 * Converting POJO to XML
		 * 1. SerializationFeature.INDENT_OUTPUT used to INDENT or Pretty print XML
		 */
		mapper = new XmlMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		String xmlData = mapper.writeValueAsString(eSignature);
		System.out.println(">---XML---<\n"+xmlData);
		
		return xmlData;
	}
	
}
