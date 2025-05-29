
public class OperationCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte a = 10, b=20;
//		byte c = a+b;  //에러 발생하니까 아래 2가지 방식으로 수정하면 되는뎅에에에ㅔㅔㅔㅔㅔㅔㅔㅔㅔㅔ
		byte c1 = (byte) (a+b); 
		int c2 = a+b; 
		System.out.println(c1);
		System.out.println(c2);
		
		byte d = 10+20;
		System.out.println(d);
		
//		byte e = 100+200;  // byte의 최대 크기 127의 값을 넘어가니까 에러 발생하고 
		short e = 100+200; 
		System.out.println(e);
		
		System.out.println(5/2); // 정수 - 정수 연산의 결과값은 무조건 정수
		System.out.println(6/2.); //그래서 둘중에 하나 소수형태로 변경해서 계산하면 결과값 소수로 출력
	}

}
