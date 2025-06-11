package ch10.inner;

public class Outer3 {
	private int data = 10;
	
	public class Inner3{
		private int data = 20;
		
		public void doIt(int data) {
			System.out.println(data);
			System.out.println(this.data);
			System.out.println(Outer3.this.data);
		}
	}
}
