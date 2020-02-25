package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Stop {

    private static final String ID_LABEL = "id";
    private static final String FORWARD_LABEL = "forward";
    private static final String BACKWARD_LABEL = "backward";

    private final UUID id;
    @NotBlank
    private final Location forward;
    @NotBlank
    private final Location backward;

    // Constructor
    public Stop(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(FORWARD_LABEL) @NotBlank Location forward,
            @JsonProperty(BACKWARD_LABEL) @NotBlank Location backward
    ) {
        this.id = id;
        this.forward = forward;
        this.backward = backward;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public Location getForward() {
        return forward;
    }

    public Location getBackward() {
        return backward;
    }
}
