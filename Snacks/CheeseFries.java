package Snacks;

public class CheeseFries extends Snacks {
    public  CheeseFries(){
        description = "Cheese Fries";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
