/**
 * 
 */
package com.restanta.pattern.adapter;

/**
 * @author Cezar
 *
 */
public class SmartPhone {
	private String name;
	private String manufacturer;
	private double displaySize;
	private String operatingSystem;
	private double version;
	private double price;

	private boolean state;
	
	

	/**
	 * Constructor cu parametrii
	 * 
	 * @param manufacturer
	 * @param displaySize
	 * @param operatingSystem
	 * @param version
	 */
	public SmartPhone(String name, String manufacturer, double displaySize,
			String operatingSystem, double version) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.displaySize = displaySize;
		this.operatingSystem = operatingSystem;
		this.version = version;
	}

	/**
	 * default constructor
	 */
	public SmartPhone() {
		this(null, null, 0, null, 0);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @return the displaySize
	 */
	public double getDisplaySize() {
		return displaySize;
	}

	/**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * @return the version
	 */
	public double getVersion() {
		return version;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param manufacturer
	 *            the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @param displaySize
	 *            the displaySize to set
	 */
	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}

	/**
	 * @param operatingSystem
	 *            the operatingSystem to set
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(double version) {
		this.version = version;
	}

	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * buy function
	 */
	public void buy() {
		System.out.println("buy smartphone: " + this.name + "");
	}

	public void powerUp() {
		state = true;
	}

	public void shutDown() {
		state = false;

	}
}
