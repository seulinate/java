package ch10;

import java.util.function.Function;

public class MethodReferenceExample2 {
	public String toUpperCase(String str) {
		return str.toUpperCase(); 
	}

	public static void main(String[] args) {
		MethodReferenceExample2 instance =new MethodReferenceExample2();
		
		//1번 => 람다 표현식 이용
		Function<String,String> lambda = (str)->instance.toUpperCase(str);
		
		//2번 방법 => 메서드 참조를 사용하는 방법
		Function<String,String> reference = instance::toUpperCase;
		
		System.out.println(lambda.apply("hello"));
		System.out.println(reference.apply("world"));
	}

}
