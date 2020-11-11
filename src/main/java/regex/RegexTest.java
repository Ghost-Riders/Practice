package regex;

import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	// private static final Logger LOGGER =
	// LoggerFactory.getLogger(RegexTest.class);

	public static void main(String[] args) {
		String ticketBlockRegexPattern = "[\\%]{1}[0-9]{1}[\\|]{1}[0-9a-z]{3}[\\|]{1}[0-9]{3}[\\|]{1}[0-9a-zA-Z]{8}[\\|]{1}[0-9a-zA-Z]{3}[\\|]{1}[0-9a-zA-Z]{3}[\\|]{1}[0-9]{1}[\\|]{1}[0-9]{1}[\\|]{1}[0-9a-zA-Z]{2}[\\|]{1}[0-9_]{6}[\\%]{1}";
		String operatorBlockRegexPattern = "[\\(\\<]{2}[0-9]{1}[\\|]{1}[0-9]{1}[\\|]{1}[0-9]{2}[\\|\\[]{2}[\\%]{1}[0-9]{1}[\\|]{1}[0-9a-z]{3}[\\|]{1}[0-9]{3}[\\|]{1}[0-9a-zA-Z]{8}[\\|]{1}[0-9a-zA-Z]{3}[\\|]{1}[0-9a-zA-Z]{3}[\\|]{1}[0-9]{1}[\\|]{1}[0-9]{1}[\\|]{1}[0-9a-zA-Z]{2}[\\|]{1}[0-9_]{6}[\\%]{1}";
		// \\%{1}\\|{1}[0-9A-Za-z]{3}
		String originalString = "{()(<2|2|10|[%1|45c|863|5ee50642|1e0|9c4|1|0|b4|0061_0%%1|45c|863|5ee50642|1e0|9c4|1|0|b4|0061_0%]>)(<2|2|10|[%1|45c|863|5ee50642|1e0|9c4|1|0|b4|0061_0%%1|45c|863|5ee50642|1e0|9c4|1|0|b4|0061_0%]>)}";

		String strRepeat = String.join("",
				Collections.nCopies(Integer.parseInt(originalString.substring(7, 8)), ticketBlockRegexPattern));
		GroupCount(operatorBlockRegexPattern, originalString);
		System.out.println("repeated String : " + strRepeat);

		// GroupCount(operatorBlockRegexPattern, originalString);

	}

	public static String GroupCount(String regexPattern, String originalString) {
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(originalString);
		int i = 0;
		while (matcher.find()) {
			System.out.println("I found the text " + matcher.group() + " starting at index " + matcher.start()
					+ " and ending at index " + matcher.end());
			i++;
		}
		System.out.println(matcher.matches() + " count: " + i);

		// LOGGER.info(String.valueOf(matcher.matches()));
		return "";
	}

}
