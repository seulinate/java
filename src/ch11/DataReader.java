package ch11;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataReader {

	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("member.data");
			dis = new DataInputStream(fis);
			String name = null;
			while((name = dis.readUTF()) != null) {
				System.out.println(name);
				System.out.println(dis.readUTF());
				System.out.println(dis.readUTF());
				System.out.println(dis.readUTF());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(dis != null) try {dis.close();} catch(Exception e) {}
		}
	}

}
