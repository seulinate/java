package ch10.test;

import java.util.Scanner;


//함수형 인터페이스
@FunctionalInterface
interface StringOperation{
	String apply(String str); //조건 
}

public class num01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String word = sc.next();
		
		System.out.println("======실행 결과========");
		System.out.println("입력:"+word);
		
		
		//대문자 변환 람다식 
		StringOperation bigWord2 = (str) ->str.toUpperCase();
//		System.out.println("대문자 변환:" +bigWord2); //이렇게 작성하면 주소값 출력됨
		System.out.println("대문자 변환 :"+ bigWord2.apply(word));
		
		//대문자 변환
		String bigWord = word.toUpperCase();
//		System.out.println("대문자 변환:"+bigWord);
		
		
		//문자열 뒤집기 람다식
		StringOperation changeWord2 = (str) -> new StringBuilder(str).reverse().toString();
//		System.out.println("문자열 뒤집기 :"+ changeWord2);
		System.out.println("문자열 뒤집기 :" +changeWord2.apply(word));
		
		
//		//문자열 뒤집기
		String changeWord = null;
		for(char x:word.toCharArray()) {
//			System.out.println("문자열 뒤집기:"+changeWord);
		}
	}

}
