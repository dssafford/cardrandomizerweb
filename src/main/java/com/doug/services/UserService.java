package com.doug.services;

import com.doug.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by doug on 3/3/17.
 */
public interface UserService extends JpaRepository<User, Integer> {

//	User findByUserName(String userName);
//
//	Iterable<User> listAllUsers();
//
//	User getById(Integer id);
//
//	void delete(Integer id);
//
//	User saveOrUpdateUser(User user);

}