package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.CirculateFunction;
import com.hva.Intelliware.Functions.JetsOffFunction;
import com.hva.Intelliware.Functions.JetsOnFunction;
import com.hva.Intelliware.Functions.SetTemperatureFunction;

public class HotTub extends GenericDevice {	
    public HotTub() {    	
        name = "Hot Tub";        
        functions.add(new CirculateFunction());
        functions.add(new JetsOnFunction());  
        functions.add(new JetsOffFunction());
        functions.add(new SetTemperatureFunction());
        
    }
}
