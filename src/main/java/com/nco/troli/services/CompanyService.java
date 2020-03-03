package com.nco.troli.services;

import com.nco.troli.data.daos.CompanyDao;
import com.nco.troli.data.models.Company;
import com.nco.troli.data.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CompanyService implements CompanyDao {

    private final CompanyRepository companyRepository;

    // Constructor
    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public boolean insertCompany(Company company) {
        return companyRepository.save(company) == null;
    }

    @Override
    public List<Company> selectAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Optional<Company> selectCompanyById(UUID id) {
        return companyRepository.findById(id);
    }

    @Override
    public boolean deleteCompanyById(UUID id) {
        companyRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean deleteAllCompanies() {
        companyRepository.deleteAll();
        return true;
    }

    @Override
    public boolean updateCompanyById(UUID id, Company company) {
        if(companyRepository.findById(id).isPresent()) {
            company.setId(id);
            companyRepository.save(company);
            return true;
        }
        else {
            return false;
        }
    }
}
