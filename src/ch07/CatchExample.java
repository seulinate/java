package ch07;

public class CatchExample {

	public static void main(String[] args) {
		
		int a = (int)(Math.random() * 100);//10 - 90까지
		int b = (int)(Math.random() * 4); 
		try {
			System.out.printf("a = %d, b=%d, result=%d\n",a,b,divide(a,b));
			doSomething(a);
		}catch(ArithmeticException ae) {
			System.out.println("0으로는 나눌 수 없습니다.");
			System.out.println(ae.getMessage()); 
		}catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println("예외 발생 원인 : "+e.getMessage());
		}
	}

	public static void doSomething(int a) throws Exception {
		if(a>50) {
			throw new Exception("a값이 50보다 큽니다.");
		}
		System.out.println("50%활률로 실행됨 ");
	}

	public static int divide(int a, int b) {
		return a/b;
	}
}
