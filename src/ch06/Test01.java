package ch06;

public class Test01 {
	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동",20,"컴퓨터공학");
		Student student2 = new Student("김길동",25,"전자공학");
		
		System.out.println("첫번째 학생 정보");
		student1.displayStudentInfo();
		
		
		System.out.println("두번째 학생 정보");
		student1.displayStudentInfo();
	}

}
