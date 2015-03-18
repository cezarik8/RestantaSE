/**
 * 
 */
package com.restanta.pattern.observer;

/**
 * @author Cezar
 *
 */
public class AndroidUpdate implements IUpdate {
	protected SoftwareUpdate vers;
	private double lastVers;
	private String deviceID = null;

	public AndroidUpdate(SoftwareUpdate vers, double lastVers, String deviceID) {
		this.lastVers = lastVers;
		this.deviceID = deviceID;

		this.vers = vers;
		this.vers.attach(this);
	}

	@Override
	public void update() {
		System.out.println("\n\nDevice:" + deviceID + "\nUpdated from "
				+ lastVers + " to latest Android Version: " + vers.getState()
				+ "");
	}
}
