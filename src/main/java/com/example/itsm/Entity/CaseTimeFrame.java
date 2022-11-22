package com.example.itsm.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class CaseTimeFrame {
    @Id
    LocalDateTime CreatedTime;

    LocalDateTime LastUpdated;

    LocalDateTime ExpiresAt;
}
