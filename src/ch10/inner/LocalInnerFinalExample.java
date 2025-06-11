package ch10.inner;

public class LocalInnerFinalExample {
	public static void main(String[] args) {
		Button b1 = new Button("red");
		b1.action(100);
		b1.action(200);
		System.out.println();
		
		Button b2 = new Button("blue");
		b2.action(300);
	}
}
