package com.art.tbl.service.contractor.interfaces;
/*
@author ArtemFrunze
@class IContractorService
@date 12.09.2021
@time 9:55 
*/

import com.art.tbl.model.Contractor;

import java.util.List;

public interface IContractorService {
    Contractor create(Contractor contractor);
    Contractor get(String id);
    List<Contractor> getAll();
    Contractor update(Contractor contractor);
    Contractor delete(String id);
}
