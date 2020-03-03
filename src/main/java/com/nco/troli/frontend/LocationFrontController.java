package com.nco.troli.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationFrontController {

    @RequestMapping("location")
    public String location() {
        return "location.html";
    }
}
