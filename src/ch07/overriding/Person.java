package ch07.overriding;

public class Person {
	String name;
	int age;
	
	String getDetails() {
		return "이름: " + name + "\t나이" + age;
	}

}
