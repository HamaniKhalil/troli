package com.nco.troli.api;

import com.nco.troli.data.models.Bus;
import com.nco.troli.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

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

    // ==== POST ====
    @PostMapping
    public void insertBus(@Valid @NotNull @RequestBody Bus bus) {
        busService.insertBus(bus);
    }

    // ==== GET ====
    @GetMapping
    public List<Bus> selectAllBuses() {
        return busService.selectAllBuses();
    }

    @GetMapping("/{id}")
    public Bus selectLineById(@PathVariable("id") UUID id) {
        return busService.selectBusById(id).orElse(null);
    }

    // ==== PUT ====
    @PutMapping("/{id}")
    public void updateLineById(
            @PathVariable("id") UUID id,
            @Valid @NotNull @RequestBody Bus bus
    ) {
        busService.updateBusById(id, bus);
    }

    // ==== DELETE ====
    @DeleteMapping("/{id}")
    public void deleteBusById(@PathVariable("id") UUID id) {
        busService.deleteBusById(id);
    }

    @DeleteMapping
    public void deleteAllBuses() {
        busService.deleteAllBuses();
    }
}
