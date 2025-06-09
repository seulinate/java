package ch09.generic;

public class GenericExample {

	public static void main(String[] args) {
		Container<String> cont1 = new Container<>();
		
		cont1.setData("Hello");
		
		String s1 = cont1.getData();
		System.out.println(s1);
	}

}
