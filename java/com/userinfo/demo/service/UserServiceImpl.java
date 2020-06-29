package com.userinfo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.userinfo.demo.model.UserEntity;
import com.userinfo.demo.repository.UserRepository;
 
@Service
public class UserServiceImpl implements UserService {
     
    @Autowired
    private UserRepository repo;
     
    @Override
    public UserEntity getUser(Long id) {
    	return repo.getUser(id);
    }
    @Override
	public boolean deleteUser(UserEntity user) {
		return repo.deleteUser(user);
	}
    @Override
	public boolean updateUser(UserEntity user) {
		return repo.deleteUser(user);
	}
    @Override
	public boolean addUser(UserEntity user) {
    	return repo.addUser(user);
    }
}