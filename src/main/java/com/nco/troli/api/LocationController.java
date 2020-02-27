package com.nco.troli.api;

import com.nco.troli.data.models.Location;
import com.nco.troli.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

import static com.nco.troli.env.Constants.LOCATION_PATH;

@RequestMapping(LOCATION_PATH)
@RestController
public class LocationController {

    private final LocationService locationService;

    // Constructor
    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    // ==== POST ====
    @PostMapping
    public void insertLocation(@Valid @NotNull @RequestBody Location location) {
        locationService.insertLocation(location);
    }

    // ==== GET ====
    @GetMapping
    public List<Location> selectAllLocations() {
        return locationService.selectAllLocations();
    }

    @GetMapping("/{id}")
    public Location selectLocationById(@PathVariable("id") UUID id) {
        return locationService.selectLocationById(id).orElse(null);
    }

    // ==== PUT ====
    @PutMapping("/{id}")
    public void updateLocationById(
            @PathVariable("id") UUID id,
            @Valid @NotNull @RequestBody Location location
    ) {
        locationService.updateLocationById(id, location);
    }

    // ==== DELETE ====
    @DeleteMapping("/{id}")
    public void deleteLocationById(@PathVariable("id") UUID id) {
        locationService.deleteLocationById(id);
    }
}
