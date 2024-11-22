package com.handmadestar.blog.services;

import java.util.List;

import com.handmadestar.blog.entities.Post;
import com.handmadestar.blog.payloads.PostDto;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	Post updatePost(PostDto postDto, Integer postId);
	
	//delete
	void deletePost(Integer postId);
	
	//get all posts
	List<Post> getAllPost();
	
	//get all posts 
	Post getPostById(Integer postId);
	
	//getall posts by user
	List<PostDto> getPostByUser(Integer userId);
	
	//getall post by category
	List<PostDto> getPostByCategory(Integer categoryId);
	
	//search posts
	List<Post> searchPosts(String keyword);

}
