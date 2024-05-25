/**
 * @author Amirreza Mirzaei
 * This class represents a pizza in a pizza restaurant. This class is implementing the Deliverable interface.
 */
package pizza.foodItems;

import pizza.Services.Deliverable;
/**
 * Class Called Pizza and implements the Deliverable interface
 */
public class Pizza implements Deliverable {

	/**
	 * a public static final variable which is set to True by default
	 */
	public final static boolean THIN_CRUST = true;
	/**
	 * Variable size in inches is declared
	 */
	private int sizeInInches;
	/**
	 * Variable type of sauce is declared
	 */
	private String typeOfSauce;
	/**
	 * Variable thin crust is declared
	 */
	private boolean thinCrust;
	/**
	 * an array of foodItems is declared as topping
	 */
	private FoodItem[] toppings;
	/**
	 * Variable topping count is declared
	 */
	private int toppingCount;
	/**
	 * Variable base price is declared
	 */
	private double basePrice;
	
	/**
	 * Constructor of the pizza class which has a constructor chaining and it will call the other constructor 
	 * @param size is the size of the pizza in Inches
	 * @param sauce is the type of the sauce of the pizza
	 */
	public Pizza(int size , String sauce) {
		this(size,0.0);
		this.typeOfSauce = sauce;
	}
	/**
	 * this is the constructor of the pizza class 
	 * @param size is the size of the pizza in Inches
	 * @param basePrice is the base price of the chosen pizza
	 */
	public Pizza(int size, double basePrice) {
		this.sizeInInches = size;
		this.basePrice = basePrice;
	}
	
	/**
	 * this method will set the base price for the pizza
	 * @param price is set as the base price
	 */
	public void setBasePrice(double price) {
		this.basePrice = price;
	}
	
	/**
	 * this will set the thin crust for the pizza
	 * @param yes will set the thin crust for the pizza
	 */
	public void setThinCrust(boolean yes) {
		this.thinCrust = yes;
	}
	
	/**
	 * this method will return the sauce of the pizza
	 * @return the type of the sauce
	 */
	public String getTypeOfSauce() {
		return this.typeOfSauce;
	}
	
	/**
	 * this method will return the topping for the pizza
	 * @return an array of foodItems which will be the topping
	 */
	public FoodItem[] getTopping() {
		return this.toppings;
	}
	
	/**
	 * this method will return the base price of the pizza
	 * @return the base price
	 */
	public double getBasePrice() {
		return this.basePrice;
	}
	
	
	/**
	 * this method will add topping to the pizza
	 * @param item is the topping of the pizza which will be added to the pizza
	 */
	public void addTopping(FoodItem item) {
	if(toppings == null) {
		toppings = new FoodItem[10];
	}
	if(toppingCount < toppings.length) {
		toppings[toppingCount++] = item;
	}else {
		System.out.println("You Reached to your Maximum toppings");
	}
}
	
	/**
	 * this will return the size of the pizza in inches
	 * @return the size in inches
	 */
	public int sizeInInches() {
		return this.sizeInInches;
	}
	
	/**
	 * this method will complete and override the deliveryCost method in the interface deliverable
	 */
	@Override
	public double deliveryCost() {
		
		if (sizeInInches == 10) {
			return 2.5;
			
		}else if(sizeInInches == 12) {
		    return 3.5;
		    
		}else if (sizeInInches == 14) {
			 return 4.75;
		}
		return 0.0;
	}
	
	/**
	 * @return the price of the pizza
	 */
	public double price() {
		double totalPrice = 0;
		for(int i = 0 ; i < toppingCount ; i++) {
			if(toppings[i] != null) {
				totalPrice += toppings[i].price();
			}
		}
		return totalPrice;
	}
	
	/**
	 * @return the total price of the pizza which is base price and price and delivery cost
	 */
	public double totalPrice() {
		return  basePrice + price() + deliveryCost();
		
	}
	
	/**
	 * Returns a string representation of this Pizza object.
	 * 
	 * @return A string containing the class name of this object, along with its attributes including
	 *         size, type of sauce, crust type, topping, topping count, and base price.
	 */
	public String toString() {
		return getClass().getName() + "[THIN_CRUST = " + THIN_CRUST + ", sizeInInches = " + sizeInInches
									+ ", typeOfSauce = " + typeOfSauce + ", thinCrust = " + thinCrust
									+ ", toppings = " + toppings + ", toppingCount = " + toppingCount
									+ ", basePrice = " + basePrice + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
