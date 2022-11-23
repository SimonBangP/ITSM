package com.example.itsm.Repository;

import com.example.itsm.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CommentRepository extends JpaRepository <Comment, LocalDateTime> {

}
