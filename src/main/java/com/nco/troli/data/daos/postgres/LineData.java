package com.nco.troli.data.daos.postgres;

import com.nco.troli.data.daos.LineDao;
import com.nco.troli.data.models.Line;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.LINE_PSQL_QUALIFIER;

@Repository(LINE_PSQL_QUALIFIER)
public class LineData implements LineDao {

    private final JdbcTemplate jdbcTemplate;

    // Constructor
    @Autowired
    public LineData(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean insertLine(UUID id, Line Line) {
        return false;
    }

    @Override
    public List<Line> getAllLines() {
        return null;
    }

    @Override
    public boolean deleteLineById(UUID id) {
        return false;
    }

    @Override
    public boolean updateLineById(UUID id, Line line) {
        return false;
    }

    @Override
    public Optional<Line> selectLineById(UUID id) {
        return Optional.empty();
    }
}
