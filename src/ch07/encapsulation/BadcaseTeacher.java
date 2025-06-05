package ch07.encapsulation;

public class BadcaseTeacher {
	String name;
	int age;
	String subject;
	
	String getDetail() {
		return "이름: " + name + "\t나이 :" + age + "\t과목" + subject;
	}

}
