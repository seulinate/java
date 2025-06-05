package ch07.polymorphism;

public class Student extends Person{
	private String major;
	
	public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
	}
	
	public String getDetails() {
		return super.getDetails() + "\t 전공:"+major;
	}
	
	public void applyForClasses() {
		System.out.println("수강신청합니다.");
	}

}
