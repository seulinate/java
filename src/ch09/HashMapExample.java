package ch09;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map maps = new HashMap(); 
		
		String s1 = new String("홍길동");
		
		maps.put("name", s1);
		maps.put("hiredate", new Date()); // 순서
		maps.put("salary", 20000);
		System.out.println(maps);
		
		System.out.println("=================");
		System.out.println("* key 이용한 value 조회 ");
		System.out.println(maps.get("hiredate"));
		System.out.println(maps.get("salary"));
		System.out.println(maps.get("name"));


		System.out.println("=================");
		System.out.println("* entrySet을 이용한 맵 데이터  출력");
		//set을 받는데 
		Set<Map.Entry<String,Object>> entries = maps.entrySet();
		for(Map.Entry<String, Object> entry : entries) {
			System.out.println(entry.getKey() + ":" +entry.getValue());
		}

		System.out.println("=================");
		System.out.println("*KeySet을 이용한 맵 데이터 출력");
		Set<String> keys = maps.keySet();
		for(String key : keys) {
			System.out.println(key + "::"+maps.get(key));
		}

		
	}

}
