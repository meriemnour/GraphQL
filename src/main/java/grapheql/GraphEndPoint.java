package grapheql;


import javax.servlet.annotation.WebServlet;
import com.coxautodev.graphql.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import repository.BookRepository;
import repository.ChapterRepository;


@WebServlet(urlPatterns = "/GraphQLV1")

public class GraphEndPoint extends SimpleGraphQLServlet 
{

	public GraphEndPoint() {
super(buildSchema());
		// TODO Auto-generated constructor stub
	}

	 private static GraphQLSchema buildSchema()
	 
	 
	 {
		 
		 BookRepository bookRepository=new BookRepository();
		 ChapterRepository chapterRepository = new ChapterRepository();
		 return SchemaParser.newParser().file("schema.graphql").resolvers(new Query(bookRepository, chapterRepository), 
		 new Mutation(bookRepository, chapterRepository)).build().makeExecutableSchema();
		 
	 }

	 
}
