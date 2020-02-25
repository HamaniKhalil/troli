package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

abstract public class Pathfinder {

    protected static final String ID_LABEL = "id";
    protected static final String LOCATION_LABEL = "location";

    protected final UUID id;
    @NotBlank
    protected Location location;

    // Constructor
    public Pathfinder(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(LOCATION_LABEL) @NotBlank Location location
    ) {
        this.id = id;
        this.location = location;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public Location getLocation() {
        return location;
    }
}
