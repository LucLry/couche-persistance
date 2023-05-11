package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    final UserDao userDao;

    public UserService (UserDao userDao){
        this.userDao = userDao;
    }


    public List<User> findAllUsers(){
        return userDao.findAll();
    }
    @Transactional
    public User saveUser (User user ){
        return userDao.save(user);
    }

    public Optional<User> findUserById(Long id) {
        return userDao.findById(id);
    }

    @Transactional
    public boolean deleteUserById(Long id){
        userDao.deleteById(id);
        return true;
    }

}
