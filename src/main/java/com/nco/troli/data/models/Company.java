package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "company")
public class Company {

    private static final String ID_LABEL = "id";
    private static final String NAME_LABEL = "name";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ID_LABEL)
    private UUID id;
    @Column(name = NAME_LABEL)
    @NotNull
    private String name;

    // Constructors
    public Company() {}

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

    // Setters
    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
