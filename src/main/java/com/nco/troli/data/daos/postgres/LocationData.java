package com.nco.troli.data.daos.postgres;

import com.nco.troli.data.daos.LocationDao;
import com.nco.troli.data.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.LOCATION_PSQL_QUALIFIER;

@Repository(LOCATION_PSQL_QUALIFIER)
public class LocationData implements LocationDao {

    private final JdbcTemplate jdbcTemplate;

    // Constructor
    @Autowired
    public LocationData(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean insertLocation(UUID id, Location location) {
        return false;
    }

    @Override
    public List<Location> getAllLocations() {
        return null;
    }

    @Override
    public boolean deleteLocationById(UUID id) {
        return false;
    }

    @Override
    public boolean updateLocationById(UUID id, Location location) {
        return false;
    }

    @Override
    public Optional<Location> selectLocationById(UUID id) {
        return Optional.empty();
    }
}
