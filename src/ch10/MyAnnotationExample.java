package ch10;

import java.lang.reflect.Method;

public class MyAnnotationExample {

	public static void main(String[] args) throws NoSuchMethodException{
		
		
		//NoSuchMethodException 이거 문슨 예외 처리임 ? 
		
		Method method = MyClass.class.getMethod("myMethod");
		MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
		String value = annotation.value();
		System.out.println("@MyAnnotation value : "+value);
	}
}
