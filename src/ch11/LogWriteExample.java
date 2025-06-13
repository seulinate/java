package ch11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;

public class LogWriteExample {

	public static void main(String[] args) {
		String fileName = "runtime.log";
		String mode = "rw";
		
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(fileName,mode);
			
			raf.seek(raf.length());
			
			raf.writeUTF(new Date().toString()+"\n");
			System.out.println(fileName + "에 현재시간이 기록되었습니다.");
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(raf != null)
				try {raf.close();} catch(IOException e){}
		}
	}
}
