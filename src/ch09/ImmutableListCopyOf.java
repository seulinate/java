package ch09;

import java.util.ArrayList;
import java.util.List;

public class ImmutableListCopyOf {

	public static void main(String[] args) {
		List<String> mutableList = new ArrayList<>();
		mutableList.add("apple");
		mutableList.add("banana");
		mutableList.add("orange");
		
		List<String>immutableList = List.copyOf(mutableList);
		// 위에서 만든 mutableList랑 똑같은 요소를 갖는 하지만 수정은 불가능한 리스트를 만들어낸다.
		
		mutableList.add("grape");
		immutableList.add("grape");
		
		
		System.out.println("ImmutalbeList: "+immutableList); // 동일하게 만들었고 이것도 수정이 불가능함.
		System.out.println("mutableList :" +mutableList);
	}

}
