package com.nco.troli.api;

import com.nco.troli.data.models.Line;
import com.nco.troli.services.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

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

    // ==== POST ====
    @PostMapping
    public void insertLine(@Valid @NotNull @RequestBody Line line) {
        lineService.insertLine(line);
    }

    // ==== GET ====
    @GetMapping
    public List<Line> selectAllLines() {
        return lineService.selectAllLines();
    }

    @GetMapping("/{id}")
    public Line selectLineById(@PathVariable("id") UUID id) {
        return lineService.selectLineById(id).orElse(null);
    }

    // ==== PUT ====
    @PutMapping("/{id}")
    public void updateLineById(
            @PathVariable("id") UUID id,
            @Valid @NotNull @RequestBody Line line
    ) {
        lineService.updateLineById(id, line);
    }

    // ==== DELETE ====
    @DeleteMapping("/{id}")
    public void deleteLineById(@PathVariable("id") UUID id) {
        lineService.deleteLineById(id);
    }

    @DeleteMapping
    public void deleteAllLines() {
        lineService.deleteAllLines();
    }
}
