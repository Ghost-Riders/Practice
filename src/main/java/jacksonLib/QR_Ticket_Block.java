package jacksonLib;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QR_Ticket_Block {
	private String operator_id;
	private String NoOfTickets;
	private String validator_info;
	private TicketInfo1 ticketInfo1;
	@JsonProperty("ticketInfo2")
	private TicketInfo1 ticketInfo2;
	@JsonProperty("ticketInfo3")
	private TicketInfo1 ticketInfo3;
	@JsonProperty("ticketInfo4")
	private TicketInfo1 ticketInfo4;
	@JsonProperty("ticketInfo5")
	private TicketInfo1 ticketInfo5;
	@JsonProperty("ticketInfo6")
	private TicketInfo1 ticketInfo6;
	@JsonProperty("ticketInfo7")
	private TicketInfo1 ticketInfo7;
	@JsonProperty("ticketInfo8")
	private TicketInfo1 ticketInfo8;
	@JsonProperty("ticketInfo9")
	private TicketInfo1 ticketInfo9;
	@JsonProperty("ticketInfo10")
	private TicketInfo1 ticketInfo10;

	public QR_Ticket_Block() {

	}

	public QR_Ticket_Block(String operator_id, String noOfTickets, String validator_info, TicketInfo1 ticketInfo1) {

		this.operator_id = operator_id;
		NoOfTickets = noOfTickets;
		this.validator_info = validator_info;
		this.ticketInfo1 = ticketInfo1;
	}

	public String getOperator_id() {
		return operator_id;
	}

	public void setOperator_id(String operator_id) {
		this.operator_id = operator_id;
	}

	public String getNoOfTickets() {
		return NoOfTickets;
	}

	public void setNoOfTickets(String noOfTickets) {
		NoOfTickets = noOfTickets;
	}

	public String getValidator_info() {
		return validator_info;
	}

	public void setValidator_info(String validator_info) {
		this.validator_info = validator_info;
	}

	public TicketInfo1 getTicketInfo1() {
		return ticketInfo1;
	}

	public void setTicketInfo1(TicketInfo1 ticketInfo1) {
		this.ticketInfo1 = ticketInfo1;
	}

	@Override
	public String toString() {
		return "QR_Ticket_Block [operator_id=" + operator_id + ", NoOfTickets=" + NoOfTickets + ", validator_info="
				+ validator_info + ", ticketInfo1=" + ticketInfo1 + "]";
	}

	public TicketInfo1 getTicketInfo2() {
		return ticketInfo2;
	}

	public void setTicketInfo2(TicketInfo1 ticketInfo2) {
		this.ticketInfo2 = ticketInfo2;
	}

	public TicketInfo1 getTicketInfo3() {
		return ticketInfo3;
	}

	public void setTicketInfo3(TicketInfo1 ticketInfo3) {
		this.ticketInfo3 = ticketInfo3;
	}

	public TicketInfo1 getTicketInfo4() {
		return ticketInfo4;
	}

	public void setTicketInfo4(TicketInfo1 ticketInfo4) {
		this.ticketInfo4 = ticketInfo4;
	}

	public TicketInfo1 getTicketInfo5() {
		return ticketInfo5;
	}

	public void setTicketInfo5(TicketInfo1 ticketInfo5) {
		this.ticketInfo5 = ticketInfo5;
	}

	public TicketInfo1 getTicketInfo6() {
		return ticketInfo6;
	}

	public void setTicketInfo6(TicketInfo1 ticketInfo6) {
		this.ticketInfo6 = ticketInfo6;
	}

	public TicketInfo1 getTicketInfo7() {
		return ticketInfo7;
	}

	public void setTicketInfo7(TicketInfo1 ticketInfo7) {
		this.ticketInfo7 = ticketInfo7;
	}

	public TicketInfo1 getTicketInfo8() {
		return ticketInfo8;
	}

	public void setTicketInfo8(TicketInfo1 ticketInfo8) {
		this.ticketInfo8 = ticketInfo8;
	}

	public TicketInfo1 getTicketInfo9() {
		return ticketInfo9;
	}

	public void setTicketInfo9(TicketInfo1 ticketInfo9) {
		this.ticketInfo9 = ticketInfo9;
	}

	public TicketInfo1 getTicketInfo10() {
		return ticketInfo10;
	}

	public void setTicketInfo10(TicketInfo1 ticketInfo10) {
		this.ticketInfo10 = ticketInfo10;
	}

}
