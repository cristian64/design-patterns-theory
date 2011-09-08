package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.DimDownFunction;
import com.hva.Intelliware.Functions.DimUpFunction;
import com.hva.Intelliware.Functions.OffFunction;
import com.hva.Intelliware.Functions.OnFunction;

public class CeilingLight extends GenericDevice {	
    public CeilingLight() {    	
        name = "Ceiling Light";        
        functions.add(new OnFunction());
        functions.add(new OffFunction());  
        functions.add(new DimDownFunction());
        functions.add(new DimUpFunction());
        
    }
}
