package com.art.tbl.service.location.interfaces;
/*
@author OlgaGereliuk
@class LocationServiceImpl
@Date 05.09.2021
@Time 20:57
*/

import com.art.tbl.model.Location;

import java.util.List;

public interface ILocationService {
    Location create(Location location);
    Location get(String id);
    List<Location> getall();
    Location update(Location location);
    Location delete(String id);
}
