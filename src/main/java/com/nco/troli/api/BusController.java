package com.nco.troli.api;

import com.nco.troli.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.nco.troli.env.Constants.BUS_PATH;

@RequestMapping(BUS_PATH)
@RestController
public class BusController {

    private final BusService busService;

    // Constructor
    @Autowired
    public BusController(BusService busService) {
        this.busService = busService;
    }
}
