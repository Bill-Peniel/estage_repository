package com.mef.estage.repositories;

import com.mef.estage.entities.Referentiels.Agent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface AgentRepository extends BaseRepository<Agent>{
    @Query("SELECT a FROM Agent a WHERE a.isDelete = false " +
            "and a.id NOT IN (SELECT u.agent.id FROM User u WHERE u.isDelete = false) " +
            "ORDER BY lastName, firstName")
    Set<Agent> getAccountableAgent();
}
