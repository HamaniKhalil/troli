package com.nco.troli.services;

import com.nco.troli.data.daos.StopDao;
import com.nco.troli.data.models.Stop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.STOP_PSQL_QUALIFIER;

@Service
public class StopService {

    private final StopDao stopDao;

    // Constructor
    @Autowired
    public StopService(@Qualifier(STOP_PSQL_QUALIFIER) StopDao stopDao) {
        this.stopDao = stopDao;
    }

    public boolean addStop(Stop stop) {
        return stopDao.insertStop(stop);
    }

    public List<Stop> getAllStops() {
        return stopDao.selectAllStops();
    }

    public Optional<Stop> getStopById(UUID id) {
        return stopDao.selectStopById(id);
    }

    public boolean deleteStopById(UUID id) {
        return stopDao.deleteStopById(id);
    }

    public boolean updateStopById(UUID id, Stop stop) {
        return stopDao.updateStopById(id, stop);
    }
}
