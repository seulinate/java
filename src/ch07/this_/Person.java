package ch07.this_;

public class Person {
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name) {
		this(name, 1);
	}
	
	public Person() {
		this("이름없음");
	}
	
	String getDetails() {
		return "이름:" + name +"\t나이:" + age;
	}
	
}
