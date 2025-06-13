package ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import ch09.Customer;

public class CustomerManager4 {
	
	static ArrayList<Customer> custList = new ArrayList<>();
	
	static int index = -1;
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		loadCustomer();
		
		
		while(true) {
			System.out.printf("\n 고객 수:%d, 인덱스: %d \n",custList.size(),index);
			
			System.out.println("=================================메 뉴=====================================");
			System.out.println("(I)nsert | (P)revious | (N)ext | (C)urrent | (U)pdate | (D)elete | (Q)uit");
			System.out.print("메뉴를 입력하세요 : ");
			
			String menu = sc.next();
			menu = menu.toLowerCase(); //다 소문자로 변경해서 
			
			switch(menu.charAt(0)) {
			case 'i': case 'ㅑ':
				System.out.println("고객 정보를 입력해주세요. (예: 이름, 성별, 이메일, 생년월일)");
				insertCustomer();
				System.out.println("고객 정보를 입력했습니다.");
				break;
			
			case 'p': case 'ㅔ' :
				System.out.println("이전 데이터를 출력합니다.");
				
				if(index <= 0) {
					System.out.println(">> 이전 데이터가 존재하지 않습니다.");
				}else {
					index--;
					printCustomer(index);
				}
				break;
				
			case 'n': case 'ㅜ' :
				System.out.println("다음 데이터를 출력합니다. >>");
				
				if(index >=custList.size()-1) {
					System.out.println(" >> 다음 데이터가 존재하지 않습니다.");
				}else {
					index++;
				printCustomer(index);
				}
				break;
				
			case 'c' : case 'ㅊ' :
				System.out.println("현재 데이터를 출력합니다. >>");

				if((index >= 0) && (index < custList.size()) ){
					printCustomer(index);
				}else {
					System.out.println("출력할 데이터가 선택되지 않았습니다.");
				}
				break;
				
			case 'u' : case 'ㅕ':
				System.out.print("수정할 데이터를 입력하세요.");		
				if((index >= 0) && (index < custList.size())) {
					System.out.println(index + "번째 데이터를 수정합니다.");
					updateCustomer(index);
				}else {
					System.out.println("고객 데이터 수정이 정상적으로 완료되었습니다.");	
				}
				break;
				
			case 'd' : case 'ㅇ':
				System.out.println("데이터 삭제");
				
				if((index >=0) && (index < custList.size() )) {
					System.out.println(index + "번째 데이터 삭제했습니다.");
					deleteCustomer(index);
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
	}//end main
	
	public static void insertCustomer() {
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("성별(M/F) :");
		char gender = sc.next().charAt(0);
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("출생 연도 : ");
		int birthYear = sc.nextInt();
//		
//		nameList[count] = name;
//		genderList[count] = gender;
//		emailList[count] = email;
//		birthYearList[count] = birthYear;
		
		Customer customer = new Customer(name,gender,email,birthYear);
//		custList[count] = customer;
		
		custList.add(customer);
		
//		count++;
		
	}
	
	
	public static void deleteCustomer(int index) {
		custList.remove(index);
	}


	public static void updateCustomer(int index) {
//		Customer customer = custList[index];
		Customer customer = custList.get(index);
		
		System.out.println("----------UPDATE CUSTOMER INFO------------");
		
		System.out.print("수전 전 : 이름 (" + customer.getName() + ")");
		customer.setName(sc.next());
		System.out.print("수전 전 : 성별 (" + customer.getGender() + ")");
//		customer.gender = sc.next().charAt(0);
		customer.setGender(sc.next().charAt(0));
		System.out.print("수전 전 : 이메일 (" + customer.getEmail() + ")");
//		customer.email = sc.next();
		customer.setEmail(sc.next());
		System.out.print("수전 전 : 출생연도 (" + customer.getBirthYear() + ")");
//		customer.birthYear = sc.nextInt();
		customer.setBirthYear(sc.nextInt());


	}



	
	public static void printCustomer(int index) {
		System.out.println("==========고객정보===========");
//		Customer customer = custList[index];
		Customer customer = custList.get(index);
		
		System.out.println("이름 :" + customer.getName());
		System.out.println("성별 :" + customer.getGender());
		System.out.println("이메일 :" + customer.getEmail());
		System.out.println("출생 연도 :" + customer.getBirthYear());
	}

	
	
	
	//파일 입출력 추가 
	private static void loadCustomer() {
		String fileName = "customer.csv";
		FileReader reader = null;
		BufferedReader bufReader = null;
		
		try {
			reader = new FileReader(fileName);
			bufReader = new BufferedReader(reader);
			String line = null;
			do {
				line = bufReader.readLine();
				if(line != null) {
					String[] value = line.split(",");
					Customer customer = new Customer();
					customer.setName(value[0]);
					customer.setGender(value[1].charAt(0));
					customer.setEmail(value[2]);
					customer.setBirthYear(Integer.parseInt(value[3]));
					custList.add(customer);
				}
			}while(line != null);
			System.out.println("데이터가 파일에서 로드됐습니다.");
		}catch(IOException e) {
			System.out.println("예외 발생:" +e.getMessage());
		}finally {
			try {bufReader.close();}catch(Exception e) {}
			try {reader.close();}catch(Exception e) {}
		}
	}
	
	private static void saveCustomer() {
		String fileName = "customer.csv";
		FileWriter writer = null;
		BufferedWriter bufWriter = null;
		try {
			writer = new FileWriter(fileName);
			bufWriter = new BufferedWriter(writer);
			for(Customer c : custList) {
				bufWriter.write(c.toCSV() + "\r\n");
			}
			bufWriter.flush();
			System.out.println("Customer 데이터가 저장됐습니다.");
		}catch(IOException e) {
			System.out.println("파일 저장 중 예외 발생:"+e.getMessage());
		}finally {
			try {bufWriter.close();}catch(Exception e) {}
			try {writer.close();}catch(Exception e) {}
		}
	}
	
}
