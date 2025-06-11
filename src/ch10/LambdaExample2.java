package ch10;

import java.util.Arrays;

public class LambdaExample2 {

	public static void main(String[] args) {
		String[] names = {"eric","jin","varrr","fo"};
		
//		Arrays.sort(names,new StringComparator());
		Arrays.sort(names,(a,b)->a.length() - b.length());
		
		for(String name: names) {
			System.out.println(name);
		}
	}
}
