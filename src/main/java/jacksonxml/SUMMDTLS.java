package jacksonxml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SUMMDTLS {
	@JacksonXmlProperty(localName = "TORDCT")
	private String TORDCT;
	@JacksonXmlProperty(localName = "TORDAMT")
	private String TORDAMT;
	@JacksonXmlProperty(localName = "TORDCY")
	private String TORDCY;
	@JacksonXmlProperty(localName = "TREFCNT")
	private String TREFCNT;
	@JacksonXmlProperty(localName = "TREFAMT")
	private String TREFAMT;
	@JacksonXmlProperty(localName = "TREFCY")
	private String TREFCY;

	public SUMMDTLS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTORDCT() {
		return TORDCT;
	}

	public void setTORDCT(String tORDCT) {
		TORDCT = tORDCT;
	}

	public String getTORDAMT() {
		return TORDAMT;
	}

	public void setTORDAMT(String tORDAMT) {
		TORDAMT = tORDAMT;
	}

	public String getTORDCY() {
		return TORDCY;
	}

	public void setTORDCY(String tORDCY) {
		TORDCY = tORDCY;
	}

	public String getTREFCNT() {
		return TREFCNT;
	}

	public void setTREFCNT(String tREFCNT) {
		TREFCNT = tREFCNT;
	}

	public String getTREFAMT() {
		return TREFAMT;
	}

	public void setTREFAMT(String tREFAMT) {
		TREFAMT = tREFAMT;
	}

	public String getTREFCY() {
		return TREFCY;
	}

	public void setTREFCY(String tREFCY) {
		TREFCY = tREFCY;
	}

	@Override
	public String toString() {
		return "SUMMDTLS [TORDCT=" + TORDCT + ", TORDAMT=" + TORDAMT + ", TORDCY=" + TORDCY + ", TREFCNT=" + TREFCNT
				+ ", TREFAMT=" + TREFAMT + ", TREFCY=" + TREFCY + "]";
	}

}
