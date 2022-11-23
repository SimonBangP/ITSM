package com.example.itsm.Config;

import com.example.itsm.Entity.Account;
import com.example.itsm.Entity.Case;
import com.example.itsm.Entity.CaseTimeFrame;
import com.example.itsm.Entity.Comment;
import com.example.itsm.Repository.AccountRepository;
import com.example.itsm.Repository.CommentRepository;
import com.example.itsm.Service.AccountService;
import com.example.itsm.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;


@Component
public class SetupWorkEnvironment implements ApplicationRunner {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    AccountService accountService;

    @Autowired
    CommentRepository commentRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account acc = new Account("Ömer", "?", 13311532, "?");
        accountRepository.save(acc);

        Comment comment = new Comment(LocalDateTime.now(), acc, "test", true);

        CaseTimeFrame caseTimeFrame = new CaseTimeFrame(LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now().plusHours(24));


        Comment[] comments = new Comment[1];
        comments[0] = comment;


        Case casee = new Case(1, "test", "test", acc, acc, 1, "quo", comments, comments, caseTimeFrame);



    }
}
