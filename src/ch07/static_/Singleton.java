package ch07.static_;

public class Singleton {
	private static Singleton instance = new Singleton();
	//private 붙여서 은닉 
	//instatnce는 인스턴스 객체..
	//반환하기 위해서는 get처리해서 return 
	
	private Singleton() {
		System.out.println("sfsdfasdfa");
	}
	
	public static Singleton getInstance() {
		return instance;
	}

}
