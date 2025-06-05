package ch07.final_;

public class FinalVarExample {
	final int MY_VALUE = 7; 
	//final 변수의 이름은 대문자로 작성하고, 여러 단어가 결합된 경우는 언더스코어로 연결해서 작성하면 된다. 
	
	public void go() {
		System.out.println(MY_VALUE);
	}

	public static void main(String[] args) {
		FinalVarExample fv = new FinalVarExample();
		fv.go();
	}

}
