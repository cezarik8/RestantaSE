package com.restanta.pattern.factory;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.restanta.exceptions.InputExp;
import com.restanta.pattern.adapter.AdapterSmartphone;
import com.restanta.pattern.adapter.AdapterTablet;
import com.restanta.pattern.adapter.IDisp;
import com.restanta.pattern.observer.IosUpdate;
import com.restanta.pattern.observer.SoftwareUpdate;

/**
 * @author Cezar
 * @description crearea unui "dispozitiv" care are instalat sistemul iOS
 */
public class IosDisp implements IDisp {
	private IDisp ourDisp;

	private IosUpdate iosUptStatus;

	/**
	 * constructor IosDisp
	 * 
	 * @param operatingSystem
	 *            valoarea 0 pentru iOS 
	 *            valoarea 1 pentru Android
	 * @param softUpt
	 *            obiect pentru observer
	 */
	public IosDisp(int operatingSystem, SoftwareUpdate softUpt) {
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
			System.out.println("4.Operating system: iOS");
			System.out.println("5.Version:");
			version = Double.parseDouble(reader.nextLine());

			if (displaySize < 5.5)
				ourDisp = new AdapterSmartphone(name, manufacturer,
						displaySize, "iOS", version);
			else if (displaySize > 5.5) {
				String choice = null;
				while (choice == "true" || choice == "false")
					choice = reader.nextLine();
				if (choice == "true")
					ourDisp = new AdapterTablet(name, manufacturer,
							displaySize, "iOS", version, true);
				else
					ourDisp = new AdapterTablet(name, manufacturer,
							displaySize, "iOS", version, false);
			}

			iosUptStatus = new IosUpdate(softUpt, version, manufacturer + "_"
					+ name);
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
		ourDisp.powerUp();
	}

	@Override
	public void shutDown() {
		ourDisp.shutDown();
	}

}
