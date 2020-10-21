package Drinks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotCocoa extends HotDrinks{
    double cost = 4.5;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Hot Chocolate for the richest";
    }

    @Override
    public void brew() {
        System.out.println("Hot cocoa mixture added in...");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding milk");
    }

    public boolean customerWantsCondiment(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost + 1.5;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like milk? -> $1.50 (y/n)");

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