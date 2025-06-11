package ch10;

import java.util.function.Supplier;

public class MethodReferenceExample3 {
	
	public MethodReferenceExample3() {
		System.out.println("Constructor called");
	}

	public static void main(String[] args) {
		
		//1번 => 람다 표현식 이용
		Supplier<MethodReferenceExample3> lambda = ()-> new MethodReferenceExample3();
		
		//2번 방법 => 메서드 참조를 사용하는 방법
		Supplier<MethodReferenceExample3> reference = MethodReferenceExample3::new;
		
		lambda.get();
		reference.get();
	}
}
