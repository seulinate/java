package ch03;

public class BitShiftExample {

	static void PrintBinStr(int i) {
		String binStr = Integer.toBinaryString(i);
		// .toBinaryString() 메서드 : 10진수를 2진수로 출력하기 위한 ! 
		System.out.printf("[%32s],%d \n",binStr , i);
	}
	
	
	public static void main(String[] args) {
		
		//양수
		int x = 192;
		PrintBinStr(x); 
		
		int a = x << 3;
		PrintBinStr(a);
		
		int b = x << 3;
		PrintBinStr(b);
		
		
		//음수
		int y = -192;
		PrintBinStr(y);
		
		int c = y << 3;
		PrintBinStr(c);
		
		int d = y >> 3;
		PrintBinStr(d);
		
		// >>> 연산 
		int e = y >>> 3;
		PrintBinStr(e);
		
		int f = y >>> 35; // 이렇게 선언한 크기?보다 큰 경우는 나누었을때 나머지 만큼 >>> 연산처리하면 된다.
		PrintBinStr(f);
		
	}

}
