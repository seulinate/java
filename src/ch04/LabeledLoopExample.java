package ch04;

public class LabeledLoopExample {
	public static void main(String[] args) {
		//label:
		label : 
		for(int i = 0; i<3; i++) { //outer loop
			for(int j=0; j<3; j++) { //inner loop
				if(j == 2) {
					break label; //break 혹은 continue 사용한다. 
				}
				System.out.println(i + "\t" + j);
			}
		}
	}
}