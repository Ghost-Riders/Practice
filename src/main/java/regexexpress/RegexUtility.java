package regexexpress;

import java.util.regex.Pattern;

public class RegexUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// r[27 character ORD].xml - RRN file
		// Acquirer ID(H2)+Operator ID(H4)+Terminal ID(H6)+Media Type(H1)+Julian Date(N6
		// YDDDHH)+STAN(N6)+LRC(H2)
		System.out.println(Pattern.matches("^[r]{1}[a-zA-Z0-9]{13}[0-9]{12}[a-zA-Z0-9]{2}\\.[xml|XML]{3}$",
				"r0100020123000025506000013B5.XML"));

		// batr_[6 digit nFlSeqno]_[12 digit nFlDtTmLcTxn].xml - Batch (Consolidated)
		// RRN file
		System.out.println("batr : " + Pattern.matches("^[batr]{4}\\_[0-9]{6}\\_[0-9]{12}\\.[xml|XML]{3}$",
				"batr_010002_012300002550.XML"));

		// qr_DDMMYYYYhhmmss_<TG_ID>_<PTO_ID>.JSON.
		System.out.println(Pattern.matches("^[q]{1}[r]{1}[0-9]{14}[\\_][0-9]{0,5}[\\_][0-9]{0,5}\\.[json|JSON]{4}$",
				"qr10092020181928_07_02.json"));

		// 4. Financial Settlement MIS Report for QRs bought online through Mobile APP
		// or Webclient from TG => AFC: – qrf_DDMMYYYYhhmmss_<TG_ID>_<PTO_ID>. Eg.
		// qrf_13062020031015_23_135.json
		System.out.println(
				Pattern.matches("^[q]{1}[r]{1}[f]{1}[\\_][0-9]{14}[\\_][0-9]{0,5}[\\_][0-9]{0,5}\\.[json|JSON]{4}$",
						"qrf_13062020031015_23_135.json"));

		// 5. Financial Settlement MIS Report for Paper-based QRs bought at TOM from TG
		// => AFC: – qrfp_DDMMYYYYhhmmss_<TG_ID>_<PTO_ID>. Eg.
		// qrfp_14062020113045_23_135.json
		System.out.println(Pattern.matches("^[qrfp]{4}[\\_][0-9]{14}[\\_][0-9]{0,5}[\\_][0-9]{0,5}\\.[json|JSON]{4}$",
				"qrfp_14062020113045_23_135.json"));
	}

}
