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
	
	// @author Casper og @author Andreas
	
	private int nrOfHouses;
	
	private int houseValue; // hotel koster det samme som et hus
	
	private boolean builtHotel;
	
	public int getNrOfHouses() {
		return nrOfHouses; 
	}
	public void setNrOfHouses(int nrOfHouses) {
		this.nrOfHouses = nrOfHouses;		
	}
	
	public void addHouse() {
		this.nrOfHouses++;
		//TODO defensiv programering = max 4 houses!
	}
	public void removeHouse() {
		this.nrOfHouses--;
		//TODO defensiv programmering = House min 0!
	}
	public int getHouseValue() {
		return houseValue;
	}
	public void setHouseValue(int houseValue) {
		this.houseValue = houseValue;
		houseValue = 100;
	}
	public boolean hotelCheck() { //Checker om der er bygget et hotel
		return builtHotel;
	}
	
	public void addHotel() {
		this.builtHotel = true;
		//TODO defensiv programmering: Den kan kun være true 1 gang, indtil den bliver false
	}
	public void removeHotel() {
		this.builtHotel = false;
	}
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
