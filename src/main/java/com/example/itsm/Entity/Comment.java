package com.example.itsm.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    private LocalDateTime timeStamp;
    @ManyToOne
    private Account user;
    private String description;
    boolean important;

}
