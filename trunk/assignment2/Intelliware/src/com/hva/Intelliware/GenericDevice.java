package com.hva.Intelliware;

import java.util.ArrayList;

/**
 * 
 * @author Ruben Herrebrugh and Cristian Aguilera
 * Class to simulate a generic device with no functionalities
 */
public class GenericDevice {    
	
	protected String name;
    protected ArrayList<Function> functions = new ArrayList<Function>();
    
    /**
     * Return name of device
     * @return String with name of device
     */
    public String getName() {
    	return name;
    }
    
    /**
     * 
     * @param function String - required action 
     * @param value String - additional parameter for specified action
     * @return Boolean - false when function is not supported by device, otherwise true
     */
    public boolean doFunction(String function, String[] args) {
    	// loop through device functions to find desired function
    	for (int i = 0; i < functions.size(); i++) {
    		// verify if we have match
			if (functions.get(i).getName().equals(function)) {							
				// execute function and display function success
				if (functions.get(i).doFunction(args)) {
					// print what executed function
					System.out.println("function '" + function + 
									   "' peformed by " + name);
				} else {
					System.out.println("function '" + function +
									   "' can not be executed by " + name + 
									   " (requires different arguments)");
				}
				
				// return we executed command
				return true;				
			}			
		}
    	// function not found, not supported by device, print message
    	System.out.println("function '" + function + "' not supported by " + name);
    	
    	// return false
    	return false;
    }
}
