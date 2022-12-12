package grapheql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import entities.Book;
import entities.Chapter;
import repository.BookRepository;
import repository.ChapterRepository;


public class Query implements GraphQLRootResolver {
private BookRepository bookRepository;
private ChapterRepository chapterRepository;

	
	public Query(BookRepository b, ChapterRepository c)
	{this.bookRepository=b;
	this.chapterRepository = c;

	}
	
	
	public List<Book> getAllCompanies()
	
	
	{return bookRepository.getListBook();}
	
	
	
	
	
	public Book getBookbyid(String id)
	{
		return bookRepository.getBookbyId(id);
		}
	
public List<Chapter> getAllChapters()
	
	
	{return chapterRepository.getListChapter();}

public Chapter getChapterbyid(String id)
{
	return chapterRepository.getChapterbyId(id);
	}

}