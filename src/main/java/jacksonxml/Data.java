package jacksonxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Data {
	@JacksonXmlProperty(localName = "id", isAttribute = true)
	private String id;
	@JacksonXmlProperty(localName = "first_name")
	private String firstName;
	@JacksonXmlProperty(localName = "last_name")
	private String lastName;
	@JacksonXmlProperty(localName = "age")
	private int age;
}
