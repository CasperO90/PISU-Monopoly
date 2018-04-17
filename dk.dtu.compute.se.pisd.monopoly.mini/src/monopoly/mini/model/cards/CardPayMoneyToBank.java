package monopoly.mini.model.cards;

import monopoly.mini.GameController;
import monopoly.mini.model.Card;
import monopoly.mini.model.Player;
import monopoly.mini.model.exceptions.PlayerBrokeException;

public class CardPayMoneyToBank extends Card {
	
	private int amount;
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void doAction(GameController controller, Player player) throws PlayerBrokeException {
		try {
			controller.paymentToBank(player, amount);
		} finally {
			// Make sure that the card is returned to the deck even when
			// an Exception should occur!
			super.doAction(controller, player);
		}
	}

}
