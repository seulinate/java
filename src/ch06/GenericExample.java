package ch06;

public class GenericExample {
	public static void main(String[] args) {
		Box2<String> stringBox = new Box2<String>();
		stringBox.setValue("Hello World");
		
		Box2<Integer> intBox = new Box2<Integer>();
		intBox.setValue(42);
		
		String stringValue = stringBox.getValue();
		int intValue = intBox.getValue();
		System.out.println(stringValue + " " +intValue);
	}
}

class Box2<T>{
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}
