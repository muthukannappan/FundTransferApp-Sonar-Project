package com.rvz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rvz.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Integer> {
       public UserDetails findByUsername(String username);
}
