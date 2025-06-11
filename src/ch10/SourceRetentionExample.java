package ch10;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface MyAnnotation1{
	String value();
}

public class SourceRetentionExample {
	MyAnnotation1(value ="this is annotation will be retained only in source code")
	public void myMethod() {
		
	}

}
