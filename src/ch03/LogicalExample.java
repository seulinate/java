package ch03;

public class LogicalExample {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		boolean condition1 = x > 0 && y < 20; //T
		boolean condition2 = x > 0 || y > 20; //T
		boolean condition3 = !(x<0) && (y != 10); //F
		System.out.println("Conditon 1 :" + condition1);
		System.out.println("Conditon 2 :" + condition2);
		System.out.println("Conditon 3 :" + condition3);
		
		boolean condition4 = (x > 0 && y <20) || !(x<0) && (y !=10);
		System.out.println("Condition 4 : "+ condition4);
	}

}
