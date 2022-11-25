package com.example.itsm.Repository;

import com.example.itsm.Entity.Account;
import com.example.itsm.Entity.Comment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    AccountRepository accountRepository;

    @BeforeEach
    void setUpB4Each(){
        Account acc = new Account("test", "test1", 13311532, "test2");

        accountRepository.save(acc);

        Comment comment = new Comment(LocalDateTime.now(), acc, "test123", true);

        commentRepository.save(comment);
    }

    @Test
    public void createComment(){
        Account acc = new Account("test111", "test1", 13311532, "test2");

        accountRepository.save(acc);

        Comment comment = new Comment(LocalDateTime.now().plusHours(1), acc, "test123", true);

        commentRepository.save(comment);

        assertEquals(2, commentRepository.count());
    }

    @Test
    public void editComment(){
        Comment comment = commentRepository.findCommentByDescription("test123");

        comment.setDescription("ændret");

        Comment ændret = commentRepository.findCommentByDescription("ændret");

        assertEquals("ændret", ændret.getDescription());
    }

    @Test
    public void deleteComment(){

        commentRepository.deleteCommentByDescription("test123");
        assertEquals(null, commentRepository.findCommentByDescription("test123"));
    }
}

