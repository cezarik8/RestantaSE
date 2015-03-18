/**
 * 
 */
package com.restanta.pattern.adapter;

/**
 * @author Cezar
 *
 */
public class AdapterTablet implements IDisp {

	private Tablet adaptee = null;

	public AdapterTablet(String name, String manufacturer, double displaySize,
			String operatingSystem, double version, boolean gsmAntenna) {
		adaptee = new Tablet(name, manufacturer, displaySize, operatingSystem,
				version, gsmAntenna);
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
