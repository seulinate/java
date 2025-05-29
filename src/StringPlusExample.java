
public class StringPlusExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello ";
		String s2 = "World";
		System.out.println(s1+s2); // Hello World
		
		int a1 = 3 , a2 = 5;
		System.out.println(s1 + a1 + a2); //Hello35
		System.out.println(a1 + a2 + s1 ); //8Hello
		System.out.println(s1 + (a1 + a2)); //Hello8
	}

}
