package ch07.inheritance;

public class GoodcaseTestInheritance {

	public static void main(String[] args) {
		GoodcasePerson p = new GoodcasePerson();
		
		p.name = "홍길동";
		p.age = 20;
		System.out.println("person ==> "+p.getDetails());
		
		GoodcaseStudent s = new GoodcaseStudent();
		s.name = "김이슬";
		s.age = 28;
		s.major = "컴퓨터공학";
		System.out.println("student ==> "+s.getDetails());
		
		GoodcaseTeacher t = new GoodcaseTeacher();
		t.name = "이순신";
		t.age = 45;
		t.subject = "자바프로그래밍";
		System.out.println("teacher ==> "+t.getDetails());
		
		GoodcaseEmployee e = new GoodcaseEmployee();
		e.name = "강감찬";
		e.age = 35;
		e.department = "입학처";
		System.out.println("employee ==> "+e.getDetails());
	}

}
