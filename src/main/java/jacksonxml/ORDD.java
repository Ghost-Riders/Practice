package jacksonxml;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class ORDD {

	@JacksonXmlElementWrapper(localName = "ORD", useWrapping = false)
	private List<ORD> ORD;
}
