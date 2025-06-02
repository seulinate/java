package ch04;

public class EnhancedForExample {

	public static void main(String[] args) {
		String[] weekArray = {"Sunday","Monday","Tuesday","Thursday","Wednesday","Friday","Saturday"};
		
		for(String day : weekArray) { //향상된 for문 
			System.out.println(day);
		}
	}

}
