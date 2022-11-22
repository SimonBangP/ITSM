package com.example.itsm.Service;

import com.example.itsm.DTO.response.AccountResponse;
import com.example.itsm.Entity.Account;
import com.example.itsm.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<AccountResponse> getAccounts(){
        List<Account> accounts = accountRepository.findAll();

        List<AccountResponse> responses = accounts.stream().map(acc -> new AccountResponse(acc)).collect(Collectors.toList());

        return responses;
    }

    public AccountResponse getAccountByFullname(String fullname){
        Optional<Account> optionalAccount = accountRepository.findAccountByFullName(fullname);

        return new AccountResponse(optionalAccount.get());
    }

    public void add(Account account){
        accountRepository.save(account);
    }

    public void removeAccount(String fullname){
        accountRepository.deleteAccountByFullName(fullname);
    }
}
