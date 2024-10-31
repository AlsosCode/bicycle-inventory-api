// BicycleService.java
package org.example;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

// Service class that manages the bicycle inventory and handles business logic
@Service
public class BicycleService {

    // List of bicycles initialized with sample data
    private List<Bicycle> bicycles = BicycleDataFactory.createSampleData();

    // Retrieves the list of all bicycles
    public List<Bicycle> getAllBicycles() {
        return bicycles;
    }

    // Filters and retrieves bicycles that are in stock (quantity > 0)
    public List<Bicycle> getInStockBicycles() {
        return bicycles.stream().filter(bike -> bike.getInStock() > 0).toList();
    }

    // Finds a bicycle by its ID
    public Optional<Bicycle> getBicycleById(Long id) {
        return bicycles.stream().filter(bike -> bike.getId().equals(id)).findFirst();
    }

    // Adds a new bicycle to the list
    public Bicycle addBicycle(Bicycle bicycle) {
        bicycles.add(bicycle);
        return bicycle;
    }

    // Removes a bicycle from the list by its ID
    public void deleteBicycleById(Long id) {
        bicycles.removeIf(bike -> bike.getId().equals(id));
    }
}
