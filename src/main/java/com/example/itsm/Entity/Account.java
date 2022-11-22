package com.example.itsm.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    String fullName;
    String email;
    int phone;
    String location;
}
