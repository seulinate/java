package ch10;

import java.util.function.Consumer;

public class LambdaEx {
	
	public static void executeAction(String mess, Consumer<String> consumer) {
		consumer.accept(mess);
	}

	public static void main(String[] args) {
		Consumer<String> cons = (mess) -> System.out.println("Action performed: "+mess);
		executeAction("Hello World",cons);
	}

}
