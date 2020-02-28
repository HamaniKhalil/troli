package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "location")
public class Location {

    public static final String ID_LABEL = "id";
    public static final String LONGITUDE_LABEL = "longitude";
    public static final String LATITUDE_LABEL = "latitude";

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = ID_LABEL)
    private UUID id;
    @Column(name = LONGITUDE_LABEL)
    @NotNull
    private double longitude;
    @Column(name = LATITUDE_LABEL)
    @NotNull
    private double latitude;

    // Constructor
    public Location() {}

    public Location(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(LONGITUDE_LABEL) @NotNull double longitude,
            @JsonProperty(LATITUDE_LABEL) @NotNull double latitude
    ) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    // Setters
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
