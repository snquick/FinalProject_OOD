package VideoGame;

public class playstationGame extends videoGame {
	
	public playstationGame(){
        description = "Playstation Game";
    }

    @Override
    public double cost() {
        return 60.00;
    }
}
