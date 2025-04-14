package com.mef.estage.services;

import com.mef.estage.entities.Referentiels.Section;
import com.mef.estage.entities.Referentiels.Structure;
import com.mef.estage.repositories.StructureRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StructureService extends  AbstractBaseService<Structure> {

    @Autowired
    @Getter
    private StructureRepository repository;

    public StructureService() {
        super(Structure.class);
    }

}
