package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "passenger")
@PrimaryKeyJoinColumn(name = "id")
public class Passenger extends Pathfinder {

    // Constructors
    public Passenger() {}

    public Passenger(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(LOCATION_LABEL) @NotNull Location location
    ) {
        super(id, location);
    }
}
