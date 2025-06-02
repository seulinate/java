package ch05;

import java.util.Scanner;

public class ArrayTest01 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요:");
		int studentNum = sc.nextInt();
		
		int[] grades = new int[studentNum];
		
		for(int i=0; i<studentNum; i++) {
			System.out.print("학생" + (i+1) + "의 성적을 입력하세요.");
			grades[i] = sc.nextInt();
		}
		
		System.out.println("입력된 성적 => ");
		for(int i=0; i<studentNum; i++) {
			System.out.println("학생" + (i+1) + " : " + grades[i]);
		}
		
		double sum = 0;
		for(int grade : grades) { sum = sum + grade; }
		
		double avg = sum/studentNum;
		System.out.println("평균성적 >>"+studentNum);
			
		}
	}

	