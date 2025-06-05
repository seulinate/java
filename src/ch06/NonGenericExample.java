package ch06;

public class NonGenericExample {
	public static void main(String[] args) {
		Box1 StringBox = new Box1();
		StringBox.setValue("Hello world");
		
		Box1 intBox = new Box1();
		intBox.setValue(42);
		
		String stringValue = (String)StringBox.getValue();
		int intValue = (int)intBox.getValue();
		System.out.println(stringValue + " " +intValue);
	}
}
	
	class Box1{
		private Object value;
		
		public void setValue(Object value) {
			this.value = value;
		}
		
		public Object getValue() {
			return value;
	}

}
