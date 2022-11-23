package com.example.itsm.DTO.response;


import com.example.itsm.Entity.Account;
import com.example.itsm.Entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class CommentResponse {

private LocalDateTime timeStamp;
private Account user;
private String description;
private String important;


public CommentResponse (Comment com){
    this.timeStamp = com.getTimeStamp();
    this.user = com.getUser();
    this.description = com.getDescription();
    this.important = com.getImportant();
}

}
