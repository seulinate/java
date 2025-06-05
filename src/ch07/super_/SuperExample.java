package ch07.super_;

public class SuperExample {
	public static void main(String[] args) {
		Student s1 = new Student("김이슬",18,"컴공");
		System.out.println(s1.getDetails());
		
		Teacher t1 = new Teacher("이순신",45,"자바프로그래밍");
		System.out.println(t1.getDetails());
		
		Employee e1 = new Employee("허진경",30,"입학처");
		System.out.println(e1.getDetails());
		
	}

}
