package ch04;

public class BreakExample1 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i);
		}
		System.out.println("for문 실행이 종료되었습니다. "); 
	}

}
