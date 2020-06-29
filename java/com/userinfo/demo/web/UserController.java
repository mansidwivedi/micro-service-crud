package com.userinfo.demo.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.userinfo.demo.model.UserEntity;
import com.userinfo.demo.service.UserServiceImpl;
 
@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserServiceImpl service;
 
//    @GetMapping
//    public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
//        List<EmployeeEntity> list = service.getAllEmployees();
// 
//        return new ResponseEntity<List<EmployeeEntity>>(list, new HttpHeaders(), HttpStatus.OK);
//    }
 
    @GetMapping("/{id}")
    public UserEntity getUser(@PathVariable("id") Long id,UserEntity user) {
    	user.setUser_id(id);
    	return service.getUser(id);
    }
    
    @PostMapping("addUser")
    public boolean addUser(@RequestBody UserEntity user) {
    	return service.addUser(user);
    }
 
    @PostMapping("/{id}")
    public boolean updateUser(@RequestBody UserEntity user,@PathVariable("id") Long id) {
    	user.setUser_id(id);
    	return service.updateUser(user);
    }

 
    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable("id") Long id,UserEntity user){
    	user.setUser_id(id);
    	return service.deleteUser(user);
    }
   
 
}