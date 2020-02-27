package com.nco.troli.api;

import com.nco.troli.services.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.nco.troli.env.Constants.STOP_PATH;

@RequestMapping(STOP_PATH)
@RestController
public class StopController {

    private final StopService stopService;

    // Constructor
    @Autowired
    public StopController(StopService stopService) {
        this.stopService = stopService;
    }
}
