package com.art.tbl.service.contractor.impls;
/*
@author ArtemFrunze
@class ContractorServiceImpl
@date 12.09.2021
@time 9:57 
*/

import com.art.tbl.model.Contractor;
import com.art.tbl.repository.ContractorRepositoryFake;
import com.art.tbl.service.contractor.interfaces.IContractorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractorServiceImpl implements IContractorService {
    @Autowired
    ContractorRepositoryFake repo;

    @Override
    public Contractor create(Contractor contractor) {
        return repo.create(contractor);
    }

    @Override
    public Contractor get(String id) {
        return repo.get(id);
    }

    @Override
    public List<Contractor> getAll() {
        return repo.getAll();
    }

    @Override
    public Contractor update(Contractor contractor) {
        return repo.update(contractor);
    }

    @Override
    public Contractor delete(String id) {
        return repo.delete(id);
    }
}
