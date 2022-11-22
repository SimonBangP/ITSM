package com.example.itsm.Repository;

import com.example.itsm.DTO.request.AccountRequest;
import com.example.itsm.Entity.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class AccountRepositoryTest  {

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

}
