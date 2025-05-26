/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.iago.airports.projections;

/**
 *
 * @author ppjata
 */
public interface AirportNearMeProjection {
    
     long getid();
     String getName();
     String getCity();
     String getIataCode();
     double getLatitude();
     double getLongitude();
     double getAltitude();
     double getDistanciaKM();
    
}
