package com.nco.troli.data.daos;

import com.nco.troli.data.models.Bus;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BusDao {

    boolean insertBus(Bus bus);

    List<Bus> selectAllBuses();

    boolean deleteBusById(UUID id);

    boolean deleteAllBuses();

    boolean updateBusById(UUID id, Bus bus);

    Optional<Bus> selectBusById(UUID id);
}
