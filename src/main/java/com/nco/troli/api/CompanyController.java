package com.nco.troli.api;

import com.nco.troli.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
