package ch04;

public class ForStarExample {

	public static void main(String[] args) {
		
		int dan = 5;
		
		for(int i=0; i<dan; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int i=0; i<dan; i++) { // i는 행 , j는 열 
			for(int j=0; j<dan-i; j++) { //핵심 dan - i
				System.out.print("*");
			}
			System.out.println();
		} 
		
		System.out.println();
		
		for(int i=0; i<dan; i++) {
			for(int j=0; j<dan-i-1; j++) { //j에 대한 조건
				System.out.print(" ");
			}
			for(int j=0; j<2+i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<dan; i++) {
			for(int j=0; j<dan-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
		
		System.out.println();
		
		for(int i=0;i <dan; i++) {
			for(int j=0; j<i; j++) {
				System.out.println(" ");
			}
			for(int j=0; j<dan-i; j++) {
				System.out.println("*");
			}
		}
		
		
		
	}

}
