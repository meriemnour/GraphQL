package repository;


import java.util.ArrayList;
import java.util.List;

import entities.Chapter;
import entities.Book;



public class ChapterRepository {
	
	/*private List<Chapter> chapters;
	
	public ChapterRepository() {
		chapters=new ArrayList<Chapter>();
		                  
		chapters.add(new Chapter("ref1", "JaxRS", "Web Service", new Book("ref1", "JaxRS"),3));
		chapters.add(new Chapter("ref2", "graphQL", "Web Service", new Book("ref2", "GraphQL"),3));
	}*/
	
	static List<Chapter> chapters = new ArrayList<Chapter>();
	public ChapterRepository() {
		// TODO Auto-generated constructor stub
		this.chapters.add(new Chapter("ref1", "JaxRS", "Web Service",new Book("ref1", "JaxRS"),3));
	}
	public List<Chapter>getListChapter()
	{
		return chapters;
	}
	
	public void saveChapter(Chapter chapter) {
		this.chapters.add(chapter);
	}

	public Chapter getChapterbyId(String id) {
		for(Chapter C:chapters)
			{if(C.getId().equals(id))
				return C;
			}
		return null;
	}
	
	public void deleteChapter(String id)
	{
		Chapter c=this.getChapterbyId(id);
		this.chapters.remove(c);
	}
	
	public void updateChapter(Chapter c) {
		int i =chapters.indexOf(c);
		if(i!=-1) {
			this.chapters.set(i, c);
		}
	}

}
