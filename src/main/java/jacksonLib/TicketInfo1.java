package jacksonLib;

public class TicketInfo1 {
	private String grp_size;
	private String Src_Stn;
	private String Dest_Stn;
	private String activation_date;
	private String tkt_validity;
	private String Ticket_Fare;
	private String product_id;
	private String service_id;
	private String duration;
	private String route_id;

	public TicketInfo1() {

	}

	public TicketInfo1(String grp_size, String src_Stn, String dest_Stn, String activation_date, String tkt_validity,
			String ticket_Fare, String product_id, String service_id, String duration, String route_id) {
		this.grp_size = grp_size;
		Src_Stn = src_Stn;
		Dest_Stn = dest_Stn;
		this.activation_date = activation_date;
		this.tkt_validity = tkt_validity;
		Ticket_Fare = ticket_Fare;
		this.product_id = product_id;
		this.service_id = service_id;
		this.duration = duration;
		this.route_id = route_id;
	}

	public String getGrp_size() {
		return grp_size;
	}

	public void setGrp_size(String grp_size) {
		this.grp_size = grp_size;
	}

	public String getSrc_Stn() {
		return Src_Stn;
	}

	public void setSrc_Stn(String src_Stn) {
		Src_Stn = src_Stn;
	}

	public String getDest_Stn() {
		return Dest_Stn;
	}

	public void setDest_Stn(String dest_Stn) {
		Dest_Stn = dest_Stn;
	}

	public String getActivation_date() {
		return activation_date;
	}

	public void setActivation_date(String activation_date) {
		this.activation_date = activation_date;
	}

	public String getTkt_validity() {
		return tkt_validity;
	}

	public void setTkt_validity(String tkt_validity) {
		this.tkt_validity = tkt_validity;
	}

	public String getTicket_Fare() {
		return Ticket_Fare;
	}

	public void setTicket_Fare(String ticket_Fare) {
		Ticket_Fare = ticket_Fare;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getService_id() {
		return service_id;
	}

	public void setService_id(String service_id) {
		this.service_id = service_id;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getRoute_id() {
		return route_id;
	}

	public void setRoute_id(String route_id) {
		this.route_id = route_id;
	}

	@Override
	public String toString() {
		return "TicketInfo1 [grp_size=" + grp_size + ", Src_Stn=" + Src_Stn + ", Dest_Stn=" + Dest_Stn
				+ ", activation_date=" + activation_date + ", tkt_validity=" + tkt_validity + ", Ticket_Fare="
				+ Ticket_Fare + ", product_id=" + product_id + ", service_id=" + service_id + ", duration=" + duration
				+ ", route_id=" + route_id + "]";
	}

}
