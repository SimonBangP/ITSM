package com.example.itsm.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    private String fullName;
    private String email;
    private int phone;
    private String location;
}
