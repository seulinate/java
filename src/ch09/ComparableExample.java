package ch09;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		Employee e1 = new Employee("홍길동",20000);
		Employee e2 = new Employee("김길동",70000);
		Employee e3 = new Employee("송길동",40000);
		Employee e4 = new Employee("박길동",90000);
		
		TreeSet<Employee> list = new TreeSet<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Employee s : list) {
			System.out.println(s);
		}
	}

}
