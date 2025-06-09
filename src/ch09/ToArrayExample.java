package ch09;

import java.util.HashSet;
import java.util.Set;

public class ToArrayExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
//		set.add("A");
//		set.add("B");
//		set.add("C");
//		set.add("D");
//		set.add("E");
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("four");
		set.add("five");
		
		String[] strArray = set.toArray(new String[set.size()]);
		for(String str:strArray){
			System.out.println(str);
		}
	}

}
