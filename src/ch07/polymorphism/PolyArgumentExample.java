package ch07.polymorphism;

public class PolyArgumentExample {

	public static void main(String[] args) {
		
		Student s = new Student("허현수",17,"2000012345");
		printPersonInfo(s);
		
		Teacher t = new Teacher("홍길동",11,"자바프로그래밍");
		printPersonInfo(t);
		
		Employee e = new Employee("이순신",23,"입학처");
		printPersonInfo(e);
		
	}

	public static void printPersonInfo(Person p) {
		System.out.println("-------------------정보------------------------");
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("----------------------------------------------");
		
	}

}
