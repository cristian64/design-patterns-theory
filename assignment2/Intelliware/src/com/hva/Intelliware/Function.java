package com.hva.Intelliware;

/**
 * 
 * @author Ruben Herrebrugh and Cristian Aguilera
 * Interface for functions, loaded onto generic devices with 
 * specific function implementations
 */
public interface Function {
	public String getName();
    public boolean doFunction(String[] args);
}
