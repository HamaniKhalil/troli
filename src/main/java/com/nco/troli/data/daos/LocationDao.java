package com.nco.troli.data.daos;

import com.nco.troli.data.models.Location;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LocationDao {

    boolean insertLocation(Location location);

    List<Location> selectAllLocations();

    boolean deleteLocationById(UUID id);

    boolean updateLocationById(UUID id, Location location);

    Optional<Location> selectLocationById(UUID id);
}
