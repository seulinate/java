
public class ByteInputExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int keyCode = System.in.read(); //read()는 IOException 예외 발생 방지를 위해서 throws Exception 이 있어야한다. 
		System.out.println(keyCode);
		System.out.printf("%c",keyCode);
		

	}

}
