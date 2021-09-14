package com.art.tbl.repository;/*
@author OlgaGereliuk
@class LocationRepositoryFake
@Date 05.09.2021
@Time 20:25
*/
import com.art.tbl.fakedata.Data;
import com.art.tbl.model.Contractor;
import com.art.tbl.model.Location;
import com.art.tbl.model.ProvidedService;
import com.art.tbl.model.Reviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class LocationRepositoryFake {
    @Autowired
    Data data;

    public Location create(Location location){
//        location.setContractorId(data.getContractor().stream()
//                .map(Contractor::getId).collect(Collectors.toList()));
        UUID id = UUID.randomUUID();
        location.setId(id.toString());
        location.setCreatedAt(LocalDateTime.now());
        location.setUpdatedAt(LocalDateTime.now());
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
        location.setCreatedAt(loc.getCreatedAt());
        location.setUpdatedAt(LocalDateTime.now());
        data.getLocations().set(data.getLocations().indexOf(loc), location);
        return location;
    }
    public Location delete(String id){
        Location location = get(id);
        data.getLocations().remove(get(id));
        return location;
    }

}
