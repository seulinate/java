package ch04;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		String result;
		
		if( (score > 100) || (score < 0) ) {
			System.out.println("잘못된 점수 입력입니다.");
		}else {
			if(score >= 90) {
				result = "A";
				System.out.println("합격");
			}else if(score >=80) {
				result = "B";
				System.out.println("합격");
			}else if(score >= 70) {
				result = "C";
				System.out.println("합격");
			}else if(score >= 60) {
				result = "D";
				System.out.println("합격");
			}else {
				result = "F";
				System.out.println("불합격");
			}

			System.out.println(result);
		}
	}

}
