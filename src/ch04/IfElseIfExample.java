package ch04;

import java.util.Scanner;

public class IfElseIfExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 >");
		int score = sc.nextInt();
		String grade ;
		
		if(score >=95) {
			grade = "A+";
		}else if(score >=90) {
			grade = "A";
		}else if(score >=90) {
			grade = "B+";
		}else if(score >=90) {
			grade = "B";
		}else if(score >=90) {
			grade = "C+";
		}else if(score >=90) {
			grade = "C";
		}else {
			grade = "F";
		}
		
		System.out.printf("점수 %d점 입니다. 해당 점수는 %s학점입니다.",score,grade);
		sc.close();
		
	}

}
