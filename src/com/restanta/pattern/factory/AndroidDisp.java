/**
 * 
 */
package com.restanta.pattern.factory;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.restanta.exceptions.InputExp;
import com.restanta.pattern.adapter.AdapterSmartphone;
import com.restanta.pattern.adapter.AdapterTablet;
import com.restanta.pattern.adapter.IDisp;
import com.restanta.pattern.observer.AndroidUpdate;
import com.restanta.pattern.observer.SoftwareUpdate;

/**
 * @author Cezar
 *
 */
public class AndroidDisp implements IDisp {
	private IDisp ourDisp;

	private AndroidUpdate andUptStatus;

	public AndroidDisp(int operatingSystem, SoftwareUpdate softUpt) {
		// System.out.println("Choose your specs:\n1.Name: ");
		String name = null;
		String manufacturer = null;
		double displaySize = 0;

		double version = 0;

		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		try {
			System.out.println("Choose your specs:\n1.Manufacturer:");
			manufacturer = reader.nextLine();
			System.out.println("2.Name:");
			name = reader.nextLine();
			System.out.println("3.Display size:");

			String ds = reader.nextLine();
			String decimalPattern = "([0-9]*)\\.([0-9]*)";
			boolean match = Pattern.matches(decimalPattern, ds);
			// displaySize = Double.parseDouble(ds);
			// System.out.println(displaySize);
			System.out.println(match);
			if (match)
				displaySize = Double.parseDouble(ds);
			else
				throw new InputExp("Invalid Error");

			System.out.println("4.Operating system: Android");
			System.out.println("5.Version:");
			version = Double.parseDouble(reader.nextLine());

			if (displaySize < 5.5)
				ourDisp = new AdapterSmartphone(name, manufacturer,
						displaySize, "Android", version);
			else if (displaySize > 5.5) {
				String choice = null;
				while (choice == "true" || choice == "false")
					choice = reader.nextLine();
				if (choice == "true")
					ourDisp = new AdapterTablet(name, manufacturer,
							displaySize, "Android", version, true);
				else
					ourDisp = new AdapterTablet(name, manufacturer,
							displaySize, "Android", version, false);
			}
			andUptStatus = new AndroidUpdate(softUpt, version, manufacturer
					+ "_" + name);
		} catch (InputExp e) {
			e.printMessage();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void powerUp() {
		ourDisp.powerUp();
	}

	@Override
	public void buy() {

		ourDisp.buy();
	}

	@Override
	public void shutDown() {
		ourDisp.shutDown();
	}

}
