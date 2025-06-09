package ch09;

import java.util.Comparator;

public class Employee2Comparator implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 obj1, Employee2 obj2) {
//		return obj1.name.compareTo(obj2.name); 
		return obj1.salary - obj2.salary; //가격 내림차순  
	}
}