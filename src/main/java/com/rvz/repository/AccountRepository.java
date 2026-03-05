package com.rvz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rvz.entity.AccountDetail;
@Repository
public interface AccountRepository extends JpaRepository<AccountDetail, Integer>{
      public AccountDetail findByAccno(int accno);
}
