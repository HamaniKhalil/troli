package com.nco.troli.services;

import com.nco.troli.data.daos.LineDao;
import com.nco.troli.data.models.Company;
import com.nco.troli.data.models.Line;
import com.nco.troli.data.models.Stop;
import com.nco.troli.data.repositories.CompanyRepository;
import com.nco.troli.data.repositories.LineRepository;
import com.nco.troli.data.repositories.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class LineService implements LineDao {

    private final LineRepository lineRepository;
    private final CompanyRepository companyRepository;
    private final StopRepository stopRepository;

    // Constructor
    @Autowired
    public LineService(
            LineRepository lineRepository,
            CompanyRepository companyRepository,
            StopRepository stopRepository
    ) {
        this.lineRepository = lineRepository;
        this.companyRepository = companyRepository;
        this.stopRepository = stopRepository;
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
    public boolean deleteAllLines() {
        lineRepository.deleteAll();
        return true;
    }

    @Override
    public boolean updateLineById(UUID id, Line line) {
        Optional<Line> found = lineRepository.findById(id);

        if(found.isPresent()) {
            Line old = found.get();
            // Copy company
            Company company;
            if((company = line.getCompany()) != null) {
                if(company.getId() != null) {
                    company = companyRepository.findById(company.getId()).get();
                }
                old.setCompany(company);
            }
            // Copy stops
            if(line.getStops() != null && !line.getStops().isEmpty()) {
                for(int i = 0; i < line.getStops().size(); i ++) {
                    if(line.getStops().get(i).getId() == null) {
                        Stop storredStop = stopRepository.save(line.getStops().get(i));
                        line.getStops().set(i, storredStop);
                    }
                }
                old.setStops(line.getStops());
            }
            // Update
            lineRepository.save(old);
            return true;
        }
        else {
            return false;
        }
    }
}
