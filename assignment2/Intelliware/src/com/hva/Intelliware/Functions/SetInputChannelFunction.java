package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class SetInputChannelFunction implements Function {

	@Override
	public String getName() {
		return "SETINPUTCHANNEL";		
	}

	@Override
    public boolean doFunction() {
        // function requires integer value
		return false;
    }
	
	@Override
	public boolean doFunction(String value) {
		// function requires integer value, attempt conversion		
			System.out.println("Input channel set to " + value);
			return true;
	}  
	
}
