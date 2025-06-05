package ch07.encapsulation;

public class BadcaseMyDate {
	public int day;
	public int month;
	public int year;
	
	public String toString() {
		return this.year + "_" + this.month + "_" + this.day;
	}
}
