package com.nco.troli.data.daos;

import com.nco.troli.data.models.Bus;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BusDao {

    boolean insertBus(UUID id, Bus bus);

    default boolean insertBus(Bus bus) {
        UUID id = UUID.randomUUID();
        return insertBus(id, bus);
    }

    List<Bus> selectAllBuses();

    boolean deleteBusById(UUID id);

    boolean updateBusById(UUID id, Bus bus);

    Optional<Bus> selectBusById(UUID id);
}
