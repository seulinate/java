package ch10.inner;

public class Button {
	private String label;
	
	public Button(String label) {
		this.label = label;
	}
	
	private OnClickListener OnClickListener;
	
	public void setOnClickListener(OnClickListener listener) {
		this.OnClickListener = listener;
	}
	
	public static interface OnClickListener{
		void onClick();
	}
	
	public void actionClick() {
		System.out.println(label +"버튼의 이벤트 처리");
		OnClickListener.onClick();
	}
	
	
	
	
	public void action(final int data) { //final 지역변수 필요성
		class EventHandler{
			void callback() {
				System.out.println(label +"버튼의 이벤트 처리");
				System.out.println("이벤트핸들러에 전달된 값 : " +data);
			}
		}
		new EventHandler().callback();
	}


}
