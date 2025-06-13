package ch11;

import java.io.FileWriter;

public class CSVWriter {
	public static void main(String[] args) throws Exception{
		String data1 = "홍길동,서울,hong@test.com,30";
		String data2 = "길남,부산,kil@hong.com,25";
		
		FileWriter out = new FileWriter("member.csv");
		out.write(data1+"\n");
		out.write(data2);
		out.flush();
		out.close();
		System.out.println("파일에 저장됨");
	}
}
