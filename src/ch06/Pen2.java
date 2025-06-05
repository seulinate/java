package ch06;

public class Pen2 {
	String color = "black";
	int price = 500;
	
	public Pen2(String init_color,int init_price) {
		color = init_color;
		price = init_price;
		System.out.println("생성자를 이용하여 color, price를 초기화한다.");
	}
	
	public void write(int count) {
		for(int i=0; i<count; i++) {
			System.out.println(color + "색으로 글을 작성합니다.");
		}
		System.out.println("가격: " +price );
	}

}
