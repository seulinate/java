package ch05;

import java.awt.Point;

public class ReferenceArrayExample {

	public static void main(String[] args) {
		Point[] pArr = {
				new Point(0,1),new Point(7,6),new Point(9,6),
				new Point(0,8) , new Point(2,3)
		};
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i]);
		}
	}

}
