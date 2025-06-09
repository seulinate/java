package ch09.generic;

import java.util.ArrayList;

public class CollectionGenericExample {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		//String 제네릭으로 문자열 타입으로만 가능하도록 지정해버렸으니까 int,float같은 다른 타입으로는 불가능
		myList.add("first");
		myList.add("second");
		myList.add("third");
		
		String s1 = myList.get(0);
		System.out.println(s1); //first 
		
		for(String s : myList) {
			System.out.println(s);
		}
	}
}
