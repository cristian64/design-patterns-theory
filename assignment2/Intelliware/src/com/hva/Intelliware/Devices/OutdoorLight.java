package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.OffFunction;
import com.hva.Intelliware.Functions.OnFunction;

public class OutdoorLight extends GenericDevice {	
    public OutdoorLight() {    	
        name = "Outdoor Light";        
        functions.add(new OnFunction());
        functions.add(new OffFunction());  
        
    }
}
