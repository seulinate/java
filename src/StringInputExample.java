
public class StringInputExample {

	public static void main(String[] args) throws Exception{
		byte[] buffer = new byte[100];
		int readCount = System.in.read(buffer);
		
		String inputData = new String(buffer,0,readCount);
		System.out.println(inputData);
		
	}

}
