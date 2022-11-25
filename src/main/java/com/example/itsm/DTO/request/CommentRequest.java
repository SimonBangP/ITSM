package com.example.itsm.DTO.request;

import com.example.itsm.Entity.Account;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentRequest {


    private LocalDateTime localDateTime;
    private Account user;
    private String description;
    boolean important;
}
