package com.example.itsm.Service;

import com.example.itsm.DTO.response.CommentResponse;
import com.example.itsm.Entity.Comment;
import com.example.itsm.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class CommentService {

    @Autowired
    CommentRepository commentRepository;


    public List<CommentResponse> getComments(){
        List<Comment> comments = commentRepository.findAll();

        List<CommentResponse> responses = comments.stream().map(c -> new CommentResponse(c)).collect(Collectors.toList());

        return responses;
    }

    public void addComment(Comment comment){commentRepository.save(comment);}

    public void deleteCommentByDescription(String description){
        commentRepository.deleteCommentByDescription(description);
    }

    public Comment findCommentByDescription(String description){
        return commentRepository.findCommentByDescription(description);
    }
}
