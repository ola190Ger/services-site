package com.art.tbl.service.location.interfaces;
/*
@author OlgaGereliuk
@class LocationServiceImpl
@Date 05.09.2021
@Time 20:57
*/

import com.art.tbl.dto.LocationDTO;
import com.art.tbl.model.Location;

import java.util.List;

public interface ILocationService {
    LocationDTO create(LocationDTO location);
    LocationDTO get(String id);
    List<LocationDTO> getall();
    LocationDTO update(LocationDTO location);
    LocationDTO delete(String id);
}
