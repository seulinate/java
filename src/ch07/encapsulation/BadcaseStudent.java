package ch07.encapsulation;

public class BadcaseStudent {
	String name;
	int age;
	String major;
	
	String getDetails() {
		return "이름: " +name + "\t나이: " + age + "\t전공: " + major;
	}

}
