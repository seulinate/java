package ch07.interface_;

public class InterfaceImplExample3 {

	public static void main(String[] args) {
		ToDo todo = new ToDo();
		IToDo3 itodo3 = todo;
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
//		itodo3.m4();
		
		IToDo4 itodo4 = todo;
		itodo4.m4();
	}

}
