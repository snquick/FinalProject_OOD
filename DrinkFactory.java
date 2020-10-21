import Drinks.*;

public class DrinkFactory {

    public Drinks makeDrink(String drinkType) {
        if (drinkType.equals(null)){
            return null;
        }
        else if(drinkType.equals("Mountain Dew")){
            return new MountainDew();
        }
        else if(drinkType.equals("Hot Cocoa")){
            return new HotCocoa();
        }
        return null;
    }

}
