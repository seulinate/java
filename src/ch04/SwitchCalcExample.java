package ch04;

import java.util.Scanner;

public class SwitchCalcExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계산할 수식을 입력하세요 > ");
		int number1 = sc.nextInt();
		String op = sc.next();
		int number2 = sc.nextInt();
		
		switch(op.charAt(0)) {
		case '+':
			System.out.println(number1 + number2);
			break;
		case '-':
			System.out.println(number1 - number2);
			break;
		case 'x':
			System.out.println(number1 * number2);
			break;
		case '÷' :
			System.out.println(number1 / number2);
			break;
		default:
			System.out.println("잘못된 입력입니다. ");
		}
		sc.close();
	}

}
