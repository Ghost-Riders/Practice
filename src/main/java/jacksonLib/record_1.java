package jacksonLib;

public class record_1 {
	private Security security;
	private QR_Dataset_Version qr_Dataset_Version;
	private QR_Common_Data qr_Common_Data;
	private QR_Ticket_Block qr_Ticket_Block;

	public record_1() {

	}

	public record_1(Security security, QR_Dataset_Version qr_Dataset_Version, QR_Common_Data qr_Common_Data,
			QR_Ticket_Block qr_Ticket_Block) {
		this.security = security;
		this.qr_Dataset_Version = qr_Dataset_Version;
		this.qr_Common_Data = qr_Common_Data;
		this.qr_Ticket_Block = qr_Ticket_Block;
	}

	public Security getSecurity() {
		return security;
	}

	public void setSecurity(Security security) {
		this.security = security;
	}

	public QR_Dataset_Version getQr_Dataset_Version() {
		return qr_Dataset_Version;
	}

	public void setQr_Dataset_Version(QR_Dataset_Version qr_Dataset_Version) {
		this.qr_Dataset_Version = qr_Dataset_Version;
	}

	public QR_Common_Data getQr_Common_Data() {
		return qr_Common_Data;
	}

	public void setQr_Common_Data(QR_Common_Data qr_Common_Data) {
		this.qr_Common_Data = qr_Common_Data;
	}

	public QR_Ticket_Block getQr_Ticket_Block() {
		return qr_Ticket_Block;
	}

	public void setQr_Ticket_Block(QR_Ticket_Block qr_Ticket_Block) {
		this.qr_Ticket_Block = qr_Ticket_Block;
	}

	@Override
	public String toString() {
		return "record_1 [security=" + security + ", qr_Dataset_Version=" + qr_Dataset_Version + ", qr_Common_Data="
				+ qr_Common_Data + ", qr_Ticket_Block=" + qr_Ticket_Block + "]";
	}

}
