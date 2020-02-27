package com.nco.troli.services;

import com.nco.troli.data.daos.LineDao;
import com.nco.troli.data.models.Line;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.LINE_PSQL_QUALIFIER;

@Service
public class LineService {

    private final LineDao lineDao;

    // Constructor
    @Autowired
    public LineService(@Qualifier(LINE_PSQL_QUALIFIER) LineDao lineDao) {
        this.lineDao = lineDao;
    }

    public boolean addLine(Line line) {
        return lineDao.insertLine(line);
    }

    public List<Line> getAllLines() {
        return lineDao.selectAllLines();
    }

    public Optional<Line> getLineById(UUID id) {
        return lineDao.selectLineById(id);
    }

    public boolean deleteLineById(UUID id) {
        return lineDao.deleteLineById(id);
    }

    public boolean updateLineById(UUID id, Line line) {
        return lineDao.updateLineById(id, line);
    }
}
