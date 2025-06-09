package ch09;

public class Employee implements Comparable<Employee>{
	String name;
	int salary;
	
	public Employee() {}
	
	public Employee(String name,int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return name + ":" + salary;
	}
	
	public int compareTo(Employee emp) {
//		return this.name.compareTo(emp.name);
		return this.name.compareTo(emp.name);
	}
	
}
