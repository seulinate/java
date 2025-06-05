package ch06;

public class Student {
	
	String name;
	int age;
	String major;
	
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public void displayStudentInfo() {
		System.out.printf("이름: %s , 나이 : %d, 전공 : %s",name,age,major);
	}

}
