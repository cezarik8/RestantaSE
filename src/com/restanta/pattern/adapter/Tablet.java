/**
 * 
 */
package com.restanta.pattern.adapter;

/**
 * @author Cezar
 *
 */
public class Tablet {
	private String manufacturer;
	private double displaySize;
	private String operatingSystem;
	private double version;
	private double price;
	private boolean gsmAntenna;
	private String name;

	private boolean state;

	/**
	 * Constructor cu parametrii
	 * 
	 * @param manufacturer
	 * @param displaySize
	 * @param operatingSystem
	 * @param version
	 */
	public Tablet(String name, String manufacturer, double displaySize,
			String operatingSystem, double version, boolean gsmAntenna) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.displaySize = displaySize;
		this.operatingSystem = operatingSystem;
		this.version = version;
		this.gsmAntenna = gsmAntenna;
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
	 * @return the gsmAntenna
	 */
	public boolean isGsmAntenna() {
		return gsmAntenna;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
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
	public void setDisplaySize(float displaySize) {
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
	public void setVersion(float version) {
		this.version = version;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @param gsmAntenna
	 *            the gsmAntenna to set
	 */
	public void setGsmAntenna(boolean gsmAntenna) {
		this.gsmAntenna = gsmAntenna;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Tablet(String name, String manufacturer, float displaySize,
			String operatingSystem, float version) {
		this(name, manufacturer, displaySize, operatingSystem, version, false);
	}

	/**
	 * default constructor
	 */
	public Tablet() {
		this(null, null, 0, null, 0, false);
	}

	/**
	 * buy function
	 */
	public void buy() {
		System.out.println("buy tablet: " + this.name + "");
	}

	public void powerUp() {
		state = true;
	}

	public void shutDown() {
		state = false;

	}

	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(double version) {
		this.version = version;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}
}
