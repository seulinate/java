package ch09;

import java.util.List;

public class ImmutableListOf {

	public static void main(String[] args) {
		List<String> immutableList = List.of("apple","banana","orange");
		//List.of : 수정할 수 없는 리스트를 만들었음
		
		immutableList.add("grape"); // List.of를 사용해서 만든 리스트는 추가, 삭제, 변경이 불가능한 메서드이다. 
		
		System.out.println("ImmutableList: "+immutableList);
	}

}
