// Template pattern
package Drinks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public abstract class ColdDrinks implements Drinks{
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void prepareBeverage() {
        pourInGlass();

        if(customerWantsIce()) {
            addIce();
        }
    }
    
    @Test
    public void pourInGlass(){
        System.out.println("Preparing your cold elixir to enhance gaming!");
    }
    
    @Test
    public void addIce(){
        System.out.println("Adding magical ice");
    }

    public boolean customerWantsIce(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like ice? (y/n)");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(answer == null){
            answer = "no";
        }

        return answer;
    }
}
