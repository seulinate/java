package ch05;

import java.util.Scanner;

public class ArrayTest02 {

	static int Max = 100; //final ? 
	
	static Scanner sc = new Scanner(System.in);

	static String[] nameList = new String[Max];
	static int[] countList = new int[Max];
	static String[] dateList = new String[Max];
	static String[] infoList = new String[Max];
	
	static int index = -1;
	static int count = 0;
	
	
	public static void main(String[] args) {
		System.out.println("=================================메 뉴=====================================");
		System.out.println("1 입력 | 2 조회 | 3 수정 | 4 삭제");
		System.out.print("메뉴를 입력하세요 : ");
		
		int menu = sc.nextInt();
		
		switch(menu){
		case 1 :
			System.out.print("입력");
			insertFood();
			System.out.println("입력이 완료되었습니다.");
			break;
		
		case 2:
			System.out.print("조회");
			PrintFood();
			break;
			
		case 3 :
			System.out.print("수정");
			updateFood();
			System.out.print("수정이 완료되었습니다.");
			break;
		
		case 4:
			System.out.print("삭제");
			deleteFood();
			System.out.print("삭제가 완료되었습니다.");
			break;
		
			
		//이거 안씀
		case 0 :
			System.out.println("종료");
			System.exit(0);
		default : 
			System.out.println("잘못입력함");
		}		
		
		
	}


	public static void PrintFood() {
		System.out.println("==========식자재 정보===========");
		System.out.println("이름 :" +nameList[index]);
		System.out.println("수량 :" +countList[index]);
		System.out.println("유통기한 :" +dateList[index]);
		System.out.println("설명 :" +infoList[index]);
	}


	public static void deleteFood() {
		for(int i=index; i<count-1; i++) {
			nameList[i] = nameList[i+1];
			countList[i] = countList[i+1];
			dateList[i] = dateList[i+1];
			infoList[i] = infoList[i+1];
		}
		count--;
	}


	public static void updateFood() {
		System.out.println("---------Food INFO------------");
		System.out.print("수전 전 : 이름 (" + nameList[index] + ")");
		nameList[index] = sc.next();
		System.out.print("수전 전 : 성별 ( " + countList[index] + ")");
		countList[index] = sc.nextInt();
		System.out.print("수전 전 : 이메일 (" + dateList[index] + ")");
		dateList[index] = sc.next();
		System.out.print("수전 전 : 출생연도(" + infoList[index] + ")");
		infoList[index] = sc.next();
	}


	public static void insertFood() {
		System.out.print("음식이름");
		String name = sc.next();
		System.out.print("수량");
		int count = sc.nextInt();
		System.out.print("유통기한");
		String date = sc.next();
		System.out.print("식자제 설명");
		String info = sc.next();

		nameList[count] = name;
		countList[count] = count;
		dateList[count] = date;
		infoList[count] = info;
		count++;
	}

}
