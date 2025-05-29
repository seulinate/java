package ch03;

public class BitMaskingExample {

	public static void main(String[] args) {
		int pixel = 0xFFF07896;
		int blue = pixel & 0x000000FF; 
		// 0x000000FF => 1byte에서 F가 위치한 위치 제외하고 나머지는 모두 0으로 값 변경해준다. 
 		System.out.printf("16진수 %x , 10진수 %d \n",blue,blue);
		
		// %x ??? 16진수 출력 연산자
		
		int red = pixel & 0x00FF0000;
		red = red >> 16;
		System.out.printf("16진수 %x , 10진수 %d \n",red,red);
	}

}
