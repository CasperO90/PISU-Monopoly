package monopoly.mini.model.properties;

import monopoly.mini.model.Property;

/**
 * A specific property, which represents utilities which can
 * not be developed with houses or hotels.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class Utility extends Property {
	
	// @Casper
	
	
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
	
	
	
	//TODO lav en set fordeling af utilites
	

	/*
	 * private int nrOfHouses;
	
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
	}
	public boolean hotelCheck() { //Checker om der er bygget et hotel
		return builtHotel;
	}
	

	}
	//TODO Lav en "set" fordeling af huse
	
	
	testtestest
	 */
		//testtest
		
}

