package com.nco.troli.services;

import com.nco.troli.data.daos.LocationDao;
import com.nco.troli.data.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.LOCATION_PSQL_QUALIFIER;

@Service
public class LocationService {

    private final LocationDao locationDao;

    // Constructor
    @Autowired
    public LocationService(@Qualifier(LOCATION_PSQL_QUALIFIER) LocationDao locationDao) {
        this.locationDao = locationDao;
    }

    public boolean insertLocation(Location location) {
        return locationDao.insertPerson(location);
    }

    public List<Location> selectAllLocations() {
        return locationDao.selectAllLocations();
    }

    public Optional<Location> selectLocationById(UUID id) {
        return locationDao.selectLocationById(id);
    }

    public boolean deleteLocationById(UUID id) {
        return locationDao.deleteLocationById(id);
    }

    public boolean updateLocationById(UUID id, Location location) {
        return locationDao.updateLocationById(id, location);
    }
}
