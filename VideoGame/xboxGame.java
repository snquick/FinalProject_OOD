package VideoGame;

public class xboxGame extends videoGame {
	public xboxGame(){
        description = "Xbox Game";
    }

    @Override
    public double cost() {
        return 60.00;
    }
}
