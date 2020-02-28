package com.nco.troli.services;

import com.nco.troli.data.daos.BusDao;
import com.nco.troli.data.models.Bus;
import com.nco.troli.data.repositories.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BusService implements BusDao {

    private final BusRepository busRepository;

    // Constructor
    @Autowired
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public boolean insertBus(Bus bus) {
        return busRepository.save(bus) == null;
    }

    @Override
    public List<Bus> selectAllBuses() {
        return busRepository.findAll();
    }

    @Override
    public Optional<Bus> selectBusById(UUID id) {
        return busRepository.findById(id);
    }

    @Override
    public boolean deleteBusById(UUID id) {
        busRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean updateBusById(UUID id, Bus bus) {
        if(busRepository.findById(id).isPresent()) {
            bus.setId(id);
            busRepository.save(bus);
            return true;
        }
        else {
            return false;
        }
    }
}
