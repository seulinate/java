package ch07.modifier2;

import ch07.modifier3.Super5;

public class Sub5 extends Super5{
	private int num5 = 5;
	
	public void print() {
		System.out.println("super num1:" + num1);
		System.out.println("super num2:" + num2);
//		System.out.println("super num3:" + num3);
//		System.out.println("super num4:" + num4);
		System.out.println("super num1:" + num5);
		System.out.println("super num4: " + getNum4());
	}


}
