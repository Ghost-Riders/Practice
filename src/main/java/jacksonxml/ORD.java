package jacksonxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ORD {
	@JacksonXmlProperty(localName = "ATRN")
	private long ATRN;
	@JacksonXmlProperty(localName = "SN")
	private String SN;
	@JacksonXmlProperty(localName = "SDT")
	private String SDT;
	@JacksonXmlProperty(localName = "MID")
	private String MID;
	@JacksonXmlProperty(localName = "MN")
	private String MN;
	@JacksonXmlProperty(localName = "MORDN")
	private String MORDN;
	@JacksonXmlProperty(localName = "ORDBDT")
	private String ORDBDT;
	@JacksonXmlProperty(localName = "ORDAMT")
	private String ORDAMT;
	@JacksonXmlProperty(localName = "ORDCY")
	private String ORDCY;
	@JacksonXmlProperty(localName = "PMC")
	private String PMC;
	@JacksonXmlProperty(localName = "GNM")
	private String GNM;
	@JacksonXmlProperty(localName = "GTN")
	private String GTN;
	@JacksonXmlProperty(localName = "PAYPROC")
	private String PAYPROC;
	@JacksonXmlProperty(localName = "SAMT")
	private String SAMT;
	@JacksonXmlProperty(localName = "SCY")
	private String SCY;
	@JacksonXmlProperty(localName = "COM")
	private String COM;
	@JacksonXmlProperty(localName = "GST")
	private String GST;
	@JacksonXmlProperty(localName = "ORDSTS")
	private String ORDSTS;
	@JacksonXmlProperty(localName = "STSDES")
	private String STSDES;
	@JacksonXmlProperty(localName = "PAYAMT")
	private String PAYAMT;
	@JacksonXmlProperty(localName = "OD")
	private String OD;

}
