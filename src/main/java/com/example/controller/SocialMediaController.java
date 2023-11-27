package com.example.controller;

import java.sql.SQLException;
//import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Account;
import com.example.service.AccountService;
//import com.example.service.MessageService;

//import antlr.StringUtils;
//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

/**
 * TODO: You will need to write your own endpoints and handlers for your controller using Spring. The endpoints you will need can be
 * found in readme.md as well as the test cases. You be required to use the @GET/POST/PUT/DELETE/etc Mapping annotations
 * where applicable as well as the @ResponseBody and @PathVariable annotations. You should
 * refer to prior mini-project labs and lecture materials for guidance on how a controller may be built.
 */

public class SocialMediaController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public ResponseEntity<Account> registerUser(@RequestBody Account account){
        Account existAccount=accountService.getAccountByUsername(account.getUsername());
        if(existAccount !=null){
            return new ResponseEntity<>(HttpStatus.CONFLICT);

        }
        Account savedAccount=accountService.saveAccount(account);
        return new ResponseEntity<Account>(savedAccount,HttpStatus.OK);
    }
    // public ResponseEntity<?> register(@RequestBody Account account) {
    //     // Registration logic
    //     if (account.getUsername().isEmpty() || account.getPassword().length() < 4) {
    //         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid username or password.");
    //     } else if (accountService.findByUsername(account.getUsername()).isPresent()) {
    //         return ResponseEntity.status(HttpStatus.CONFLICT).body("Username already exists.");
    //     } else {
    //         Account addedAccount = accountService.registerUser(account);
    //         return ResponseEntity.status(HttpStatus.OK).body(addedAccount);
    //     }
    // }


    //  login user 

    // @Autowired
    // //private AccountService accountService;

    // @PostMapping("/login")
    // public ResponseEntity<Object> loginUser(@RequestBody Account account) throws SQLException {
    //     Account loggedInAccount = accountService.loginUser(account);
        
    //     if (loggedInAccount != null) {
    //         return ResponseEntity.ok(loggedInAccount);
    //     } else {
    //         return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    //     }
    // }
    
}
