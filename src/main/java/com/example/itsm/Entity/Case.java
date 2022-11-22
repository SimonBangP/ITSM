package com.example.itsm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int caseid;
    String title;
    String description;
    int priority;
    String status;


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
