package jacksonLib;

public class QR_Common_Data {

	private String Requester_ID;
	private String language;
	private String TG_ID;
	private String TXN_Type;
	private String Txn_Ref_No;
	private String QR_Gen_Datetime;
	private String Tkt_Sl_No;
	private String Total_Fare;
	private String booking_lat;
	private String booking_lon;
	private String mobile;

	public QR_Common_Data() {

	}

	public QR_Common_Data(String requester_ID, String language, String tG_ID, String tXN_Type, String txn_Ref_No,
			String qR_Gen_Datetime, String tkt_Sl_No, String total_Fare, String booking_lat, String booking_lon,
			String mobile) {
		Requester_ID = requester_ID;
		this.language = language;
		TG_ID = tG_ID;
		TXN_Type = tXN_Type;
		Txn_Ref_No = txn_Ref_No;
		QR_Gen_Datetime = qR_Gen_Datetime;
		Tkt_Sl_No = tkt_Sl_No;
		Total_Fare = total_Fare;
		this.booking_lat = booking_lat;
		this.booking_lon = booking_lon;
		this.mobile = mobile;
	}

	public String getRequester_ID() {
		return Requester_ID;
	}

	public void setRequester_ID(String requester_ID) {
		Requester_ID = requester_ID;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTG_ID() {
		return TG_ID;
	}

	public void setTG_ID(String tG_ID) {
		TG_ID = tG_ID;
	}

	public String getTXN_Type() {
		return TXN_Type;
	}

	public void setTXN_Type(String tXN_Type) {
		TXN_Type = tXN_Type;
	}

	public String getTxn_Ref_No() {
		return Txn_Ref_No;
	}

	public void setTxn_Ref_No(String txn_Ref_No) {
		Txn_Ref_No = txn_Ref_No;
	}

	public String getQR_Gen_Datetime() {
		return QR_Gen_Datetime;
	}

	public void setQR_Gen_Datetime(String qR_Gen_Datetime) {
		QR_Gen_Datetime = qR_Gen_Datetime;
	}

	public String getTkt_Sl_No() {
		return Tkt_Sl_No;
	}

	public void setTkt_Sl_No(String tkt_Sl_No) {
		Tkt_Sl_No = tkt_Sl_No;
	}

	public String getTotal_Fare() {
		return Total_Fare;
	}

	public void setTotal_Fare(String total_Fare) {
		Total_Fare = total_Fare;
	}

	public String getBooking_lat() {
		return booking_lat;
	}

	public void setBooking_lat(String booking_lat) {
		this.booking_lat = booking_lat;
	}

	public String getBooking_lon() {
		return booking_lon;
	}

	public void setBooking_lon(String booking_lon) {
		this.booking_lon = booking_lon;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "QR_Common_Data [Requester_ID=" + Requester_ID + ", language=" + language + ", TG_ID=" + TG_ID
				+ ", TXN_Type=" + TXN_Type + ", Txn_Ref_No=" + Txn_Ref_No + ", QR_Gen_Datetime=" + QR_Gen_Datetime
				+ ", Tkt_Sl_No=" + Tkt_Sl_No + ", Total_Fare=" + Total_Fare + ", booking_lat=" + booking_lat
				+ ", booking_lon=" + booking_lon + ", mobile=" + mobile + "]";
	}

}
