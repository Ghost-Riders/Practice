package jacksonxml;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class gate {

	@JacksonXmlElementWrapper(localName = "data", useWrapping = false)
	private List<Data> data;
}
