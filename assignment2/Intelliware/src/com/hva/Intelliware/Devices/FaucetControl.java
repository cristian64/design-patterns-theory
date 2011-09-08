package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.CloseCrankFunction;
import com.hva.Intelliware.Functions.OpenCrankFunction;


public class FaucetControl extends GenericDevice {	
    public FaucetControl() {    	
        name = "FaucetControl";        
        functions.add(new OpenCrankFunction());
        functions.add(new CloseCrankFunction());        
    }
}
