package jacksonxml;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlParser {
	public static void main(String[] args) {
		sbiEpay();
	}

	public static void employeeParser() {
		File file = new File(".\\src\\main\\resources\\spacestation.xml");
		System.out.println("path" + file.getPath());

		ObjectMapper mapper = new XmlMapper();
		Employees employees = new Employees();
		try {
			employees = mapper.readValue(file, Employees.class);
		} catch (JsonParseException e) {
			System.out.println(e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		String xmlString = null;
		try {
			xmlString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employees);
		} catch (JsonProcessingException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(xmlString);

	}

	public static void sbiEpay() {
		File file = new File(".\\src\\main\\resources\\mis.xml");
		System.out.println("path" + file.getPath());

		ObjectMapper mapper = new XmlMapper();
		misReport misReport = new misReport();
		try {
			misReport = mapper.readValue(file, misReport.class);
		} catch (JsonParseException e) {
			System.out.println(e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		String xmlString = null;
		try {
			xmlString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(misReport);
		} catch (JsonProcessingException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(xmlString);

	}
}
