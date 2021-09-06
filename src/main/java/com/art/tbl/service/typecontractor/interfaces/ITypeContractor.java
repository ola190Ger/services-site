package com.art.tbl.service.typecontractor.interfaces;
/*
@author ArtemFrunze
@class ITypeContractor
@date 06.09.2021
@time 20:32 
*/

import com.art.tbl.model.TypeContractor;

import java.util.List;

public interface ITypeContractor {
    TypeContractor create(TypeContractor typeContractor);
    TypeContractor get(String id);
    List<TypeContractor> getall();
    TypeContractor update(TypeContractor typeContractor);
    TypeContractor delete(String id);
}
