package ch03;

import java.util.Scanner;

public class Ch03Test03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요:");
		int b = sc.nextInt();
		
		System.out.println("두 정수 중 큰수 :"+ (Math.max(a,b)));
		System.out.println("두 정수 중 작은수 :" + (Math.min(a,b)));
		
		String result;
		
		if(a == b) {
			result = "같음";
		}else result = "다름";
		System.out.println("두 정수가 같은지 비교하세요 :"+result);
		
	}

}
