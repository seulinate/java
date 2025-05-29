package ch03;

import java.util.Scanner;

public class DivModExample2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int number = sc.nextInt();
		
		int sum = 0;
		while(number > 0) {
			int check = number % 10;
			sum += check;
			number = number / 10;
		}
		System.out.println("입력한 수의 각 자리수의 합 ? " +  sum);
		sc.close();
		
		
	}

}
