package Drinks;

public class MountainDew extends ColdDrinks {
	
    @Override
    public double cost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Mountain Dew for the real gamers";
    }
}
