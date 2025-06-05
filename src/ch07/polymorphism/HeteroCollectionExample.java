package ch07.polymorphism;

public class HeteroCollectionExample {
	public static void main(String[] args) {
		
		Person[] pArr = new Person[4];
		
		//이종모음 
		pArr[0] = new Person("홍길동",20);
		pArr[1] = new Student("김길동",17,"20160001");
		pArr[2] = new Teacher("박길동",23,"자바프로그래밍");
		pArr[2] = new Employee("허길동",23,"입학처");
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].getDetails());
		}
	}
}
