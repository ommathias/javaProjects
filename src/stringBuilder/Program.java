package stringBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		Post post = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to new zealand",
				"I'm going to visit this country", 12);
		
		Post post1 = new Post (sdf.parse("28/07/2018 23:14:19"),
				"Good night", "See u tomorrow", 5);
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment ("Thats awesome!");
		Comment c3 = new Comment ("Good night");
		Comment c4 = new Comment ("may the force be with u");
		

		post.addComment(c1);
		post.addComment(c2);
		post1.addComment(c3);
		post1.addComment(c4);
		
		
		System.out.println(post);
		System.out.println(post1);	
		
		
		

	}

}
