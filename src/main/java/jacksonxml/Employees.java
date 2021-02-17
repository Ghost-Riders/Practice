package jacksonxml;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "employees")
public final class Employees {
	@JacksonXmlElementWrapper(localName = "employee", useWrapping = false)
	private List<Employee> employee;

	@JacksonXmlElementWrapper(localName = "gate", useWrapping = false)
	private gate gate;

	@JacksonXmlProperty(localName = "s", isAttribute = true)
	private String s;

}