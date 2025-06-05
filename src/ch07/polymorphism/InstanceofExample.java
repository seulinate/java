package ch07.polymorphism;

public class InstanceofExample {

	public static void main(String[] args) {
		
		Student s = new Student("허현수",17,"2000012345");
		printPersonInfo(s);
		
		Teacher t = new Teacher("홍길동",11,"자바프로그래밍");
		printPersonInfo(t);
		
		Employee e = new Employee("이순신",23,"입학처");
		printPersonInfo(e);
		
	}

	public static void printPersonInfo(Person p) {
		if(p instanceof Student) {
			System.out.println("-------------------student 정보------------------------");
			
			//다형적 객체 이용해서 student에만 존재하는 메서드 호출하기 위해서는 반드시 선언한 타입 클래스 해당 메서드가 있어햐 한다.
			Student stu = (Student)p;
			stu.applyForClasses();
			
		}else if(p instanceof Teacher) {
			System.out.println("-------------------teacher 정보------------------------");
		}else if(p instanceof Employee) {
			System.out.println("-------------------employee 정보------------------------");
		}else {
			System.out.println("-------------------person 정보------------------------");
		}
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("----------------------------------------------");
		
	}
}
