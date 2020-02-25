package com.nco.troli.data.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Location {

    private static final String ID_LABEL = "id";
    private static final String LONGITUDE_LABEL = "longitude";
    private static final String LATITUDE_LABEL = "latitude";

    private final UUID id;
    @NotBlank
    private double longitude;
    @NotBlank
    private double latitude;

    // Constructor
    public Location(
            @JsonProperty(ID_LABEL) UUID id,
            @JsonProperty(LONGITUDE_LABEL) @NotBlank double longitude,
            @JsonProperty(LATITUDE_LABEL) @NotBlank double latitude
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
}
