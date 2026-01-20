package application;

import java.util.Date;

import entities.Comment;
import entities.Post;
import entities.enums.PostStatus;

public class Main {

	public static void main(String[] args) {
		
		Comment c1 = new Comment("Have a nice Trip!", "Alex Brown");
		Comment c2 = new Comment("Wow that's awesome!", "Bob Green");
		Post post = new Post(new Date(),"Traveling to New Zealand", "I love this country", 12, PostStatus.PUBLISHED);
		
		post.addComment(c1);
		post.addComment(c2);
		
		System.out.println(post);
		

	}

}
