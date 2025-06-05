package ch07.modifier;

import ch07.modifier2.Sub5;
import ch07.modifier3.Super5;

public class ModifierExample {
	public static void main(String[] args) {
		System.out.println("super 참조");
		
		Super5 sup = new Super5();
		System.out.println("num1 =" + sup.num1 +
//				"num1 =" + sup.num2 +
//				"num2 =" + sup.num3 +
				"num4 =" + sup.getNum4());
		
		System.out.println("sub참조");
		Sub5 sub = new Sub5();
		sub.print();
		
	}

}
