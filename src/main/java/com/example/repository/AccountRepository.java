package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Account;
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
}
// public interface accountRepository extends JpaRepository<Account,Long>{
//     Optional<Account> registerUser()
// }
//login

// @Repository
// interface AccountDAO extends JpaRepository<Account, Long> {
//     Account getAccountByUsername(Account account);
// }
