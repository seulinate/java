package ch09;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Person> stack = new Stack<>();
		stack.push(new Person("홍길동",29));
		stack.push(new Person("이순신",30));
		stack.push(new Person("강감찬",65));
		// 강감찬 - 이순신 - 홍길동 ( 바닥 )
		
		System.out.println(stack); 
		
		//pop() : 제일 위에 있는 강감찬 
		Person p = stack.pop();
		System.out.println(p.getName());
		System.out.println(stack);
		
		//그다음이 이순신
		Person p2 = stack.peek(); //peek() 조회만, 아무것도 안적혀있으니까 0번째 ? 
		System.out.println(p2.getName());
		System.out.println(stack);
		
		stack.empty();   
		System.out.println(stack);
		
	}

}
