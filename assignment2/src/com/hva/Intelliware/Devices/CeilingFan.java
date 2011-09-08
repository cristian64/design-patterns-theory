package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.HighFunction;
import com.hva.Intelliware.Functions.LowFunction;
import com.hva.Intelliware.Functions.MediumFunction;
import com.hva.Intelliware.Functions.OffFunction;
import com.hva.Intelliware.Functions.OnFunction;

public class CeilingFan extends GenericDevice {	
    public CeilingFan() {    	
        name = "CeilingFan";        
        functions.add(new OnFunction());
        functions.add(new OffFunction());
        functions.add(new HighFunction());
        functions.add(new MediumFunction());
        functions.add(new LowFunction());
        
    }
}
