package com.art.tbl.repository;/*
@author OlgaGereliuk
@class ProvidedServiceRepositoryFake
@Date 06.09.2021
@Time 21:52
*/

import com.art.tbl.fakedata.Data;
import com.art.tbl.model.ProvidedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class ProvidedServiceRepositoryFake {
    @Autowired
    Data data;

    public ProvidedService create(ProvidedService providedService) {
        UUID id = UUID.randomUUID();
        providedService.setId(id.toString());
        providedService.setCreatedAt(LocalDateTime.now());
        providedService.setUpdatedAt(LocalDateTime.now());
        data.getProvidedServices().add(providedService);
        return providedService;
    }

    public List<ProvidedService> getAll() {
        return data.getProvidedServices();
    }

    public ProvidedService get(String id) {
        return getAll().parallelStream().filter(s -> s.getId().equals(id)).findFirst().orElseGet(() -> get(id));

    }

    public ProvidedService update(ProvidedService providedService) {
        ProvidedService providedService1 = get(providedService.getId());
        providedService.setCreatedAt(providedService1.getCreatedAt());
        providedService.setUpdatedAt(LocalDateTime.now());
        data.getProvidedServices().set(data.getProvidedServices().indexOf(providedService1), providedService);
        return providedService;
    }

    public ProvidedService delete(String id) {
        ProvidedService providedService = get(id);
        data.getProvidedServices().remove(get(id));
        return providedService;
    }
}
