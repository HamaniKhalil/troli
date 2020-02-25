package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Passenger extends Pathfinder {

    // Constructor
    public Passenger(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(LOCATION_LABEL) @NotBlank Location location
    ) {
        super(id, location);
    }
}
