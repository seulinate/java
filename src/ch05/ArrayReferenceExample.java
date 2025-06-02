package ch05;

import java.util.Arrays;

public class ArrayReferenceExample {

	public static void main(String[] args) {
		int[] array1 = {2,3,5,7,11,13,17,19};
		int[] array2;
		System.out.println(Arrays.toString(array1));
		//.toString() 메서드 : 배열 요소 확인
		
		
		array2 = array1; //array1과 array2가 같은 객체 참조한다. ( array1이 바뀌면 array2도 바뀐다. )
		array2[0] = 0;
		array2[2] = 2;
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}
