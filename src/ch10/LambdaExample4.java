package ch10;

import java.util.function.Function;

public class LambdaExample4 {
	public static void main(String[] args) {
		Function<Integer,Integer> doubleFunction = (x)-> x*2;
		
		//함수형 인턴페이스 종류 중 하나인 Function<T,R>은 하나의 인자를 받아들여서 결과를 반환하는 것으로 R apply(T t) 으로 문자열을 정수로 변환하거나 객체를 다른 객체로 매핑하는 동작 수행한다.
		//즉, T으로 입력받아서 F으로 결과 반환한다.
		int result = doubleFunction.apply(5);
		System.out.println("Result:" + result);
	}
}