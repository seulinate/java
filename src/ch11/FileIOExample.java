package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {
	public static void main(String[] args) {
		String inFile ="in.txt";
		String outFile = "out3.txt";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(inFile);
			fos = new FileOutputStream(outFile);
			int readByte =0 ;
			while((readByte = fis.read()) != -1) {
				fos.write(readByte);
			}
			System.out.println(inFile + ">> "+outFile);
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(fis != null) {
				try {fis.close();} catch(IOException e){}
			}if(fos!=null) {
				try{fos.close();} catch(IOException e){}
			}
		}
	}
}
