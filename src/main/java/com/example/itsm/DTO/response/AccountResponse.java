package com.example.itsm.DTO.response;

import com.example.itsm.Entity.Account;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountResponse {
    private String fullName;
    private String email;
    private int phone;
    private String location;

    public AccountResponse(Account acc){
        this.fullName = acc.getFullName();
        this.email = acc.getEmail();
        this.phone = acc.getPhone();
        this.location = acc.getLocation();
    }
}
