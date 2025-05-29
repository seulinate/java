package ch03;

public class ConditionalExample {

	public static void main(String[] args) {
		int a = 5 -(int)(Math.random()* 10);
		
		// (int)(Math.random()*10) 이므로  0 ~ 9까지의 값이 랜덤으로 출력된다. 
		//그러면 0 - 5까지는 0보다 크거나 같음, 6-9까지는 0보다 작음으로 분류된다. 
		
		int abs = a>0 ? a: ~a;
		System.out.println(a + "의 절대값 : " + abs);
		
		System.out.println(a >= 0 ? "0보다 크거나 같다." : "0보다 작다.");
	}

}
