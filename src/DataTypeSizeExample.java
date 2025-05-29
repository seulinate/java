
public class DataTypeSizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("byte type");
		System.out.println("\tMin : "+Byte.MIN_VALUE);
		System.out.println("\tMax : "+Byte.MAX_VALUE);
		
		System.out.println("short type");
		System.out.println("\tMin : "+Short.MIN_VALUE);
		System.out.println("\tMax : "+Short.MAX_VALUE);
		
		System.out.println("int type");
		System.out.println("\tMin : "+Integer.MIN_VALUE);
//		System.out.println("\tMin : "+Int.MIN_VALUE);  
		//래퍼클래스에 있는 클래스 사용하는거임 int아니고 Integer입니다.
		System.out.println("\tMax : "+Integer.MAX_VALUE);
		
		System.out.println("long type");
		System.out.println("\tMin : "+Long.MIN_VALUE);
		System.out.println("\tMax : "+Long.MAX_VALUE);

		System.out.println("float type");
		System.out.println("\tMin : "+Float.MIN_VALUE);
		System.out.println("\tMax : "+Float.MAX_VALUE);

		System.out.println("double type");
		System.out.println("\tMin : "+Double.MIN_VALUE);
		System.out.println("\tMax : "+Double.MAX_VALUE);

		System.out.println("boolean type");
		
		//boolean은 true,false라는 값을 가지는것이니까 Min,Max함수 사용하는게 아니지 ! 
//		System.out.println("\tMin : "+Boolean.MIN_VALUE); 
//		System.out.println("\tMax : "+Boolean.MAX_VALUE);
		System.out.println("\tMin : "+Boolean.TRUE); 
		System.out.println("\tMax : "+Boolean.FALSE);
		
		System.out.println("character type");
		System.out.println("\tMin : "+Character.MIN_VALUE);
		System.out.println("\tMax : "+Character.MAX_VALUE);
		
		/*
		if(Character.MIN_VALUE == Character.MIN_VALUE) {
			System.out.println("같음");
		}else {System.out.println("다름");}*/
		
	}

}
