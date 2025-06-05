package ch07;

import java.io.IOException;

public class CheckedExample {

	public static void main(String[] args) {
		System.out.print("값을 입력받는 프로그램입니다. 값을 입력하세요 > ");
		byte[] data = new byte[100];
		try {
			System.in.read(data);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.print("입력한 문자열은 : ");
		System.out.println(new String(data).trim());
	}

}
