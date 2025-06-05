package ch07.overriding;


public class OverridingExample {
	public static void main(String[] args) {

		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		System.out.println("person ==> "+p.getDetails());
		
		Student s = new Student();
		s.name = "김이슬";
		s.age = 28;
		s.major = "컴퓨터공학";
		System.out.println("student ==> "+s.getDetails());
		
		Teacher t = new Teacher();
		t.name = "이순신";
		t.age = 45;
		t.subject = "자바프로그래밍";
		System.out.println("teacher ==> "+t.getDetails());
		
		Employee e = new Employee();
		e.name = "강감찬";
		e.age = 35;
		e.department = "입학처";
		System.out.println("employee ==> "+e.getDetails());
	}

}
