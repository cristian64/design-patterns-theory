package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.AlertFunction;
import com.hva.Intelliware.Functions.ArmFunction;
import com.hva.Intelliware.Functions.DisarmFunction;
import com.hva.Intelliware.Functions.NotifyFunction;

public class SecurityControl extends GenericDevice {	
    public SecurityControl() {    	
        name = "Alarm";        
        functions.add(new ArmFunction());
        functions.add(new DisarmFunction());
        functions.add(new NotifyFunction());
        functions.add(new AlertFunction());
    }
}
