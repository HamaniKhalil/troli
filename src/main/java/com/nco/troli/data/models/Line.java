package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;

public class Line {

    private static final String ID_LABEL = "id";
    private static final String STOPS_LABEL = "stops";
    
    private final UUID id;
    @NotBlank
    private final List<Stop> stops;

    // Constructor
    public Line(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(STOPS_LABEL) @NotBlank List<Stop> stops
    ) {
        this.id = id;
        this.stops = stops;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public List<Stop> getStops() {
        return stops;
    }
}
