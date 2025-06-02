package ch04;

import java.util.Scanner;

public class SwitchStrExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 입력하세요 ( 메뉴 목록 : insert, update, delete, select, quit ) :  ");
		
		String menu = sc.next();
		
		switch(menu) {
		case "insert":
			System.out.println("입력(insert) 메뉴가 선택되었습니다.");
			break;
		case "update":
			System.out.println("수정 (update) 메뉴가 선택되었습니다.");
			break;
		case "delete":
			System.out.println("삭제 (delete) 메뉴가 선택되었습니다.");
			break;
		case "select":
			System.out.println(" 조회 (select) 메뉴가 선택되었습니다.");
			break;
		case "quit":
			System.out.println(" 종료(quit) 메뉴가 선택되었습니다.");
			break;
		default : 
			System.out.println("메뉴를 잘 못 입력했습니다.");
		}
		sc.close();
	}

}
