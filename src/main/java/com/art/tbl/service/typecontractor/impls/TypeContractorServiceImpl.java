package com.art.tbl.service.typecontractor.impls;
/*
@author ArtemFrunze
@class ITypeContractorImpl
@date 06.09.2021
@time 20:34 
*/

import com.art.tbl.model.TypeContractor;
import com.art.tbl.repository.TypeContractorRepositoryFace;
import com.art.tbl.service.typecontractor.interfaces.ITypeContractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeContractorServiceImpl implements ITypeContractorService {
    @Autowired
    TypeContractorRepositoryFace repo;

    @Override
    public TypeContractor create(TypeContractor typeContractor) {
        return repo.create(typeContractor);
    }

    @Override
    public TypeContractor get(String id) {
        return repo.get(id);
    }

    @Override
    public List<TypeContractor> getall() {
        return repo.getAll();
    }

    @Override
    public TypeContractor update(TypeContractor typeContractor) {
        return repo.update(typeContractor);
    }

    @Override
    public TypeContractor delete(String id) {
        return repo.delete(id);
    }
}
