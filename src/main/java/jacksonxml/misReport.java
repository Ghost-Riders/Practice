package jacksonxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "SBIEPAY")
public final class misReport {
//	@JacksonXmlElementWrapper(localName = "ORD", useWrapping = false)
//	private ORD ORD;
	@JacksonXmlElementWrapper(localName = "ORDD", useWrapping = false)
	private ORDD ORDD;

	@JacksonXmlProperty(localName = "schemaId", isAttribute = true)
	private String schemaId;

	@JacksonXmlProperty(localName = "SUMMDTLS")
	private SUMMDTLS summdtls;

}
