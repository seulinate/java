import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.println("나이와 이름을 입력하세요.");
		System.out.print("나이 >");
		age = sc.nextInt();
		System.out.print("이름 >");
//		name = sc.next();
		name = sc.nextLine(); 
		// 나이는 nextInt()으로 입력받고 이름은 nextLine()으로 입력받아서 나이 입력되고 ( byte 제일 끝에 남아 있던 \n이 nextLine()에 읽어진다. )
		
		System.out.println("나이 :"+age);
		System.out.println("이름 :"+name);
		sc.close();
	}

}
