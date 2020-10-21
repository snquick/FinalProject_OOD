package VideoGame;

public class pcGame extends videoGame {
	
	public pcGame(){
        description = "PC Game";
    }

    @Override
    public double cost() {
        return 20.00;
    }
}
