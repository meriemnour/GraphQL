package repository;

import java.util.ArrayList;
import java.util.List;

import entities.Book;
import entities.Chapter;

public class BookRepository {
	/*private List<Book> books;
	public BookRepository() {
		books=new ArrayList<Book>();
		
		books.add(new Book("ref1", "JaxRS"));
		books.add(new Book("ref2", "GraphQL"));
	}
	*/
	
	static List<Book> books = new ArrayList<Book>();
	public BookRepository() {
		// TODO Auto-generated constructor stub
		this.books.add(new Book("ref1","JaxRs"));
	}
	public List<Book>getListBook(){
		return books;
		
	}
	
	public void saveBook(Book book) {
		this.books.add(book);
	}
	
	public Book getBookbyId(String id) {
		for(Book b:books) {
			if(b.getId().equals(id))
				return b;
		}return null;
	}
	
	public void deleteBook(String id) {
		Book b=this.getBookbyId(id);
		this.books.remove(b);
	}
	
	public void updateBook(Book b) {
		int i = books.indexOf(b);
		if(i!=-1) {
			this.books.set(i, b);
		}
	}

}
