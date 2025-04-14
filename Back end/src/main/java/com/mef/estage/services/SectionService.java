package com.mef.estage.services;

import com.mef.estage.entities.Referentiels.Agent;
import com.mef.estage.entities.Referentiels.Section;
import com.mef.estage.repositories.SectionRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionService extends AbstractBaseService<Section> {

    @Autowired
    @Getter
    private SectionRepository repository;

    public SectionService() {
        super(Section.class);
    }

}
