/* Author: Stephanie Quick
 * Course: Object Oriented Development
 * Program: Gaming Cafe
 * Design Patterns: Command, Template, Factory, and Decorator
 * */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.Test;

public class Client {
	static String drinkType = ""; @Test
	public static void main(String[] args) {
		//Initialized Objects
		GameExpert gameexpert = new GameExpert();
		CafeEmployee cafeemployee = new CafeEmployee();
		boolean order = true;
		
		// Initiailized Variables
		String pizzaChoice = "";
		List<String> snackType = new ArrayList<>();
		List<String> drinkType = new ArrayList<>();
		List<String> gameType = new ArrayList<>();
		String answer = "";

		Scanner scanner = new Scanner(System.in);
		System.out.println("                         ****Welcome to Stephanie's Gaming Cafe!****");
		System.out.println("      Here you can order food, drinks, and your own game to take home after a night here!");
		System.out.println("                        Just pick you the food you want and it'll come out fresh :)");
		System.out.println("      And choose whatever gaming platform you are using, and you can choose from our libary of games on the way out");
		System.out.println("                                  Game on fellow noob!");

		while(order == true) { 
			System.out.println("What do you want to order?");
			System.out.println("(1) Snack");
			System.out.println("(2) Drink");
			System.out.println("(3) Games");
			System.out.println("(4) I have finished ordering.");

			int a = scanner.nextInt();
			if(a==1) {

				while (true) {
					System.out.println("Which snack do you want?");
					System.out.println("(1) Cheeseburger --- $9.50");
					System.out.println("(2) Cheese Fries --- $5.00");
					System.out.println("(3) Nachos --- $8.00");
					System.out.println("(4) Pizza --- $10.00");

					BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

					try {
						answer = input.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}

					if (answer.equals("1")) {
						snackType.add("Cheeseburger");
						System.out.println("*Cheeseburger is chosen.");
						break;
					} else if (answer.equals("2")) {
						snackType.add("Cheese Fries");
						System.out.println("*Cheese fries are chosen.");
						break; 
					}
					else if (answer.equals("3")) {
						snackType.add("Nachos");
						System.out.println("*Nachos are chosen.");
						break; 
					}
					else if (answer.equals("4")) {
						snackType.add("Pizza");
						System.out.println("*Pizza is chosen.");

						System.out.println("");

						System.out.println("Would you like a specialty pizza update?");
						System.out.println("(1) Triple Kill (Pepperoni, sausage, bacon) --- $1.50");
						System.out.println("(2) Deluxe (veggies) --- $1.25");
						System.out.println("(3) No, I would like to keep mine plain.");

						int value = scanner.nextInt();
						if (value == 1) {
							pizzaChoice = "Triple Kill";
							System.out.println("*Triple Kill is chosen.");
							break;
						} else if (value == 2) {
							pizzaChoice = "Deluxe";
							System.out.println("*Deluxe is chosen.");
							break;
						} else if (value == 3) {
							break;
						}
						System.out.println("The selection of pizza toppings is completed.");
						System.out.println("");
					} else {
						continue;
						
					}
				}
			}

			else if (a == 2) {
				Scanner scanBeverage = new Scanner(System.in);
				System.out.println("----------------------- DRINKS ----------------------");
				for (int i = 0; i < 1; i++) {
					System.out.println("-------------------- Drink Types --------------------");
					System.out.println("(1) Mountain Dew --- $2.50");
					System.out.println("(2) Hot Cooca --- $5.50");
					System.out.println("(3) I finished the drink selection.");
					int drink = scanBeverage.nextInt();
					if(drink == 1) {
						drinkType.add("Mountain Dew");
						System.out.println("Mountain Dew is chosen.");
						break;
					}
					else if(drink == 2) {
						drinkType.add("Hot Cocoa");
						System.out.println("You have selected: Hot Cocoa");
						
						break;
					}
					else if (drink == 3) {
						break;
					}
				}
				System.out.println("The selection of drinks is completed.");
				System.out.println("");
			}
			
			else if (a == 3) {
				Scanner scanGame = new Scanner(System.in);
				System.out.println("--------------------- GAMES ----------------");
				
				for (int i = 0; i < 1; i++) {
					System.out.println("-------------------- Game Types --------------------");
					System.out.println("You tell us the platform, you pick any game from our library :D");
					System.out.println("(1) PC   --- $20.00");
					System.out.println("(2) Xbox --- $60.00");
					System.out.println("(3) Playstation --- $60.00");
					System.out.println("(4) I finished the game selection.");
					
					int game = scanGame.nextInt();
					
					if(game == 1) {
						gameType.add("PC Game");
						System.out.println("PC is chosen.");
						break;
					}
					else if(game == 2) {
						gameType.add("Xbox Game");
						System.out.println("Xbox is chosen.");
						break;
					}
					else if(game == 3) {
						gameType.add("Playstation Game");
						System.out.println("Playstation is chosen.");
						break;
					}
					else if (game == 4) {
						break;
					}
				}
				System.out.println("The selection of games is completed.");
				System.out.println("");
				
				}
			else if (a == 4) {
				Scanner oAgain = new Scanner (System.in);
				
				if (snackType.size() != 0 || pizzaChoice != "") {
					SnackOrder snackOrder = new SnackOrder(cafeemployee, snackType, pizzaChoice);
					gameexpert.takeOrder(snackOrder);
				}
				
				if (drinkType.size() != 0) {
					DrinkOrder drinkOrder = new DrinkOrder(cafeemployee, drinkType);
					gameexpert.takeOrder(drinkOrder);
				}
				
				if (gameType.size() != 0) {
					GameOrder gameOrder = new GameOrder(cafeemployee, gameType);
					gameexpert.takeOrder(gameOrder);
				}
				
				cafeemployee.totalCostOrder();
				
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println("Would you like to order again?: ");
				System.out.println("(1) Yes");
				System.out.println("(2) No");
				
				int again = oAgain.nextInt();
				if (again == 1) {
					System.out.println("-------------------------------------------------------------------------------");
					snackType.clear();
					drinkType.clear();
					gameType.clear();
					continue;
				} else if (again == 2) {
					order = false;
					System.out.println("See ya later!");
					System.out.println("-------------------------------------------------------------------------------");
					
				}
				
			}
		}
	}
}
