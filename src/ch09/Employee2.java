package ch09;

public class Employee2{
	String name;
	int salary;
	
	public Employee2() {}
	
	public Employee2(String name,int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return name + ":" + salary;
	}
}
