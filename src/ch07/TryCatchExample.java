package ch07;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] greetings = {"안녕", "반가워", "또만나"};
		while(true) {
			try {
				System.out.printf("0이상 %d미만의 정수를 입력하세요(99는 종료) > ",greetings.length);
				if(sc.hasNextInt()) {
					int index = sc.nextInt();
					if(index==99) {
						System.out.println("반복을 종료합니다.");
						break;
					}
					System.out.println(greetings[index]);
				}else {
					System.out.println("정수를 입력하세요");
					sc.next();
				}
			}catch(Exception e) { // 입력하라는 범위의 숫자 1-3 ,99 제외한 예외값을 입력하는 경우 예외처리 
				System.out.println("예외가 발생했습니다.");
			}
		}
		System.out.println("main의 마지막입니다.");
		sc.close();
	}

}
