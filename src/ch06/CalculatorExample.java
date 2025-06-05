package ch06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.sum(3,4));
		System.out.println(calc.sum(3,4,5));
		
//		System.out.println(calc.sum(3,4,5,6));
		System.out.println(calc.sum(new int[] {3,4,5,6})); // 배열으로 만들어서 사용해야하니까 복잡하다.
		
	}
}
