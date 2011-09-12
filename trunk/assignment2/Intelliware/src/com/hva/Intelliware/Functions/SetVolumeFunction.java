package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class SetVolumeFunction implements Function {

	@Override
	public String getName() {
		return "SET_VOLUME";		
	}
	
	@Override
	public boolean doFunction(String[] args) {
		// function requires integer value, attempt conversion
		try {
			int i = Integer.parseInt(args[0]);
			System.out.println("Volume set to " + i);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}   
	
}
