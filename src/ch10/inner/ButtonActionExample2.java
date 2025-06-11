package ch10.inner;

public class ButtonActionExample2 {

	public static void main(String[] args) {
		Button btn1 = new Button("red");
		
		class ButtonClickListener implements Button.OnClickListener{
			@Override
			public void onClick() {
				System.out.println("버튼을 클릭했습니다.");
			}
		}
		ButtonClickListener listener = new ButtonClickListener();
		btn1.setOnClickListener(listener);
		
		btn1.actionClick();
	}

}
