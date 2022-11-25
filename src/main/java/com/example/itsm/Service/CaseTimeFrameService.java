package com.example.itsm.Service;


import com.example.itsm.DTO.response.CaseTimeFrameResponse;
import com.example.itsm.Entity.CaseTimeFrame;
import com.example.itsm.Repository.CaseTimeFrameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CaseTimeFrameService {

    @Autowired
    CaseTimeFrameRepository caseTimeFrameRepository;

public List<CaseTimeFrameResponse> getCaseTimeFrame (){

   List<CaseTimeFrame> caseTimeFrames = caseTimeFrameRepository.findAll();

   List <CaseTimeFrameResponse> responses = caseTimeFrames.stream().map(ctf -> new CaseTimeFrameResponse(ctf)).collect(Collectors.toList());
    return responses;
}

}
