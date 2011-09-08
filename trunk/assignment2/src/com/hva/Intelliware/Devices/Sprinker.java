package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.OffFunction;
import com.hva.Intelliware.Functions.OnFunction;
import com.hva.Intelliware.Functions.SetTimerFunction;

public class Sprinker extends GenericDevice {	
    public Sprinker() {    	
        name = "Sprinkler";        
        functions.add(new OnFunction());
        functions.add(new OffFunction());
        functions.add(new SetTimerFunction());
    }
}
