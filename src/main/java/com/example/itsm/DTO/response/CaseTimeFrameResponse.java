package com.example.itsm.DTO.response;

import com.example.itsm.Entity.CaseTimeFrame;

import java.time.LocalDateTime;

public class CaseTimeFrameResponse {

LocalDateTime createdTime;

LocalDateTime lastUpdated;

LocalDateTime expiresAt;


public CaseTimeFrameResponse (CaseTimeFrame ctf){

    this.createdTime = ctf.getCreatedTime();
    this.lastUpdated = ctf.getLastUpdated();
    this.expiresAt = ctf.getExpiresAt();
}
}
