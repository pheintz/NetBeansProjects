/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

/**
 *
 * @author Patrick Heintz
 * minimal class holding location data for a flight path.
 * Data includes location name, location longitude, and location latitude
 */
public class Location {
    
    String cityLocation;
    double latitude, longitude;
    
    Location()
    {
        cityLocation = "";
    }
    Location(String newLocation, double lat, double longi)
    {
        cityLocation = newLocation;
        latitude = lat;
        longitude = longi;
    }
    public double getLong()
    {
        return longitude;
    }
    public double getLat()
    {
        return latitude;
    }
    public String getCityLoction()
    {
        return cityLocation;
    }
}
