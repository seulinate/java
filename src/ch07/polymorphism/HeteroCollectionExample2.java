package ch07.polymorphism;

public class HeteroCollectionExample2 {
	public static void main(String[] args) {
		
		Object[] objArr = new Object[5];
		
		objArr[0] = new Person("홍길동",20);
		objArr[1] = new Student("김길동",17,"20160001");
		objArr[2] = Integer.valueOf(100);
		objArr[3] = new String("Hello");
		objArr[4] = new java.util.Date();
		
		for(int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i]);
		}
	}
}
