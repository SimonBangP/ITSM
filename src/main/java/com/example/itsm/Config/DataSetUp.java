package com.example.itsm.Config;

import com.example.itsm.Entity.Account;
import com.example.itsm.Repository.AccountRepository;
import com.example.itsm.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataSetUp implements ApplicationRunner {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    AccountService accountService;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account acc = new Account("Ömer", "?", 13311532, "?");

        accountRepository.save(acc);
    }
}
