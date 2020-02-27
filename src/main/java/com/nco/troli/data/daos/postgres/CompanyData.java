package com.nco.troli.data.daos.postgres;

import com.nco.troli.data.daos.CompanyDao;
import com.nco.troli.data.models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.nco.troli.env.Constants.COMPANY_PSQL_QUALIFIER;

@Repository(COMPANY_PSQL_QUALIFIER)
public class CompanyData implements CompanyDao {

    private final JdbcTemplate jdbcTemplate;

    // Constructor
    @Autowired
    public CompanyData(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean insertCompany(UUID id, Company company) {
        return false;
    }

    @Override
    public List<Company> getAllCompanies() {
        return null;
    }

    @Override
    public boolean deleteCompanyById(UUID id) {
        return false;
    }

    @Override
    public boolean updateCompanyById(UUID id, Company company) {
        return false;
    }

    @Override
    public Optional<Company> selectCompanyById(UUID id) {
        return Optional.empty();
    }
}
