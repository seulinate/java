package ch04;

public class ReturnExample2 {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println("넓이  :" + calcRect(a,b));
	}

	private static int calcRect(int width, int height) {
		return (width * height);
	}

}
