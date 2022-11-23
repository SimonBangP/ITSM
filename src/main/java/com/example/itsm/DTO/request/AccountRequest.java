package com.example.itsm.DTO.request;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountRequest {

    private String fullName;
    private String email;
    private int phone;
    private String location;
}
