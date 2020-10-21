package Snacks;

import org.junit.Test;

public abstract class Snacks {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }
    @Test
    public void prepareDough(String type) {
        System.out.println("Preparing "+ type);
    }

    public void cookDough(String type) {
        System.out.println("Cooking " + type);
    }
    
    @Test
    public void dishUp(String type) {
        System.out.println("Putting " + type + " on the dish");
    }
}
