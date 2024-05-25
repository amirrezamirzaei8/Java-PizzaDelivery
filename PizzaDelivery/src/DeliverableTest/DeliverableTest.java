/**
 * @author Amirreza Mirzaei
 * This class is the Driver class and contains the main() method
 */
package DeliverableTest;

import pizza.foodItems.*;
import pizza.Services.Deliverable;
import pizza.foodItems.FoodItem;
import pizza.foodItems.Pizza;
import pizza.foodItems.SudsOrder;
import pizza.Services.*;


/**
 * Test our deliverable interface and inheritance heirarchy for the pizza shop
 * app.
 */
public class DeliverableTest {
	/**
	 * final static variable THIN_CRUST
	 * Constant Variable
	 */
	final static boolean THIN_CRUST = true;

	/**
	 * Main entry point for testing aspects of our pizza shop app.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		/*
		 * 	Setup some toppings for pizza's
		 * 		onion, cheese, double cheese, pepperoni, ham, olive and green pepper
		 */
		Onion onion = new Onion("Onion");
		onion.setPricePerUnit(2.0);
		onion.setQuantity(1);
		onion.setUnitsOfMeasure("1/2 CUP");;

		Cheese cheese = new Cheese("Cheese");
		cheese.setPricePerUnit(2.75);
		cheese.setQuantity(1);
		cheese.setUnitsOfMeasure("1/2 CUP");;

		Cheese dblCheese = new Cheese("Double Cheese");
		dblCheese.setPricePerUnit(2.75);
		dblCheese.setQuantity(2);
		dblCheese.setUnitsOfMeasure("CUP");;

		Pepperoni pepperoni = new Pepperoni("Pepperoni");
		pepperoni.setPricePerUnit(3.75);
		pepperoni.setQuantity(1);
		pepperoni.setUnitsOfMeasure("CUP");;

		Ham ham = new Ham("Ham");
		ham.setPricePerUnit(2.75);
		ham.setQuantity(2);
		ham.setUnitsOfMeasure("CUP");;

		Olive olive = new Olive("Olive");
		olive.setPricePerUnit(1.75);
		olive.setQuantity(1);
		olive.setUnitsOfMeasure("CUP");;

		GreenPepper greenPepper = new GreenPepper("GreenPepper");
		greenPepper.setPricePerUnit(2.80);
		greenPepper.setQuantity(1);
		greenPepper.setUnitsOfMeasure("CUP");;

		/* Create our pizza orders				*/
		Pizza pizzaPesto = new Pizza(12, "pesto");
		pizzaPesto.setBasePrice(25.00);
		pizzaPesto.setThinCrust(Pizza.THIN_CRUST);
		pizzaPesto.addTopping(dblCheese);
		pizzaPesto.addTopping(pepperoni);
		pizzaPesto.addTopping(ham);
		pizzaPesto.addTopping(greenPepper);

		Pizza pizzaMarinara = new Pizza(14, "marinara");
		pizzaMarinara.setBasePrice(35.25);
		pizzaMarinara.setThinCrust(Pizza.THIN_CRUST);
		pizzaMarinara.addTopping(onion);
		pizzaMarinara.addTopping(ham);
		pizzaMarinara.addTopping(cheese);
		pizzaMarinara.addTopping(olive);

		Deliverable[] deliverableItems = { pizzaPesto, pizzaMarinara,
				new SudsOrder("Rollicking Root Beer", 6, 473),
				new SudsOrder("Super Citrus Fizz", 4, 473) };

		int pizzaCount = 0;

		/*	TODO:	print the table of delivery costs that copies the provided sample output			*/
		System.out.printf("Item-Sauce                 #/Size       Cost \n");
		
	    System.out.printf("\n");
	    
	    for (Deliverable items : deliverableItems) {
            if (items instanceof Pizza) {
                Pizza pizza = (Pizza) items;
                System.out.printf("%-29s%-10d%-5.2f\s- Delivery (%4.2f) Total ->>    $%-20.2f%n",
                        "Pizza " + (++pizzaCount) + "-" + pizza.getTypeOfSauce(),
                        pizza.sizeInInches(),
                        pizza.getBasePrice(),
                        pizza.deliveryCost(),
                        pizza.totalPrice());
                /**
                 * Printing the topping
                 */
                for (FoodItem toppings : pizza.getTopping()) {
                    if (toppings != null) {
                        System.out.printf("%-40s%-20.2f%n", "\s\s\s\s\s\s- " + toppings.getName(), toppings.price());
                    }
                }
                System.out.printf("\n");
            }
            if (items instanceof SudsOrder) {
                SudsOrder sudsOrder = (SudsOrder) items;
                System.out.printf("%-30s%-10d%-20.2f%n\n", sudsOrder.getName(), sudsOrder.getNumber(), sudsOrder.deliveryCost());
            }
        }

	}
}

