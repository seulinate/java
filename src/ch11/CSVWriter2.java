package ch11;

import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CSVWriter2 {

	public static void main(String[] args) throws Exception {
		String data1 = "김길동,광주,kim@test.com,30";
		String data2 = "박길동,인천,park@test.com,33";
		
		FileOutputStream fos = new FileOutputStream("member2.csv");
		PrintWriter out = new PrintWriter(fos);
		out.println(data1);
		out.println(data2);
		out.flush();
		out.close();
		System.out.println("파일에 저장됨");
	}

}
