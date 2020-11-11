package jacksonLib;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class MapToJSON {
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		Security security = new Security();
		security.setSecurity_Scheme("4");

		QR_Dataset_Version qr_Dataset_Version = new QR_Dataset_Version();
		qr_Dataset_Version.setVersion_No("4");

		QR_Common_Data qr_Common_Data = new QR_Common_Data();
		qr_Common_Data.setRequester_ID("14");
		qr_Common_Data.setLanguage("0");
		qr_Common_Data.setTG_ID("7");
		qr_Common_Data.setTXN_Type("65");
		qr_Common_Data.setTxn_Ref_No("SBI");
		qr_Common_Data.setQR_Gen_Datetime("15/10/2020@15-17-21");
		qr_Common_Data.setTkt_Sl_No("15102020151721W0000000898");
		qr_Common_Data.setTotal_Fare("2500");
		qr_Common_Data.setBooking_lat("");
		qr_Common_Data.setBooking_lon("");
		qr_Common_Data.setMobile("9876543210");

		TicketInfo1 ticketInfo1 = new TicketInfo1();
		ticketInfo1.setGrp_size("1");
		ticketInfo1.setSrc_Stn("2260");
		ticketInfo1.setDest_Stn("28136");
		ticketInfo1.setActivation_date("15/10/2020@15-01-19");
		ticketInfo1.setTkt_validity("480");
		ticketInfo1.setTicket_Fare("2500");
		ticketInfo1.setProduct_id("1");
		ticketInfo1.setService_id("0");
		ticketInfo1.setDuration("180");
		ticketInfo1.setRoute_id("2410_0");

		QR_Ticket_Block qr_Ticket_Block = new QR_Ticket_Block();
		qr_Ticket_Block.setOperator_id("2");
		qr_Ticket_Block.setNoOfTickets("1");
		qr_Ticket_Block.setValidator_info("16");
		qr_Ticket_Block.setTicketInfo1(ticketInfo1);

		HashMap<String, Object> hashmap = new HashMap();
		record_1 record_1 = new record_1();
		record_1.setSecurity(security);
		record_1.setQr_Dataset_Version(qr_Dataset_Version);
		record_1.setQr_Common_Data(qr_Common_Data);
		record_1.setQr_Ticket_Block(qr_Ticket_Block);

		int i = 1;
		hashmap.put("filename", "fname564645465465456.json");

		for (i = 1; i < 10; i++) {
			hashmap.put("record_" + i, record_1);
			hashmap.put("no_of_records", String.valueOf(i));
		}
		

		try {
			// Convert Map to JSON
			String json = mapper.writeValueAsString(hashmap);
			mapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);

			mapper.enable(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS);
			mapper.writeValue(new File("D:\\Kaptan sir\\QR_workspace\\Practice\\target\\abc.json"), hashmap);
			// Print JSON output
			System.out.println(json);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}