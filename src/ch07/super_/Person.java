package ch07.super_;

public class Person {
	
	//private으로 선언함
	private String name;
	private int age;
	
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
