package com.nco.troli.api;

import com.nco.troli.data.models.Company;
import com.nco.troli.data.models.Stop;
import com.nco.troli.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

import static com.nco.troli.env.Constants.COMPANY_PATH;

@RequestMapping(COMPANY_PATH)
@RestController
public class CompanyController {

    private final CompanyService companyService;

    // Constructor
    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    // ==== POST ====
    @PostMapping
    public void insertCompany(@Valid @NotNull @RequestBody Company company) {
        companyService.insertCompany(company);
    }

    // ==== GET ====
    @GetMapping
    public List<Company> selectAllCompanies() {
        return companyService.selectAllCompanies();
    }

    @GetMapping("/{id}")
    public Company selectCompanyById(@PathVariable("id") UUID id) {
        return companyService.selectCompanyById(id).orElse(null);
    }

    // ==== PUT ====
    @PutMapping("/{id}")
    public void updateCompanyById(
            @PathVariable("id") UUID id,
            @Valid @NotNull @RequestBody Company company
    ) {
        companyService.updateCompanyById(id, company);
    }

    // ==== DELETE ====
    @DeleteMapping("/{id}")
    public void deleteCompanyById(@PathVariable("id") UUID id) {
        companyService.deleteCompanyById(id);
    }

    @DeleteMapping
    public void deleteAllCompanies() {
        companyService.deleteAllCompanies();
    }
}
