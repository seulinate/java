package ch10.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperationExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("순회:");
		numbers.stream().forEach(System.out::println); //forEach()는 주어진 각각의 동작을 수행하는 스트림 메서드입니다.
		
		System.out.println("\n정렬");
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("\n짝수");
		numbers.stream().filter(n-> n%2 ==0).forEach(System.out::println);
		
		System.out.println("\n합계");
		int sum = numbers.stream().reduce(0, Integer::sum); 
		System.out.println(sum);
		
		System.out.println("\n나머지에 따른 그룹핑>");
		Map<Integer,List<Integer>> groupByRemainder = numbers.stream()
				.collect(Collectors.groupingBy(n->n %3));
		System.out.println(groupByRemainder);
		
		
	}

}
