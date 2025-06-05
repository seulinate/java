package ch06;

public class Calculator {
	
	public int sum(int num1,int num2) {
		return num1 + num2;
	}
	
	public int sum(int num1, int num2, int num3) {
		return num1+ num2+num3;
	}
	
	public int sum(int[] values) {
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		return sum;
	}
	
	
	//가변인자는 배열으로 전달되니까 위에 선언한 배열이랑 메서드명이 중복될 수 없다. 
	//이 경우에 메서드명을 변경하거나, 가변 인수 앞에 매개변수 하나를 정의하는 2가지 해결 방식이 있다. 
	//단, 이경우 주의사항으로는 가변인자는 몇개가 전달될지 정해진게 아니라서 가장 마지막에 위치해야한다.
	public int sum(int init,int... values) { // 매개변수... => 해당 자료형의 인수값을 0개 이상 받을 수 있다.
		int sum = 0;
		for(int value : values) {
			sum = sum + value;
		}
		return sum;
	}

}
