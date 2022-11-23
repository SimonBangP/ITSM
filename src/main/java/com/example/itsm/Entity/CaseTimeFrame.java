package com.example.itsm.Entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CaseTimeFrame {
    @Id
    LocalDateTime CreatedTime;

    LocalDateTime LastUpdated;

    LocalDateTime ExpiresAt;
}
