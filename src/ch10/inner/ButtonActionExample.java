package ch10.inner;

public class ButtonActionExample {

	public static void main(String[] args) {
		Button btn1 = new Button("red");
		
		
//		class ButtonClickListener implements Button.OnClickListener{
//			@Override
//			public void onClick() {
//				System.out.println("버튼을 클릭했습니다.");
//			}
//		}
//		ButtonClickListener listener = new ButtonClickListener();
		
		//위의 코드를 아래처럼 작성 가능하다. ( 인터페이스 구현과 동시에 객체를 만들고 변수에 저장함 )
		Button.OnClickListener listener = new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("버튼 출력");
			}
		};

		btn1.setOnClickListener(listener);
		
		btn1.actionClick();
	}

}
