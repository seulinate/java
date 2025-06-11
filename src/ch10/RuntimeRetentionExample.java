package ch10;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
	String value();
}

public class RuntimeRetentionExample {
	MyAnnotation3(value ="this is annotation will be retained only in source code")
	public void myMethod() {
		
	}

}
