package com.nco.troli.api;

import com.nco.troli.data.models.Stop;
import com.nco.troli.services.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

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

    // ==== POST ====
    @PostMapping
    public void insertStop(@Valid @NotNull @RequestBody Stop stop) {
        stopService.insertStop(stop);
    }

    // ==== GET ====
    @GetMapping
    public List<Stop> selectAllStops() {
        return stopService.selectAllStops();
    }

    @GetMapping("/{id}")
    public Stop selectStopById(@PathVariable("id") UUID id) {
        return stopService.selectStopById(id).orElse(null);
    }

    // ==== PUT ====
    @PutMapping("/{id}")
    public void updateStopById(
            @PathVariable("id") UUID id,
            @Valid @NotNull @RequestBody Stop stop
    ) {
        stopService.updateStopById(id, stop);
    }

    // ==== DELETE ====
    @DeleteMapping("/{id}")
    public void deleteStopById(@PathVariable("id") UUID id) {
        stopService.deleteStopById(id);
    }

    @DeleteMapping
    public void deleteAllStops() {
        stopService.deleteAllStops();
    }
}
