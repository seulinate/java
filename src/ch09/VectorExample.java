package ch09;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Person> v = new Vector<>();
		v.addElement(new Person("홍길동",29));
		v.addElement(new Person("이순신",30));
		v.addElement(new Person("강감찬",65));
		
		System.out.println(v); 
		Person p = v.elementAt(2);
		System.out.println(p.getName());
		v.remove(1);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v);
		
	}

}
