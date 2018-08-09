package model;

public class Book {
	// instance members
	private String bookName;
	private String bookPrice;
	private String bookDescription;

	// constructor

	public Book() {
		super();
	}

	public Book(String bookName, String bookPrice, String bookDescription) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDescription = bookDescription;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookDescription=" + bookDescription + "]";
	}

}
