package ch06;

public class VarargsExample {

	public static void main(String[] args) {
		int sum1 = calculateSum(1,2,3,4,5);
		int sum2 = calculateSum(10,20,30);
		int sum3 = calculateSum(8,2,5,7);
	}


	public static int calculateSum(int... number) {
		int sum = 0;
		for(int num : number) {
			sum += num;
		}
		return sum;
	}
}