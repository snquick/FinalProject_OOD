import org.junit.Test;

public class GameExpert {
	Command command;
	@Test
    public void takeOrder(Command c){
        command = c;
        command.orderUp();
    }
}
