package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Bus extends Pathfinder {

    private static final String IS_FORWARD_LABEL = "isForward";

    @NotBlank
    private boolean isForward;

    public Bus(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(LOCATION_LABEL) @NotBlank Location location,
            @JsonProperty(IS_FORWARD_LABEL) @NotBlank boolean isForward
    ) {
        super(id, location);
        this.isForward = isForward;
    }

    // Getters
    public boolean isForward() {
        return isForward;
    }
}
