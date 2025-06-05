package ch07.interface_;

public class Something implements ISomething{
	public void run() {
		System.out.println("run() :"+ISomething.DEFAULT_SALARY);
	}

}
