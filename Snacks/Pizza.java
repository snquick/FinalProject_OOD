package Snacks;

public class Pizza extends Snacks {
    public  Pizza(){
        description = "Pizza";
    }

    @Override
    public double cost() {
        return 10.00;
    }
}
