package com.handmadestar.blog.services;

import java.util.List;

import com.handmadestar.blog.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto userDto);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getallUser();
	void deleteUser(Integer userId);

}
