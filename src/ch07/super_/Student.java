package ch07.super_;

public class Student extends Person{
	private String major;
	
	public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
	}
	@Override
	String getDetails() {
		return super.getDetails() + "\t 전공:"+major;
	}

}
