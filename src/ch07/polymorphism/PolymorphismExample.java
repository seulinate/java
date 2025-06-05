package ch07.polymorphism;

public class PolymorphismExample {
	public static void main(String[] args) {
		
		Person p;
		
		p = new Student("김이슬",18,"컴공");
		System.out.println(p.getDetails());
		
		p = new Teacher("이순신",45,"자바프로그래밍");
		System.out.println(p.getDetails());
		
		p = new Employee("허진경",30,"입학처");
		System.out.println(p.getDetails());
	}
}
