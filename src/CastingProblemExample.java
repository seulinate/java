
public class CastingProblemExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1234567890;
		float b = a;
		System.out.println(b);
		
		
		double c = 3.6;
		int d = (int)c;
		System.out.println(c);  // 3
		
		int e = 1522;
		byte f = (byte)e; 
		
		/*
		 * 1522 => 00000000 00000000 00000101 11110010 
		 * byte형으로 변환하면 가장 마지막의 1개의 byte만 가지고 와
		 * 11110010 -> 가장 앞에 있는 1은 음수 의미하고 그 뒤에 1110010은 2의 보수 ? 으로 표현하면 0001101에 +1 계산인데
		 * 0001101 에 +1하면 
		 * 0001110이니까 = 8 + 4 + 2 = 14 이고 맨 앞에 1 음수니까 - 부호 더해서
		 * 최종 결과값 -14 출력임 
		 */
		
		System.out.println(f); 
	
	
	}
}
