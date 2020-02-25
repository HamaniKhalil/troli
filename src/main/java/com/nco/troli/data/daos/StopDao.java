package com.nco.troli.data.daos;

import com.nco.troli.data.models.Stop;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StopDao {

    boolean insertStop(UUID id, Stop stop);

    default boolean insertStop(Stop stop) {
        UUID id = UUID.randomUUID();
        return insertStop(id, stop);
    }

    List<Stop> getAllStops();

    boolean deleteStopById(UUID id);

    boolean updateStopById(UUID id, Stop stop);

    Optional<Stop> selectStopById(UUID id);
}
