package ch03;

public class NotOpExample {
	public static void main(String[] args) {
		byte binData = 0b0000_1000;
		System.out.println(binData);
		System.out.println(~binData);
		System.out.println((byte)0b1111_0111);
		
		boolean isTrue = false;
		System.out.println(!isTrue);
	}

}
