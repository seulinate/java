package ch03;

public class DecimalToBinaryExample {
	public static void main(String[] args) {
		int decimalNumber = 23; 
		String binaryString = Integer.toBinaryString(decimalNumber);
		System.out.println(binaryString);
		System.out.println("2진수 문자열 = "+binaryString);
	}
}