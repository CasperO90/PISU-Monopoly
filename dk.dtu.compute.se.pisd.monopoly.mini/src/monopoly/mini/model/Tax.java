package monopoly.mini.model;

import monopoly.mini.GameController;
import monopoly.mini.model.exceptions.PlayerBrokeException;

/**
 * Represents a space, where the player has to pay tax.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class Tax extends Space {

	@Override
	public void doAction(GameController controller, Player player) throws PlayerBrokeException {
		
		controller.paymentToBank(player, player.getBalance() / 10);
	}

}
