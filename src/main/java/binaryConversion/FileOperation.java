package binaryConversion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FileOperation {
	public static void main(String[] args) {
		writeFIle();
		System.out.println("Current Date/Time : " + currentDate("dd:MM:YYYY@hh:mm:ss"));
		System.out.println(
				"Configurable Date & Time function : " + dateFormatter("7-Jun-2013", "dd-MMMM-yyyy", "dd-MM-yyyy"));
//		String currentDate = currentDate();
//		System.out.println("Calculated Date : " + currentDate);
	}

	public static void writeFIle() {

		File file = new File(".\\xml");

		Boolean fileExists = file.exists();
		System.out.println("File existance : " + fileExists);
		if (!fileExists) {
			boolean s = file.mkdirs();
			System.out.println("Directory created : " + s);
		} else {
			System.err.println("Directory Already exist's ");
		}
		System.out.println("Absolute path " + file.getAbsolutePath());
		try {
			System.out.println("Canonical path " + file.getCanonicalPath());
			System.out.println("Given Path : " + file.getCanonicalPath());
		} catch (IOException e1) {
			System.err.println("Canonical path error : " + e1.getMessage());
		}

		PrintWriter printWriter = null;
		try {

			// TimeZone tz = TimeZone.getDefault();
			// System.out.println(tz.getDisplayName()); // India Standard Time

			// Current date & time filename
			// Calendar date = new GregorianCalendar();
			// date.setTimeZone(tz);
//			String dd = String.format("%02d", date.get(Calendar.DAY_OF_MONTH));
//			String mm = String.format("%02d", date.get(Calendar.MONTH) + 1);
//			String year = String.format("%02d", date.get(Calendar.YEAR));
//
//			System.out.println(dd + mm + year + " \t hours :" + date.get(Calendar.HOUR));
//			// work if else for am pm then set 12 hours
//			System.out.println(date.get(Calendar.AM_PM));
//			boolean hour0 = Boolean.valueOf(String.valueOf((date.get(Calendar.AM_PM))));
//			if (hour0) {
//
//			}
//			String hour = String.format("%02d", date.get(Calendar.HOUR)) == "0" ? "12"
//					: String.format("%02d", date.get(Calendar.HOUR));
//			String minute = String.format("%02d", date.get(Calendar.MINUTE));
//			String seconds = String.format("%02d", date.get(Calendar.SECOND));

			String TG_ID = "23";
			String PTO_ID = "10";
			final String fileName = "qrf_" + currentDate("ddMMyyyyHHmmss") + "_" + TG_ID + "_" + PTO_ID + ".xml";
			final String xmlFile = file.getCanonicalPath() + File.separator + fileName;
			System.out.println("Actual Path & File name : " + xmlFile);
			FileWriter fileWriter = new FileWriter(xmlFile);
			printWriter = new PrintWriter(fileWriter);
			String xmlPrototype = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
			printWriter.print(xmlPrototype);
			printWriter.print("<Message>Welcome</Message>");
			printWriter.print("<" + fileName + "/>");

		} catch (IOException e) {
			System.err.println("Something went Wrong ... " + e.getMessage());
		} finally {
			System.out.println("Closing print writer...");
			printWriter.close();
		}
	}

	public static String currentDate(String dateFormat) {
		// Convert Current System dates into desired format
		// Example "ddMMyyyyHHmmss" so the function will return date as 16022021123600
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
		LocalDateTime now = LocalDateTime.now();
		System.err.println("Current Date & Time : " + dtf.format(now) + " & Format : " + dateFormat);
		return dtf.format(now);
	}

	public static String dateFormatter(String actualDater, String actualDatesFormat, String requiredDateFormat) {
		// input "dd-MMM-yyyy" i.e. Date in this format
		SimpleDateFormat actualDatesFormater = new SimpleDateFormat(actualDatesFormat);

		// date convert in this format i.e "dd-MM-yyyy"
		SimpleDateFormat requiredDatesFormater = new SimpleDateFormat(requiredDateFormat);
		try {
			// Parse given date in given format
			Date date = actualDatesFormater.parse(actualDater);
			System.err.println("Date : " + date);
			System.out.println("Date format : " + actualDatesFormat + " & Date : " + actualDatesFormater.format(date));

			//
			String requiredDate = requiredDatesFormater.format(date);
			System.err.println("Required Date : " + requiredDate + " & Format : " + requiredDateFormat);
			return requiredDate;
		} catch (ParseException e) {
			System.err.println("Date Parsing error : " + e.getLocalizedMessage());
			return null;
		}
	}

}
