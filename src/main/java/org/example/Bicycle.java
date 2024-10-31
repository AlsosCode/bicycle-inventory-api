// Bicycle.java
package org.example;

// Bicycle class represents a bicycle with properties and a linked Manufacturer
public class Bicycle {
    private Long id;
    private String name;
    private String color;
    private String model;
    private int inStock;
    private Manufacturer manufacturer;

    // Constructor
    public Bicycle(Long id, String name, String color, String model, int inStock, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.model = model;
        this.inStock = inStock;
        this.manufacturer = manufacturer;
    }

    // Getters and Setters for accessing and modifying bicycle attributes
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public int getInStock() { return inStock; }
    public void setInStock(int inStock) { this.inStock = inStock; }
    public Manufacturer getManufacturer() { return manufacturer; }
    public void setManufacturer(Manufacturer manufacturer) { this.manufacturer = manufacturer; }
}
