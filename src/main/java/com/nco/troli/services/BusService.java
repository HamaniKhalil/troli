package com.nco.troli.services;

import com.nco.troli.data.daos.BusDao;
import com.nco.troli.data.models.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.BUS_PSQL_QUALIFIER;

@Service
public class BusService {

    private final BusDao busDao;

    // Constructor
    @Autowired
    public BusService(@Qualifier(BUS_PSQL_QUALIFIER) BusDao busDao) {
        this.busDao = busDao;
    }

    public boolean addBus(Bus bus) {
        return busDao.insertBus(bus);
    }

    public List<Bus> getAllBuses() {
        return busDao.getAllBuses();
    }

    public Optional<Bus> getBusById(UUID id) {
        return busDao.selectBusById(id);
    }

    public boolean deleteBusById(UUID id) {
        return busDao.deleteBusById(id);
    }

    public boolean updateBusById(UUID id, Bus bus) {
        return busDao.updateBusById(id, bus);
    }
}
