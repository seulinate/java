package ch09;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("hello");
		list.add("java");
		list.add("banana");
		list.add("apple");
		list.add("zoo");
		
		System.out.println("list add :" +list);
		
		list.remove();
		System.out.println("list data after remove() :"+list);
		
		list.remove(2);
		System.out.println("list data after remove(2) :" +list);
		
		list.set(1, "new element");
		System.out.println("list data after set() : "+list); //그 자리를 변경하는
		
		String str1 = list.peek(); 
		System.out.println("str1 : " +str1); 
		System.out.println("list data after peek() :"+list);
		
		String str2 = list.poll(); 
		System.out.println("Str2:"+str2);
		System.out.println("list data after poll():"+list);
	}

}
