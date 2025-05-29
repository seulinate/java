package ch03;

public class ShortCircuitExample {

	public static void main(String[] args) {
		
		int x = 10, y=20;
		System.out.println(( x != 10) & (++y == 21));  // F & T => F
		System.out.println("y :" + y);  // 21
		
		System.out.println(( x == 10) | (++y == 21)); // T | F = T
		System.out.println("y :" + y); // 22
		
		int a = 10, b = 20;
		System.out.println(( a != 10) && (++b == 21)); 
		// F -> F (자바에서는 뒤의 연산은 하지 않는다. 왜냐하면 && 연산에서 앞에서 False 결과값이 나왔으면 이미 False값이 출력값인게 정해졌으니까 
		System.out.println("y :" + b); //뒤의 연산을 하지 않았으니까 그대로 20
		
		System.out.println(( a == 10) || (++b == 21));
		// T -> or 연산에서 앞의 값이 True으로 이미 확정 결과값 판정으로 뒤의 연산은 진행하지 않는다.
		System.out.println("y :" + b); //뒤의 연산은 처리하지 않았으니까 그대로 20
		
		
	}

}
