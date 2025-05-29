package ch03;

import java.util.Scanner;

public class Ch03Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위 번호를 입력하세요:");
		int diceNumber = sc.nextInt();
		
		String dap;
		if((diceNumber % 2)== 0) {
			dap = "짝수";
		}else dap="홀수";
		
		System.out.printf("주사위 숫자 %d는 %s!",diceNumber,dap);
		
	}

}
