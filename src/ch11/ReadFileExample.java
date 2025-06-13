package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileExample {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("in.txt");
			byte[] buffer = new byte[256];
			int readCount = -1;
			do {
				readCount = fis.read(buffer);
				if(readCount != -1) {
					String data = new String(buffer,0,readCount); 
					System.out.print(data);
				}
			}while(readCount != -1);
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(fis!=null) {
				try {fis.close();} catch(Exception e) {}
			}
		}
	}
}
