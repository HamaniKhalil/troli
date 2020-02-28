package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "stop")
public class Stop {

    private static final String ID_LABEL = "id";
    private static final String NAME_LABEL = "name";
    private static final String FORWARD_LABEL = "forward";
    private static final String BACKWARD_LABEL = "backward";

    // Column names
    private static final String FORWARD_COLUMN = "forward_id";
    private static final String BACKWARD_COLUMN = "backward_id";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ID_LABEL)
    private UUID id;
    @Column(name = NAME_LABEL)
    @NotNull
    private String name;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = FORWARD_COLUMN)
    @NotNull
    private Location forward;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = BACKWARD_COLUMN)
    @NotNull
    private Location backward;

    // Constructor
    public Stop() {}

    public Stop(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(NAME_LABEL) String name,
            @JsonProperty(FORWARD_LABEL) @NotNull Location forward,
            @JsonProperty(BACKWARD_LABEL) @NotNull Location backward
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

    // Setters
    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setForward(Location forward) {
        this.forward = forward;
    }

    public void setBackward(Location backward) {
        this.backward = backward;
    }
}
