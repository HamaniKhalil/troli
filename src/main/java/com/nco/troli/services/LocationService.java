package com.nco.troli.services;

import com.nco.troli.data.daos.LocationDao;
import com.nco.troli.data.models.Location;
import com.nco.troli.data.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LocationService implements LocationDao {

    private final LocationRepository locationRepository;

    // Constructor
    @Autowired
    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public boolean insertLocation(Location location) {
        return locationRepository.save(location) == null;
    }

    @Override
    public List<Location> selectAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Optional<Location> selectLocationById(UUID id) {
        return locationRepository.findById(id);
    }

    @Override
    public boolean deleteLocationById(UUID id) {
        locationRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean updateLocationById(UUID id, Location location) {
        if(locationRepository.findById(id).isPresent()) {
            location.setId(id);
            locationRepository.save(location);

            return true;
        }
        else {
            return false;
        }
    }
}
