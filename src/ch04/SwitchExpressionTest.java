package ch04;

public class SwitchExpressionTest {
	public static void main(String[] args) {
		
		int a = (int)(Math.random() * 10); // 0 - 9까지의 경우의 수 
		String b;
		
		switch(a) {
		case 9: case 8:
			System.out.println("출력된 랜덤 순자는 : 9 8 입니다.");
			b = "A범위";
			break;
		case 7: case 6: case 5:
			System.out.println("출력된 랜덤 순자는 :  7 6 5 입니다.");
			b = "B범위";
			break;
		default:
			System.out.println("출력된 랜덤 순자는 :  4 3 2 1 0 입니다.");
			b = "C범위";
		}
		
		System.out.println(b);


	}

}
