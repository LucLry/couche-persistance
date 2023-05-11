package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository <User, Long> {
    public List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);


}
