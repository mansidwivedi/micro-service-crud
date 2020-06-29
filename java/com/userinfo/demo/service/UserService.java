package com.userinfo.demo.service;

import org.springframework.stereotype.Repository;

import com.userinfo.demo.model.UserEntity;
 
@Repository
public interface UserService{
	public UserEntity getUser(Long user_id);
	public boolean deleteUser(UserEntity user);
	public boolean updateUser(UserEntity user);
	public boolean addUser(UserEntity user);	
}