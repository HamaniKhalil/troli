package com.nco.troli.services;

import com.nco.troli.data.daos.StopDao;
import com.nco.troli.data.models.Stop;
import com.nco.troli.data.repositories.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StopService implements StopDao {

    private final StopRepository stopRepository;

    // Constructor
    @Autowired
    public StopService(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    @Override
    public synchronized boolean insertStop(Stop stop) {
        return stopRepository.save(stop) == null;
    }

    @Override
    public List<Stop> selectAllStops() {
        return stopRepository.findAll();
    }

    @Override
    public Optional<Stop> selectStopById(UUID id) {
        return stopRepository.findById(id);
    }

    @Override
    public boolean deleteStopById(UUID id) {
        stopRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean deleteAllStops() {
        stopRepository.deleteAll();
        return true;
    }

    @Override
    public boolean updateStopById(UUID id, Stop stop) {
        if(stopRepository.findById(id).isPresent()) {
            stop.setId(id);
            stopRepository.save(stop);
            return true;
        }
        else {
            return false;
        }
    }
}
