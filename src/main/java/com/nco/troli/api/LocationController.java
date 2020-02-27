package com.nco.troli.api;

import com.nco.troli.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
