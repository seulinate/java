
public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 100;
		int b = a;
		
		// byte < int 으로 int 자료형이 byte 자료형보다 크다. ( 큰 크기의 자료형에서 작은 크기의 자료형으로 변환될 때 강제 형변환 필수이다. )
		byte c = (byte)b;
//		byte d = b; 
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
