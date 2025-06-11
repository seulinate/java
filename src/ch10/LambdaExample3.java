package ch10;

import java.util.Arrays;

public class LambdaExample3 {
	public static void executeAction(String message,MyFunction function) {
		function.performAction(message);
	}
	
	public static void main(String[] args) {
		MyFunction myFunction = (message)-> System.out.println("Action performed : "+message);
		
		executeAction("Hello World",myFunction);
	}
}
