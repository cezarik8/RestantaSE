/***
 * created by Cezar
 */
package com.restanta;

import com.restanta.pattern.adapter.IDisp;
import com.restanta.pattern.factory.DispMobilFactory;
import com.restanta.pattern.observer.SoftwareUpdate;

public class Main {

	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SoftwareUpdate androidLatestSoftware = new SoftwareUpdate();
		SoftwareUpdate iosLatestSoftware = new SoftwareUpdate();

		DispMobilFactory dispMobFactory = new DispMobilFactory();
		//IDisp dispMobs = dispMobFactory.produceDispMobil(0, iosLatestSoftware);

		IDisp dispMobs1 = dispMobFactory.produceDispMobil(1,
				androidLatestSoftware);
		
		androidLatestSoftware.setState(5.4);
		//iosLatestSoftware.setState(4.5);

		
		//dispMobs.buy();

	}

}
