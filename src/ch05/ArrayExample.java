package ch05;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intArr = new int[5];
		intArr[0] = 50;
		intArr[1] = 60;
		intArr[2] = 80;
		
		//intArr[]=)50,60,80,0,0}; 이렇게 구성되어 있다.
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
//		System.out.println(intArr[5]);
	}
}
