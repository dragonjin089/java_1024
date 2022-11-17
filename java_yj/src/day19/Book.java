package day19;

import java.util.Scanner;

import lombok.Data;

@Data
public class Book {

	private String bookName ;
	private String writer;
	private int price;
	private String company;
	private String type;
	private long isbn;
	Scanner scan;
	
	public Book(String bookName, String writer, int price, String company, String type, long isbn) {
		
		this.bookName = bookName;
		this.writer = writer;
		this.price = price;
		this.company = company;
		this.type = type;
		this.isbn = isbn;
	}

	public Book(String bookName2) {
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public String toString() {
		return "책이름 : " + bookName + "\n"+
			 "저자 : " + writer + "\n"+
				"가격 : " + price + "\n"+
			 "출판사 : " + company +"\n"+
				"장르 : " + type + "\n"+
			 "isbn : " + isbn + "\n";
	}
	
	
	
}
