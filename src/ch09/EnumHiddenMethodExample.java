package ch09;

public class EnumHiddenMethodExample {

	public static void main(String[] args) {
		Coin[] coins = Coin.values();
		
		System.out.println(coins); 
		
		System.out.println("==========");
		for(Coin c : coins) {
			System.out.println(c.toString());
		}
		System.out.println("==========");
		Coin c1 = Coin.valueOf("QUARTER");
		System.out.println("c1의 값 :" +c1);
		System.out.printf("c1의 값 :%s\n",c1);
	}

}
