package ch07.modifier3;

public class Sub4{
	
	public void doSub4() {
		Super4 s = new Super4();
		System.out.println(s.getNum4());
//		System.out.println(s.num4); //에러
	}
}
