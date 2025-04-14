package com.mef.estage.controllers;

import com.mef.estage.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/agt")
public class AgentController {
    @Autowired
    private AgentService agentService;


}
