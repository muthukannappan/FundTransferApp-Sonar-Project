package com.rvz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rvz.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
       public User findByUsername(String username);
}
