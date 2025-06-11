package ch10.exam;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample0 {

	public static void main(String[] args) {
		
		
		//int 형식이라면 ?
		List<Integer> intList = Arrays.asList(10,15,23,16,83,14,21,12);
		MyUtil<Integer> util = new MyUtil<>();
		List<Integer> filteredOutput = util.filter(intList, (data)->data%2 ==0);
		
		List<Integer> filteredOutput2 = util.filter(intList, new Predicate<Integer>() {
			@Override
			public boolean test(Integer data) {
				return data%2 == 0; 
			}
		});
		
		System.out.println(filteredOutput2);
		
		//만약에 int가 아니고 string 문자열 타입이라면 ? 
		List<String> strList = Arrays.asList("Hello","hi","Nice","World","ys");
		MyUtil<String> util2 = new MyUtil<>();
		List<String> filteredOutput3 = util2.filter(strList, (data) ->data.length() >=5);
		
		System.out.println(filteredOutput3);
	}
}