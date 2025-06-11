package ch10;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@interface MyAnnotation2{
	String value();
}

public class ClassRetentionExample {
	MyAnnotation2(value ="this is annotation will be retained only in source code")
	public void myMethod() {
		
	}
}
