/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.iago.airports.service;

import java.util.List;
import local.iago.airports.DTO.AirportMinDTO;
import local.iago.airports.entities.Airport;
import local.iago.airports.repositories.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author ppjata
 */
@Service
public class AirportService {
    
    @Autowired
    private AirportRepository airportRepository;
    
    public List<Airport> findAll() {
        
       List<Airport> result = airportRepository.findAll();
       return result;
       
    }
        
       public List<Airport> findByCity(String city) {
           List<Airport> result = airportRepository.findByCityIgnoreCase(city);
           return result;
           
    }
     
    public List<AirportMinDTO> findByCountry(String country) {
        List<Airport> resultAirport = airportRepository.findByCountryIgnoreCase(country);
        
        List<AirportMinDTO> resultDTO = resultAirport.stream()
                .map(x -> new AirportMinDTO(x)).toList();
        
        return resultDTO;
    }
    
    public Airport findByIataCode(String iataCode) {
        Airport result = airportRepository.findByIataCode(iataCode);
        return result;
        
    }
       
}