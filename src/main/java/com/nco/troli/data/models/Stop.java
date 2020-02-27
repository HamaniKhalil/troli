package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Stop {

    private static final String ID_LABEL = "id";
    private static final String NAME_LABEL = "name";
    private static final String FORWARD_LABEL = "forward";
    private static final String BACKWARD_LABEL = "backward";

    private final UUID id;
    private final String name;
    @NotBlank
    private final Location forward;
    @NotBlank
    private final Location backward;

    // Constructor
    public Stop(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(NAME_LABEL) String name,
            @JsonProperty(FORWARD_LABEL) @NotBlank Location forward,
            @JsonProperty(BACKWARD_LABEL) @NotBlank Location backward
    ) {
        this.id = id;
        this.name = name;
        this.forward = forward;
        this.backward = backward;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Location getForward() {
        return forward;
    }

    public Location getBackward() {
        return backward;
    }
}
