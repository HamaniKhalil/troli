package com.nco.troli.services;

import com.nco.troli.data.daos.LocationDao;
import com.nco.troli.data.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.POSTGRES_QUALIFIER;

@Service
public class LocationService {

    private final LocationDao locationDao;

    // Constructor
    @Autowired
    public LocationService(@Qualifier(POSTGRES_QUALIFIER) LocationDao locationDao) {
        this.locationDao = locationDao;
    }

    public boolean addLocation(Location location) {
        return locationDao.insertPerson(location);
    }

    public List<Location> getAllLocations() {
        return locationDao.getAllLocations();
    }

    public Optional<Location> getLocationById(UUID id) {
        return locationDao.selectLocationById(id);
    }

    public boolean deleteLocationById(UUID id) {
        return locationDao.deleteLocationById(id);
    }

    public boolean updateLocationById(UUID id, Location location) {
        return locationDao.updateLocationById(id, location);
    }
}
