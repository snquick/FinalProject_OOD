import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import Drinks.Drinks;
import Snacks.Snacks;
import Snacks.SnackDecorator.*;
import VideoGame.videoGame;
import org.junit.Test;

public class CafeEmployee {
	public List<String> snackType = new ArrayList<>();
	public List<String> drinkType = new ArrayList<>();
	public List<String> gameType = new ArrayList<>();
	public String pizzaChoice = null;
	double totalCost = 0;
	
	Snacks snacks;
	Drinks drinks;
	videoGame games;
	TripleKillToppings tk;
	DeluxeToppings dt;
	PizzaDecorator pizzadecorator;
	
	@Test
	public void totalCostOrder() {
		//DecimalFormat df = new DecimalFormat("0.00");
		//String tC = df.format(totalCost);
		String tC = String.format("%.2f", totalCost);
		System.out.println("Total Cost: $" + tC);
		totalCost = 0;
	}
	
	public void getOrder(String factoryType){
			
		if(factoryType.equalsIgnoreCase("Snacks")){
			System.out.println(snackType + " order received.\n ");
			SnackFactory factory =  new SnackFactory();
			
			snacks = decorate(pizzaChoice);		
			for (int i = 0; i < snackType.size(); i++) {
				snacks = factory.makeSnack(snackType.get(i));
				snacks.prepareDough(snackType.get(i));
				snacks.cookDough(snackType.get(i));
				System.out.println(snacks.getDescription() + " order completed.\n");
				totalCost += snacks.cost();
			}
		}

		else if(factoryType.equalsIgnoreCase("Drinks")){
			System.out.println(drinkType + " order received.\n");
			DrinkFactory factory = new DrinkFactory();
			
			for (int i = 0; i < drinkType.size(); i++) {
				drinks = factory.makeDrink(drinkType.get(i));
				drinks.prepareBeverage();
				System.out.println(drinks.getDescription() + " order completed.\n");
				totalCost += drinks.cost();
			}
		}
		
		else if(factoryType.equalsIgnoreCase("Games")){
			System.out.println(gameType + " order received.\n");
			videoGameFactory factory = new videoGameFactory();
			
			for (int i = 0; i < gameType.size(); i++) {
				games = factory.orderGame(gameType.get(i));
				games.prepareGame(gameType.get(i));
				System.out.println(games.getDescription() + " order completed.\n");
				totalCost += games.cost();
			}
		}
	}
	public Snacks decorate(String pizzaChoice) {
		if(pizzaChoice.equals("TripleKill")){
			//tk = new TripleKillToppings();
			//return tk;
			//return 2.50 + snacks.cost();
		}
		else if(pizzaChoice.equals("Deluxe")){
			//dt = new DeluxeToppings(snacks);
			//return dt;
		}
		return null;
	}
}
