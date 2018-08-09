package com.sevice;

import java.util.Collection;

import model.Book;
import model.booklistDAO;

public class booklistService implements bookService {

	private booklistDAO bdao = new booklistDAO();

	@Override
	public void addNewBook() {

		bdao.addNewBook(new Book("Alchemist", "499", "Philosophy"));
		bdao.addNewBook(new Book("twilight", "999", "Romance and drama"));
		bdao.addNewBook(new Book("All your Perfects", "400", "Romance"));
	}

	@Override
	public Collection<Book> viewAllBooks() {
		return bdao.viewAllBoooks();
	}

	@Override
	public void deleteBook(String bookName) {
		bdao.deleteBook(bookName);
	}

	@Override
	public void setBookDAO(booklistDAO dao) {

		this.bdao = dao;
	}

}
