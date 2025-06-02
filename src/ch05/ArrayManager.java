package ch05;

import java.util.Scanner;

public class ArrayManager {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		int index = -1;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***********배열 관리 프로그램*************");
		
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1 추가 | 2 출력 | 3 조회 | 4 수정 | 5 삭제 | 6 삽입 | 0 종료 ");
			System.out.println("-------------------------------------------");
			System.out.print("실행할 메뉴 번호를 입력하세요. > ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.print("배열에 추가할 데이터를 입력하세요. >>");
				int inputData = sc.nextInt();
				array[count] = inputData;
				count++;
				break;
				
			case 2:
				System.out.print("배열의 데이터 출력  :");
				for(int i=0; i<count; i++) {
					System.out.print(array[i] + "\t");
				}
				System.out.println();
				break;
				
			case 3:
				System.out.print("배열에서 찾을 데이터 조회 > ");
				int searchData = sc.nextInt();
				for(int i=0; i <count; i++) {
					if(array[i] == searchData) {
						System.out.println(i + "인 배열 위치에서 데이터를 찾았습니다.");
						break;
					}
				}
				break;
				
			case 4:
				System.out.print("수정할 위치 인덱스 값과 데이터 입력(예 : 2 30) > ");
				index = sc.nextInt();
				int updateData = sc.nextInt();
				
				array[index] = updateData;
				break;
				
			case 5:
				System.out.print("삭제할 위치 인덱스값 입력하기 >");
				index = sc.nextInt();
				int deleteData = array[index];
				System.out.printf("%d 위치의 인덱스 데이터 %d 삭제하겠습니다.\n",index ,deleteData);
				
				for(int i=index; i<count-1; i++) { //삭제하는 경우 삭제할 인덱스 바로 뒤의 인덱스 위치 부터 앞으로 한칸씩 이동 
					array[i] = array[i+1];
				}
				count--; //하나 삭제했으니까 반복문 종료 이후 count값 -1 
				break;
				
			case 6:
				System.out.print("삽입할 위치와 데이터 입력하세요(예: 2 30) > ");
				index = sc.nextInt();
				int insertData = sc.nextInt();
				
				for(int i=count; i>index-1; i--) {//삽입하는 경우 배열의 제일 끝에서 부터 한칸씩 뒤로 이동 
					array[i] = array[i-1];
				}
				array[index] = insertData;
				count++; //하나 추가(삽입)했으니까 반복문 종료 이후 count +1 
				break;
			case 0:
				sc.close();
				System.out.println("배열 관리 프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}

}
