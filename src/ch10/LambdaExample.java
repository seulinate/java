package ch10;

import java.util.Arrays;

public class LambdaExample {
	public static void main(String[] args) {
		String[] names = {"eric","jin","varrr","fo"};
		
		Arrays.sort(names,new StringComparator());
		
		for(String name: names) {
			System.out.println(name);
		}
	}
}