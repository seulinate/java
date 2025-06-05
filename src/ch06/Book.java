package ch06;


//생성자 중복 정의하기

public class Book {
	String title;
	String author;
	int pageCount;
	
	public Book() { //기본생성자
		this.title = "unknown title";
		this.author = "unknown author";
		this.pageCount = 0;
	}
	
	public Book(String title,String author) { //일부 정보만 받는 생성자
		this.title = title;
		this.author = author;
		this.pageCount = 0;
	}
	
	public Book(String title, String author, int pageCount) { // 모든 정보를 다 갖는 생성자 
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}

}
