package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "line")
public class Line {

    // JSON Label names
    private static final String ID_LABEL = "id";
    private static final String STOPS_LABEL = "stops";
    private static final String COMPANY_LABEL = "company";

    // DB column names
    private static final String LINE_STOP_TABLE_NAME = "line_stop";
    private static final String COMPANY_COLUMN = "company_id";
    private static final String LINE_ID_COLUMN = "line_id";
    private static final String STOP_ID_COLUMN = "stop_id";
    private static final String STOP_ORDER_COLUMN = "stop_order";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ID_LABEL)
    private UUID id;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @OrderColumn(name = STOP_ORDER_COLUMN)
    @JoinTable(
            name = LINE_STOP_TABLE_NAME,
            joinColumns = {
                    @JoinColumn(name = LINE_ID_COLUMN, nullable = false, updatable = false)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = STOP_ID_COLUMN, nullable = false, updatable = false)
            }
    )
    private List<Stop> stops;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = COMPANY_COLUMN)
    private Company company;

    // Constructor
    public Line() {}

    public Line(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(STOPS_LABEL) @NotNull List<Stop> stops,
            @JsonProperty(COMPANY_LABEL) Company company
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
