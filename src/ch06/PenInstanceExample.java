package ch06;

public class PenInstanceExample {
	public static void main(String[] args) {
		Pen redPen = new Pen();
		//클래스이름 객체이름 = new 생성자();
		
		System.out.println(redPen);
		redPen.write(2);

	}

}
