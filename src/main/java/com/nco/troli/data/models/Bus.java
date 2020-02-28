package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "bus")
@PrimaryKeyJoinColumn(name = "id")
public class Bus extends Pathfinder {

    private static final String IS_FORWARD_LABEL = "isForward";
    private static final String IS_FORWARD_COLUMN = "is_forward";

    @Column(name = IS_FORWARD_COLUMN)
    @NotNull
    private boolean isForward;

    // Constructors
    public Bus() {}

    public Bus(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(LOCATION_LABEL) @NotNull Location location,
            @JsonProperty(IS_FORWARD_LABEL) @NotNull boolean isForward
    ) {
        super(id, location);
        this.isForward = isForward;
    }

    // Getters
    public boolean isForward() {
        return isForward;
    }

    //Setters
    public void setForward(boolean forward) {
        isForward = forward;
    }
}
