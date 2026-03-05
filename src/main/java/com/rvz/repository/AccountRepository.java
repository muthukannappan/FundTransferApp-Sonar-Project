package com.rvz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rvz.entity.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
      public Account findByAccno(int accno);
}
