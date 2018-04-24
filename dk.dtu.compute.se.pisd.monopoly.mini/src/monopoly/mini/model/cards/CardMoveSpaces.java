package monopoly.mini.model.cards;

import monopoly.mini.GameController;
import monopoly.mini.model.Card;
import monopoly.mini.model.Space;
import monopoly.mini.model.exceptions.PlayerBrokeException;
import monopoly.mini.model.Player;


public class CardMoveSpaces extends Card{
	
	private int spaceMove;
	private Space target;
	
	public int getSpaceMove() {
		return spaceMove;
	}
	
	public void setSpaceMove(int spaceMove)	{
		this.spaceMove = spaceMove;
	}
	
	public void doAction(GameController controller, Player player) throws PlayerBrokeException {
		try {
			target.setIndex(player.getCurrentPosition().getIndex()+spaceMove);
			controller.moveToSpace(player, target);	
		} finally {
			// Make sure that the card is returned to the deck even when
			// an Exception should occur!
			super.doAction(controller, player);
		}
	}	
	adsa
	

}
