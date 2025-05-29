
public class Test02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
//		byte c = a+b; // 에러 : a+b의 값 int으로 자동형변환되어 표현되니까 
		byte c1 = (byte)(a + b); //sol 01. 명시적 형변환하기
		int c2 = a+b; //c의값을 아예 int형으로 선언하기
		System.out.println(c1);
		System.out.println(c2);
		
//		long data1 = 2147483648; //에러 : long 타입으로 제대로 표현되지 않음 
		long data1 = 2147483648L; //long형 값으로 인식시키기 위해서는 숫자 뒤에 영문자 L 붙여야한다고 했고 
		System.out.println(data1);
		
		int data2 = 1522;
//		byte data3 = data2; //에러
		byte data3 = (byte)data2; // int형으로 선언된 data2을 byte으로 선언한 변수 data3에 넣어야하니까 (byte)으로 강제 형 변환 
		System.out.println(data3);
		System.out.println(a + b+ "Hello");
	}
}
