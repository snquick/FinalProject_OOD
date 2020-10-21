// Factory pattern
import Snacks.*;

public class SnackFactory {

    public Snacks makeSnack(String snackType) {
        if (snackType.equals(null)){
            return null;
        }
        else if(snackType.equals("Cheeseburger")){
            return new Cheeseburger();
        }
        else if(snackType.equals("Cheese Fries")){
            return new CheeseFries();
        }
        else if(snackType.equals("Nachos")){
            return new Nachos();
        }
        else if(snackType.equals("Pizza")){
            return new Pizza();
        }
        return null;
    }

}
