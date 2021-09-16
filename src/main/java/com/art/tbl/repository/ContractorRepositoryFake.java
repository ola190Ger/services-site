package com.art.tbl.repository;
/*
@author ArtemFrunze
@class ContractorRepositoryFake
@date 12.09.2021
@time 9:40 
*/

import com.art.tbl.fakedata.Data;
import com.art.tbl.model.Contractor;
import com.art.tbl.model.TypeContractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class ContractorRepositoryFake {
    @Autowired
    Data data;

    public Contractor create(Contractor contractor) {
        UUID id = UUID.randomUUID();
        contractor.setId(id.toString());
        contractor.setCreatedAt(LocalDateTime.now());
        contractor.setUpdatedAt(LocalDateTime.now());
        if(contractor.getProvidedServicesId() == null)
            contractor.setProvidedServicesId(new ArrayList<>());
        if(contractor.getTypeContractorId() == null)
            contractor.setTypeContractorId(new ArrayList<>());
        data.getContractors().add(contractor);
        return contractor;
    }

    public Contractor get(String id) {
        return this.getAll().stream().filter(item -> item.getId().equals(id)).findFirst()
                .get();
    }

    public Contractor update(Contractor contractor) {
        Contractor contr = get(contractor.getId());
        contractor.setCreatedAt(contr.getCreatedAt());
        contractor.setUpdatedAt(LocalDateTime.now());
        data.getContractors().set(data.getContractors().indexOf(contr), contractor);
        return contractor;
    }

    public Contractor delete(String id) {
        Contractor contractor = get(id);
        data.getContractors().remove(get(id));
        return contractor;
    }

    public List<Contractor> getAll() {
        return data.getContractors();
    }
}
