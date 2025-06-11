package ch10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SimpleStreamExample {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("one","two","three","four","five");
		
		List<String> result = strings.stream()
				.filter(s->s.length() >=4) 
				.map(String::toUpperCase)
				.collect(Collectors.toList()); //결과를 리스트로 수집한다. 
		
		result.forEach(System.out::println);
		
	}

}
