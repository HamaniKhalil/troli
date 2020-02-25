package com.nco.troli.services;

import com.nco.troli.data.daos.CompanyDao;
import com.nco.troli.data.models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.POSTGRES_QUALIFIER;

@Service
public class CompanyService {

    private final CompanyDao companyDao;

    // Constructor
    @Autowired
    public CompanyService(@Qualifier(POSTGRES_QUALIFIER) CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public boolean addCompany(Company company) {
        return companyDao.insertCompany(company);
    }

    public List<Company> getAllCompanies() {
        return companyDao.getAllCompanies();
    }

    public Optional<Company> getCompanyById(UUID id) {
        return companyDao.selectCompanyById(id);
    }

    public boolean deleteCompanyById(UUID id) {
        return companyDao.deleteCompanyById(id);
    }

    public boolean updateCompanyById(UUID id, Company company) {
        return companyDao.updateCompanyById(id, company);
    }
}