package ch11;

import java.io.BufferedReader;
import java.io.FileReader;

public class TextReadApplication {

	public static void main(String[] args) throws Exception{
		FileReader fr = null;
		BufferedReader in = null;
		
		fr = new FileReader("member2.csv");
		in = new BufferedReader(fr);
		String data = null;
		while((data = in.readLine()) != null) {
			String[] member = data.split(",");
			String name = member[0];
			String address = member[1];
			String email = member[2];
			int age = Integer.parseInt(member[3]);
			System.out.printf("%s %s %s %d\n" ,name,address,email,age);
		}
		in.close();
		
	}

}
