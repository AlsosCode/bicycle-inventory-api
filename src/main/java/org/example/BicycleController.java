// BicycleController.java
package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

// REST Controller that defines API endpoints for interacting with the bicycle inventory
@RestController
@RequestMapping("/api/bicycle")
public class BicycleController {

    private final BicycleService bicycleService;

    // Constructor injection of BicycleService
    public BicycleController(BicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }

    // Endpoint to retrieve all bicycles
    @GetMapping
    public List<Bicycle> getAllBicycles() {
        return bicycleService.getAllBicycles();
    }

    // Endpoint to retrieve only bicycles that are in stock
    @GetMapping("/in-stock")
    public List<Bicycle> getInStockBicycles() {
        return bicycleService.getInStockBicycles();
    }

    // Endpoint to retrieve a specific bicycle by its ID
    @GetMapping("/{id}")
    public Optional<Bicycle> getBicycleById(@PathVariable Long id) {
        return bicycleService.getBicycleById(id);
    }

    // Endpoint to add a new bicycle to the inventory
    @PostMapping
    public Bicycle addBicycle(@RequestBody Bicycle bicycle) {
        return bicycleService.addBicycle(bicycle);
    }

    // Endpoint to delete a bicycle by its ID
    @DeleteMapping("/{id}")
    public void deleteBicycleById(@PathVariable Long id) {
        bicycleService.deleteBicycleById(id);
    }
}
