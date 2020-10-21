// Decorator pattern
package Snacks.SnackDecorator;
import Snacks.Snacks;

public class DeluxeToppings {
	Snacks snacks;
	
	 public DeluxeToppings (Snacks snacks) {
	        this.snacks = snacks;
	    }

	    public double cost() {
	        return 3.85 + snacks.cost();
	    }

	    public String getDescription() {
	        return snacks.getDescription() + ", Deluxe Pizza: Pepperoni, Sausage, Green Pepper, Mushroom, Red Onion";
	    }

}
