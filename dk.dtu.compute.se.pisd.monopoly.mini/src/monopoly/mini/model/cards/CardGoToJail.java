package monopoly.mini.model.cards;

import monopoly.mini.GameController;
import monopoly.mini.model.Card;
import monopoly.mini.model.Player;
import monopoly.mini.model.exceptions.PlayerBrokeException;

public class CardGoToJail extends Card{
	
	public void doAction(GameController controller, Player player) throws PlayerBrokeException {
		controller.gotoJail(player);
		controller.returnChanceCardToDeck(this);
	};	
}
