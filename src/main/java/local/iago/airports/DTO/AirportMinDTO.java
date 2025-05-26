/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.iago.airports.DTO;

import local.iago.airports.entities.Airport;

/**
 *
 * @author ppjata
 */
public class AirportMinDTO {

    private long id;
    private String name;
    private String city; 
    private String iataCode; 
    
    public AirportMinDTO() {
    }
    
    public AirportMinDTO(Airport airport) { 
        
        this.id = airport.getId();
        this.name = airport.getName();
        this.city = airport.getCity();
        this.iataCode = airport.getIataCode();
        
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }
}

