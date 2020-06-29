package com.userinfo.demo.repository;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userinfo.demo.model.UserEntity;
 
//@Repository public interface UserRepository extends JpaRepository<UserEntity, Long> {}

@Repository
public class UserDaoImpl implements UserRepository{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public UserEntity getUser(Long user_id){
		Session session=sessionFactory.getCurrentSession();
		UserEntity user=(UserEntity)session.load(UserEntity.class,user_id);
		if(user!=null) {
			return user;
		}
		else{
			return null;
			}
		}
	@Override
	public boolean deleteUser(UserEntity user) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().delete(user);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	@Override
	public boolean updateUser(UserEntity user) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().update(user);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	@Override
	public boolean addUser(UserEntity user) {
		boolean status=false;
		try {
			sessionFactory.getCurrentSession().save(user);
			status=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
}