package ch07.interface_;

public class InterfaceMemberExample {
	public static void main(String[] args) {
		System.out.println(ISomething.MY_INT);
		System.out.println(Something.MY_INT);
		Something some1 = new Something();
		some1.run();
		some1.doIt();
		ISomething.doThat();
	}

}
