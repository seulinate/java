package ch09.generic;


class Box<T>{
	
	private T value;
	
	public Box(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
}


public class LowerBoundExample {

	public static void main(String[] args) {
		Box<? super Integer> intBox = new Box<>(10);
		Object value = intBox.getValue();
		System.out.println("vlaue:" +value);
	}

}
