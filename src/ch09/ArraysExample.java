package ch09;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		String[] fruitArray = {"apple","banana","orange"};
		System.out.println("Array to List :" + Arrays.asList(fruitArray));
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3,4};
		int result = Arrays.compare(arr1, arr2);
		if(result < 0) {
			System.out.println("arr1 is smaller than arr2");
		}else if(result > 0) {
			System.out.println("arr1 is larger than arr2");
		}else {
			System.out.println("Both arrays are equal");
		}
		
		int[] numbers = {5,2,9,1,3};
		Arrays.sort(numbers);
		System.out.println("Sorted Array : " +Arrays.toString(numbers));
		
		char[] charArray = {'a','d','b','c','e'};
		System.out.println("Array to String" +Arrays.toString(charArray));
		
		int[][] matrix = {{1,2},{3,4},{5,6}};
		System.out.println("Matrix to String : "+Arrays.deepToString(matrix));
		
		
	}

}
