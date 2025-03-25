//package com.godev.chatroom.service;
//
//import com.godev.chatroom.model.Account;
//import com.godev.chatroom.repository.AccountRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class AccountService {
//    @Autowired
//    private AccountRepository accountRepository;
//
//    public Account createAccount(Account account) {
//        return accountRepository.save(account);
//    }
//
//    public Optional<Account> getAccountById(Long id) {
//        return accountRepository.findById(id);
//    }
//
//    public Optional<Account> getAccountByUsername(String username) {
//        return accountRepository.findByUsername(username);
//    }
//}
