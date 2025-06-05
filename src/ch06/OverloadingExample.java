package ch06;

public class OverloadingExample {
	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		
		obj.abc(100,"자바");
		obj.abc(3.5,4.5);
		obj.abc("자바");
		obj.abc(100,200);
	}

}
