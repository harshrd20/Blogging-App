package com.handmadestar.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handmadestar.blog.entities.Category;
import com.handmadestar.blog.entities.Post;
import com.handmadestar.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
}
