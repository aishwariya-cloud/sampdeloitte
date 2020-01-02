package com.library.model;

public class Books {

	private int bookId;
	private String bookName;
	private double bookPrice;
	private String bookAuthor;
	
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookAuthor="
				+ bookAuthor + "]";
	}
	public static int counter=1001;
	
	public Books()
	{
		counter++;
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Books.counter = counter;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
}
