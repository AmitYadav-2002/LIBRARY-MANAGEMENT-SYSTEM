package com.qsp.lms.model;

public class Book {
	private String bookName; 
    private double bookprice;
    private String bookAuthorName;
    
    public String getBookName() {
		return bookName;
	}
	public void setBookName(String d) {
		this.bookName = d;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double d) {
		this.bookprice = d;
	}
	public String getBookAuthorName() {
		return bookAuthorName;
	}
	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookprice=" + bookprice + ", bookAuthorName=" + bookAuthorName + "]";
	}
	
}
