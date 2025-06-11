package ch10.test;

import java.util.Arrays;
import java.util.List;

public class num03 {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		num.stream().filter(n->n%2 ==0)
		.map(n->n*n)
		.forEach(System.out::println);
	}
}