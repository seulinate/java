package ch07.overriding;

public class Student extends Person{
	String major;
	
	String getDetail() {
		return "이름 : " + name + "\t나이 : " + age + "\t전공" + major;
	}

}
