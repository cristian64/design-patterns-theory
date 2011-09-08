package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class SetTemperatureFunction implements Function {

	@Override
	public String getName() {
		return "SET_TEMPERATURE";		
	}

	@Override
    public boolean doFunction() {
        // function requires integer value
		return false;
    }
	
	@Override
	public boolean doFunction(String value) {
		// function requires integer value, attempt conversion
		try {
			int i = Integer.parseInt(value);
			System.out.println("Temperature set to " + i);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}  
	
}
