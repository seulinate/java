package ch07.overriding;

public class Employee extends Person {
	String department;
	
	String getDetail() {
		return "이름 : " + name + "\t나이 : " + age + "\t과목" + department;
	}
}
