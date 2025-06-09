package ch09;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add(new Integer(4));
		boolean isAdded = set.add("five");
		boolean isAdded2 = set.add(new String("five"));
		//hashset은 기존의 객체와 새로 넣는 객체가 같은지 다른지 비교하느데 그때 사용하는게 2개임
		//hashcode로 비교해서 -> 그 값이 다르면 ? 두객체는 무조건 다른애들이다.  
		//단,우연하게 hashcode가 같은 값이 될 수도 있는데,,,, -> 이러한 이유로 해시코드가 같다고 해서 무조건 두 객체가 같다는 보장은 없음.
		
		//따라서 set안에서는 두개를 비교시 hashcode로 먼저 비교하고 다르면 다른애니까 확실히 -> 값을 넣어 ok
		
		//만약에 hashcode가 같으면 equals()이용해서 한번 더 비교한다. 
		//String에는 hashcode와 equals() 메서드가 둘다 있어서 동등 비교가 가능하다.
		
		
		System.out.println(set);
		System.out.println(isAdded);
		System.out.println(isAdded2);
		
		System.out.println(set.size());
		
		set.remove("two"); //순서가 보장이 안되니까 
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
		if(set.isEmpty()) {
			System.out.println("set is Empty");
		}
		
	}

}
