package ch11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOExample {

	public static void main(String[] args) {
		String outFile = "employee.txt";
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(outFile);
			dos = new DataOutputStream(fos);
			dos.writeUTF("허현준");
			dos.writeUTF("41456");
			dos.writeUTF("30");
			dos.writeUTF("박준수");
			dos.writeUTF("4455");
			dos.writeUTF("28");
			System.out.println("데이터가 저장되었습니다.");
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(dos != null) {
				try {dos.close();} catch(IOException e) {}
			}
		}
		
		System.out.println("\n저장된 데이터를 불러옵니다.");
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream(outFile);
			dis = new DataInputStream(fis);
			System.out.println("이름 : "+dis.readUTF());
			System.out.println("사번 : "+dis.readUTF());
			System.out.println("나이 : "+dis.readUTF());
			System.out.println("이름 : "+dis.readUTF());
			System.out.println("사번 : "+dis.readUTF());
			System.out.println("나이 : "+dis.readUTF());
		}catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if(dis != null)
				try {dis.close();} catch(IOException e) {}
		}
		
	}

}
