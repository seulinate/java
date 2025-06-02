package ch05;

import java.util.Scanner;

public class CustomerManager {
	
	static int Max = 100; //final ? 
	
	static String[] nameList = new String[Max];
	static char[] genderList = new char[Max];
	static String[] emailList = new String[Max];
	static int[] birthYearList = new int[Max];
	
	static int index = -1;
	static int count = 0;
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.printf("\n 고객 수:%d, 인덱스: %d \n",count,index);
			System.out.println("=================================메 뉴=====================================");
			System.out.println("(I)nsert | (P)revious | (N)ext | (C)urrent | (U)pdate | (D)elete | (Q)uit");
			System.out.print("메뉴를 입력하세요 : ");
			
			String menu = sc.next();
			menu = menu.toLowerCase(); //다 소문자로 변경해서 
			
			
			
			switch(menu.charAt(0)) {
			case 'i': case 'ㅑ':
				System.out.println("고객 정보를 입력해주세요. (예: 이름, 성별, 이메일, 생년월일)");
				
				if(count >= Max) {
					System.out.println(">> 고객 정보 저장 공간이 부족합니다. 더 이상 입력할 수 없습니다.");
				}else {
					insertCustomer();
					System.out.println("고객 정보 입력이 정상적으로 완료되었습니다.");
				}
				break;
			
			case 'p': case 'ㅔ' :
				System.out.println("이전 데이터를 출력합니다.");
				
				if(index <= 0) {
					System.out.println(">> 이전 데이터가 존재하지 않습니다.");
				}else {
					index--;
					printCustomer();
				}
				break;
				
			case 'n': case 'ㅜ' :
				System.out.println("다음 데이터를 출력합니다. >>");
				
				if(index >= count -1) {
					System.out.println(" >> 다음 데이터가 존재하지 않습니다.");
				}else {
					index++;
				printCustomer();
				}
				break;
				
			case 'c' : case 'ㅊ' :
				System.out.println("현재 데이터를 출력합니다. >>");

				if((index >= 0) && (index < count) ){
					printCustomer();
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
				
			case 'u' : case 'ㅕ':
				System.out.print("수정할 데이터를 입력하세요.");		
				if((index >= 0) && (index < count)) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateCustomer();
				}else {
					System.out.println("고객 데이터 수정이 정상적으로 완료되었습니다.");	
				}
				break;
				
			case 'd' : case 'ㅇ':
				System.out.println("데이터 삭제");
				
				if((index >=0) && (index < count )) {
					System.out.println(index + "번째 데이터 삭제했습니다.");
					deleteCustomer();
				}else {
				System.out.println("삭제할 데이터가 없습니다.");
				}
				break;
			
			case 'q' : case 'ㅂ':
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
				break;
			
			default : 
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}
	}

	
	public static void deleteCustomer() {
		for(int i=index; i<count-1; i++) {
			nameList[i] = nameList[i+1];
			genderList[i] = genderList[i+1];
			emailList[i] = emailList[i+1];
			birthYearList[i] = birthYearList[i+1];
		}
		count--;
	}


	public static void updateCustomer() {
		System.out.println("----------UPDATE CUSTOMER INFO------------");
		System.out.print("수전 전 : 이름 (" + nameList[index] + ")");
		nameList[index] = sc.next();
		System.out.print("수전 전 : 성별 ( " + genderList[index] + ")");
		genderList[index] = sc.next().charAt(0);
		System.out.print("수전 전 : 이메일 (" + emailList[index] + ")");
		emailList[index] = sc.next();
		System.out.print("수전 전 : 출생연도(" + birthYearList[index] + ")");
		birthYearList[index] = sc.nextInt();
	}


	public static void insertCustomer() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("성별(M/F) :");
		char gender = sc.next().charAt(0);
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("출생 연도 : ");
		int birthYear = sc.nextInt();
		
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count++;
	}
	
	public static void printCustomer() {
		System.out.println("==========고객정보===========");
		System.out.println("이름 :" +nameList[index]);
		System.out.println("성별 :" +genderList[index]);
		System.out.println("이메일 :" +emailList[index]);
		System.out.println("출생 연도 :" +birthYearList[index]);
	}

	
}
