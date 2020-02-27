package com.nco.troli.data.daos;

import com.nco.troli.data.models.Line;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LineDao {

    boolean insertLine(UUID id, Line Line);

    default boolean insertLine(Line line) {
        UUID id = UUID.randomUUID();
        return insertLine(id, line);
    }

    List<Line> selectAllLines();

    boolean deleteLineById(UUID id);

    boolean updateLineById(UUID id, Line line);

    Optional<Line> selectLineById(UUID id);
}
