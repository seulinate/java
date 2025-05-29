package ch03;

public class MaskingExample {

	public static void main(String[] args) {
		int originalValue = 0xABCD1234;
		int extratedByte = originalValue & 0xFF; 
		// 0xFF => FF가 살아있는 자리만 남기고 나머지는 모두 0으로 변경한다. 
		
		System.out.println("원본값 : "+ Integer.toHexString(originalValue));//toHexString ?  16진수로 출력해주는 메소드이다. 
		System.out.println("최하위 바이트 추출 : "+ Integer.toHexString(extratedByte));
		
	}

}
