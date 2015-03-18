/**
 * 
 */
package com.restanta.pattern.factory;

import com.restanta.pattern.adapter.IDisp;
import com.restanta.pattern.observer.SoftwareUpdate;

/**
 * @author Cezar
 *
 */
public class DispMobilFactory {
	public IDisp produceDispMobil(int operatingSystem, SoftwareUpdate softUpt) {
		if (operatingSystem == 0) {
			return new IosDisp(0, softUpt);
		} else
			return new AndroidDisp(1, softUpt);
	}
}
