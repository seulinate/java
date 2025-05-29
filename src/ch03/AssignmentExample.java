package ch03;

public class AssignmentExample {
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		
		a = a + 3 ;
		a += 3 ;  // 복합 대입 연산자라고 한다. 
		
		b =+ 3 ;
		b = +3;
		
		System.out.println(a + "\t" + b);
	}

}
