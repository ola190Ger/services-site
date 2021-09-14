package com.art.tbl.repository;
/*
@author ArtemFrunze
@class TypeContractorRepositoryFace
@date 06.09.2021
@time 20:35 
*/

import com.art.tbl.fakedata.Data;
import com.art.tbl.model.TypeContractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class TypeContractorRepositoryFace {
    @Autowired
    Data data;

    public TypeContractor create(TypeContractor typeContractor) {
        UUID id = UUID.randomUUID();
        typeContractor.setId(id.toString());
        typeContractor.setCreatedAt(LocalDateTime.now());
        typeContractor.setUpdatedAt(LocalDateTime.now());
        data.getTypeContractors().add(typeContractor);
        return typeContractor;
    }

    public TypeContractor get(String id) {
        return this.getAll().stream().filter(item -> item.getId().equals(id)).findFirst()
                .get();
    }

    public TypeContractor update(TypeContractor typeContractor) {
        TypeContractor type = get(typeContractor.getId());
        typeContractor.setCreatedAt(type.getCreatedAt());
        typeContractor.setUpdatedAt(LocalDateTime.now());
        data.getTypeContractors().set(data.getTypeContractors().indexOf(type), typeContractor);
        return typeContractor;
    }

    public TypeContractor delete(String id) {
        TypeContractor typeContractor = get(id);
        data.getTypeContractors().remove(get(id));
        return typeContractor;
    }

    public List<TypeContractor> getAll() {
        return data.getTypeContractors();
    }
}
