package com.gavin.mapper;

import java.util.List;

import com.gavin.entity.User;

public interface UserMapper {
	public List<User> selectAll() throws Exception;
	
}
