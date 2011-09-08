package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class NotifyFunction implements Function {

	@Override
	public String getName() {
		return "NOTIFY";		
	}

	@Override
    public boolean doFunction() {
        System.out.println("Notify");
        return true;
    }
	
	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
