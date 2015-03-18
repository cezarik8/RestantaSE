/**
 * 
 */
package com.restanta.pattern.adapter;

/**
 * @author Cezar
 *
 */
public class AdapterSmartphone implements IDisp {
	private SmartPhone adaptee = null;

	/***
	 * Trateaza obiectul de tip Smartphone
	 * 
	 * @param name
	 * @param manufacturer
	 * @param displaySize
	 * @param operatingSystem
	 * @param version
	 */
	public AdapterSmartphone(String name, String manufacturer,
			double displaySize, String operatingSystem, double version) {
		adaptee = new SmartPhone(name, manufacturer, displaySize,
				operatingSystem, version);
	}

	@Override
	public void buy() {
		adaptee.buy();

	}

	@Override
	public void powerUp() {
		adaptee.powerUp();
	}

	@Override
	public void shutDown() {
		adaptee.shutDown();

	}

}
