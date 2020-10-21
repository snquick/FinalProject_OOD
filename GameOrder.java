import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GameOrder implements Command {
    CafeEmployee cafeemployee;
    List<String> gameOrder = new ArrayList<>();
    
    public GameOrder(CafeEmployee cafeemployee, List<String> gOrder){
        this.cafeemployee = cafeemployee;
        this.gameOrder= gOrder;
    }

    @Override 
    public void orderUp() {
    	cafeemployee.gameType = this.gameOrder;
    	cafeemployee.getOrder("Games");
    }
}
