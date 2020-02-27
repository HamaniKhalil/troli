package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;

public class Line {

    private static final String ID_LABEL = "id";
    private static final String STOPS_LABEL = "stops";
    private static final String COMPANY_LABEL = "company";
    
    private final UUID id;
    @NotBlank
    private final List<Stop> stops;
    @NotBlank
    private final Company company;

    // Constructor
    public Line(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(STOPS_LABEL) @NotBlank List<Stop> stops,
            @JsonProperty(COMPANY_LABEL) @NotBlank Company company
    ) {
        this.id = id;
        this.stops = stops;
        this.company = company;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public Company getCompany() {
        return company;
    }
}
