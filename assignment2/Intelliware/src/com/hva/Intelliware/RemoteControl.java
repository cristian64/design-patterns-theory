package com.hva.Intelliware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.hva.Intelliware.Devices.CeilingFan;
import com.hva.Intelliware.Devices.SecurityControl;
import com.hva.Intelliware.Devices.TV;

public class RemoteControl {
	int iCurrentDevice = 0;
	ArrayList<GenericDevice> oaAllDevices = new ArrayList<GenericDevice>();
	
	public RemoteControl() {
		
		System.out.println("Starting Demo");
		// lets create a ceiling fan
		CeilingFan myFan = new CeilingFan();
				
		// perform some actions on the ceiling fan
		myFan.doFunction("ON",new String[]{""});
		myFan.doFunction("OFF",new String[]{""});
		myFan.doFunction("HIGH",new String[]{""});
		myFan.doFunction("MEDIUM",new String[]{""});
		myFan.doFunction("LOW",new String[]{""});
		
		// lets create an Alarm and perform some actions
		SecurityControl myAlarm = new SecurityControl();
		myAlarm.doFunction("ARM",new String[]{""});
		myAlarm.doFunction("DISARM",new String[]{""});
		myAlarm.doFunction("NOTIFY",new String[]{""});
		myAlarm.doFunction("ALERT",new String[]{""});
		myAlarm.doFunction("STOP",new String[]{""});	// not supported by alarm, pretend we are stupid
	
		// lets create an TV and set the volume to 20
		TV myTV = new TV();
		myTV.doFunction("SET_VOLUME", new String[]{"20"}); // function with parameter
		
		// obviously all devices can also be added to a arraylist to peform batch operations or checks
		oaAllDevices.add(myFan);
		oaAllDevices.add(myAlarm);
		oaAllDevices.add(myTV);
		
		// lets turn all devices in arraylist off
		for (GenericDevice device : oaAllDevices) {
			device.doFunction("OFF", new String[]{""});
		}		
		
		System.out.println("End of Demo");

		// initialize first device
		nextDevice();
		
		// enter menu
		while (readData()) {};
		
	}
	
	private void nextDevice() {
		// change index to next device
		iCurrentDevice++;
		
		// check if we go beyond last device
		if (iCurrentDevice > oaAllDevices.size()-1) {
			
			// select first device instead
			iCurrentDevice = 0;
		}
		// select next device
		changeDevice(oaAllDevices.get(iCurrentDevice));
	}
	
	private void changeDevice(GenericDevice selectedDevice) {
		// display we are selecting a new device
		System.out.println("------------------------------------");
		System.out.println("Changed to device: " + selectedDevice.getName());
		System.out.println("------------------------------------");
		System.out.println("menu options:");
		
		// get all functions available
		for (int i = 0; i < selectedDevice.functions.size(); i++) {
			// extract functions					
			System.out.println("[" + i + "]: " + selectedDevice.functions.get(i).getName().toLowerCase());			
		}
		
		// print default menu options
		System.out.println("[10]: change device");
		System.out.println("[99]: exit program");
	}
	
	private void handleMenuInput(int input) {
		
		if (input>9) {
			nextDevice();
		} else if ((input>-1)&&(input<10)) {
			// check if device has that many options		
			if (oaAllDevices.get(iCurrentDevice).functions.size() > input) {
				// execute corresponding function				
				oaAllDevices.get(iCurrentDevice).doFunction(oaAllDevices.get(iCurrentDevice).functions.get(input).getName(), new String[]{""});
			}
			} else {
				System.out.println("invalid input");
		}

	}
	
	
	/**
	 * @author Stefan Bos
	 */
	private boolean readData() {
		String line = null;
		   int val = 0;
		   try {
		     BufferedReader is = new BufferedReader(
		       new InputStreamReader(System.in));
		     line = is.readLine();
		     val = Integer.parseInt(line);
		   } catch (NumberFormatException ex) {
		     System.err.println("Not a valid number: " + line);
		   } catch (IOException e) {
		     System.err.println("Unexpected IO ERROR: " + e);
		   }
		   if (val==99) {
			   return false;
		   } else {
			   handleMenuInput(val);
			   return true;
		   }
	}	
}
