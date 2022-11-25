package com.example.itsm.Repository;

import com.example.itsm.DTO.request.AccountRequest;
import com.example.itsm.Entity.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AccountRepositoryTest  {

    @Autowired
    AccountRepository accountRepository;


    @BeforeEach
    void setUpB4Each(){
        Account acc = new Account("test", "test1", 13311532, "test2");

        accountRepository.save(acc);
    }

    @Test
    public void createAccount(){
        Account testaccount = new Account("testtest", "testtesttest", 13311532, "testtesttesttest");

        accountRepository.save(testaccount);

        assertEquals(2, accountRepository.count());
    }

    @Test
    public void findbyFullname(){
        Optional<Account> account = accountRepository.findAccountByFullName("test");

        assertEquals(false ,account.isEmpty());
    }

    @Test
    public void editAccount(){
        Optional<Account> account = accountRepository.findAccountByFullName("test");

        account.get().setPhone(1234);

        Optional<Account> edited = accountRepository.findAccountByFullName("test");


        assertEquals(1234, edited.get().getPhone());
    }

    @Test
    public void deleteAccount(){
        accountRepository.deleteAccountByFullName("test");

        assertEquals(true, accountRepository.findAccountByFullName("test").isEmpty());
    }
}
