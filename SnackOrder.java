import java.util.ArrayList;
import java.util.List;

public class SnackOrder implements Command {
    CafeEmployee cafeemployee;
    String pizzaChoice;
    List<String> order = new ArrayList<>();
    
    public SnackOrder(CafeEmployee cafeemployee, List<String> snackType, String pzChoice){
        this.cafeemployee = cafeemployee;
        this.order = snackType;
        this.pizzaChoice = pzChoice;
       
    }

    @Override
    public void orderUp() {
    	cafeemployee.snackType = this.order;
    	cafeemployee.pizzaChoice = this.pizzaChoice;
        cafeemployee.getOrder("Snacks");
    }
}
