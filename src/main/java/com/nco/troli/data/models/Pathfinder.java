package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@MappedSuperclass
abstract public class Pathfinder {

    protected static final String ID_LABEL = "id";
    protected static final String LOCATION_LABEL = "location";
    protected static final String LOCATION_COLUMN = "location_id";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ID_LABEL)
    protected UUID id;
    @OneToOne
    @JoinColumn(name = LOCATION_COLUMN)
    @NotNull
    protected Location location;

    // Constructor
    public Pathfinder() {}

    public Pathfinder(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(LOCATION_LABEL) @NotNull Location location
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

    // Setters
    public void setId(UUID id) {
        this.id = id;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
