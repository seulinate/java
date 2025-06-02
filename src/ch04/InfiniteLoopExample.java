package ch04;

import java.util.Scanner;

public class InfiniteLoopExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("종료하려면 'exit'을 입력하세요 : ");
			String input = sc.nextLine();
			
			if(input.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("입력한 값:" +input);
			}
		}
		sc.close();
	}

}
