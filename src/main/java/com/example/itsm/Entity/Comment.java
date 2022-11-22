package com.example.itsm.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
public class Comment {

    @Id
    private LocalDateTime timeStamp;
    @ManyToOne
    private Account user;
    private String description;
    boolean important;

}
