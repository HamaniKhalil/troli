package com.nco.troli.services;

import com.nco.troli.data.daos.LineDao;
import com.nco.troli.data.models.Line;
import com.nco.troli.data.repositories.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LineService implements LineDao {

    private final LineRepository lineRepository;

    // Constructor
    @Autowired
    public LineService(LineRepository lineRepository) {
        this.lineRepository = lineRepository;
    }

    @Override
    public boolean insertLine(Line line) {
        return lineRepository.save(line) == null;
    }

    @Override
    public List<Line> selectAllLines() {
        return lineRepository.findAll();
    }

    @Override
    public Optional<Line> selectLineById(UUID id) {
        return lineRepository.findById(id);
    }

    @Override
    public boolean deleteLineById(UUID id) {
        lineRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean updateLineById(UUID id, Line line) {
        if(lineRepository.findById(id).isPresent()) {
            line.setId(id);
            lineRepository.save(line);
            return true;
        }
        else {
            return false;
        }
    }
}
