package com.nurul.researchgroup.controller;

import com.nurul.researchgroup.model.Account;
import com.nurul.researchgroup.model.User;
import com.nurul.researchgroup.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class AccountController {

    @Autowired
    private AccountService accService;

    @GetMapping("/")
    public String init() {
        return "Welcome to Research Group Management System";
    }

    @GetMapping("/signup/getaccountbyemail")
    public List<Account> getAccountByEmail(@RequestParam(name = "email") String email) {
            return accService.getAccountByEmail(email);
    }

    @PostMapping("/signup/create")
    public Account createAccount(@RequestBody Account acc) {
        return accService.create(acc);
    }

    @GetMapping("/getaccountbyusername")
    public Account getAccountByUsername(@RequestParam(name = "username") String username) {
        return accService.getAccountByUsername(username);
    }

    @GetMapping("/account/getaccountbyid/{id}")
    public Optional<Account> getAccountById(@PathVariable String id) {
        return accService.getAccountById(id);
    }

    @PutMapping("/resetpassword")
    public Account resetPassword(@RequestBody Account acc) {
        return accService.update(acc);
    }

    @PutMapping("/account/update")
    public Account updateAccount(@RequestBody Account acc) {
        return accService.update(acc);
    }

//    @Autowired
//    private AccountRepository repository;
//
//    @PostMapping("/signup/create")
//     public String create(@RequestBody Account account) {
//         repository.save(account);
//         return  "Account " + account.getId() + " created";
//     }
//
//     @PutMapping("/account/update")
//     public String update(@RequestBody Account account) {
//        repository.save(account);
//        return "Account " + account.getFirstName() + " successfully updated";
//     }
//
//     @GetMapping("/find/{id}")
//     public Optional<Account> getAccount(@PathVariable int id) {
//        return repository.findById(id);
//     }
//
//     @DeleteMapping("/delete/{id}")
//     public String delete(@PathVariable int id) {
//        repository.deleteById(id);
//        return "Account is successfully deleted";

    }