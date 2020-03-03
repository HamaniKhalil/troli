package com.nco.troli.data.daos;

import com.nco.troli.data.models.Line;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LineDao {

    boolean insertLine(Line Line);

    List<Line> selectAllLines();

    boolean deleteLineById(UUID id);

    boolean deleteAllLines();

    boolean updateLineById(UUID id, Line line);

    Optional<Line> selectLineById(UUID id);
}
