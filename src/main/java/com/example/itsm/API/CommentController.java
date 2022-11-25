package com.example.itsm.API;

import com.example.itsm.DTO.response.AccountResponse;
import com.example.itsm.DTO.response.CommentResponse;
import com.example.itsm.Repository.CommentRepository;
import com.example.itsm.Service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/comments")
public class CommentController {

    CommentService commentService;

    @GetMapping
    public ResponseEntity<List<CommentResponse>> getComments(){
        return new ResponseEntity<>(commentService.getComments(), HttpStatus.OK);
    }
}
