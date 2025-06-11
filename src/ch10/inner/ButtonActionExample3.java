package ch10.inner;

public class ButtonActionExample3 {

	public static void main(String[] args) {
		Button btn1 = new Button("red");
		
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("버튼 출력했습니다.");
			}
		});
		
		btn1.actionClick();
	}

}
