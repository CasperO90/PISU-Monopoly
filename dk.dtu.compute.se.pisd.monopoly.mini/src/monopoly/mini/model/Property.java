package monopoly.mini.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import monopoly.mini.GameController;
import monopoly.mini.model.exceptions.PlayerBrokeException;
import monopoly.mini.MiniMonopoly;

/**
 * A property which is a space that can be owned by a player.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class Property extends Space {
	
	private int cost;
	private int rent;
	private int mortgage;
	private int colorcode;
	
	
	protected Player owner;
	
	
	
	/**
	 * Returns the cost of this property.
	 * 
	 * @return the cost of this property
	 */
	public int getCost() {
		return cost;
	}

	public int getMortgage() {
		int b = cost - 100;
		this.cost = mortgage - b;
		return mortgage;
	}
	
	public void setMortgage(int mortgage) {
		this.mortgage = mortgage;
		notifyChange();
	}
	/** @author Elisa */
	public int getColorcode() {
		return colorcode;
	}
	public void setColorcode(int colorcode) {
		this.colorcode = colorcode;
		notifyChange();
	}
	
	/**
	 * Sets the cost of this property.
	 * 
	 * @param cost the new cost of this property
	 */
	public void setCost(int cost) {
		this.cost = cost;
		notifyChange();
	}

	/**
	 * Returns the rent to be payed for this property.
	 * 
	 * @return the rent for this property
	 */
	public int getRent() {
		return rent;
	}

	/**
	 * Sets the rent for this property.
	 * 
	 * @param rent the new rent for this property
	 */
	public void setRent(int rent) {
		this.rent = rent;
		notifyChange();
	}

	/**
	 * Returns the owner of this property. The value is <code>null</code>,
	 * if the property currently does not have an owner.
	 * 
	 * @return the owner of the property or <code>null</code>
	 */
	public Player getOwner() {
		return owner;
	}

	/**
	 * Sets the owner of this property  to the given owner (which can be 
	 * <code>null</code>).
	 * 
	 * @param player the new owner of the property
	 */
	public void setOwner(Player player) {
		this.owner = player;
		notifyChange();
	}

	@Override
	public void doAction(GameController controller, Player player) throws PlayerBrokeException {
		if (owner == null) {
			controller.offerToBuy(this, player);
		} else if (!owner.equals(player)) {
		
			controller.payment(player, rent, owner);
		}
	}


	

}
