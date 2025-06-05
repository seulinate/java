package ch07.this_;

public class Employee extends Person{
	String department;
	
	public Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	@Override
	String getDetails() {
		return "이름:"+name +"\t나이:"+age+"\t전공:" + department;
	}

}
