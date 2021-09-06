package com.art.tbl.service.providedservice.impls;/*
@author OlgaGereliuk
@class ProvidedServiceServiceImpl
@Date 06.09.2021
@Time 22:06
*/

import com.art.tbl.model.ProvidedService;
import com.art.tbl.repository.ProvidedServiceRepositoryFake;
import com.art.tbl.service.providedservice.interfaces.IProvidedServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvidedServiceServiceImpl implements IProvidedServiceService {
    @Autowired
    ProvidedServiceRepositoryFake repo;

    @Override
    public ProvidedService create(ProvidedService providedService) {
        return repo.create(providedService);
    }

    @Override
    public List<ProvidedService> getAll() {
        return repo.getAll();
    }

    @Override
    public ProvidedService get(String id) {
        return repo.get(id);
    }

    @Override
    public ProvidedService update(ProvidedService providedService) {
        return repo.update(providedService);
    }

    @Override
    public ProvidedService delete(String id) {
        return repo.delete(id);
    }


}
