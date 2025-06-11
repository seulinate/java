package ch10.inner;

public class InnerExample3 {
	public static void main(String[] args) {
		Outer3.Inner3 in = new Outer3().new Inner3();
		in.doIt(30);
	}
}