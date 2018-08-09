package model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class booklistDAO implements bookDAO {

	private Map<String, Book> books = new HashMap<>();
	Book book = new Book();

	@Override
	public void addNewBook(Book book) {
		books.put(book.getBookName(), book);

	}

	@Override
	public Collection<Book> viewAllBoooks() {

		return books.values();
	}

	@Override
	public void deleteBook(String bookName) {
		books.remove(bookName);
	}

}
