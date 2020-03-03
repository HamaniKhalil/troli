package com.nco.troli.data.daos;

import com.nco.troli.data.models.Stop;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StopDao {

    boolean insertStop(Stop stop);

    List<Stop> selectAllStops();

    boolean deleteStopById(UUID id);

    boolean deleteAllStops();

    boolean updateStopById(UUID id, Stop stop);

    Optional<Stop> selectStopById(UUID id);
}
