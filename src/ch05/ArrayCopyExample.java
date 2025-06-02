package ch05;

import java.util.Arrays; //Arrays. 사용하면 자동 import 된다. 
public class ArrayCopyExample {

	public static void main(String[] args) {
		int source[] = {1,2,3,4,5,6};
		int destination[] = {9,8,7,6,5,4,3,2,1,0};
		
		System.out.println(Arrays.toString(destination));
		
		System.arraycopy(source,1,destination,3,4);
		//arraycopy() 메서드 : 기존 배열 복사해서 새로운 배열 만든다. 
		
		System.out.println(Arrays.toString(destination));
	}
}
