import java.util.Date;

public class FormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12345;
		System.out.printf("정수 : [%d][%10d][%-10d][%010d]\n",a,a,a,a);
		
		double b = 123.456;
		System.out.printf("실수: [%f][%10.2f][%-10.4f][%010.4f]\n",b,b,b,b);

		String c = "hello";
		System.out.printf("문자 : [%s][%10s][%-10s][%10S][%5.2s]\n",c,c,c,c,c);
		//%5.2s : 공백 포함 총 5자리 출력하는데 문자열을 .2개 출력한다. 
		System.out.printf("논리 : [%b][%B]\n",true,false);
		
		Date d = new Date();
		System.out.printf("시간 : [%tH:%tM:%tS]\n",d,d,d);
		System.out.printf("날짜:[%1$ty-%1$tm-%1$td]",d);
		// 1$ : 1번 위치에 있는 값을 대입한다. 
		
	}
}
