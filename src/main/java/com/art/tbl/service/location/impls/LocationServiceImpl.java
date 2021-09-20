package com.art.tbl.service.location.impls;
/*
@author OlgaGereliuk
@class LocationServiceImpl
@Date 05.09.2021
@Time 20:54
*/

import com.art.tbl.dto.ImageDTO;
import com.art.tbl.dto.LocationDTO;
import com.art.tbl.mapper.ImageMapper;
import com.art.tbl.mapper.LocationMapper;
import com.art.tbl.model.Image;
import com.art.tbl.model.Location;
import com.art.tbl.repository.LocationRepositoryFake;
import com.art.tbl.service.location.interfaces.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationServiceImpl implements ILocationService {
    @Autowired
    LocationRepositoryFake repo;

    @Override
    public LocationDTO create(LocationDTO location){

        return LocationMapper.LOCATION_MAPPER.fromLocationDTO(repo.create(LocationMapper.LOCATION_MAPPER.toLocation(location)));
    }
    @Override
    public LocationDTO get(String id){
        return LocationMapper.LOCATION_MAPPER.fromLocationDTO(repo.get(id));
    }
    @Override
    public List<LocationDTO> getall(){
        List<LocationDTO> locationDTOList = new ArrayList<>();
        for (Location location: repo.getAll()){
            locationDTOList.add(LocationMapper.LOCATION_MAPPER.fromLocationDTO(location));
        }
        return locationDTOList;
    }
    @Override
    public LocationDTO update(LocationDTO location) {
        return LocationMapper.LOCATION_MAPPER.fromLocationDTO(repo.update(LocationMapper.LOCATION_MAPPER.toLocation(location)));
    }
    @Override
    public LocationDTO delete(String id){
        return LocationMapper.LOCATION_MAPPER.fromLocationDTO(repo.delete(id));
    }


}
