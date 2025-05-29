import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class LineInputExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(reader);
		//InputStreamReader이랑 BufferedReader 이랑 이용하면 줄 단위로 입력가능함 .
		// BufferedReader가 가지고 있는게 readLine() 메서드 
		
		String line = in.readLine(); //readLine()도 마찬가지로 예외처리 필요함
		System.out.println(line);
		in.close();
		
	}

}
