package com.example.itsm.Entity;

import com.example.itsm.DTO.request.AccountRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Account {

    @Id
    private String fullName;
    private String email;
    private int phone;
    private String location;


    public Account(AccountRequest request){
        this.fullName = request.getFullName();
        this.email = request.getEmail();
        this.phone = request.getPhone();
        this.location = request.getLocation();
    }
}
