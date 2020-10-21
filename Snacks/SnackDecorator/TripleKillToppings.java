// Part of the decorator pattern
package Snacks.SnackDecorator;
import Snacks.Snacks;

public class TripleKillToppings {
	Snacks snacks;
	/*
	 public TripleKillToppings(Snacks snacks){
	        this.snacks = snacks;
	    }*/

	    public double cost() {
	    	/*
	    	double addPCost = snacks.cost();
	    	addPCost += 2.50;*/
	        return 2.50 + snacks.cost();
	    }

	    public String getDescription() {
	        return snacks.getDescription() + ", Triple Kill: Pepperoni, Sausage, Bacon, and Red Sauce";
	    }

}
