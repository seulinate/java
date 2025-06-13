package ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StringInputExample {

	public static void main(String[] args) {
		//InputStreamReader ,OutputStreamReader는 byte 스트림과 char 스트림 사이의 인터페이스 역할
		//InputStream , OutputStream은 byte 스트림 방식 / Reader , Writer는 char 스트림 방식 
		
		String outFile = "out4.txt";
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		BufferedWriter bw = null;
		
		String inputString;
		System.out.println("파일에 저장할 내용을 입력한 다음 Ctrl + Z 누르세요.");
		
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			fos = new FileOutputStream(outFile);
			osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
			
			while((inputString = br.readLine()) != null) {
				bw.write(inputString + "\n");
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(br!=null)
					try {br.close();} catch(IOException e) {}
			if(bw!=null) 
				try {bw.close();} catch(IOException e) {}
			
		}
	}

}
