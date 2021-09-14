package com.art.tbl.service.providedservice.interfaces;/*
@author OlgaGereliuk
@class IProvidedServiceService
@Date 06.09.2021
@Time 22:02
*/

import com.art.tbl.model.ProvidedService;

import java.util.List;

public interface IProvidedServiceService {
    ProvidedService create(ProvidedService providedService);
    List<ProvidedService> getAll();
    ProvidedService get(String id);
    ProvidedService update(ProvidedService providedService);
    ProvidedService delete(String id);

}
