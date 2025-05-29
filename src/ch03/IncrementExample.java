package ch03;

public class IncrementExample {

	public static void main(String[] args) {
		int a = 5;
		++a;
		System.out.println("전위증가 : "+a);
		
		int b = 10;
		b++;
		System.out.println("후위증가 : "+b);
	}
}
