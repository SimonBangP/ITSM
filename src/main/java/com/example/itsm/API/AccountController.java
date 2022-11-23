package com.example.itsm.API;

import com.example.itsm.DTO.request.AccountRequest;
import com.example.itsm.DTO.response.AccountResponse;
import com.example.itsm.Entity.Account;
import com.example.itsm.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping
    public ResponseEntity<List<AccountResponse>> getAccounts(){
        return new ResponseEntity<>(accountService.getAccounts(), HttpStatus.OK);
    }

    @GetMapping("/{fullname}")
    public ResponseEntity<AccountResponse> getByFullname(@PathVariable String fullname){
        AccountResponse found = accountService.getAccountByFullname(fullname);

        if (found != null){
            return new ResponseEntity<>(found, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Void> addAccount(@RequestBody AccountRequest request){
        Account newAccount = new Account(request);

        accountService.add(newAccount);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{fullname}")
    public ResponseEntity<Void> removeAccount(@PathVariable String fullname){

        AccountResponse found = accountService.getAccountByFullname(fullname);

        if (found != null){
            accountService.removeAccount(fullname);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
