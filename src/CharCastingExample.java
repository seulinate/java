
public class CharCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a1 = 'A';
		char a2= '가';
		int a3 = a1;
		double d1 = 56.789;
		short a4 = (short)a1;
		short a5 = (short)a2;
		
		System.out.println(a1 + " " +(int)a1);  // A , 65(아스킬코드)
		System.out.println(a2 + " " +(int)a2); //가 , (AC -> 아스킬코드 변환 : 44032 )
		System.out.println(a3);  // int으로 선언했으니까 A의 int 형 65
		System.out.println(a4); // 이거는 형변환이 일어나지 않은것 ?!?! 그래서 65 출력된거 ( 오류 ?라고 봐야함 ? )
		System.out.println(a5); 
		System.out.println((char)a5); //가
		System.out.println((char)d1); //실수를 char으로 강제형 변환하면 정수만 출력된다. 

	}

}
