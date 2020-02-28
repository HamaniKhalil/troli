package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "line")
public class Line {

    private static final String ID_LABEL = "id";
    private static final String STOPS_LABEL = "stops";
    private static final String COMPANY_LABEL = "company";

    //
    private static final String COMPANY_COLUMN = "company_id";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ID_LABEL)
    private UUID id;
    @ManyToMany
    @JoinTable(
            name = "line_stop",
            joinColumns = {
                    @JoinColumn(name = "line_id", nullable = false, updatable = false)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "stop_id", nullable = false, updatable = false)
            }

    )
    private List<Stop> stops;
    @ManyToOne
    @JoinColumn(name = COMPANY_COLUMN)
    @NotNull
    private Company company;

    // Constructor
    public Line() {}

    public Line(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(STOPS_LABEL) @NotNull List<Stop> stops,
            @JsonProperty(COMPANY_LABEL) @NotNull Company company
    ) {
        this.id = id;
        this.stops = stops;
        this.company = company;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public Company getCompany() {
        return company;
    }

    // Setters
    public void setId(UUID id) {
        this.id = id;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
