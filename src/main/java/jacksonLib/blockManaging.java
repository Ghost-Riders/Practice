package jacksonLib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class blockManaging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> items = new ArrayList<String>();
		items.add("{()(<2|1|10|[%2|bd7|d26|5f6b2545|1e0|1388|1|0|b4|1220_0%]>)}");
		items.add("{()(<3|1|10|[%4|bd7|d26|5f6b2545|1e0|2710|1|0|b4|1220_0%]>)}");
		items.add("{()(<2|1|10|[%2|bd7|d26|5f6b2545|1e1|1388|1|0|b4|1220_0%]>)}");
		items.add("{()(<3|1|10|[%4|bd7|d26|5f6b2545|1e2|2710|1|0|b4|1220_0%]>)}");
		items.add("{()(<2|1|10|[%2|bd7|d26|5f6b2545|1e3|1388|1|0|b4|1220_0%]>)}");
		items.add("{()(<3|1|10|[%4|bd7|d26|5f6b2545|1e4|2710|1|0|b4|1220_0%]>)}");
		items.add("{()(<2|1|10|[%2|bd7|d26|5f6b2545|1e5|1388|1|0|b4|1220_0%]>)}");
		items.add("{()(<4|1|10|[%4|bd7|d26|5f6b2545|1e6|2710|1|0|b4|1220_0%]>)}");

		HashMap<Integer, String> hashmap = new HashMap();
		for (String opr : items) {
			hashmap.put(Integer.valueOf(opr.substring(5, 6)), opr.substring(5, 6));
		}
		System.out.println("Display Operators : " + hashmap);
		String multipleOperators = "";
		// using values() for iteration over keys
		for (String operatorId : hashmap.values()) {
			String opstr = "";
			// System.out.println("value: " + url+"\n keys : "+hashmap.keySet());
			String operatorBlockRegexPattern = "[\\(\\<]{2}[" + operatorId + "]{0,6}[\\|]{1}";
			// System.out.println(operatorBlockRegexPattern);
			int noOfTicketsBlock = 0;

			for (String string : items) {
				String str = GroupCount(operatorBlockRegexPattern, string);
				if (str != null) {
					noOfTicketsBlock++;
					opstr = opstr + "%" + str + "%";
				}
			}
			System.out.println(" opstr : " + opstr);
			String validator_info = Integer.toHexString(16);
			opstr = "(<" + operatorId + "|" + noOfTicketsBlock + "|" + validator_info + "[" + opstr + "]>)";
			System.out.println(" opstr final : " + opstr);
			multipleOperators = multipleOperators + opstr;
			opstr = null;
		}
		multipleOperators = "{()" + multipleOperators + "}";
		System.out.println("Multiple Operator Final : " + multipleOperators);
		// opstr = "{()" + opstr + "}";
		// System.out.println(" opstr : " + opstr);
		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// System.out.println(result);

	}

	public static String GroupCount(String regexPattern, String originalString) {
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(originalString);
		String tblock = null;
		while (matcher.find()) {
			// System.out.println("I found the text " + originalString);
			String tb2[] = originalString.split("\\%");
			tblock = tb2[1];
			// System.out.println("tb2[] : " + tblock);
		}
		// LOGGER.info(String.valueOf(matcher.matches()));
		return tblock;
	}

}
