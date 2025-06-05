package ch07.this_;

public class Teacher extends Person{
	String subject;
	
	public Teacher(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	@Override
	String getDetails() {
		return "이름:"+name +"\t나이:"+age+"\t전공:"+subject;
	}

}
