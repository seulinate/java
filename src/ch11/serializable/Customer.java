package ch11.serializable;

import java.io.Serializable;

public class Customer implements Serializable{
	private String name;
	private char gender;
	private String email;
	private int birthYear;
	
	public Customer(String name,char gender,String email,int birthYear) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return "Customer [name= " + name + ". gender="+gender+"email="+email+", birthYear="+birthYear+"]";
	}

}
