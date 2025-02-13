package com.handmadestar.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handmadestar.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
