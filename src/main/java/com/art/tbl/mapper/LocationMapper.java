package com.art.tbl.mapper;/*
@author OlgaGereliuk
@class LocationMapper
@Date 19.09.2021
@Time 22:56
*/


import com.art.tbl.dto.LocationDTO;
import com.art.tbl.model.Location;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

@Mapper(uses={Location.class})
public interface LocationMapper {
    LocationMapper LOCATION_MAPPER = Mappers.getMapper(LocationMapper.class);

    LocationDTO fromLocationDTO(Location location);

    @InheritInverseConfiguration
    Location toLocation(LocationDTO locationDTO);
}
