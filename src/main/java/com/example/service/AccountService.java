package com.example.service;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Account;
import com.example.repository.AccountRepository;
@Service
public interface AccountService {
    @Autowired

    Account findByUsername(String username);
    
    // private AccountRepository accountRepository;

    // public Optional<Account> findByUsername(String username) {
    //     return accountRepository.findByUsername(username);
    // }

    // // public Account registerUser(Account account) {
    // //     Account savedAccount = accountRepository.save(account);
    // //     //return savedAccount;
    // // }

    Account saveAccount(Account account);
//login


    // @Autowired
    // private AccountService accountService;

    // public Account loginUser(Account account) throws SQLException {
    //     Account loggedInAccount = accountService.getAccountByUsername(account);

    //     if (account != null && loggedInAccount != null && account.getUsername() != null
    //             && loggedInAccount.getUsername() != null && account.getPassword() != null
    //             && loggedInAccount.getPassword() != null && account.getUsername().equals(loggedInAccount.getUsername())
    //             && account.getPassword().equals(loggedInAccount.getPassword())) {
    //         return loggedInAccount;
    //     } else {
    //         return null;
    //     }
    // }

    // private Account getAccountByUsername(Account account) {
    //     return null;
    // }

        Account  getAccountByUsername(String username);
}
