package ch05;

import java.util.Arrays;

public class ArraySimpleCopyExample {

	public static void main(String[] args) {
		String[] strArray = {"안녕하세요","good morning","Bon Jour"};
		String[] newArray = new String[5];
		for(int i=0; i<strArray.length;i++) {
			newArray[i] = strArray[i];
		}
		newArray[3] = "Buenos Dias";
		newArray[4] = "guten Morgen";
		System.out.println(Arrays.toString(strArray));
		System.out.println(Arrays.toString(newArray));
	}

}
