package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "bus")
@PrimaryKeyJoinColumn(name = "id")
public class Bus extends Pathfinder {

    // JSON labels
    private static final String IS_FORWARD_LABEL = "isForward";
    private static final String LINE_LABEL = "line";
    // DB Column names
    private static final String IS_FORWARD_COLUMN = "is_forward";
    private static final String LINE_COLUMN = "line_id";

    @Column(name = IS_FORWARD_COLUMN)
    @NotNull
    private boolean isForward;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = LINE_COLUMN)
    @NotNull
    private Line line;

    // Constructors
    public Bus() {}

    public Bus(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(LOCATION_LABEL) @NotNull Location location,
            @JsonProperty(IS_FORWARD_LABEL) @NotNull boolean isForward,
            @JsonProperty(LINE_LABEL) @NotNull Line line
    ) {
        super(id, location);
        this.isForward = isForward;
        this.line = line;
    }

    // Getters
    public boolean isForward() {
        return isForward;
    }

    public Line getLine() {
        return line;
    }

    //Setters
    public void setForward(boolean forward) {
        isForward = forward;
    }

    public void setLine(Line line) {
        this.line = line;
    }
}
