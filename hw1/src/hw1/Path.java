/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1;

import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Path class which holds flight path information
 * via list of Location
 * Can calculate the bearing from one location to the next.
 */
public class Path 
{
    Iterator<Location> currLocItr;
    Scanner stdin = new Scanner(System.in);
    
    List<Location> locList;
    Location tempLoc;
    Location currentLocation;
    Location nextLocation;
    
    double bearing;
    double currLatRadians, currLongRadians;  //current radians
    double nextLatRadians, nextLongRadians;  //next location radians
    double nextLat, nextLong;                //next location lat/long values
    int numLocations;

    
    Path()
    {
        //constructor for navigation info
        locList = new ArrayList<>();
        numLocations = 0;
        currLocItr = locList.iterator();
    }

    /**
     * Add a new location to the path by adding
     * user data into the ArrayList of class Location
     */
    void addLocation() 
    {
        String checkForDupes;
        System.out.println("Please enter the name of the next location: ");
        
        checkForDupes = stdin.next();
        while(checkForDuplicates(locList, checkForDupes) == true) //check for duplicate locations in list
        {
            System.out.println("That location is already on the path.\n"
                    + "Please enter the name of the next location: ");
            checkForDupes = stdin.next();
        }
        
        System.out.println("Please enter the latitude of the next location: ");
        nextLat = stdin.nextDouble();
        
        System.out.println("Please enter the latitude of the next location: ");
        nextLong = stdin.nextDouble();
        
        // construct new Location from user input and add to locList
        Location newLoc = new Location(checkForDupes, nextLat, nextLong);
        
        locList.add(newLoc);
        ++numLocations;
    }
    
    /**
     * Display the current path by iteration though location list
     */
    void displayPath() 
    {
        Iterator<Location> itr = locList.iterator();
        while(itr.hasNext())
        {
            Location newLoc = itr.next();
            System.out.print("Location: " + newLoc.getCityLoction() + "("
            + newLoc.getLat() + ", " + newLoc.getLong() + ")\n");
        }
    }
    
    /**
     * Move to new location.  Set class location iterator at position
     * of matching string.
     */
    void moveToLocation() 
    {
        System.out.println("Please enter the name of the location: ");
        String currentLoc = stdin.next();
        
        Iterator<Location> itr = locList.iterator();
        
        while(itr.hasNext())
        {
            Location newLoc = itr.next();
            if(newLoc.cityLocation.equals(currentLoc)) //if location is found set to currentLocation
            {
                currentLocation = newLoc;
                currLocItr = itr;
                return;
            }
        }
    }
    
    /**
     * Displays the message to head out on a bearing
     * Calls: calculateBearing() to do the calculations
     * required for the message
     */
    void displayBearing() 
    {
        
        System.out.println("Head out on a bearing of " + calculateBearing() 
                + " degrees.\n");
    } 
    
    
    /**
     * checkForDuplicates
     * Checks for duplicate locations within a List of locations
     * 
     * @param locList list of locations to iterate through
     * @param tempLoc name of location to check for duplicate entry
     * @return 
     */
    boolean checkForDuplicates(List<Location> locList, String tempLoc) 
    {
        Iterator<Location> itr = locList.iterator();
        
        while(itr.hasNext())
        {
            Location newLoc = itr.next();
            if(newLoc.cityLocation.equals(tempLoc))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * using formula from http://www.movable-type.co.uk/scripts/latlong.html
     * Calculate the bearing from current location to next location
     * Iterator resets after traversing and current location must be reset
     * by the user
     * 
     * @return bearing result of the calculation
     */
    private double calculateBearing() 
    {
        if(!currLocItr.hasNext())
        {
            return 0.0;
        }
        
        Iterator<Location> itr = locList.iterator();
        Location newLoc = itr.next();
        
        //  move new iterator to current location
        while(!(newLoc.cityLocation.equals(currentLocation.cityLocation)))
        {
            newLoc = itr.next();
        }
        newLoc = itr.next();
        
        currLatRadians = currentLocation.getLat() * acos(-1.0) / 180;
        currLongRadians = currentLocation.getLong() * acos(-1.0) / 180;
        
        nextLatRadians = newLoc.getLat() * acos(-1.0) / 180;
        nextLongRadians = newLoc.getLong() * acos(-1.0) / 180;
        
        bearing = atan2(sin(nextLongRadians-currLongRadians)*cos(nextLatRadians),
            cos(currLatRadians)*sin(nextLatRadians) - sin(currLatRadians)*cos(nextLatRadians)
            *cos(nextLongRadians-currLongRadians));
        
        bearing = bearing * 180.0 / acos(-1.0);
        if (bearing < 0.0)
        {
            bearing += 360.0;
        }
        return bearing;
    }
    
    /**
     * Override toString uses iterator itr to traverse through Path data
     * and return it as a StringBuilder object if Path.toString() is called
     * 
     * @return StringBuilder result
     */
    @Override public String toString() 
    {
        Iterator<Location> itr = locList.iterator();
        StringBuilder result = new StringBuilder();
        String NEW_LINE = System.getProperty("line.separator");
        
        while(itr.hasNext())
        {
            Location newLoc = itr.next();
            result.append("Location: " + newLoc.getCityLoction() + "("
            + newLoc.getLat() + ", " + newLoc.getLong() + ")\n");
        }
        return result.toString();
  }
}
