package com.userinfo.demo.repository;



//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userinfo.demo.model.UserEntity;
 
//@Repository public interface UserRepository extends JpaRepository<UserEntity, Long> {}

@Repository
public interface UserRepository{
	public UserEntity getUser(Long id);
	public boolean deleteUser(UserEntity user);
	public boolean updateUser(UserEntity user);
	public boolean addUser(UserEntity user);	
}