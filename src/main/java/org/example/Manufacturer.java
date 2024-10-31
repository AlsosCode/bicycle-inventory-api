// Manufacturer.java
package org.example;

// Manufacturer class represents the manufacturer of a bicycle with contact details
public class Manufacturer {
    private Long id;
    private String name;
    private String website;
    private String phoneNumber;

    // Constructor
    public Manufacturer(Long id, String name, String website, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.website = website;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters for accessing and modifying manufacturer attributes
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getWebsite() { return website; }
    public void setWebsite(String website) { this.website = website; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
}
