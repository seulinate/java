package ch11;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataWriter {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("member.data");
			dos = new DataOutputStream(fos);
			dos.writeUTF("김이슬");
			dos.writeUTF("서울");
			dos.writeUTF("seul@test.com");
			dos.writeUTF("28");
			dos.writeUTF("김예리");
			dos.writeUTF("익산");
			dos.writeUTF("lee@test.com");
			dos.writeUTF("23");
			System.out.println("File Saved");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(dos != null) try {dos.close();}catch(Exception e) {}
		}

	}

}
