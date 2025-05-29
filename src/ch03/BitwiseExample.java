package ch03;

public class BitwiseExample {

	public static void main(String[] args) {
		byte a = 5; //00000101
		byte b = 3; //00000011
		System.out.println(a & b);  // 00000001  => 1
		System.out.println(a | b ); //00000111 => 4 + 2 + 1  = 7 
		System.out.println(a ^ b); // 00000110 =? 4 + 2 = 6
	}

}
