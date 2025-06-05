package ch07.encapsulation;

public class BadcaseEmployee {
	String name;
	int age;
	String department;
	
	String getDetail() {
		return "이름: " + name + "\t나이 :" + age + "\t부서" + department;
	}

}
