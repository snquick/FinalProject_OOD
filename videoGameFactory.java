// Factory Pattern
import VideoGame.*;

public class videoGameFactory {
	
    public videoGame orderGame(String gameType) {
        if (gameType.equals(null)){
            return null;
        }
        else if(gameType.equals("Playstation Game")){
            return new playstationGame();
        }
        else if(gameType.equals("Xbox Game")){
            return new xboxGame();
        }
        else if(gameType.equals("PC Game")){
            return new pcGame();
        }
        return null;
    }

}
