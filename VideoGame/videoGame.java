package VideoGame;

import org.junit.Test;

public abstract class videoGame {
	String description = ""; // creating string variable

	public abstract double cost();

	public String getDescription(){
		return description; 
		}
    @Test
	public void prepareGame(String type) {
		System.out.println("Packaging "+ type + " into your Gaming Elite bag! Pick up once you're ready to leave. :) ");
		
		}
}
