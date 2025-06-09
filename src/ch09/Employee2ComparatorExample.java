package ch09;

import java.util.TreeSet;

public class Employee2ComparatorExample {

	public static void main(String[] args) {
		Employee2 e1 =new Employee2("홍길동",20000);
		Employee2 e2 =new Employee2("김길동",30000);
		Employee2 e3 =new Employee2("허길동",70000);
		Employee2 e4 =new Employee2("이길동",40000);
		
		TreeSet<Employee2> list = new TreeSet<Employee2>(new Employee2Comparator());
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Employee2 s:list) {
			System.out.println(s);
		}
	}
}

