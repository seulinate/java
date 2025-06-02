package ch04;

public class Test1 {

	public static void main(String[] args) {
		
		int x =5;
		boolean b2 = false;
		boolean b1 = true;
		if((x==4) && !b2) // false && true => false
			System.out.print("1");
		System.out.print("2");
		if((b2 = true) && b1) // b2에 true 값 대입하니까 true && true => true  
			System.out.print("3");
		
	}

}
