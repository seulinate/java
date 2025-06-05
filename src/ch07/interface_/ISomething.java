package ch07.interface_;

public interface ISomething {
	public static final int DEFAULT_SALARY = 10000;
	int MY_INT = 22;
	void run();
	
	default void doIt() {
		System.out.println("defulat method");
	}
	
	static void doThat() { //인터페이스에 static으로 정의되어 있으면  -> ISomething.doThat(); 이런식으로 아예 인터페이스 이름으로 메서드 호출이 가능하다.
		System.out.println("static method");
	}

}
