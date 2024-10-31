// BicycleDataFactory.java
package org.example;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;

// Factory class for creating sample data of Bicycle objects
public class BicycleDataFactory {


    // Static method to generate a list of sample Bicycle objects
    public static List<Bicycle> createSampleData() {
        Faker faker = new Faker(); // Faker instance to generate random data
        List<Bicycle> bicycles = new ArrayList<>();

        // Loop to generate 50 sample bicycles
        for (int i = 1; i < 51; i++) {
            // Create a new Manufacturer object with random data
            Manufacturer manufacturer = new Manufacturer(
                    (long) i, faker.company().name(), faker.internet().url(), faker.phoneNumber().phoneNumber()
            );

            // Create a new Bicycle object with random data
            Bicycle bicycle = new Bicycle(
                    (long) i,
                    faker.name().firstName() + " Bike",
                    faker.color().name(),
                    "BIKE-" + (1000 + i),
                    faker.number().numberBetween(0, 10),
                    manufacturer
            );

            // Add the new bicycle to the list
            bicycles.add(bicycle);
        }
        return bicycles; // Return the list of sample bicycles
    }
}
