//퀴즈01

public class Test01 {
	
	static int myFunction(int x) { // 3*x + 10 의 식을 만족하는 함수 myFunction 만들기 
		int y = 0;
		int a = 3;
		int b = 10;
		y = a*x+b;
		return y;
	}

	public static void main(String[] args) {
		int result = myFunction(10); // x =10의 값을 갖는 결과값 출력하기 
		System.out.println(result);


	}

}