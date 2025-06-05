package ch06;
import static java.lang.Math.sqrt;

import java.util.Scanner;


public class ImportStaticExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result = sqrt(16.0); // 이거는 자동완성이 안된다고 ? -> 특정 클래스 정적 멤버 직접 참조하는 구문임 자동완성x
		System.out.println("Square root of 16 is :" + result);
	}

}
