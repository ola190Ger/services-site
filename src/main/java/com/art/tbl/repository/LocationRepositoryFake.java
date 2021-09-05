package com.art.tbl.repository;/*
@author OlgaGereliuk
@class LocationRepositoryFake
@Date 05.09.2021
@Time 20:25
*/
import com.art.tbl.fakedata.Data;
import com.art.tbl.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LocationRepositoryFake {
    @Autowired
    Data data;

    public Location create(Location location){
        data.getLocations().add(location);
        return location;
    }

    public List<Location> getAll() {
        return data.getLocations();
    }


    public Location get(String id){
        return getAll().parallelStream().filter(s -> s.getId().equals(id)).findFirst().orElseGet(() -> get(id));
    }

    public Location update(Location location) {
        Location loc = get(location.getId());
        data.getLocations().set(data.getLocations().indexOf(loc), location);
        return location;
    }
    public Location delete(String id){
        Location location = get(id);
        data.getLocations().remove(get(id));
        return location;
    }

}
