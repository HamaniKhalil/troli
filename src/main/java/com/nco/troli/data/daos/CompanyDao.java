package com.nco.troli.data.daos;

import com.nco.troli.data.models.Company;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CompanyDao {

    boolean insertCompany(UUID id, Company company);

    default boolean insertCompany(Company company) {
        UUID id = UUID.randomUUID();
        return insertCompany(id, company);
    }

    List<Company> getAllCompanies();

    boolean deleteCompanyById(UUID id);

    boolean updateCompanyById(UUID id, Company company);

    Optional<Company> selectCompanyById(UUID id);
}
