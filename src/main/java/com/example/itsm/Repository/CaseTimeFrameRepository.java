package com.example.itsm.Repository;

import com.example.itsm.Entity.CaseTimeFrame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface CaseTimeFrameRepository extends JpaRepository <CaseTimeFrame, LocalDateTime> {
}
