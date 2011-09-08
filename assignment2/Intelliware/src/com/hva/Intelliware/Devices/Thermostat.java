package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.TurnDownFunction;
import com.hva.Intelliware.Functions.TurnUpFunction;

public class Thermostat extends GenericDevice {	
    public Thermostat() {    	
        name = "Thermostat";        
        functions.add(new TurnUpFunction());
        functions.add(new TurnDownFunction());
        
    }
}
