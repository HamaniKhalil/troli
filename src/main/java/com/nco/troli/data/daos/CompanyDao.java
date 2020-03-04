package com.nco.troli.data.daos;

import com.nco.troli.data.models.Company;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CompanyDao {

    boolean insertCompany(Company company);

    List<Company> selectAllCompanies();

    boolean deleteCompanyById(UUID id);

    boolean deleteAllCompanies();

    boolean updateCompanyById(UUID id, Company company);

    Optional<Company> selectCompanyById(UUID id);
}
