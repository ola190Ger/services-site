package com.art.tbl.service.location.impls;
/*
@author OlgaGereliuk
@class LocationServiceImpl
@Date 05.09.2021
@Time 20:54
*/

import com.art.tbl.model.Location;
import com.art.tbl.repository.LocationRepositoryFake;
import com.art.tbl.service.location.interfaces.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements ILocationService {
    @Autowired
    LocationRepositoryFake repo;

    @Override
    public Location create(Location location){
        return repo.create(location);
    }
    @Override
    public Location get(String id){
        return repo.get(id);
    }
    @Override
    public List<Location> getall(){
        return repo.getAll();
    }
    @Override
    public Location update(Location location) {
        return repo.update(location);
    }
    @Override
    public Location delete(String id){
        return repo.delete(id);
    }


}
