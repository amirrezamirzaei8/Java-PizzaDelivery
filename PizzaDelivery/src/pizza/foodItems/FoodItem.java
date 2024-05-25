/**
 * @author Amirreza Mirzaei
 * This class is called FoodItem and it is the superclass of the Ham, Olive, Cheese, GreenPepper, Onion, Tomato, Pepperoni.
 */
package pizza.foodItems;

/**
 * Class FoodItem which it is a superclass and represents the inheritance concept
 */
public class FoodItem {
	
	/**
	 * Declaring the variable called name
	 */
	private String name;
	
	/**
	 * Declaring the variable called unitsOfMeasure 
	 */
	private String unitsOfMeasure; /* "{cup, half cup, quarter cup, oz, milliliters}"; */
	/**
	 * Declaring the variable called quantity
	 */
	private float quantity;
	/**
	 * Declaring the variable called pricePerUnit
	 */
	private double pricePerUnit;
	
	/**
	 * This is the constructor of FoodItem
	 * @param name will be set to the class level varibale called name
	 */
	public FoodItem(String name) {
		this.name = name;
		
	}
	/**
	 * This method will set the units of measure
	 * @param unitType is set to the unitsOfMeasure
	 */
	public void setUnitsOfMeasure(String unitType) {
		this.unitsOfMeasure = unitType;
	}
	/**
	 *  * This method will set the quantity
	 * @param quantity is set to the class level variable called quantity
	 */
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	/**
	 *  * This method will set the price
	 * @param price is set to the pricePerUnit
	 */
	public void setPricePerUnit(double price) {
		this.pricePerUnit = price;
	}
	
	
	/**
	 * 
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	
	/**
	 * This method will calculate the price
	 * @return the price which is quantity * pricePerUnit
	 */
	public double price() {
		double price = quantity * pricePerUnit;
		return price;
				
	}
	
	
	
	
}


