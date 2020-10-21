import java.util.ArrayList;
import java.util.List;

public class DrinkOrder implements Command {
    CafeEmployee cafeemployee;
    List<String> drinkOrder = new ArrayList<>();
    
    
    public DrinkOrder(CafeEmployee cafeemployee, List<String> dOrder){
        this.cafeemployee = cafeemployee;
        this.drinkOrder= dOrder;
    }

    @Override
    public void orderUp() {
    	cafeemployee.drinkType = this.drinkOrder;
    	cafeemployee.getOrder("Drinks");
    }
}
