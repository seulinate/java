package ch04;

public class Test3 {

	public static void main(String[] args) {
		//Q . 0부터 시작해 짝수의 합이 1000보다 커지기 위한 가장 작은 정수는 ?
		//반복문 안에서 짝수의 합 계산하기 ,짝수의 합이 1000보다 큰 경우 가장 작은 정수 얼마인지 출력하기
		
		int i = 0;
		int sum = 0;
		while(i % 2 == 0) {
			sum +=i;
			i = i+2;
			if(sum >= 1000) {
				System.out.println("종료: "+sum);
				break;
			}
		}
	}
}
