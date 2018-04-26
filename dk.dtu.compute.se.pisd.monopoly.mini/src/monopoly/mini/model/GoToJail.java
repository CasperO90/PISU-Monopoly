package monopoly.mini.model;

import monopoly.mini.GameController;
import monopoly.mini.model.exceptions.PlayerBrokeException;

public class GoToJail extends Space {
	
	
	
	
	public void doAction(GameController controller, Player player) throws PlayerBrokeException {
		controller.gotoJail(player);
	}

}
