package com.bookapp.model;

public class Book {
	
	private String title;
	private String author;
	private double price;
	private Integer bookid;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, double price, Integer bookid) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}
