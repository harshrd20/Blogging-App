package com.handmadestar.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.handmadestar.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
