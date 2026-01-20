package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.PostStatus;

public class Post {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private PostStatus status;
	
	List<Comment> comments = new ArrayList<>();
	
	public Post() {
		
	}

	public Post(Date moment, String title, String content, Integer likes, PostStatus status) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		this.status = status;
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

	public PostStatus getStatus() {
		return status;
	}

	public void setStatus(PostStatus status) {
		this.status = status;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment c) {
		comments.add(c);
	}
	
	public void removeComment(Comment c) {
		comments.remove(c);
	}
	
	public String toString() {
		
		 StringBuilder sb = new StringBuilder();
		 sb.append(title + "\n");
		 sb.append(likes + " likes " + " - " + sdf.format(moment) + "\n");
		 sb.append("Status " + status + "\n");
		 sb.append(content + "\n\n");
		 sb.append("Comments: \n");
		 for(Comment c: comments) {
			 sb.append(c + "\n");
		 }
		 
		 return sb.toString();
	}
	
	
	
	
	
}
