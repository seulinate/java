package ch04;

import java.util.Scanner;

public class TEST2 {

	//코딩테스트 기본 출력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("테스트케이스 개수 입력 > ");
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int sum = 0 ;
			System.out.print("입력받을 데이터의 개수 > ");
			int number = sc.nextInt();
			
			System.out.printf("%d개의 데이터를 입력하세요 : ",number);
			for(int j = 0; j <number; j++) {
				int data = sc.nextInt();
				sum = sum+data;
			}
			System.out.print("입력받은 데이터의 합 ");
			System.out.println("TestCase #" + (i+1) + " " + sum);
		}
		sc.close();
	}

}
