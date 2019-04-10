package com.imsystem.service.setup;

import java.util.List;

import com.imsystem.domain.User;

public interface UserService {

	public User queryUserByName(String name,String pwd);
	
	public User queryUserById(String id);
	
	public List<User> queryUserAll();
    
	public int insertUser(User user);
    
	public int deleteUserById(String id);
    
	public int updateUserById(User user);
	
}
