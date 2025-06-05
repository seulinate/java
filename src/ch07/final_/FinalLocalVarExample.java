package ch07.final_;

public class FinalLocalVarExample {
	
	public int data = 100;
	
	public static void main(String[] args) {
		
		new FinalLocalVarExample().doIt("홍길동");
	}

	public void doIt(final String name) {
		final int age = 30;
		
		class InnerLocal{
			public void InnerDoIt() {
				System.out.println("외부클래스의 멤버변수 :" + data);
				System.out.println("외부클래스의 파라미터 변수 :" + name);
				System.out.println("외부클래스의 지역변수 age :" + age);
			}
		}
		new InnerLocal().InnerDoIt();
	}
	

}
