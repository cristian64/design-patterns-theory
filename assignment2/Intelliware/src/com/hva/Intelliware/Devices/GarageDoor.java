package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.DownFunction;
import com.hva.Intelliware.Functions.LightOffFunction;
import com.hva.Intelliware.Functions.LightOnFunction;
import com.hva.Intelliware.Functions.StopFunction;
import com.hva.Intelliware.Functions.UpFunction;

public class GarageDoor extends GenericDevice{
	public GarageDoor() {
        name = "Garage Door";        
        functions.add(new UpFunction());
        functions.add(new DownFunction());
        functions.add(new StopFunction());      
        functions.add(new LightOnFunction());      
        functions.add(new LightOffFunction());      
	}
}
