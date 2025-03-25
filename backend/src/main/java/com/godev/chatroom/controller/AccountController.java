//package com.godev.chatroom.controller;
//
//
//import com.godev.chatroom.model.Account;
//import com.godev.chatroom.service.AccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/accounts")
//public class AccountController {
//    @Autowired
//    private AccountService accountService;
//
//    @PostMapping
//    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
//        Account createAccount = accountService.createAccount(account);
//        return ResponseEntity.ok(createAccount);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Account> getAccountById(@PathVariable Long id) {
//        Optional<Account> account = accountService.getAccountById(id);
//        return account.map(ResponseEntity::ok)
//            .orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    @GetMapping("/username/{username}")
//    public ResponseEntity<Account> getAccountByUsername(@PathVariable String username) {
//        Optional<Account> account = accountService.getAccountByUsername(username);
//        return account.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }
//}
