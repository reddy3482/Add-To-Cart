package model;

import java.util.Collection;

public interface bookDAO {
	public void addNewBook(Book book);

	Collection<Book> viewAllBoooks();

	public void deleteBook(String bookName);

}
