/**
 * @author Amirreza Mirzaei
 * This class represents a suds orders in a pizza restaurant. This class is implementing the Deliverable interface.
 */
package pizza.foodItems;

import pizza.Services.Deliverable;

/**
 * public class SudsOrder which implements Deliverable interface
 */
public class SudsOrder implements Deliverable {
	
	/**
	 * Declaring the variable called name
	 */
	private String name;
	
	/**
	 * Declaring the variable called number
	 */
	private int number;
	
	/**
	 * Declaring the varibale called sizeInML
	 */
	private int sizeInML;
	
	/**
	 * This is the constructor of the SudsOrder Class
	 * @param name assign the passed argument to the name
	 * @param number assign the passed argument to the number
	 * @param sizeInML assign the passed argument to the sizeInML
	 */
	public SudsOrder(String name, int number, int sizeInML) {
		this.name = name;
		this.number = number;
		this.sizeInML = sizeInML;
	}


	/**
	 * this method will return the name
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * this method will return the number 
	 * @return the number
	 */
	public int getNumber() {
		return this.number;
	}

	/**
	 * this method will return the sizeInML
	 * @return the sizeInML
	 */
	public int sizeInML() {
		return this.sizeInML;
	}
	
	/**
	 * this method is implementing and overriding the deliveryCost method in the deliverable interface
	 * @return the deliveryCost of the SudsOrder 
	 */
	@Override
	public double deliveryCost() {
		return number * 0.75;
	}

	/**
	 * Returns a string representation of this SudsOrder object.
	 * 
	 * @return A string containing the class name of this object, along with its attributes including
	 *         name, number, and size in ML.
	 */
	public String toString() {
		return getClass().getName() + "[name = " + name + ", number = " + number
									+ ", sizeInML = " + sizeInML + "]";
	}

	

}
