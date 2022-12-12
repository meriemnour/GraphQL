package grapheql;


import com.coxautodev.graphql.tools.GraphQLRootResolver;

import entities.Book;
import entities.Chapter;
import repository.BookRepository;
import repository.ChapterRepository;

public class Mutation implements GraphQLRootResolver{
    private  BookRepository bookRepository;
private ChapterRepository chapterRepository;

	
	
	public Mutation(BookRepository B,  ChapterRepository C) {
		// TODO Auto-generated constructor stub
		this.bookRepository=B;
		this.chapterRepository = C;
	}
	// Book
	
	public Book createBook(String id, String title) {
		Book b= new Book(id,title);
		this.bookRepository.saveBook(b);
		return b;
	}
	public Book deleteBook(String id) {
	  this.bookRepository.deleteBook(id);
	  return null;
	}
	public Book updateBook(String id, String title) {
		Book b= new Book(id,title);
		this.bookRepository.updateBook(b);
		return b;
	}
	
	// Chapter
	//String id, String name, String course,Book book, int order
	public Chapter createChapter(String id, String name,String course, Book book, int order) {
		Chapter c= new Chapter(id,name,course,book,order);
		this.chapterRepository.saveChapter(c);
		return c;
	}
	
	public Chapter deleteChapter(String id) {
		  this.chapterRepository.deleteChapter(id);
		  return null;
		}
		public Chapter updateChapter(String id, String name,String course, Book book, int order) {
			Chapter c= new Chapter(id,name,course,book,order);
			this.chapterRepository.updateChapter(c);
			return c;
		}
}

