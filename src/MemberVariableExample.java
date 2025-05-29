
public class MemberVariableExample {
	int a ;   //인스턴스 변수
	static int b;  //클래스 변수
	
	public static void main(String[] args) { //static블록
//		System.out.println(a); //static블록에서 non-static을 객체 생성하지 않고 참조하면 에러 발생 
		System.out.println(b);

	}

}
