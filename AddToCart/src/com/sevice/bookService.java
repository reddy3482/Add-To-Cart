package com.sevice;

import java.util.Collection;

import model.Book;
import model.booklistDAO;

public interface bookService {
	public  void addNewBook();

	Collection<Book> viewAllBooks();

	void deleteBook(String bookName);
	
	public void setBookDAO(booklistDAO dao);


}
