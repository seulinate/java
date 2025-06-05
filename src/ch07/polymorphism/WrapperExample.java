package ch07.polymorphism;

public class WrapperExample {

	public static void main(String[] args) {
		Object[] arrObj = new Object[10];
		
		arrObj[0] = new Byte((byte)127);
		arrObj[1] = new Short((short)127);
		arrObj[2] = new Integer(123456789);
		arrObj[3] = new Long(123123313L);
		arrObj[4] = new Float(3.5F);
		arrObj[5] = new Double(3.7);
		arrObj[6] = new Boolean(true);
		arrObj[7] = new Character('J');
		arrObj[8] = new String("hello world");
		arrObj[9] = new java.util.Date();
		
		for(int i=0; i<arrObj.length; i++) {
			System.out.println(arrObj[i]);
		}
	}

}
