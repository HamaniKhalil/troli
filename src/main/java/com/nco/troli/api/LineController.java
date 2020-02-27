package com.nco.troli.api;

import com.nco.troli.services.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.nco.troli.env.Constants.LINE_PATH;

@RequestMapping(LINE_PATH)
@RestController
public class LineController {

    private final LineService lineService;

    // Constructor
    @Autowired
    public LineController(LineService lineService) {
        this.lineService = lineService;
    }
}
