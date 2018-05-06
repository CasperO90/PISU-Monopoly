package monopoly.mini.model.properties;

import monopoly.mini.GameController;
import monopoly.mini.model.Player;
import monopoly.mini.model.Property;
import monopoly.mini.model.exceptions.PlayerBrokeException;

/**
 * A specific property, which represents utilities which can
 * not be developed with houses or hotels.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class Utility extends Property {
	
	/** @author Casper & Elisa */
	
	
	private boolean ownUtility;
	
	private int nrOfUtilities;
	
	private int utilityValue;
	
	public int getNrOfUtilities() {
		return nrOfUtilities;
	}
	
	public void setnrOfUtilities(int nrOfUtilities) {
		this.nrOfUtilities = nrOfUtilities;
	}
	
	public void addUtility() {
		this.nrOfUtilities++;
	}
	
	public void removeUtility() {
		this.nrOfUtilities--;
	}
	
	public int getUtilityValue() {
		return utilityValue;
	}
	
	public void setUtilityValue(int utilityValue) {
		this.utilityValue = utilityValue;
	}

	public boolean utilityCheck() {
		return ownUtility;
		
	}
	
	public void doAction(GameController controller, Player player){
		
			controller.ownsAllUtilities(this, player);
		
	}
	
	}
	
		


