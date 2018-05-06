package monopoly.mini.model.properties;

import monopoly.mini.GameController;
import monopoly.mini.model.Player;
import monopoly.mini.model.Property;
import monopoly.mini.model.exceptions.PlayerBrokeException;
import monopoly.mini.model.exceptions.PlayerDoesntOwnAll;

/**
 * A specific property, which represents real estate on which houses
 * and hotels can be built. Note that has not details yet and needs
 * to be implemented.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class RealEstate extends Property{
	

	
	private int nrOfHouses;
	
	private int houseValue; 
	
	public int getNrOfHouses() {
		return nrOfHouses; 
	}
	public void setNrOfHouses(int nrOfHouses) {
		this.nrOfHouses = nrOfHouses;		
	}
	
	public void addHouse() {
		this.nrOfHouses++;
		
	}
	public void removeHouse() {
		this.nrOfHouses--;
		
	}
	public int getHouseValue() {
		return houseValue;
	}
	public void setHouseValue(int houseValue) {
		this.houseValue = houseValue;
		houseValue = 100;
	}
	/** @author Elisa */
	public void doAction(GameController controller, Player player) throws PlayerBrokeException {
		if (owner.equals(player)) {
			try {
				controller.offerToBuyHouse(this, player);
			} catch (PlayerDoesntOwnAll e) {
			
				e.printStackTrace();
			}
		} 
	
	}
	
}
