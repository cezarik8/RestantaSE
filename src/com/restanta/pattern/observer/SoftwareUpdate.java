/**
 * 
 */
package com.restanta.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cezar
 *
 */
public class SoftwareUpdate {
	private List<IUpdate> observers = new ArrayList<IUpdate>();

	private double state;

	public double getState() {
		return state;
	}

	public void setState(double d) {
		this.state = d;
		notifyAllObservers();
	}

	public void attach(IUpdate observer) {
		observers.add(observer);
	}

	public void notifyAllObservers() {
		for (IUpdate observer : observers) {
			observer.update();
		}
	}
}
