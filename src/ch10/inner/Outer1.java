package ch10.inner;

public class Outer1 {
	private int data;
	
	public class Inner1{
		public void doIt() {
			data++;
			System.out.println("Inner 클래스의 메서드 호출");
			System.out.println("data값은 > "+data);
		}
	}
	
	
	public void testTheInner() {
		Inner1 in = new Inner1();
		in.doIt();
	}
	
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.testTheInner();
	}

}
