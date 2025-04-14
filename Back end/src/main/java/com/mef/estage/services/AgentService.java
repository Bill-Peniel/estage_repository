package com.mef.estage.services;

import com.mef.estage.entities.Referentiels.Agent;
import com.mef.estage.repositories.AgentRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService  {

    @Autowired
    @Getter
    private AgentRepository repository;



}
