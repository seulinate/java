package ch07.overriding;

public class Teacher extends Person {
	String subject;
	
	String getDetail() {
		return "이름 : " + name + "\t나이 : " + age + "\t과목" + subject;
	}
}
