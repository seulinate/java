package ch09;

public class GenericMethodExample {

	public static void main(String[] args) {
		String[] names = {"apple","bob","tom"};
		String firstName = getFirstlement(names);
		System.out.println("첫번째 숫자 : "+firstName);
		
		Integer[] numbers = {1,2,3};
		Integer firstNumber = getFirstlement(numbers);
		System.out.println("첫번째 숫자 : "+firstNumber);
		
		Double[] prices = {19.99,20.99,29.99};
		Double firstPrice = getFirstlement(prices);
		System.out.println("첫번째 숫자 : "+firstPrice);
	}

	public static<T> T getFirstlement(T[] array) {
		if(array == null || array.length ==0) {
			return null;
		}
		return array[0];
	}

}
