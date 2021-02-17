package binaryConversion;

public class BinaryConversion {

	public static void main(String[] args) {
		int x = 20;
		System.out.println("Uer Input : " + x);
		String binaryString = Integer.toBinaryString(x);

		System.out.println("Binary Conversion  " + binaryString);

		// Stringbuilder to set char at index
		StringBuilder stringBuilder = new StringBuilder(binaryString);
		stringBuilder.setCharAt(3, '1');

		System.out.println(" bit changed : " + stringBuilder);
		// String conversion from builder=>String
		String binaryStringModified = new String(stringBuilder);

		// String binary to integer decimal
		int binary = Integer.parseInt(binaryStringModified, 2);
		System.out.println("Binary Modification : " + Integer.toBinaryString(binary) + " " + binary);

		int decimal = Integer.parseInt(binaryStringModified, 2);
		System.out.println("Integer Conversion " + decimal);

	}

}
