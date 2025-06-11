package ch10;

import java.util.function.Function;

public class MethodReferenceExample1 {
	
	public static String toUpperCase(String str) {
		return str.toUpperCase(); //다 대문자로 바꾼다는 메서드 
	}

	public static void main(String[] args) {
		//1번 방법 => 람다 표현식 사용하는 방법
		Function<String,String> lambda = (str) -> toUpperCase(str);
		//2번 방법 => 메서드 참조를 사용하는 방법
		Function<String,String> reference = MethodReferenceExample1::toUpperCase;
		
		System.out.println(lambda.apply("hello"));
		System.out.println(reference.apply("world"));
	}

}
