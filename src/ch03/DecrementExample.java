package ch03;

public class DecrementExample {

	public static void main(String[] args) {
		int c = 5;
		--c;
		System.out.println("전위 감소" + c);
		
		int d = 10;
		d--;
		System.out.println("후위 감소"+d);
	}

}
