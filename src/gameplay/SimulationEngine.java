/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplay;

import entities.Customer;
import entities.Introvert;
import entities.Extrovert;
import entities.Location;

import java.util.ArrayList;

/**
 *
 * @author jrimland
 */
public class SimulationEngine {
    private int numCustomers = 0;
    private boolean isRunning = false;
    private ArrayList <Customer> customers;
    private ArrayList <Location> locations;
    
    
    SimulationEngine()
    {
        customers = new ArrayList<>();
        locations = new ArrayList<>();
    }
    
    public boolean initializaSim()
    {
        numCustomers = 0;
        
        return true;
    }
    
    public String contactIlluminati()
       {
               String message = "The Illuminati is here!";
               return message;
       }
    
    public void startSim()
    {
        System.out.println("Simulation started!");
    }
    
    public void stopSim()
    {
        System.out.println("Simulation stopped!");
    }
        
    
    public boolean addLocation()
    {
        locations.add(new Location());
        System.out.println("Location added.");
        return true;
    }
    
    public boolean addCustomer()
    {
        
        customers.add(new Introvert());
        System.out.println("Customer added.");
        return true;
    }
            
    
}
