package ch07.modifier2;

import ch07.modifier3.Super;

public class Sub {
	public void print() {
		Super s = new Super();
		System.out.println("Super num1 = "+s.num1);
	}

}
