package ch07.super_;

public class Teacher extends Person{
	private String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
	
	@Override
	String getDetails() {
		return super.getDetails() +"\t과목:"+subject;
	}

}
