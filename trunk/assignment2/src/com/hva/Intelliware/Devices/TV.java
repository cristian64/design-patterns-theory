package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.OffFunction;
import com.hva.Intelliware.Functions.OnFunction;
import com.hva.Intelliware.Functions.SetInputChannelFunction;
import com.hva.Intelliware.Functions.SetVolumeFunction;

public class TV extends GenericDevice {	
    public TV() {    	
        name = "TV";        
        functions.add(new OnFunction());
        functions.add(new OffFunction());
        functions.add(new SetInputChannelFunction());
        functions.add(new SetVolumeFunction());        
        
    }
}
