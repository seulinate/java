package ch04;

public class ReturnExample {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				if(i==j) {
					break;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("for문의 실행이 종료되었습니다.");
	}
}
