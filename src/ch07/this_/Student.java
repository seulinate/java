package ch07.this_;

public class Student extends Person{
	String major;
	
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	@Override
	String getDetails() {
		return "이름:"+name +"\t나이:"+age+"\t전공:"+major;
	}

}
