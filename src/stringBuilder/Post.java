package stringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

	private Date moment; 
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> lista = new ArrayList<>();

	public Post()
	{
		
	}
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getLista() {
		return lista;
	}

	
	void addComment(Comment comment)
	{
		lista.add(comment);
	}
	
	 void delComment(Comment comment)
	{
		lista.remove(comment);
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(title + " ");
		System.out.println();
		sb.append(likes + " Likes - ");
		System.out.println();
		sb.append(sdf.format(moment)+ " ");
		System.out.println();
		sb.append(content + " ");
		System.out.println("Comments: ");
	    for (Comment c : lista)
	    {
	    	sb.append(c.getText());
	    }
	    return sb.toString();
	}

}
