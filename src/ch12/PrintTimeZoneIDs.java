package ch12;

import java.util.TimeZone;

public class PrintTimeZoneIDs {

	public static void main(String[] args) {
		for(String id : TimeZone.getAvailableIDs()) {
			System.out.println(id);
		}
	}

}
