package com.example.itsm.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int caseid;
    String title;
    String description;
    @OneToOne(fetch = FetchType.EAGER)
            Account user;
    @OneToOne(fetch = FetchType.EAGER)
            Account caseWorker;
    int priority;
    String status;
    @ManyToOne(fetch = FetchType.EAGER)
    Comment[] internalComment;
    @ManyToOne(fetch = FetchType.EAGER)
    Comment[] externalComment;

    @OneToOne
    CaseTimeFrame timeFrame;




}

/*

case ID : Int
        user : Account (Entity for sig selv)   (Account: fullName, email, phone, location)
        caseWorker : Account
        title : String
        Description: String
        priority : int
        timeframe : TimeFrame (TimeFrame: StartDate, lastUpdated, expiresAt)
        status: String
        internalComment : Comment[] (Comment: timeStamp, user, description, important(checkbox)
        externalComment : Comment[]*/
