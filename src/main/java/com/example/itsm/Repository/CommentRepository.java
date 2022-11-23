package com.example.itsm.Repository;

import com.example.itsm.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public interface CommentRepository extends JpaRepository <Comment, LocalDateTime> {
    void deleteCommentByDescription(String description);

    Comment findCommentByDescription(String description);

}
