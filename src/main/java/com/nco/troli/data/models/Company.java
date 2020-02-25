package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Company {

    private static final String ID_LABEL = "id";
    private static final String NAME_LABEL = "name";

    private final UUID id;
    @NotBlank
    private final String name;

    // Constructors
    public Company(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(NAME_LABEL) String name
    ) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
