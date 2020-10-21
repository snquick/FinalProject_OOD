package Snacks;

public class Cheeseburger extends Snacks {
    public Cheeseburger(){
        description = "Cheeseburger";
    }

    @Override
    public double cost() {
        return 9.50;
    }
}
