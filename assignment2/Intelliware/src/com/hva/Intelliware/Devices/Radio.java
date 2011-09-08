package com.hva.Intelliware.Devices;

import com.hva.Intelliware.GenericDevice;
import com.hva.Intelliware.Functions.OffFunction;
import com.hva.Intelliware.Functions.OnFunction;
import com.hva.Intelliware.Functions.SetBassFunction;
import com.hva.Intelliware.Functions.SetTrebbleFunction;
import com.hva.Intelliware.Functions.SetVolumeFunction;
import com.hva.Intelliware.Functions.TurnToCDFunction;
import com.hva.Intelliware.Functions.TurnToRadioFunction;

public class Radio extends GenericDevice {	
    public Radio() {    	
        name = "Radio";        
        functions.add(new OnFunction());
        functions.add(new OffFunction());
        functions.add(new SetVolumeFunction());
        functions.add(new SetBassFunction());
        functions.add(new SetTrebbleFunction());
        functions.add(new TurnToCDFunction());
        functions.add(new TurnToRadioFunction());
                
        
    }
}
